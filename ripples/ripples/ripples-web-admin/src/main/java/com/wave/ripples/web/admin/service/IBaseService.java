package com.wave.ripples.web.admin.service;

import com.wave.ripples.commons.dto.BaseResult;
import com.wave.ripples.commons.dto.PageInfo;
import com.wave.ripples.commons.persistence.AbstractBaseEntity;

import java.util.List;

public interface IBaseService<T extends AbstractBaseEntity> {

    /**
     * 通过id查询
     * @param id
     * @return
     */
    public T selectById(Long id);
    /**
     * 分页
     * @return
     */
    public PageInfo<T> page(int draw, int start, int length, T entity);
    /**
     * 查询数据总条数
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
     * @param id
     */
    public void betchDelete(Long[] id);

    /**
     * 保存信息
     */
    public BaseResult save(T entity);

    /**
     * 查询所有
     * @return
     */
    public List<T> selectAll();

    /**
     * 批量删除
     *
     * @param ids
     */
    void deleteMulti(String[] ids);
}
