package Level2;

import org.springframework.stereotype.Component;

@Component()
public class ScienceStudent implements Student{
    @Override
    public String college() {
        return "I am an AIML Student From ABES";
    }
}
