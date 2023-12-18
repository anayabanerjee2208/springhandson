package uk.co.newday.voiceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uk.co.newday.voiceapp.models.DirectDebitUpdate.UpdateDirectDebitRequestDto;
import uk.co.newday.voiceapp.models.DirectDebitUpdate.UpdateDirectDebitResponseDto;
import uk.co.newday.voiceapp.services.DirectDebitServices;

@RestController
public class DirectDebitController {

	@Autowired
	private DirectDebitServices directDebitServices;
	
	@RequestMapping(method=RequestMethod.POST, value="/UpdateDirectDebit")
	public UpdateDirectDebitResponseDto UpdateDirectDebit(@RequestBody UpdateDirectDebitRequestDto updateDirectDebitRequestDto) {
		return directDebitServices.UpdateDirectDebit(updateDirectDebitRequestDto);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/PutDirectDebit/{accountId}")
	public UpdateDirectDebitResponseDto PutDirectDebit(@RequestBody UpdateDirectDebitRequestDto updateDirectDebitRequestDto, @PathVariable String accountId) {
		return directDebitServices.PutDirectDebit(updateDirectDebitRequestDto, accountId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/DeleteDebit/{accountNumber}")
	public UpdateDirectDebitResponseDto DeleteDirectDebit(@PathVariable String accountNumber) {
		 return new UpdateDirectDebitResponseDto();
	}
	
}
