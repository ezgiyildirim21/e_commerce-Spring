package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.AccountCard;
import com.etiya.ecommerce.entities.concrete.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICreditCardRepository extends JpaRepository<CreditCard,Integer> {

    @Query("SELECT c FROM CreditCard c")
    List<CreditCard> findAllByCreditCard();

    @Query("SELECT c.id FROM CreditCard c")
    List<Integer>findAllCreditCardId();
}
