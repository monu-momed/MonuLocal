package com.wipro.emaas.pbaportal.professional_claim.controller;

import com.wipro.emaas.pbaportal.professional_claim.model.Claim;
import com.wipro.emaas.pbaportal.professional_claim.model.ClaimResponse;
import com.wipro.emaas.pbaportal.professional_claim.service.ProfessionalClaimService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Getter
@Setter
@RequestMapping("/api/claims/professional")
public class ProfessionalClaimController {

	private final ProfessionalClaimService professionalClaimService;

	@GetMapping("")
	private List<Claim> findAll() {

		return professionalClaimService.findAll();
	}


	@GetMapping("/{id}")
	private String findById(@PathVariable String id) {

		return professionalClaimService.findByIdString(id);
	}

	@GetMapping("/obj/{id}")
	private ClaimResponse findByIdObj(@PathVariable String id) {
		return professionalClaimService.findByIdObj(id);
	}

	@PostMapping(path="", consumes = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	private String create(@RequestBody Claim claim) {
		System.out.println(claim.toString());
		return professionalClaimService.create(claim);
	}

	@PutMapping("/{id}")
	private Claim update(@PathVariable Integer id, @RequestBody Claim claim) {
		return professionalClaimService.update(id, claim);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	private void delete(@PathVariable Integer id) {
		professionalClaimService.delete(id);
	}

}
