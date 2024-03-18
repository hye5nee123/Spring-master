package com.example.demo.ex;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.emp.EmpVO;

@Controller
public class ExController {

	@RequestMapping("/ex6")
	public String ex6(EmpVO vo, MultipartFile[] photos) throws IllegalStateException, IOException {
	    // 이 메서드는 "/ex6" 엔드포인트에 매핑되어 있으며, 해당 엔드포인트로의 HTTP 요청을 처리합니다.

	    // 파일 업로드를 처리하는 메서드입니다.
	    // EmpVO는 직원에 관련된 여러 속성을 포함하는 Java Bean 클래스일 것입니다.
	    // MultipartFile[] photos는 폼을 통해 업로드된 파일들을 나타냅니다.
	    // MultipartFile 클래스는 Spring MVC에서 파일 업로드를 처리하기 위해 제공됩니다.
	    System.out.println(vo);

	    // 업로드된 파일이 null이 아니고, 파일이 포함되어 있는지 확인합니다.
	    if (photos != null) {
	        for (MultipartFile photo : photos) {
	            // 파일의 크기가 0보다 큰지 확인합니다. 즉, 파일이 비어있지 않은지 확인합니다.
	            if (photo.getSize() > 0) {
	                // 업로드된 파일을 "d:/upload" 디렉토리에 원래 파일 이름으로 저장합니다.
	                File file = new File("d:/upload", photo.getOriginalFilename());
	                photo.transferTo(file);

	                // 각 업로드된 파일의 파일 이름과 크기를 콘솔에 출력합니다.
	                System.out.println("파일명: " + photo.getOriginalFilename());
	                System.out.println("파일크기: " + photo.getSize());
	            }
	        }
	    }
	    // 파일 업로드 작업이 완료된 후에는 "index" 문자열을 반환합니다. 
	    // 이는 파일 업로드 작업이 완료된 후에 렌더링할 뷰 이름 또는 템플릿을 나타낼 것입니다.
	    return "index";
	}
	@RequestMapping("/ex3")
	public String ex3(ListCodeVO vo) {
		System.out.println(vo);
		return "index";
	}

	@RequestMapping("/ex4/{username}/{userage}")
	public String ex4(@PathVariable String username, @PathVariable(name = "userage") int age) {
		System.out.println("username" + username);
		System.out.println("age" + age);
		return "index";
	}

	@RequestMapping("/ex5") // 커맨드 객체 없이 파라미터 localhost:8081/ex5
	public String ex5(String username, @RequestParam(required = false, defaultValue = "10") Integer age) {
		System.out.println("username " + username);
		System.out.println("age " + age);
		return "index";
	}
}