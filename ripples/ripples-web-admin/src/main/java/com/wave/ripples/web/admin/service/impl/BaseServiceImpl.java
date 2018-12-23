package com.wave.ripples.web.admin.service.impl;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.commons.dto.PageInfo;
import com.wave.ripples.commons.persistence.AbstractBaseEntity;
import com.wave.ripples.web.admin.mapper.IBaseMapper;
import com.wave.ripples.web.admin.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class BaseServiceImpl<T extends AbstractBaseEntity,M extends IBaseMapper<T>> implements IBaseService<T> {

    @Autowired
    protected M mapper;


    /**
     * 分页查询
     * @param draw
     * @param start
     * @param length
     * @return
     */
    @Override
    public PageInfo<T> page(int draw, int start, int length, T entity) {
        //获取分页信息
        HashMap<String, Object> param = new HashMap<>();
        param.put("start",start);
        param.put("length",length);
        param.put("entity",entity);
        List<T> page = mapper.page(param);

        int count = count(entity);

        //设置分页信息
        PageInfo<T> pageInfo = new PageInfo<>();
        pageInfo.setDraw(draw);
        pageInfo.setRecordsFiltered(count);
        pageInfo.setRecordsTotal(count);
        pageInfo.setData(page);
        System.out.println(pageInfo);
        return pageInfo;
    }

    /**
     * 查询总数据数
     * @return
     */
    @Override
    public int count(T entity) {
        return mapper.count(entity);
    }


    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Long id){
        mapper.delete(id);
    }

    /**
     * 批量删除
     * @param id
     */
    @Override
    public void betchDelete(Long[] id) {

    }

    /**
     * 批量删除
     *
     * @param ids
     */
    @Override
    public void deleteMulti(String[] ids) {
        mapper.deleteMulti(ids);
    }

    /**
     * 保存信息
     * @param entity
     */
    @Override
    public BaseResult save(T entity) {
        return null;
    }

    /**
     * 通过id查询
     * @param id
     * @return
     */
    @Override
    public T selectById(Long id) {
        return mapper.selectById(id);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }
}
