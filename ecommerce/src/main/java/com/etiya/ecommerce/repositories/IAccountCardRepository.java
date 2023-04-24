package com.etiya.ecommerce.repositories;

import com.etiya.ecommerce.entities.concrete.AccountCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountCardRepository extends JpaRepository<AccountCard,Integer>{

    @Query("SELECT a FROM AccountCard a")
    List<AccountCard> findAllAccountCard();

    @Query("select a.id FROM AccountCard a")
   List<Integer> AccountCardFindAllId();


}
