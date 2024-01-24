package service;

import dao.UserSessionDao;
import dto.CreateUserSessionDto;
import dto.UserSessionDto;
import entity.User_Session;
import lombok.AllArgsConstructor;
import mapper.CreateUserSessionMapper;

import java.util.Optional;

@AllArgsConstructor
public class UserSessionService {
    private final UserSessionDao userSessionDao;
    private final CreateUserSessionMapper userSessionMapper;

    public void create(CreateUserSessionDto userSessionDto) {
        User_Session userSession = userSessionMapper.mapFrom(userSessionDto);
        userSessionDao.createSession(userSession);
    }

    public Optional<UserSessionDto> findToken(Integer customer_id, String ip_address, String device_info) {
        return userSessionDao.findToken(customer_id, ip_address, device_info)
                .map(userSession -> new UserSessionDto(userSession.getSession_token()));
    }
}