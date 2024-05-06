package org.example.backend.model.dto.mypage;

/**
 * packageName : org.example.backend.model.dto.mypage
 * fileName : OrderCheckDto
 * author : GGG
 * date : 2024-05-02
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-05-02         GGG          최초 생성
 */
public interface OrderCheckDto {
    String  getPdThumbnail();       // 상품 썸네일
    String getPdName();            // 상품명
    Integer getOrderDetailCnt();    // 주문상품수량
    Integer getOrderDetailPrice();  // 주문상품가격
    String  getOrderCode();         // 주문상태코드
    String getAddDate();            // 주문날짜
    Integer getOrderId();
}