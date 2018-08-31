package cn.tianjin.unifiedfee.ot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients({"cn.taiji","cn.tianjin.unifiedfee"})
@ComponentScan({"cn.taiji","cn.tianjin.unifiedfee"})
public class OtApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtApplication.class, args);
	}

}
