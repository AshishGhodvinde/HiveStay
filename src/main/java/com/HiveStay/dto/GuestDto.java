package com.HiveStay.dto;

import com.HiveStay.entity.User;
import com.HiveStay.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
