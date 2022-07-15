package simple.spring.service.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import simple.spring.service.controller.dto.SampleModel;

@RestController
public class SampleRestController {
	
	@Value("${server.base-url}")
	public String baseUrl;
	
	@RequestMapping(value = "/api/samples", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getSamples() {
        List<String> samples = Arrays.asList("Uno", "Dos", baseUrl);

        return new ResponseEntity<>(samples, HttpStatus.OK);
    }

	@RequestMapping(value = "/api/samples", method = RequestMethod.POST)
    public ResponseEntity<SampleModel> createSample(@RequestBody SampleModel sampleModel) {
        // Simulate creating Sample in database...
        return ResponseEntity.ok(sampleModel);
    }
}
