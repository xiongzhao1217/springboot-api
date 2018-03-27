package ${basePackage}.web${modulePath};

import ${basePackage}.core.api.Result;
import ${basePackage}.core.api.ResultGenerator;
import ${basePackage}.model${modulePath}.${modelNameUpperCamel};
import ${basePackage}.service${modulePath}.${modelNameUpperCamel}Service;
import ${basePackage}.core.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
/**
 * ${modelNameUpperCamel}Controller created on ${date}.
 * @author ${author}.
 */
@RestController
@RequestMapping("/${modulePath ? substring(1)}/${modelNameLowerCamel}")
public class ${modelNameUpperCamel}Controller {
    @Resource
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @PostMapping
    public Result add(@RequestBody ${modelNameUpperCamel} ${modelNameLowerCamel}) {
        ${modelNameLowerCamel}Service.insertSelective(${modelNameLowerCamel});
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        ${modelNameLowerCamel}Service.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody ${modelNameUpperCamel} ${modelNameLowerCamel}) {
        ${modelNameLowerCamel}Service.updateSelective(${modelNameLowerCamel});
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.selectById(id);
        return ResultGenerator.genSuccessResult(${modelNameLowerCamel});
    }

    @GetMapping
    public Result list(PageBean pageBean, UserAccount query) {
        PageInfo<${modelNameUpperCamel}> pageInfo = PageHelper.startPage(pageBean)
        .setOrderBy(pageBean.getOrderBy())
        .doSelectPageInfo(()->${modelNameLowerCamel}Service.find(query));
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
