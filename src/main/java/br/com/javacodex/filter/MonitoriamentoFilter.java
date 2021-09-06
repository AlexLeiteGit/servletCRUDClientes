package br.com.javacodex.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

///**
// * Servlet Filter implementation class MonitoriamentoFilter
// */
@WebFilter("/entrada")
public class MonitoriamentoFilter implements Filter {

//    /**
//     * Default constructor. 
//     */
//    public MonitoriamentoFilter() {
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see Filter#destroy()
//	 */
//	public void destroy() {
//		// TODO Auto-generated method stub
//	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		
		System.out.println("MonitoramentoFilter");
		
		long antes = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");

        //executa a ação
		chain.doFilter(request, response);

        long depois = System.currentTimeMillis();

        System.out.println("Tempo de execução da ação "+ acao + " -> " +  (depois - antes));
	}

//	/**
//	 * @see Filter#init(FilterConfig)
//	 */
//	public void init(FilterConfig fConfig) throws ServletException {
//		// TODO Auto-generated method stub
//	}

}
