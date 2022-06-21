package com.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.exception.RecordNotFoundException;
import com.hospital.model.ReportEntity;
import com.hospital.model.repository.ReportRepository;


@Service
public class ReportService {

	@Autowired
	ReportRepository repository;
	
	public List<ReportEntity> getAllReports(){
		System.out.println("getAllReports");
		List <ReportEntity> result = (List<ReportEntity>) repository.findAll();
			    
		if(result.size() > 0)
			return result;
		else
			return (List<ReportEntity>) repository.findAll();
	}
	
	public ReportEntity getReportById(Long id) throws RecordNotFoundException 
	{
		System.out.println("getReportById");
		Optional<ReportEntity> report = repository.findById(id);
		
		if(report.isPresent()) {
			return report.get();
		} else {
			throw new RecordNotFoundException("No report record exist for given id");
		}
	}
	
	public ReportEntity createOrUpdateReport(ReportEntity entity) 
	{
		System.out.println("createOrUpdateReport");

		if(entity.getId()  == null) 
		{
			entity = repository.save(entity);
			
			return entity;
		} 
		else 
		{
			Optional<ReportEntity> report = repository.findById(entity.getId());
			
			if(report.isPresent()) 
			{
				ReportEntity newEntity = report.get();
				newEntity.setNameSurname(entity.getNameSurname());
				newEntity.setSocialSecurityNumber(entity.getSocialSecurityNumber());				
				newEntity.setDiagnosis(entity.getDiagnosis());
				newEntity.setDiagnosisDetail(entity.getDiagnosisDetail());
				newEntity.setDateOfReport(entity.getDateOfReport());
				newEntity.setData(entity.getData());
				newEntity.setLaborant(entity.getLaborant());
				newEntity = repository.save(newEntity);
				
				return newEntity;
				
			} else {
				entity = repository.save(entity);
				
				return entity;
			}
		}
	} 
	
	public void deleteReportById(Long id) throws RecordNotFoundException 
	{
		System.out.println("deleteReportById");
		
		Optional<ReportEntity> report = repository.findById(id);
		
		if(report.isPresent()) 
		{
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No report record exist for given id");
		}
	}
	
	 public List<ReportEntity> getByKeyword(String keyword){
		  return repository.findByKeyword(keyword);
		}
	
}
