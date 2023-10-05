package git.mDiscovery.webfluxsecurityrestapi.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PBKDF2Encoder implements PasswordEncoder {
    private static final String SECRET_KEY_INSTANCE = "PBKDF2WithHmacSHA512";

    @Value("${jwt.password.encoder.secret}")
    private String secret;
    @Value("${jwt.password.encoder.iterations}")
    private Integer iterations;
    @Value("${jwt.password.encoder.keylength}")
    private Integer keyLength;
    @Override
    public String encode(CharSequence rawPassword) {
        return "";
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}
