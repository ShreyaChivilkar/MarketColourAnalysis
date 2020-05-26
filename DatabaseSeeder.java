package io.project.resources;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.project.CompanySpecific;
import io.project.DataRepository;


@Component
public class DatabaseSeeder implements CommandLineRunner{
	
	private DataRepository dataRepository;

	public DatabaseSeeder(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	@Override
	public void run(String...strings) throws Exception{
	
		CompanySpecific obj = new CompanySpecific("xyz",67.98,89);
		
		this.dataRepository.deleteAll();
		
}
}
