package com.company.project.service.user.impl;

import com.company.project.dao.user.MemberMapper;
import com.company.project.model.user.Member;
import com.company.project.service.user.MemberService;
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
public class MemberServiceImpl extends AbstractService<Member> implements MemberService {
    @Resource
    private MemberMapper memberMapper;

}
