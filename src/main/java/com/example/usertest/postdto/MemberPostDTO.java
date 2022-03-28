package com.example.usertest.postdto;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table
public class MemberPostDTO {
    @Id
    @GeneratedValue
    private long seq;

    @Setter
    @Column(nullable = false)
    private String postTitle;

    @Setter
    @Column(nullable = false)
    private String postContents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
}
