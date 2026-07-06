package com.HiveStay.service;

import com.HiveStay.dto.ProfileUpdateRequestDto;
import com.HiveStay.dto.UserDto;
import com.HiveStay.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
