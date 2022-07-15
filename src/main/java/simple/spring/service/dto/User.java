package simple.spring.service.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User implements Serializable {

	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

}