package dev.m.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// nơi khai báo & lưu trữ các obj dependency --> gửi cho Spring Container nó đang giữ
@Configuration
@ComponentScan("dev.m.bean")// scan all các class nào có anotation trong package dev.m.scan --> new nó và goị là bean
public class AppConfig {
    // có 2 cách để 1 class là 1 bean.
    // 1- thêm các anotation @service,@component,.. sẽ được spring auto new
    // 2- Khai báo trực tiếp các class đó vào @Configuration với @Bean
    @Bean("manhnd")
    public PdfGeneratorBean pdfGenerator() {
        return new PdfGeneratorBean();
    }
}
