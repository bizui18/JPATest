package com.JPATest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPATest.entity.LottoInfo;
import com.JPATest.entity.MyLottoNo;

@Repository
public interface MyLottoNoRepository extends JpaRepository<MyLottoNo, Integer>{

	
}