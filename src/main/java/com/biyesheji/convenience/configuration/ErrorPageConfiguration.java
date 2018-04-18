package com.biyesheji.convenience.configuration;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author atom
 */
@Configuration
public class ErrorPageConfiguration {

    /**
     * 错误页面bean
     * @return EmbeddedServletContainerCustomizer
     */
    @Bean
    public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer() {
        return new EmbeddedServletContainerCustomizer() {
            @Override
            public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
                ErrorPage error404 = new ErrorPage(HttpStatus.NOT_FOUND, "/error/404");
                ErrorPage error500 = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/error/500");

                configurableEmbeddedServletContainer.addErrorPages(error404, error500);
            }
        };
    }
}
