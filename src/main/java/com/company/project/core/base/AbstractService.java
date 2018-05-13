package com.company.project.core.base;

import com.company.project.core.exception.BizException;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;
/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 * @author xz
 */
public abstract class AbstractService<T> implements BaseService<T> {

    @Autowired
    protected Mapper<T> mapper;

    /**
     * 当前泛型真实类型的Class
     */
    private Class<T> modelClass;

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

    @Override
    public int insert(T model) {
        return mapper.insert(model);
    }

    @Override
    public int insertSelective(T model) {
        return mapper.insertSelective(model);
    }

    @Override
    public int insertBatch(List<T> models) {
        return mapper.insertList(models);
    }

    @Override
    public int deleteById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByIds(String ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public int delete(T model) {
        return mapper.delete(model);
    }

    @Override
    public int update(T model) {
        return mapper.updateByPrimaryKey(model);
    }

    @Override
    public int updateSelective(T model) {
        return mapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public T selectById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public T selectBy(String fieldName, Object value) throws TooManyResultsException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return mapper.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new BizException(e.getMessage(), e);
        }
    }

    @Override
    public T selectOne(T model) {
        return mapper.selectOne(model);
    }

    @Override
    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<T> find(T model) {
        return mapper.select(model);
    }

    @Override
    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    @Override
    public List<T> findAll() {
        return mapper.selectAll();
    }

    @Override
    public int selectCount(T model) {
        return mapper.selectCount(model);
    }

    @Override
    public int selectCountByCondition(Condition condition) {
        return mapper.selectCountByCondition(condition);
    }
}