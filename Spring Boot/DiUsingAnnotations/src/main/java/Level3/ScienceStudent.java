package Level3;

import org.springframework.stereotype.Component;

@Component
public class ScienceStudent implements Student {
    @Override
    public String college() {
        return "I am an Science Student From ABES";
    }
}
