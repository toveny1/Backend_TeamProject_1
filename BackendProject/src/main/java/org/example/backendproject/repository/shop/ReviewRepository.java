package org.example.backendproject.repository.shop;

import org.example.backendproject.model.dto.shop.IReviewDto;
import org.example.backendproject.model.entity.PdReview;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * packageName : org.example.backendproject.repository.shop
 * fileName : ReviewRepository
 * author : sjuk2
 * date : 2024-04-24
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-24         sjuk2          최초 생성
 */
@Repository
public interface ReviewRepository extends JpaRepository<PdReview, Integer> {
    @Query(value = "SELECT PR.USER_ID AS userId, PR.REVIEW_TITLE AS reviewTitle\n" +
            ", PR.REVIEW_CONTENT AS reviewContent, PR.REVIEW_RATE AS reviewRate\n" +
            ", PR.ADD_DATE AS AddDate, PRI.REVIEW_IMG_URL AS reviewImgUrl\n" +
            "FROM TB_PD_REVIEW PR, TB_PD_REVIEW_IMG PRI\n" +
            "WHERE PR.REVIEW_ID = PRI.REVIEW_ID(+)"
    , countQuery = "SELECT Count(*)\n" +
            "FROM TB_PD_REVIEW PR, TB_PD_REVIEW_IMG PRI\n" +
            "WHERE PR.REVIEW_ID = PRI.REVIEW_ID(+)"
    , nativeQuery = true)
    Page<IReviewDto> selectByReviewContaining(Integer reviewId, Pageable pageable);
}