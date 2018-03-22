package com.company.project.service.impl;

import com.company.project.dao.UserAccountMapper;
import com.company.project.model.UserAccount;
import com.company.project.service.UserAccountService;
import com.company.project.core.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
/**
 * Created by CodeGenerator on 2018/03/10.
 */
@Service
@Transactional
public class UserAccountServiceImpl extends AbstractService<UserAccount> implements UserAccountService {
    @Resource
    private UserAccountMapper userAccountMapper;

}
