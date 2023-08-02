package my;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("my")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
