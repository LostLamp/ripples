package com.wave.ripples.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件上传控制器
 */
@Controller
public class UploadController {


    @ResponseBody
    @PostMapping(value = "upload")
    public Map<String, Object> upload(MultipartFile dropFile, HttpServletRequest request){
        Map<String, Object> result = new HashMap<>();
        //获取文件名
        String fileName = dropFile.getOriginalFilename();

        //文件存放路径
        String filePath = request.getSession().getServletContext().getRealPath("/static/upload");
        System.out.println(filePath);
        //判断路径是否存在，不存在则创建
        File file = new File(filePath);
        if(!file.exists()){
            file.mkdir();
        }

        //将文件写入目标
        file = new File(filePath,fileName);
        try {
            dropFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        result.put("fileName",file.getName());
        return result;
    }
}
