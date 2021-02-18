package com.easy.mes.coregister10001.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
/**
 *
 * @author LiZiHan
 * @since 2021-02-14
 */
@FeignClient("files-receive")
@Component
public interface FRtest {
    //1、要调用的方法路径

}
