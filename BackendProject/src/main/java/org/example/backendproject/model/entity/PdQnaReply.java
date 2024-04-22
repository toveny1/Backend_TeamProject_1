package org.example.backendproject.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.example.backendproject.model.common.BaseTimeEntity2;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 * packageName : org.example.backendproject.model.entity
 * fileName : PdQnaReply
 * author : SAMSUNG
 * date : 2024-04-19
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-19         SAMSUNG          최초 생성
 */
@Entity
@Table(name="TB_PD_QNA_REPLY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
// soft delete
@Where(clause = "STATUS = 'Y'")
@SQLDelete(sql = "UPDATE TB_PD_QNA_REPLY SET STATUS = 'N' WHERE PD_QNA_REPLY_ID = ?")
public class PdQnaReply extends BaseTimeEntity2 {
//    pd_qna_reply_id	number
//    pd_qna_id	number
//    pd_qna_reply_content	varchar2(4000 byte)
//    add_date	date
//    del_date	date
//    status	char(1 byte)
    @Id
    private Integer pdQnaReplyId;
    private Integer pdQnaId;
    private String pdQnaReplyContent;
}