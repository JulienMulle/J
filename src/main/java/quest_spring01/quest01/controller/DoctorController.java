package quest_spring01.quest01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody()
        public String getDoctorWill(){
        return "Voici le Grand Docteur William Hartnell";
    };

    @GetMapping("/doctor/10")
    @ResponseBody()
        public  String getDoctorDavid(){
        return " Voici le Majesteux Docteur David Tenant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody()
        public String getDoctorJodie(){
        return "Voici la Magnifique, la Splendide Docteur Jooooooooooooooodie Whittaker";
    }
}
