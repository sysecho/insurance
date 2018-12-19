package com.geestu.insurance.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 基础异常
 * 
 * @author xiaofei.xian 日期：2018年12月19日 下午6:45:28
 */
@JsonInclude(Include.NON_NULL)
@Data
@EqualsAndHashCode(callSuper=false)
public class BaseException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  /**
   * 异常代码
   */
  protected int resultCode;
  
  /**
   * 异常消息
   */
  protected String msg;

  /**
   * 数据对象
   */
  protected Object data;

  public BaseException(int resultCode, String message, Object data, Throwable e) {
    super(message, e);
    this.resultCode = resultCode;
    this.data = data;
  }

  public BaseException(int resultCode, String message, Object data) {
    this(resultCode, message, data, null);
  }

  public BaseException(int resultCode, String message) {
    this(resultCode, message, null, null);
  }

  public BaseException() {

  }

  public BaseException(Throwable e) {
    super(e);
  }
}
