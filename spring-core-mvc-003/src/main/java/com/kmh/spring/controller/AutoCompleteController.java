package com.kmh.spring.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kmh.spring.utils.CountryUtils;

@RestController
public class AutoCompleteController {

	@GetMapping(value = { "/searchCity" })
	public ResponseEntity<String> getCityAndCountry(@RequestParam("q") final String input) {

		List<String> strings = CountryUtils.getInstance().doAutoComplete(input);
		ObjectMapper mapper = new ObjectMapper();
		String resp = "";
		try {
			resp = mapper.writeValueAsString(strings);
		} catch (JsonProcessingException e) {
		}
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
}