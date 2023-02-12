package pl.dawidkaszuba.reportservice.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "reportservice")
@Getter
@Setter
@ToString
public class ReportServiceConfig {
    private String message;
    private String buildVersion;
}
