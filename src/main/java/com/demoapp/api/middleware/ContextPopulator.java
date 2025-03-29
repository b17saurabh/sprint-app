package com.demoapp.api.middleware;

import com.demoapp.api.context.CallContext;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
public class CallContextFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        try {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            CallContext context = CallContext.Ongoing();

            // Extract data from headers (Example)
            context.setUserId(httpRequest.getHeader("X-User-Id"));
            context.setAdmin("true".equalsIgnoreCase(httpRequest.getHeader("X-Admin")));

            chain.doFilter(request, response);
        } finally {
            CallContext.clear(); // Clean up after request
        }
    }
}
