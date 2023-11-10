package com.kh.com.kh.domain.dao.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {
  private Long member_id;
  private String email;
  private String passwd;
  private String nickname;
  private String hobby;
  private String gubun;
<<<<<<< HEAD
  private String tel;
  private Long pic;
=======
  private byte[] pic;
>>>>>>> 2788b44fb7e404135f4a8cde4c782e0557ecfe8f
  private LocalDateTime cdate;
  private LocalDateTime udate;
}
