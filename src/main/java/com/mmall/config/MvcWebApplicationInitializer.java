package com.mmall.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MvcWebApplicationInitializer
        ///extends AbstractAnnotationConfigDispatcherServletInitializer
{

/*    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {

        return new Class[] {RootConfig.class};//初始化spring的根容器
        //RootConfig.class相当于平常配置的applicationContext.xml文件
    }

    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]
                {SpringMvcConfig.class};//初始化springMVC的子容器
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};//springMVC匹配的路径
    }*/
}
