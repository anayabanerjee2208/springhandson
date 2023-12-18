package uk.co.newday.voiceapp.services;

import org.springframework.stereotype.Service;

import uk.co.newday.voiceapp.models.DirectDebitUpdate.UpdateDirectDebitRequestDto;
import uk.co.newday.voiceapp.models.DirectDebitUpdate.UpdateDirectDebitResponseDto;

@Service
public class DirectDebitServices {

	public UpdateDirectDebitResponseDto UpdateDirectDebit(UpdateDirectDebitRequestDto updateDirectDebitRequestDto) {
		// TODO Auto-generated method stub
		UpdateDirectDebitResponseDto updateDirectDebitResponseDto = new UpdateDirectDebitResponseDto();
		updateDirectDebitResponseDto.setDirectDebitType("2");
		return updateDirectDebitResponseDto;
	}

	public UpdateDirectDebitResponseDto PutDirectDebit(UpdateDirectDebitRequestDto updateDirectDebitRequestDto,
			String accountId) {
		// TODO Auto-generated method stub
		UpdateDirectDebitResponseDto updateDirectDebitResponseDto = new UpdateDirectDebitResponseDto();
		updateDirectDebitResponseDto.setDirectDebitType(accountId);
		return updateDirectDebitResponseDto;
	}

}
