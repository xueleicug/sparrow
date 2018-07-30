package com.xl.base.dao;

import org.springframework.data.repository.NoRepositoryBean;
import javax.persistence.EntityManager;import javax.persistence.PersistenceContext;
import java.math.BigInteger;

@NoRepositoryBean
public class BookDAOImpl implements BookSweeper {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Integer countByPress(String pressName) {
        String countStr =
                "SELECT COUNT(*) FROM book b where b.press = '" + pressName + "'";
        BigInteger result = (BigInteger) em.createNativeQuery(countStr).getSingleResult();
        return result.intValue();
    }
}
