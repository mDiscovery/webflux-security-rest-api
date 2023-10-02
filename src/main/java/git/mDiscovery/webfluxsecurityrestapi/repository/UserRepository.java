package git.mDiscovery.webfluxsecurityrestapi.repository;

import git.mDiscovery.webfluxsecurityrestapi.entity.UserEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface UserRepository extends R2dbcRepository<UserEntity, Long> {
}
