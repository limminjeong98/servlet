package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// @Controller 대신에 @Component와 @RequestMapping을 같이 써도 된다.
// RequestMappingHandlerMapping이 스프링 빈 중에서
//  @RequestMapping 또는 @Controller가 클래스 레벨에 붙어있는 경우에 매핑 정보로 인식한다.
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
