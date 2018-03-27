package com.company.project.web.system;
import com.company.project.core.api.Result;
import com.company.project.core.api.ResultGenerator;
import com.company.project.model.system.SystemConfig;
import com.company.project.service.system.SystemConfigService;
import com.company.project.core.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * SystemConfigController created on 2018/03/27.
 * @author CodeGenerator.
 */
@RestController
@RequestMapping("/system/systemConfig")
public class SystemConfigController {
    @Resource
    private SystemConfigService systemConfigService;

    @PostMapping("/add")
    public Result add(SystemConfig systemConfig) {
        systemConfigService.insertSelective(systemConfig);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        systemConfigService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(SystemConfig systemConfig) {
        systemConfigService.updateSelective(systemConfig);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        SystemConfig systemConfig = systemConfigService.selectById(id);
        return ResultGenerator.genSuccessResult(systemConfig);
    }

    @PostMapping("/list")
    public Result list(PageBean pageBean, SystemConfig query) {
        PageInfo<SystemConfig> pageInfo = PageHelper.startPage(pageBean)
        .setOrderBy(pageBean.getOrderBy())
        .doSelectPageInfo(()->systemConfigService.find(query));
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
