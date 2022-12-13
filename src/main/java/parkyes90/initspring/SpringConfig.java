package parkyes90.initspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parkyes90.initspring.repository.MemberRepository;
import parkyes90.initspring.service.MemberService;

@Configuration
public class SpringConfig {
    private final MemberRepository memberRepository;


    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

}
