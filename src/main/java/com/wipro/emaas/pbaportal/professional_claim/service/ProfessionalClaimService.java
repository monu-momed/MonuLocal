package com.wipro.emaas.pbaportal.professional_claim.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wipro.emaas.pbaportal.professional_claim.model.Claim;
import com.wipro.emaas.pbaportal.professional_claim.model.ClaimResponse;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
@AllArgsConstructor
public class ProfessionalClaimService {
	private final RestClient client;

	public List<Claim> findAll() {

		List<Claim> claims = client.get()
				.uri("/professional")
				.retrieve()
				.body(new ParameterizedTypeReference<List<Claim>>() {});
	
		return claims;

	}

	public String findByIdString(String id) {
		String claimResponse = client.get()
				.uri("/{id}", id)
				.retrieve()
				.body(String.class);
		return claimResponse;
	}

	public ClaimResponse findByIdObj(String id) {
		ClaimResponse response = null;
		String claimResponse = client.get()
				.uri("/{id}", id)
				.retrieve()
				.body(String.class);
		System.out.println("Raw data: " + claimResponse);
		ObjectMapper m = new ObjectMapper();
		try {

			m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			m.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX")); // ISO format
			response = m.readValue(claimResponse, ClaimResponse.class);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return response;
	}
	
	public ClaimResponse findById(String id) {
		ClaimResponse claimResponse = client.get()
				.uri("/{id}", id)
				.retrieve()
				.body(ClaimResponse.class);
		return claimResponse;
	}





	public String create(Claim claim) {

		String response =  client.post()
				.uri("/professional")
				.contentType(MediaType.APPLICATION_JSON)
				.body(claim)
				.retrieve()
				.body(String.class);

		return response;
	}

	public Claim update(Integer id, Claim claim) {
		Claim response =   client.put()
				.uri("/professional/{id}", id)
				.contentType(MediaType.APPLICATION_JSON)
				.body(claim)
				.retrieve()
				.body(Claim.class);
		return response;
	}

	public void delete(Integer id) {
		client.delete()
				.uri("/professional/{id}", id)
				.retrieve()
				.toBodilessEntity();
	}

}