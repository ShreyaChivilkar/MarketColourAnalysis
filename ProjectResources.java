package io.project.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.project.CompanyItem;
import io.project.CompanySpecific;
import io.project.DataRepository;
import io.project.UserCompany;


@RestController

public class ProjectResources {
	
	private DataRepository dataRepository;

	public ProjectResources(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apiKey;
	
	
	private static String url = "https://sandbox.iexapis.com/stable/stock/twtr/chart/ytd?token=";
	
	@RequestMapping("/stock")
	public List<CompanySpecific> getCompany() {
		
		
		CompanySpecific []company = restTemplate.getForObject(url+apiKey, CompanySpecific[].class);
		
		//CompanySpecific obj = new CompanySpecific(company.getOpen(),company.getClose());
		
		this.dataRepository.saveAll(Arrays.asList(company));
		return Arrays.asList(company);
		
	
	}		
		
	@RequestMapping("/city")
	public String sayCity()
	{
		return "City";
	}
	
}
