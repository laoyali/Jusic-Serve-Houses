package com.scoder.jusic.model;

import lombok.*;

import java.io.Serializable;

/**
 * @author alang
 * @create 2020-05-20 17:28
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class House implements Serializable {
    private static final long serialVersionUID = 1815307431423026256L;

    private String id;
    /**
     * WebSocketServerSockJsSession 中的 session id，创建者sessionId
     */
    private String sessionId;
    /**
     * 房间名称
     */
    private String name = "default";
    /**
     * 房间描述
     */
    private String desc = "";
    /**
     * ip 地址
     */
    private String remoteAddress = "";

    /**
     * 创建时间
     */
    private Long createTime;


    /**
     * 房间密码
     */
    private String password = "";

    /**
     * 是否可用
     */
    private Boolean enableStatus;

}