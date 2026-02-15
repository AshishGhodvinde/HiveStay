package com.HiveStay.dto;

import com.HiveStay.entity.User;
import com.HiveStay.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
