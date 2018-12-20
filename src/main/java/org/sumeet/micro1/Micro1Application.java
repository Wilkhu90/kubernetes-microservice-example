package org.sumeet.micro1;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.sumeet.micro1.entity.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Micro1Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro1Application.class, args);
	}

	public static void createHtmlDynamically() throws IOException, TemplateException {
		Configuration cfg = new Configuration(new Version("2.3.23"));

		cfg.setClassForTemplateLoading(Micro1Application.class, "/");
		cfg.setDefaultEncoding("UTF-8");

		Template template = cfg.getTemplate("test.ftl");

		Map<String, Object> templateData = new HashMap<>();

		List<User> userList = new ArrayList<>();
		userList.add(new User("Sumeet", "Hi Guys!!"));
		userList.add(new User("Amit", "Hello! Guys..."));

		templateData.put("users", userList);

		try (StringWriter out = new StringWriter()) {

			template.process(templateData, out);
			System.out.println(out.getBuffer().toString());

			out.flush();
		}
	}
}
