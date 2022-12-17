//DEPRECATED!!!
//package com.bsoftgroup.springcloudapigateway;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//import com.netflix.zuul.exception.ZuulException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ZuulLoggingFilter extends ZuulFilter {
//
//    //Allow to modify or control the incoming requests
//    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Override
//    public boolean shouldFilter() {
//        //Turn on the filter
//        return true;
//    }
//
//    @Override
//    public Object run() throws ZuulException {
//
//        //Filter execution process
////        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
////        logger.info("request -> {} request uri-> {} ",request,request.getRequestURI());
//        logger.info("request -> {} ", RequestContext.getCurrentContext().getZuulRequestHeaders());
//
//        return null;
//    }
//
//    @Override
//    public String filterType() {
//        /*
//         * pre: as soon as the request is received
//         * ROUTING: just before sending the response
//         * middle: just before the routing
//         * */
//        return "pre";
//    }
//
//    @Override
//    public int filterOrder() {
//        //Filter execution order
//        return 1;
//    }
//}