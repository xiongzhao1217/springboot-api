package com.company.project.web.user;
import com.company.project.core.api.Result;
import com.company.project.core.api.ResultGenerator;
import com.company.project.model.user.Member;
import com.company.project.service.user.MemberService;
import com.company.project.core.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * MemberController created on 2018/03/27.
 * @author CodeGenerator.
 */
@RestController
@RequestMapping("/user/member")
public class MemberController {
    @Resource
    private MemberService memberService;

    @PostMapping("/add")
    public Result add(Member member) {
        memberService.insertSelective(member);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        memberService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Member member) {
        memberService.updateSelective(member);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Member member = memberService.selectById(id);
        return ResultGenerator.genSuccessResult(member);
    }

    @PostMapping("/list")
    public Result list(PageBean pageBean, Member query) {
        PageInfo<Member> pageInfo = PageHelper.startPage(pageBean)
        .setOrderBy(pageBean.getOrderBy())
        .doSelectPageInfo(()->memberService.find(query));
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
