package com.kh.com.kh.domain.dao.MemberDAO;

import com.kh.com.kh.domain.dao.entity.Member;

import java.util.Optional;

public interface MemberDAO {
  Optional<Member> findByInfo (String email);

  Boolean nickExist (String nickname);

  Member insert(Member member);
<<<<<<< HEAD
=======

  Long updateGubun(Long member_id, Long gubun);
>>>>>>> 2788b44fb7e404135f4a8cde4c782e0557ecfe8f
}
