package com.onedirect.duedate.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractBaseDao {

	@Autowired
	HibernateTemplate  hibernateTemplate;
	
	public void delete(Object entity, LockMode lockMode) throws DataAccessException {
		
		hibernateTemplate.delete(entity, lockMode);
	}

	
	public void delete(Object entity) throws DataAccessException {
		
		hibernateTemplate.delete(entity);
	}

	
	public void delete(String entityName, Object entity, LockMode lockMode) throws DataAccessException {
		
		hibernateTemplate.delete(entityName, entity, lockMode);
	}

	
	public void delete(String entityName, Object entity) throws DataAccessException {
		
		hibernateTemplate.delete(entityName, entity);
	}

	
	public void deleteAll(Collection<?> entities) throws DataAccessException {
		
		hibernateTemplate.deleteAll(entities);
	}

	
	public List<?> find(String queryString, Object... values) throws DataAccessException {
		
		return hibernateTemplate.find(queryString, values);
	}

	
	public List<?> findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults)
			throws DataAccessException {
		
		return hibernateTemplate.findByCriteria(criteria, firstResult, maxResults);
	}

	
	public List<?> findByCriteria(DetachedCriteria criteria) throws DataAccessException {
		
		return hibernateTemplate.findByCriteria(criteria);
	}

	
	public <T> List<T> findByExample(String entityName, T exampleEntity, int firstResult, int maxResults)
			throws DataAccessException {
		
		return hibernateTemplate.findByExample(entityName, exampleEntity, firstResult, maxResults);
	}

	
	public <T> List<T> findByExample(String entityName, T exampleEntity) throws DataAccessException {
		
		return hibernateTemplate.findByExample(entityName, exampleEntity);
	}

	
	public <T> List<T> findByExample(T exampleEntity, int firstResult, int maxResults) throws DataAccessException {
		
		return hibernateTemplate.findByExample(exampleEntity, firstResult, maxResults);
	}

	
	public <T> List<T> findByExample(T exampleEntity) throws DataAccessException {
		
		return hibernateTemplate.findByExample(exampleEntity);
	}

	
	public List<?> findByNamedParam(String queryString, String paramName, Object value) throws DataAccessException {
		
		return hibernateTemplate.findByNamedParam(queryString, paramName, value);
	}

	
	public List<?> findByNamedParam(String queryString, String[] paramNames, Object[] values)
			throws DataAccessException {
		
		return hibernateTemplate.findByNamedParam(queryString, paramNames, values);
	}

	
	public List<?> findByNamedQuery(String queryName, Object... values) throws DataAccessException {
		
		return hibernateTemplate.findByNamedQuery(queryName, values);
	}

	
	public List<?> findByNamedQueryAndNamedParam(String queryName, String paramName, Object value)
			throws DataAccessException {
		
		return hibernateTemplate.findByNamedQueryAndNamedParam(queryName, paramName, value);
	}

	
	public List<?> findByNamedQueryAndNamedParam(String queryName, String[] paramNames, Object[] values)
			throws DataAccessException {
		
		return hibernateTemplate.findByNamedQueryAndNamedParam(queryName, paramNames, values);
	}

	
	public List<?> findByNamedQueryAndValueBean(String queryName, Object valueBean) throws DataAccessException {
		
		return hibernateTemplate.findByNamedQueryAndValueBean(queryName, valueBean);
	}

	
	public List<?> findByValueBean(String queryString, Object valueBean) throws DataAccessException {
		
		return hibernateTemplate.findByValueBean(queryString, valueBean);
	}

	
	public <T> T load(Class<T> entityClass, Serializable id, LockMode lockMode) throws DataAccessException {
		
		return hibernateTemplate.load(entityClass, id, lockMode);
	}

	
	public <T> T load(Class<T> entityClass, Serializable id) throws DataAccessException {
		
		return hibernateTemplate.load(entityClass, id);
	}

	
	public void load(Object entity, Serializable id) throws DataAccessException {
		
		hibernateTemplate.load(entity, id);
	}

	
	public Object load(String entityName, Serializable id, LockMode lockMode) throws DataAccessException {
		
		return hibernateTemplate.load(entityName, id, lockMode);
	}

	
	public Object load(String entityName, Serializable id) throws DataAccessException {
		
		return hibernateTemplate.load(entityName, id);
	}

	
	public <T> List<T> loadAll(Class<T> entityClass) throws DataAccessException {
		
		return hibernateTemplate.loadAll(entityClass);
	}

	
	public <T> T merge(String entityName, T entity) throws DataAccessException {
		
		return hibernateTemplate.merge(entityName, entity);
	}

	
	public <T> T merge(T entity) throws DataAccessException {
		
		return hibernateTemplate.merge(entity);
	}

	
	public void persist(Object entity) throws DataAccessException {
		
		hibernateTemplate.persist(entity);
	}

	
	public void persist(String entityName, Object entity) throws DataAccessException {
		
		hibernateTemplate.persist(entityName, entity);
	}

	
	public void refresh(Object entity) throws DataAccessException {
		
		hibernateTemplate.refresh(entity);
	}

	
	public Serializable save(Object entity) throws DataAccessException {
		
		return hibernateTemplate.save(entity);
	}

	
	public Serializable save(String entityName, Object entity) throws DataAccessException {
		
		return hibernateTemplate.save(entityName, entity);
	}

	
	public void saveOrUpdate(Object entity) throws DataAccessException {
		
		hibernateTemplate.saveOrUpdate(entity);
	}

	
	public void saveOrUpdate(String entityName, Object entity) throws DataAccessException {
		
		hibernateTemplate.saveOrUpdate(entityName, entity);
	}

	
	public void update(Object entity, LockMode lockMode) throws DataAccessException {
		
		hibernateTemplate.update(entity, lockMode);
	}

	
	public void update(Object entity) throws DataAccessException {
		
		hibernateTemplate.update(entity);
	}

	
	public void update(String entityName, Object entity, LockMode lockMode) throws DataAccessException {
		
		hibernateTemplate.update(entityName, entity, lockMode);
	}

	
	public void update(String entityName, Object entity) throws DataAccessException {
		
		hibernateTemplate.update(entityName, entity);
	}
	
}
