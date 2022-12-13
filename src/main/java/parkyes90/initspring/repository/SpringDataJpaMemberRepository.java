package parkyes90.initspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import parkyes90.initspring.domain.Member;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
