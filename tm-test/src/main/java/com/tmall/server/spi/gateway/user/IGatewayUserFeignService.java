/**
*
* @author joker 
* @date 创建时间：2018年8月28日 下午12:23:58
* 
*/
package com.tmall.server.spi.gateway.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.joker.library.dto.ResultDTO;


/**
 * 
 * @author joker
 * @date 创建时间：2018年8月28日 下午12:23:58
 */
@FeignClient(name = "gateway")
public interface IGatewayUserFeignService
{
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ResultDTO<String> loginAndAuth(@RequestParam("loginKey") String loginKey, @RequestParam("password") String password,
			@RequestParam("storeAbbName") String storeAbbName);
}
