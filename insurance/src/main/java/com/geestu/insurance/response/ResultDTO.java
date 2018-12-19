package com.geestu.insurance.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 返回DTO调整
 *
 * @author xiaofei.xian 日期：2018年5月8日 下午6:10:24
 */

@JsonInclude(Include.NON_NULL)
@Data
@EqualsAndHashCode(callSuper=false)
public class ResultDTO {

  private int resultCode;

  private String message;

  private Object data;

  public ResultDTO() {
    super();
  };

  public ResultDTO(int resultCode, String message) {
    this.resultCode = resultCode;
    this.message = message;
  };

  public ResultDTO(int resultCode, String message, Object data) {
    this.resultCode = resultCode;
    this.message = message;
    this.data = data;
  };

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ResultDTO").append("  resultCode: ").append(resultCode).append(", message: ").append(message);
    return builder.toString();
  }

}
