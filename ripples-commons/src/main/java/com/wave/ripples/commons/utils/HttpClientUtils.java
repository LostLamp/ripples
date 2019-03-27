package com.wave.ripples.commons.utils;


import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Arrays;


/**
 * HttpClient 请求 API 工具类
 * <p>@Title HttpClientUtils </p>
 * <p>@Description TODO </p>
 *
 * @Author dz
 * @Version 1.0.0
 * @Date 2018/12/20 19:27
 */
public class HttpClientUtils {

    public static final String GET = "get";
    public static final String POST = "post";

    public static final String REQUEST_HEAD_CONNECTION = "keep-alivel";
    public static final String REQUEST_HEAD_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36";


    /**
     * GET 请求
     *
     * @param url 请求地址
     * @return
     */
    public static String doGet(String url) {
        return createRequest(url, GET, null);
    }

    /**
     * GET 请求
     *
     * @param url    请求地址
     * @param cookie cookie
     * @return
     */
    public static String doGet(String url, String cookie) {
        return createRequest(url, GET, cookie);
    }

    /**
     * POST 请求
     *
     * @param url    请求地址
     * @param params 请求参数（可选参数）
     * @return
     */
    public static String doPost(String url, BasicNameValuePair... params) {
        return createRequest(url, POST, null, params);
    }

    /**
     * POST 请求
     *
     * @param url    请求地址
     * @param cookie cookie
     * @param params 请求参数
     * @return
     */
    public static String doPost(String url, String cookie, BasicNameValuePair... params) {
        return createRequest(url, POST, cookie, params);
    }

    /**
     * 创建请求
     *
     * @param url           请求地址
     * @param requestMethod 请求方式 GET/POST
     * @param cookie        cookie
     * @param params        请求参数，仅限 POST 请求使用
     * @return
     */
    private static String createRequest(String url, String requestMethod, String cookie, BasicNameValuePair... params) {
        // 创建 HttpClient 客户端，打开浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String result = null;

        try {
            // 请求结果
            result = null;
            // 请求方式
            HttpGet httpGet = null;
            HttpPost httpPost = null;
            // 响应
            CloseableHttpResponse httpResponse = null;
            // GET 请求
            if (GET.equals(requestMethod)) {
                httpGet = new HttpGet(url);
                // 设置请求头
                httpGet.setHeader("Connection", REQUEST_HEAD_CONNECTION);
                httpGet.setHeader("Cookie", cookie);
                httpGet.setHeader("User-Agent", REQUEST_HEAD_USER_AGENT);

                httpResponse = httpClient.execute(httpGet);
            }
            // POST 请求
            else if (POST.equals(requestMethod)) {
                httpPost = new HttpPost(url);
                // 设置请求头
                httpPost.setHeader("Connection", REQUEST_HEAD_CONNECTION);
                httpPost.setHeader("Cookie", cookie);
                httpPost.setHeader("User-Agent", REQUEST_HEAD_USER_AGENT);

                // 有参数进来
                if (params != null && params.length > 0) {
                    // 设置请求对象
                    HttpEntity httpEntity = null;
                    // 将数组转换成 list 放置进请求对象中
                    httpEntity = new UrlEncodedFormEntity(Arrays.asList(params), "UTF-8");
                    httpPost.setEntity(httpEntity);
                }
                httpResponse = httpClient.execute(httpPost);
            }
            // 获取响应结果
            HttpEntity httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
