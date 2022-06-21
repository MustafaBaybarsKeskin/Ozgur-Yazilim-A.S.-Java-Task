package com.hospital.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital.model.ReportEntity;

@Repository
public interface ReportRepository extends CrudRepository<ReportEntity, Long>{

	@Query(value = "select * from REPORT r where r.name_surname like %:keyword% or r.social_security_number like %:keyword% or r.laborant like %:keyword%", nativeQuery = true)
	List <ReportEntity> findByKeyword(@Param("keyword") String keyword);

}
