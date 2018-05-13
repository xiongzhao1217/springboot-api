package com.company.project.configurer;

import com.company.project.core.exception.BizException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 全局handler前日期统一处理
 * 根据前台日期格式智能转换Date
 * @author xiongzhao
 */
@Component
public class DateConverterConfigurer implements Converter<String, Date> {

    private final Logger logger = LoggerFactory.getLogger(DateConverterConfigurer.class);

    /**
     * 前台传递日期支持自动转Date的日期格式
     */
    private static final List<String> DATE_FORMATS = new ArrayList<>(4);
    static{
        DATE_FORMATS.add("yyyy-MM");
        DATE_FORMATS.add("yyyy-MM-dd");
        DATE_FORMATS.add("yyyy-MM-dd HH:mm");
        DATE_FORMATS.add("yyyy-MM-dd HH:mm:ss");
    }

    @Override
    public Date convert(String dateStr) {
        if(StringUtils.isEmpty(dateStr)){
            return null;
        }
        if(dateStr.matches("^\\d{4}-\\d{1,2}$")){
            return parseDate(dateStr, DATE_FORMATS.get(0));
        }else if(dateStr.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")){
            return parseDate(dateStr, DATE_FORMATS.get(1));
        }else if(dateStr.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}$")){
            return parseDate(dateStr, DATE_FORMATS.get(2));
        }else if(dateStr.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")){
            return parseDate(dateStr, DATE_FORMATS.get(3));
        }else {
            throw new BizException(dateStr+"无法转换为Date类型");
        }
    }

    /**
     * 格式化日期
     * @param dateStr String 字符型日期
     * @param format String 格式
     * @return Date 日期
     */
    public  Date parseDate(String dateStr, String format) {
        Date date=null;
        try {
            DateFormat dateFormat = new SimpleDateFormat(format);
            date = dateFormat.parse(dateStr);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return date;
    }
}
