package com.example.usertest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table
public class MemberDTO {
    // 자동생성 여서 @Id, @GeneratedValue annotaion을 붙여준다.
    @Id
    @GeneratedValue
    private long seq;

    @Column(unique = true)
    private String userid;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String userName;
}
