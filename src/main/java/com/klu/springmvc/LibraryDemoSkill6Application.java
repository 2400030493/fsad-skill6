git init
git add .
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/yourname/library-demo-skill6.git
git push -u origin mainpackage com.klu.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryDemoSkill6Application {

	public static void main(String[] args) {
		SpringApplication.run(LibraryDemoSkill6Application.class, args);
	}

}
