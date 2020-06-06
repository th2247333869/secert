package com.mysecret.cn.dto.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @date 200606
 * @author tianhao
 */
@AllArgsConstructor
@Getter
public enum ResponseDtoEnum {
    /**
     * 代表无异常信息
     */
    SUCCESS("200"),
    /**
     * 代表后台执行过程中出现异常
     */
    ERROR("500");

    /**
     * code
     */
    private String code;


}
