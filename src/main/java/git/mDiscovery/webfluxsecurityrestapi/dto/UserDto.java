package git.mDiscovery.webfluxsecurityrestapi.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import git.mDiscovery.webfluxsecurityrestapi.entity.UserRole;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private UserRole role;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
