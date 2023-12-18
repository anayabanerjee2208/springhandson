package com.fun.learn.courseapp.services;

import com.fun.learn.courseapp.models.DirectDebitUpdate.UpdateDirectDebitRequestDto;
import com.fun.learn.courseapp.models.DirectDebitUpdate.UpdateDirectDebitResponseDto;
import org.springframework.stereotype.Service;

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
