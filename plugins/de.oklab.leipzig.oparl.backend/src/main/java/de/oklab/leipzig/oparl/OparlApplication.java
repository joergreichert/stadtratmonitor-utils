package de.oklab.leipzig.oparl;

import org.assertj.core.util.Sets;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;

import de.oklab.leipzig.oparl.converter.SystemConverter;

@SpringBootApplication
public class OparlApplication {

    public static void main(String[] args) {
        SpringApplication.run(OparlApplication.class, args);
    }

    @Bean(name = "conversionService")
    public ConversionService getConversionService() {
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        bean.setConverters(Sets.newLinkedHashSet(new SystemConverter()));
        bean.afterPropertiesSet();
        return bean.getObject();
    }
}
