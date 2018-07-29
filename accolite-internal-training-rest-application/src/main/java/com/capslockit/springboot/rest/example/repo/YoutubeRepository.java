package com.capslockit.springboot.rest.example.repo;

import com.capslockit.springboot.rest.example.entity.Youtube;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class YoutubeRepository implements IRepository<Youtube> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Youtube getById(Long id) {
       return Optional.ofNullable((Youtube) entityManager.unwrap(Session.class)
                .createCriteria(Youtube.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult())
                .orElseThrow(() -> new RuntimeException("No records found for specified id"));

    }

    @Override
    public List<Youtube> getList(Integer numberOfRecords) {
        Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Youtube.class);
        criteria.setMaxResults(numberOfRecords);
        return criteria.list();
    }

    @Override
    public List<Youtube> getAll() {
        Criteria criteria = entityManager.unwrap(Session.class)
                .createCriteria(Youtube.class);
        return criteria.list();
    }

    @Override
    public Map<String, Long> getRecordsCount() {
        Long value = (Long)entityManager.unwrap(Session.class)
                .createCriteria(Youtube.class)
                .setProjection(Projections.rowCount())
                .uniqueResult();
        Map<String, Long> map = new HashMap<>();
        map.put("recordsCount", value);
        return map;
    }
}
