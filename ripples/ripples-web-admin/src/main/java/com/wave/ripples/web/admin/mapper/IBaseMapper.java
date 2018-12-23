package com.wave.ripples.web.admin.mapper;

import com.wave.ripples.commons.persistence.AbstractBaseEntity;

import java.util.List;
import java.util.Map;

public interface IBaseMapper<T extends AbstractBaseEntity> {

    /**
     * 分页查询
     * @param param Map类型，传两个参数，start/数据开始位置，length/一页数据条数
     * @return
     */
    public List<T> page(Map<String,Object> param);

    /**
     * 查询数据条数
     * @return
     */
    public int count(T entity);


    /**
     * 删除
     * @param id
     */
    public void delete(Long id);

    /**
     * 批量删除
     *
     * @param ids
     */
    void deleteMulti(String[] ids);

    /**
     * 根据id查询信息
     * @param id
     * @return
     */
    public T selectById(Long id);

    /**
     * 查询所有
     * @return
     */
    public List<T> selectAll();
}
