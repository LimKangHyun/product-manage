package hello.product_manage.web.session;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.SessionTrackingMode;
import java.util.Collections;

@Configuration
public class SessionConfig {

    @Bean
    public ServletContextInitializer servletContextInitializer() {
        return (ServletContext servletContext) -> {
            servletContext.setSessionTrackingModes(Collections.emptySet()); // 자동 세션 생성 방지
        };
    }
}