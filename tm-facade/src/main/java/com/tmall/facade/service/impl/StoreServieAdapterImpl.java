/**
*
* @author joker 
* @date 创建时间：2018年8月28日 上午11:13:34
* 
*/
package com.tmall.facade.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joker.library.dto.ResultDTO;
import com.joker.library.page.PageRequestDTO;
import com.joker.library.page.PageResponseDTO;
import com.tmall.common.dto.BrandDTO;
import com.tmall.common.dto.StoreDTO;
import com.tmall.common.dto.StoreDetail;
import com.tmall.facade.service.IStoreServiceAdapter;
import com.tmall.server.spi.store.IStoreServerFeignService;

/**
 * 
 * @author joker
 * @date 创建时间：2018年8月28日 上午11:13:34
 */
@Service
public class StoreServieAdapterImpl implements IStoreServiceAdapter
{
	@Autowired
	private IStoreServerFeignService storeServerFeignService;

	@Override
	public ResultDTO<StoreDetail> findStoreDetail(Long storeId)
	{
		return storeServerFeignService.findStoreDetail(storeId);
	}


	// @Override
	// public ResultDTO<StoreDTO> findStoreByStoreAbbName(String storeAbbName)
	// {
	// return storeServerFeignService.findStoreByAbbName(storeAbbName);
	// }

}
