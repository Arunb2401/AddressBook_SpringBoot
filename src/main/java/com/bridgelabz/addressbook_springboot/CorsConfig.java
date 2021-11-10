//package com.bridgelabz.addressbook_springboot;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig {
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedMethods("GET", "POST", "DELETE", "PUT")
//                        .allowedHeaders("*")
//                        .allowedOrigins("http://localhost:4200");
//            }
//        };
//    }
//}
//
//
//
//
//@EnableWebSecurity
//@AllArgsConstructor
//
//public class CorsConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/api3/**").permitAll();
//
//    }
//
//
//    @Configuration
//    @EnableWebMvc
//    public class WebConfigurer implements WebMvcConfigurer {
//
//        @Override
//        public void addCorsMappings(CorsRegistry corsRegistry) {
//            corsRegistry.addMapping("/**")
//                    .allowedOrigins("http://localhost:4200")
//                    .allowedMethods("*")
//                    .maxAge(3600L)
//                    .allowedHeaders("*")
//                    .exposedHeaders("Authorization")
//                    .allowCredentials(true);
//        }
//    }
//}