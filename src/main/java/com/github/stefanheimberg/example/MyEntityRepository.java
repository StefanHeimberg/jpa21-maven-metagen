package com.github.stefanheimberg.example;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class MyEntityRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<MyEntity> findByText(final String text) {
        final CriteriaBuilder cb = em.getCriteriaBuilder();
        final CriteriaQuery<MyEntity> cq = cb.createQuery(MyEntity.class);
        
        final Root<MyEntity> fromMyEntity = cq.from(MyEntity.class);
        
        cb.and(cb.equal(fromMyEntity.get(MyEntity_.text), fromMyEntity));
        
        return em.createQuery(cq).getResultList();
    }
    
}
