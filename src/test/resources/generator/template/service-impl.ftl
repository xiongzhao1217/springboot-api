package ${basePackage}.service${modulePath}.impl;

import ${basePackage}.dao${modulePath}.${modelNameUpperCamel}Mapper;
import ${basePackage}.model${modulePath}.${modelNameUpperCamel};
import ${basePackage}.service${modulePath}.${modelNameUpperCamel}Service;
import ${basePackage}.core.base.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
/**
 * Created on ${date}.
 * @author ${author}.
 */
@Service
@Transactional
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {
    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}
