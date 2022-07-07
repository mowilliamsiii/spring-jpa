package com.moseswilliamsiii.springjpa.services;

import com.moseswilliamsiii.springjpa.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserServiceImpl implements UserService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
