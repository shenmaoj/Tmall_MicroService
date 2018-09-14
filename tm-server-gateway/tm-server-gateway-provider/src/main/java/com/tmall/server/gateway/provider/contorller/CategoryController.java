/**
*
* @author joker 
* @date 创建时间：2018年9月14日 下午10:00:19
* 
*/
package com.tmall.server.gateway.provider.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joker.library.dto.ResultDTO;
import com.joker.library.page.PageRequestDTO;
import com.joker.library.page.PageResponseDTO;
import com.tmall.common.dto.CategoryDTO;
import com.tmall.facade.service.IFacadedService;

/**
 * 
 * @author joker
 * @date 创建时间：2018年9月14日 下午10:00:19
 */
@RestController
@RequestMapping(value = "/valid/category")
public class CategoryController
{

	@Autowired
	private IFacadedService facadedService;

	@PostMapping(value = "/show", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResultDTO<PageResponseDTO<List<CategoryDTO>>> findCategoriesByPage(
			@RequestBody PageRequestDTO pageRequestDTO)
	{
		return facadedService.findCategoriesByPage(pageRequestDTO);
	}
}
