package com.lucasromagnoli.testador;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucasromagnoli.testador.domain.dto.ApiGithubDTO;

@SpringBootApplication
public class TestadorApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(TestadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
//		ApiGithubDTO response = restTemplate.getForObject(ApiGithubDTO.baseURL + "lucasromagnoli", ApiGithubDTO.class);
		System.out.println(ApiGithubDTO.baseURL + "lucasromagnoli");
		ResponseEntity<String> response = restTemplate.getForEntity(ApiGithubDTO.baseURL + "lucasromagnoli", String.class);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(response.getBody());
		JsonNode name = root.path("blog");
//		 MyRequest body = ...
//				 RequestEntity request = RequestEntity
//				     .post(new URI("https://example.com/foo"))
//				     .accept(MediaType.APPLICATION_JSON)
//				     .body(body);
//				 ResponseEntity<MyResponse> response = template.exchange(request, MyResponse.class);
//		
//		restTemplate.ex
		
		System.out.println("response.getHeaders() -> " + response.getHeaders().toString());
		System.out.println("response.getStatus()  -> " + response.getStatusCode().toString());
		System.out.println("response.Body()  -> " + response.getBody());
	}

}
