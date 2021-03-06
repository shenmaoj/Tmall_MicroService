/**
*
* @Description
* @author joker 
* @date 创建时间：2018年9月23日 下午8:26:59
* 
*/
package com.tmall.internal.spi.service;

import com.joker.library.dto.ResultDTO;
import com.tmall.common.dto.PropertyDTO;
import com.tmall.common.dto.UserRequestDTO;

/**
* 
* @When
* @Description
* @Detail
* @author joker 
* @date 创建时间：2018年9月23日 下午8:26:59
*/
public interface IInternalPropertyService
{
	ResultDTO<PropertyDTO>findPropertyValues(Integer propertyId);
	
	ResultDTO<?>updateProperty(UserRequestDTO userRequestDTO);
}
