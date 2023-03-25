package Baek.first_spring.repository;

import Baek.first_spring.domain.Member;

import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);

}
