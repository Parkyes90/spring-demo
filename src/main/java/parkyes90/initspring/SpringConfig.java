package parkyes90.initspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parkyes90.initspring.repository.MemberRepository;
import parkyes90.initspring.repository.MemoryMemberRepository;
import parkyes90.initspring.service.MemberService;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
