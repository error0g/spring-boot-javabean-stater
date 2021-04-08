package cn.error0;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBeanAutoConfiguration {
    @Bean
    public JavaBean bean()
    {
        return new JavaBean();
    }
}
