package boot.dev.tools;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class cntrl_class {
    @RequestMapping("/demo")
    public String go(){
        int a=700;
        int b=9;
        int c=98;
        return "sum of a and b is "+(a+b+c);
    }
}
