package com.cloud.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {
    private final   Logger LOGGER = LoggerFactory.getLogger(MyFilter.class);

    /**
     * 过滤器类型
     * @return pre 主要用在路由映射的阶段是寻找路由映射表的
     *          routing:具体的路由转发过滤器是在routing路由器，具体的请求转发的时候会调用
     *          error:一旦前面的过滤器出错了，会调用error过滤器。
     *          post:当routing，error运行完后才会调用该过滤器，是在最后阶段的
     */
    @Override
    public String filterType() {
        return "pre";
    }

//    过滤器执行顺序，数值大的靠后执行
    @Override
    public int filterOrder() {
        return 0;
    }
    //控制过滤器生效不生效，可以在里面写一串逻辑来控制
    @Override
    public boolean shouldFilter() {
        return true;
    }
//执行过滤逻辑
    @Override
    public Object run() throws ZuulException {
        RequestContext con = RequestContext.getCurrentContext();
        HttpServletRequest request = con.getRequest();
        String token = request.getParameter("token");
        if (token==null){
            con.setSendZuulResponse(true);
            con.setResponseStatusCode(401);
            con.setResponseBody("凉了");
            return null;
        }
        return null;
    }
}
