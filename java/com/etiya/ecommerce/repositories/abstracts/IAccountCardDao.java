package com.etiya.ecommerce.repositories.abstracts;

import com.etiya.ecommerce.entities.concrete.AccountCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountCardDao extends JpaRepository<AccountCard, Integer> {

    @Query("SELECT a FROM AccountCard a")
    List<AccountCard> findAllAccountCard();

    @Query("SELECT a.id FROM AccountCard a")
    List<Integer> AccountCardFindAllId();

    @Query("SELECT a.id,cp.id FROM AccountCard a JOIN a.customerPreferPayment cp")
    List<AccountCard> getAccountCardByCustomerPreferPayment();


}


