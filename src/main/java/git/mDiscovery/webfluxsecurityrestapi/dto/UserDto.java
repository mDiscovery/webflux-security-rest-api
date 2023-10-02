package git.mDiscovery.webfluxsecurityrestapi.dto;

import git.mDiscovery.webfluxsecurityrestapi.entity.UserRole;

import java.time.LocalDateTime;

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
