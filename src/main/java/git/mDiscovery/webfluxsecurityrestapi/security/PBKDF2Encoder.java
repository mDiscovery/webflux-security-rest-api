package git.mDiscovery.webfluxsecurityrestapi.security;

import org.springframework.security.crypto.password.PasswordEncoder;

public class PBKDF2Encoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return "";
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}
