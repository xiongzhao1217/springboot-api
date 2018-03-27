package com.company.project.service.system.impl;

import com.company.project.dao.system.SystemConfigMapper;
import com.company.project.model.system.SystemConfig;
import com.company.project.service.system.SystemConfigService;
import com.company.project.core.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
/**
 * Created on 2018/03/27.
 * @author CodeGenerator.
 */
@Service
@Transactional
public class SystemConfigServiceImpl extends AbstractService<SystemConfig> implements SystemConfigService {
    @Resource
    private SystemConfigMapper systemConfigMapper;

}
