package cn.study.zuulgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MyFilter
 * @Author Elv1s
 * @Date 2020/8/30 15:20
 * @Description:
 */
@Component
public class MyFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        logger.info("sned {} request to {}, params: {}",
                request.getMethod(), request.getRequestURI(), request.getParameterMap());
        // 没有id直接返回
        if (null == request.getParameter("id")) {
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            return currentContext;
        }
        return null;
    }
}
