package in.brytcode.reservnxt.service;

import javax.servlet.*;
import java.io.IOException;

public class CustomFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter-Before");
        chain.doFilter(request,response);
        System.out.println("Filter-After");
    }
}
