package org.sopt.seminar8.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity // JPA
@Table(name = "item") // 테이블 네임 별도로 매핑, 디폴트는 첫글자 대문자임
public class Item {

    @Id // 기본키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL은 IDENTITY, Oracle은 SEQUENCE, 자동은 AUTO
    private int id;

    @Column(name = "name") // 컬럼 이름 명시, DB컬럼이름과 다를경우 이렇게 매핑가능
    private String name;
}
