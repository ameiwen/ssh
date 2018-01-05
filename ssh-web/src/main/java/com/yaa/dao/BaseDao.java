package com.yaa.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
    /**
     * 保存一个对象
     *
     * @param o
     * @return
     */
    Serializable save(T o);

    /**
     * 删除一个对象
     *
     * @param o
     */
    void delete(T o);

    /**
     * 更新一个对象
     *
     * @param o
     */
    void update(T o);

    /**
     * 保存或更新对象
     *
     * @param o
     */
    void saveOrUpdate(T o);

    /**
     * 查询
     *
     * @param hql
     * @return
     */
    List<T> find(String hql);

    /**
     * 查询部分
     *
     * @param hql
     * @param num
     * @return
     */
    List<T> findPart(String hql, int num);

    /**
     * 查询集合
     *
     * @param hql
     * @param param
     * @return
     */
    List<T> find(String hql, Object[] param);

    /**
     * 查询集合
     *
     * @param hql
     * @param param
     * @return
     */
    List<T> find(String hql, List<Object> param);

    /**
     * 查询集合(带分页)
     *
     * @param hql
     * @param param
     * @param page  查询第几页
     * @param rows  每页显示几条记录
     * @return
     */
    List<T> find(String hql, Object[] param, Integer page, Integer rows);

    /**
     * 查询集合(带分页)
     *
     * @param hql
     * @param param
     * @param page
     * @param rows
     * @return
     */
    List<T> find(String hql, List<Object> param, Integer page, Integer rows);
    /**
     * 获得一个对象
     * @param c 对象类型
     * @param id
     * @return Object2
     */

    public T get(Class<T> c, Serializable id);

    /**
     * 获得一个对象
     *
     * @param hql
     * @param param
     * @return Object
     */
    T get(String hql, Object[] param);

    /**
     * 获得一个对象
     *
     * @param hql
     * @param param
     * @return
     */
    public T get(String hql, List<Object> param);

    /**
     * select count(*) from 类
     *
     * @param hql
     * @return
     */
    Long count(String hql);

    /**
     * select count(*) from 类
     *
     * @param hql
     * @return
     */
    Integer getCount(String hql);

    /**
     * select count(*) from 类
     *
     * @param hql
     * @param param
     * @return
     */
    Long count(String hql, Object[] param);

    /**
     * select count(*) from 类
     *
     * @param hql
     * @param param
     * @return
     */
    Long count(String hql, List<Object> param);

    /**
     * 执行HQL语句
     *
     * @param hql
     * @return 响应数目
     */
    Integer executeHql(String hql);

    /**
     * 执行HQL语句
     *
     * @param hql
     * @param param
     * @return 响应数目
     */
    Integer executeHql(String hql, Object[] param);

    /**
     * 执行HQL语句
     *
     * @param hql
     * @param param
     * @return
     */
    Integer executeHql(String hql, List<Object> param);

}
