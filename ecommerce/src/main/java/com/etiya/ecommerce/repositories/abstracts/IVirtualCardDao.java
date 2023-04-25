package com.etiya.ecommerce.repositories.abstracts;

import com.etiya.ecommerce.entities.concrete.VirtualCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface IVirtualCardDao extends JpaRepository<VirtualCard, Integer>{

    @Query("SELECT vc FROM VirtualCard vc")
    List<VirtualCard> findAllVirtualCard();

    @Query("SELECT vc.id FROM VirtualCard vc")
    List<Integer> VirtualCardFindAllId();

    @Query("SELECT v.id,cp.id FROM VirtualCard v JOIN v.customerPreferPayment cp")
    List<VirtualCard> getVirtualCardByCustomerPreferPayment();
}
