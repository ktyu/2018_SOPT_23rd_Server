package org.sopt.seminar8.repository;

import org.apache.ibatis.annotations.Param;
import org.sopt.seminar8.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ItemRepository extends JpaRepository<Item, Integer> { // <엔티티 클래스, 기본키 타입>

    @Transactional
    void deleteByName(final String name);



    /**
     * Delete 메소드 재정의
     * JPA의 Delete가 내부적으로 find를 한번 하고 삭제를 진행하기 때문에, 재정의함
     * @param user_idx
     */
//    ### 왜 에러나지
//    @Transactional
//    @Modifying
//    @Query("DELETE User u where u.user_idx = :user_idx")
//    void deleteByUserIdx(@Param("user_idx") final int user_idx);

}
