package com.mysecret.cn.dto;


import lombok.*;
import lombok.experimental.Accessors;

/**
 * @date 200606
 * @author tianhao
 */
@Accessors(chain = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor(staticName= "of")
public class ResponseDTO {

    /**
     * 表明对应请求的返回处理结果 “success” 或 “error”
     */
    @NonNull private String status;

    /**
     * 若status=error,则data内使用通用的错误码格式
     * 若status=success,则data内返回前端需要的json数据
     */
    private Object data;

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}