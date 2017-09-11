package com.olts.discipline.rest.mapper.impl;

import com.olts.discipline.entity.User;
import com.olts.discipline.rest.dto.UserGETDto;
import com.olts.discipline.rest.dto.UserPutDto;
import com.olts.discipline.rest.mapper.UserMapper;
import org.springframework.stereotype.Component;

/**
 * OLTS on 25.08.2017.
 */
/* MapStruct doesn't work with lombok for entity (only for dto) */
@Component("userMapper")
public class UserMapperImpl implements UserMapper {

    @Override
    public UserGETDto pojoToDto(User user) {
        UserGETDto userGETDto = new UserGETDto();
        userGETDto.setUsername(user.getUsername());
        userGETDto.setFirstName(user.getFirstName());
        userGETDto.setSecondName(user.getSecondName());
        userGETDto.setLastName(user.getLastName());
        userGETDto.setEmail(user.getEmail());
        userGETDto.setHidden(user.getHidden());
        userGETDto.setLevel(user.getLevel());
        userGETDto.setLevelPercentage(user.getLevelPercentage());
        userGETDto.setProgressPerDay(user.getProgressPerDay());
        userGETDto.setScore(user.getScore());
        userGETDto.setHabitScore(user.getHabitScore());
        userGETDto.setTaskScore(user.getTaskScore());
        userGETDto.setCreatedWhen(user.getCreatedWhen());
        userGETDto.setRank(user.getRank());
        userGETDto.setBirthDate(user.getBirthDate());
        userGETDto.setCity(user.getCity());
        userGETDto.setCountry(user.getCountry());
        return userGETDto;
    }

    @Override // todo
    public User userGETDtouser(UserGETDto userGETDto) {
        return null;
    }

    @Override
    public UserPutDto userToUserPutDto(User user) {
        UserPutDto userPutDto = new UserPutDto();
        userPutDto.setFirstName(user.getFirstName());
        userPutDto.setSecondName(user.getSecondName());
        userPutDto.setLastName(user.getLastName());
        userPutDto.setEmail(user.getEmail());
        userPutDto.setHidden(user.getHidden());
        userPutDto.setBirthDate(user.getBirthDate());
        userPutDto.setCity(user.getCity());
        userPutDto.setCountry(user.getCountry());
        return userPutDto;
    }

    @Override
    public User userPutDtoToUser(UserPutDto userPutDto) {
        return null;
    }
}
