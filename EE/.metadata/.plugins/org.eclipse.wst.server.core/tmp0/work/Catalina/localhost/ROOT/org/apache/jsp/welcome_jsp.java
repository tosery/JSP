/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-09-06 13:18:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\"\r\n");
      out.write("	content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\r\n");
      out.write("<meta name=\"generator\" content=\"Hugo 0.80.0\">\r\n");
      out.write("<title>Eco_Home</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap START -->\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap START -->\r\n");
      out.write("<link href=\"/resources/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"/resources/css/dashboard.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Bootstrap END css의 순서도 매우 중요! 위에 두개 순서 바꾸면 전혀 다른 결과 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".bd-placeholder-img {\r\n");
      out.write("	font-size: 1.125rem;\r\n");
      out.write("	text-anchor: middle;\r\n");
      out.write("	-webkit-user-select: none;\r\n");
      out.write("	-moz-user-select: none;\r\n");
      out.write("	-ms-user-select: none;\r\n");
      out.write("	user-select: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( min-width : 768px) {\r\n");
      out.write("	.bd-placeholder-img-lg {\r\n");
      out.write("		font-size: 3.5rem;\r\n");
      out.write("	}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav\r\n");
      out.write("		class=\"navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow\">\r\n");
      out.write("		<a class=\"navbar-brand col-md-3 col-lg-2 mr-0 px-3\" href=\"/welcome.jsp\"> \r\n");
      out.write("			깊은경제학\r\n");
      out.write("		</a>\r\n");
      out.write("		<button class=\"navbar-toggler position-absolute d-md-none collapsed\"\r\n");
      out.write("			type=\"button\" data-toggle=\"collapse\" data-target=\"#sidebarMenu\"\r\n");
      out.write("			aria-controls=\"sidebarMenu\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<input class=\"form-control form-control-dark w-100\" type=\"text\"\r\n");
      out.write("			placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("		<ul class=\"navbar-nav px-3\">\r\n");
      out.write("			<li class=\"nav-item text-nowrap\"><a class=\"nav-link\" href=\"#\">Sign\r\n");
      out.write("					out</a></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<nav id=\"sidebarMenu\"\r\n");
      out.write("				class=\"col-md-3 col-lg-2 d-md-block bg-light sidebar collapse\">\r\n");
      out.write("				<div class=\"sidebar-sticky pt-3\">\r\n");
      out.write("					<ul class=\"nav flex-column\">\r\n");
      out.write("						<li class=\"nav-item\">\r\n");
      out.write("							<a class=\"nav-link active\" href=\"#\">\r\n");
      out.write("								<span data-feather=\"home\"></span> Dashboard <span class=\"sr-only\">(current)</span>\r\n");
      out.write("							</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"nav-item\">\r\n");
      out.write("							<a class=\"nav-link active\" href=\"/board/listArticles.do\">\r\n");
      out.write("								 <i data-feather=\"bar-chart-2\"></i> 경제이야기\r\n");
      out.write("							</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"nav-item\">\r\n");
      out.write("							<a class=\"nav-link\" href=\"/cpta.jsp\"> \r\n");
      out.write("								<i data-feather=\"file-text\"></i> 세무/회계\r\n");
      out.write("							</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"nav-item\">\r\n");
      out.write("							<a class=\"nav-link\" href=\"/cpta.jsp\"> \r\n");
      out.write("								<i data-feather=\"layers\"></i> Information Technology\r\n");
      out.write("							</a>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("\r\n");
      out.write("					<h6\r\n");
      out.write("						class=\"sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted\">\r\n");
      out.write("						<span>Saved reports</span> <a\r\n");
      out.write("							class=\"d-flex align-items-center text-muted\" href=\"#\"\r\n");
      out.write("							aria-label=\"Add a new report\"> <span\r\n");
      out.write("							data-feather=\"plus-circle\"></span>\r\n");
      out.write("						</a>\r\n");
      out.write("					</h6>\r\n");
      out.write("					<ul class=\"nav flex-column mb-2\">\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> <span\r\n");
      out.write("								data-feather=\"file-text\"></span> Current month\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> <span\r\n");
      out.write("								data-feather=\"file-text\"></span> Last quarter\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> <span\r\n");
      out.write("								data-feather=\"file-text\"></span> Social engagement\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"> <span\r\n");
      out.write("								data-feather=\"file-text\"></span> Year-end sale\r\n");
      out.write("						</a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("\r\n");
      out.write("			<main role=\"main\" class=\"col-md-9 ml-sm-auto col-lg-10 px-md-4\">\r\n");
      out.write("				<div\r\n");
      out.write("					class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom\">\r\n");
      out.write("					<h1 class=\"h2\">Dashboard</h1>\r\n");
      out.write("					<div class=\"btn-toolbar mb-2 mb-md-0\">\r\n");
      out.write("						<div class=\"btn-group mr-2\">\r\n");
      out.write("							<button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Share</button>\r\n");
      out.write("							<button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Export</button>\r\n");
      out.write("						</div>\r\n");
      out.write("						<button type=\"button\"\r\n");
      out.write("							class=\"btn btn-sm btn-outline-secondary dropdown-toggle\">\r\n");
      out.write("							<span data-feather=\"calendar\"></span> This week\r\n");
      out.write("						</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<canvas class=\"my-4 w-100\" id=\"myChart\" width=\"900\" height=\"380\"></canvas>\r\n");
      out.write("\r\n");
      out.write("				<h2>Section title</h2>\r\n");
      out.write("				<div class=\"table-responsive\">\r\n");
      out.write("					<table class=\"table table-striped table-sm\">\r\n");
      out.write("						<thead>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th>#</th>\r\n");
      out.write("								<th>Header</th>\r\n");
      out.write("								<th>Header</th>\r\n");
      out.write("								<th>Header</th>\r\n");
      out.write("								<th>Header</th>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,001</td>\r\n");
      out.write("								<td>random</td>\r\n");
      out.write("								<td>data</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("								<td>text</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,002</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("								<td>irrelevant</td>\r\n");
      out.write("								<td>visual</td>\r\n");
      out.write("								<td>layout</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,003</td>\r\n");
      out.write("								<td>data</td>\r\n");
      out.write("								<td>rich</td>\r\n");
      out.write("								<td>dashboard</td>\r\n");
      out.write("								<td>tabular</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,003</td>\r\n");
      out.write("								<td>information</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("								<td>illustrative</td>\r\n");
      out.write("								<td>data</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,004</td>\r\n");
      out.write("								<td>text</td>\r\n");
      out.write("								<td>random</td>\r\n");
      out.write("								<td>layout</td>\r\n");
      out.write("								<td>dashboard</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,005</td>\r\n");
      out.write("								<td>dashboard</td>\r\n");
      out.write("								<td>irrelevant</td>\r\n");
      out.write("								<td>text</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,006</td>\r\n");
      out.write("								<td>dashboard</td>\r\n");
      out.write("								<td>illustrative</td>\r\n");
      out.write("								<td>rich</td>\r\n");
      out.write("								<td>data</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,007</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("								<td>tabular</td>\r\n");
      out.write("								<td>information</td>\r\n");
      out.write("								<td>irrelevant</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,008</td>\r\n");
      out.write("								<td>random</td>\r\n");
      out.write("								<td>data</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("								<td>text</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,009</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("								<td>irrelevant</td>\r\n");
      out.write("								<td>visual</td>\r\n");
      out.write("								<td>layout</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,010</td>\r\n");
      out.write("								<td>data</td>\r\n");
      out.write("								<td>rich</td>\r\n");
      out.write("								<td>dashboard</td>\r\n");
      out.write("								<td>tabular</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,011</td>\r\n");
      out.write("								<td>information</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("								<td>illustrative</td>\r\n");
      out.write("								<td>data</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,012</td>\r\n");
      out.write("								<td>text</td>\r\n");
      out.write("								<td>placeholder</td>\r\n");
      out.write("								<td>layout</td>\r\n");
      out.write("								<td>dashboard</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,013</td>\r\n");
      out.write("								<td>dashboard</td>\r\n");
      out.write("								<td>irrelevant</td>\r\n");
      out.write("								<td>text</td>\r\n");
      out.write("								<td>visual</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,014</td>\r\n");
      out.write("								<td>dashboard</td>\r\n");
      out.write("								<td>illustrative</td>\r\n");
      out.write("								<td>rich</td>\r\n");
      out.write("								<td>data</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<td>1,015</td>\r\n");
      out.write("								<td>random</td>\r\n");
      out.write("								<td>tabular</td>\r\n");
      out.write("								<td>information</td>\r\n");
      out.write("								<td>text</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("				</div>\r\n");
      out.write("			</main>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.slim.min.js\"\r\n");
      out.write("		integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\r\n");
      out.write("		crossorigin=\"anonymous\">\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("	<script>\r\n");
      out.write("		window.jQuery\r\n");
      out.write("				|| document\r\n");
      out.write("						.write('<script src=\"/resources/js/jquery-3.6.0.js\"><\\/script>')\r\n");
      out.write("	</script>\r\n");
      out.write("	<script src=\"/resources/js/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js\"></script>\r\n");
      out.write("	<script src=\"/resources/js/dashboard.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
