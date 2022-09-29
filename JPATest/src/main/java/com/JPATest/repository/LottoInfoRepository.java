package com.JPATest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JPATest.entity.LottoInfo;

@Repository
public interface LottoInfoRepository extends JpaRepository<LottoInfo, String>{


}