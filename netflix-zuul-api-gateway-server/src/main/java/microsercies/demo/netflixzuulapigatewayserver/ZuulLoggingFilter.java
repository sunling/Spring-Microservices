package microsercies.demo.netflixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter {
 
	private static final Logger log = LoggerFactory.getLogger(ZuulLoggingFilter.class);

	@Override
	public boolean shouldFilter() { 
		return false;
	}

	@Override
	public int filterOrder() { 
		return 0;
	}

	@Override
	public String filterType() { 
		return "pre";
	}

	@Override
	public Object run() throws ZuulException { 
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		log.info("request -> {}, request uri -> {}",
				request,request.getRequestURI());
		return null;
	}

}
