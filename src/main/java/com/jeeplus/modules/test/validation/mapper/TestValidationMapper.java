/**
 * Copyright &copy; 2018-2020 <a href="http://www.yinbin.ink/">青岛前途软件技术</a> All rights reserved.
 */
package com.jeeplus.modules.test.validation.mapper;

import com.jeeplus.core.persistence.BaseMapper;
import com.jeeplus.core.persistence.annotation.MyBatisMapper;
import com.jeeplus.modules.test.validation.entity.TestValidation;

/**
 * 测试校验功能MAPPER接口
 * @author lgf
 * @version 2018-06-12
 */
@MyBatisMapper
public interface TestValidationMapper extends BaseMapper<TestValidation> {
	
}