package com.company.project.core;

import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * Service 层 基础接口，其他Service 接口 请继承该接口
 * @author xz
 */
public interface BaseService<T> {
    /**
     * insert model
     * @param model
     * @return
     */
    int insertSelective(T model);

    /**
     * batch insert
     * @param models
     * @return
     */
    int insertBatch(List<T> models);

    /**
     * delete by primary key
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * batch delete
     * eg：ids -> “1,2,3,4”
     * @param ids
     */
    int deleteByIds(String ids);

    /**
     * update
     * 所有字段都更新
     * @param model
     */
    int update(T model);

    /**
     * update selective
     * 只更新非空字段
     * @param model
     */
    int updateSelective(T model);

    /**
     * selete by primary key
     * @param id
     * @return
     */
    T selectById(Integer id);

    /**
     * 通过Model中某个成员变量名称（非数据表中column的名称）查找
     * value需符合unique约束,否则会抛出异常
     * @param fieldName
     * @param value
     * @return
     * @throws TooManyResultsException
     */
    T selectBy(String fieldName, Object value) throws TooManyResultsException;

    /**
     * 通过多个ID查找
     * eg：ids -> “1,2,3,4”
     * @param ids
     * @return
     */
    List<T> findByIds(String ids);

    /**
     * 根据条件查找
     * @param condition
     * @return
     */
    List<T> findByCondition(Condition condition);

    /**
     * find all
     * @return
     */
    List<T> findAll();
}
