package Level3;

import org.springframework.stereotype.Component;

@Component
public class ComerceStudent implements Student{
    @Override
    public String college() {
        return "I am a comerce student";
    }
}
