package dev.m;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Annotation này tương đương với việc sử dụng đồng thời ba annotation sau:
 *
 * @SpringBootConfiguration: Đây là một phiên bản chuyên biệt của @Configuration trong Spring. Nó cho phép lớp được đánh dấu có thể được sử dụng làm nguồn chính của các định nghĩa bean.
 * @EnableAutoConfiguration: Đây là tính năng cốt lõi của Spring Boot. Nó sẽ tự động cấu hình ứng dụng dựa trên các dependencies (thư viện) bạn đã thêm vào pom.xml hoặc build.gradle. Ví dụ, nếu bạn thêm dependency của Spring Web, Spring Boot sẽ tự động cấu hình Tomcat nhúng và các thành phần liên quan đến web cho bạn.
 * @ComponentScan: Spring sẽ tự động quét (scan) tất cả các package từ package chứa lớp @SpringBootApplication trở xuống để tìm các thành phần Spring khác như @Component, @Service, @Repository, và @Controller.
 */
@SpringBootApplication
public class Session06SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Session06SpringbootApplication.class, args);
    }
}
