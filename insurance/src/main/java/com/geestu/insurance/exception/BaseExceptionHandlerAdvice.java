package com.geestu.insurance.exception;

import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.geestu.insurance.response.ResponseCode;
import com.geestu.insurance.response.ResultDTO;

/**
* 异常处理
* @author xiaofei.xian
* 日期：2018年5月8日 下午6:09:36
*/

@ControllerAdvice(annotations = Controller.class)
public class BaseExceptionHandlerAdvice {
  
  private static Logger logger = LoggerFactory.getLogger(BaseExceptionHandlerAdvice.class);

  @ExceptionHandler(value = BaseException.class)
  @ResponseBody
  public ResponseEntity<ResultDTO> exception(Exception exception, HttpServletResponse response) {
    ResultDTO resultDTO = new ResultDTO();
    if (exception instanceof BaseException) {// 异常
      BaseException apiException = (BaseException) exception;
      resultDTO.setMessage(apiException.getMessage());
      resultDTO.setResultCode(apiException.getResultCode());
    } else {// 未知异常
      resultDTO.setResultCode(ResponseCode.SYSTEM_ERROR);
      resultDTO.setMessage("未知异常");
    }
    logger.info(resultDTO.toString());
    resultDTO.setMessage(exception.getMessage());
    ResponseEntity<ResultDTO> responseEntity = new ResponseEntity<>(resultDTO, HttpStatus.valueOf(response.getStatus()));
    return responseEntity;
  }

}