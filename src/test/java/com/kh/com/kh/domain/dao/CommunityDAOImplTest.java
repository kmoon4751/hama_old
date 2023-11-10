package com.kh.com.kh.domain.dao;


import com.kh.com.kh.domain.dao.CommunityDAO.CommunityDAO;
import com.kh.com.kh.domain.dao.entity.Community;
import groovy.util.logging.Slf4j;
import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Data
@Slf4j
@SpringBootTest
public class CommunityDAOImplTest {

  @Autowired
  CommunityDAO communityDAO;

  @Test
  @DisplayName("글등록")
  void saveQuestion(){
    Community community = new Community();

    community.setComu_post_id(3L);
    community.setComu_gubun("궁금해요");
    community.setTitle("울산에서 제일 싼 연어");
    community.setContent("아는 업체 있으신 분?");
    community.setMember_id(2L);
    community.setArea("울산");

    Long saveQuestion = communityDAO.saveQuestion(community);
  }

}
