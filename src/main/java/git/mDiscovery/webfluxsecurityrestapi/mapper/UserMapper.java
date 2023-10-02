package git.mDiscovery.webfluxsecurityrestapi.mapper;

import git.mDiscovery.webfluxsecurityrestapi.dto.UserDto;
import git.mDiscovery.webfluxsecurityrestapi.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(UserEntity userEntity);
    @InheritInverseConfiguration
    UserEntity map(UserDto userDto);
}
