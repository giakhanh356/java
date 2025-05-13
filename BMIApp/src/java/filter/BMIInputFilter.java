/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class BMIInputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        try {
            double weight = Double.parseDouble(request.getParameter("weight"));
            double height = Double.parseDouble(request.getParameter("height"));

            if (weight <= 0 || height <= 0) {
                ((HttpServletResponse) response).sendRedirect("bmi.jsp");
                return;
            }
        } catch (NumberFormatException e) {
            ((HttpServletResponse) response).sendRedirect("bmi.jsp");
            return;
        }
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) {}
    public void destroy() {}
}
