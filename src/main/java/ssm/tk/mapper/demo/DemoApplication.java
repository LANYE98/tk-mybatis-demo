package ssm.tk.mapper.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"ssm.tk.mapper.demo.dao"})
@SpringBootApplication(scanBasePackages = {"ssm.tk.mapper.demo.service", "ssm.tk.mapper.demo.controller"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
