package git.mDiscovery.webfluxsecurityrestapi.mapper;

import git.mDiscovery.webfluxsecurityrestapi.dto.UserDto;
import git.mDiscovery.webfluxsecurityrestapi.entity.UserEntity;

public interface UserMapper {
    UserDto map(UserEntity userEntity);
    UserEntity map(UserDto userDto);
}
