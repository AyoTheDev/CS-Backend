package com.scienta.cs.easypost.verification.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VerificationsDto {
    	VerificationDto zip4 ;//	Only applicable to US addresses - checks and sets the ZIP+4
    	VerificationDto delivery ;//	Checks that the address is deliverable and makes minor corrections to spelling/format. US addresses will also have their "residential" status checked and set.
}
