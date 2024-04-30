package org.example.backendproject.repository.shop;

import org.example.backendproject.model.dto.shop.IProductImgDto;
import org.example.backendproject.model.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : org.example.backendproject.repository.shop
 * fileName : ProductImgRepository
 * author : sjuk2
 * date : 2024-04-30
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-30         sjuk2          최초 생성
 */
@Repository
public interface ProductImgRepository extends JpaRepository<ProductImage, Integer> {
    @Query(value = "SELECT PD_ID AS pdId\n" +
            ", PD_IMG_ID AS pdImgId\n" +
            ", PD_IMG_URL AS pdImgUrl\n" +
            "FROM TB_PRODUCT_IMAGE\n" +
            "WHERE PD_ID LIKE '%' || PD_ID || '%'\n" +
            "ORDER BY PD_IMG_ID"
    , nativeQuery = true)
    List<IProductImgDto> findAllByPdIdContaining(@Param("pdId") Integer pdId);
}