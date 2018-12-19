package com.geestu.insurance.response;


/**
 * 状态码
 * @author xiaofei.xian
 *
 * 日期：2018年12月19日 下午6:50:09
 */
public abstract class ResponseCode {
  public static final int REQUEST_SUCCESS = 0;// 请求成功
  public static final int SYSTEM_BUSY = -1;// 系统繁忙
  public static final int SYSTEM_ERROR = -2;// 未知错误
  public static final int MISS_PARAMETER = 10001;// 缺少参数
  public static final int PARAMETER_INVALID = 10002;// 参数不合法
}
