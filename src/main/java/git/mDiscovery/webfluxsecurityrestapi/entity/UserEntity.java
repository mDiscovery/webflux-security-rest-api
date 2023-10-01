package git.mDiscovery.webfluxsecurityrestapi.entity;

import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
@Table("users")
public class UserEntity {
    private Long id;
    private String username;
    private String password;
    private String role;
    private String firstName;
    private String lastName;
    private boolean enabled;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
