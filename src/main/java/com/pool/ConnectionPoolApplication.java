package com.pool;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(exclude = {
		JdbcTemplateAutoConfiguration.class,
		DataSourceAutoConfiguration.class
})
public class ConnectionPoolApplication implements CommandLineRunner {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ConnectionPoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App started");

		jdbcTemplate.update("insert into user values (4, 'Gupta ji', 'kanpurvale')");
		System.out.println("Updating document");
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select * from user");
		queryForList.forEach(item -> {
			System.out.println("id: " + item.get("id"));
			System.out.println("name: " + item.get("name"));
			System.out.println("about: " + item.get("about"));
			System.out.println("____________________");
		});
	}

}
