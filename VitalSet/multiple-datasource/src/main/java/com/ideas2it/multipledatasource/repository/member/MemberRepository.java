package com.ideas2it.multipledatasource.repository.member;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ideas2it.multipledatasource.model.member.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}