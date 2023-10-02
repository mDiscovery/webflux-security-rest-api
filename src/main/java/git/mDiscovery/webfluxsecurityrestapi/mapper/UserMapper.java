package git.mDiscovery.webfluxsecurityrestapi.mapper;

import git.mDiscovery.webfluxsecurityrestapi.dto.UserDto;
import git.mDiscovery.webfluxsecurityrestapi.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(UserEntity userEntity);
    UserEntity map(UserDto userDto);
}
