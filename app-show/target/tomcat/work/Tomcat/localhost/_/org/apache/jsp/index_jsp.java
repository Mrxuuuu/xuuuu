/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-10 05:42:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8 \">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/index.css\" />\r\n");
      out.write("\t\r\n");
      out.write("\t\t<title>江岸日用化工管理系统</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"header\"> \r\n");
      out.write("\t\t\t<span>欢迎登录后台管理界面平台</span>\r\n");
      out.write("            <ul>\r\n");
      out.write("            \t<li> <a href=\"#\">回首页</a> </li><li> <a href=\"#\">帮助</a> </li><li> <a href=\"#\">关于</a> </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"body\">\r\n");
      out.write("\t\t\t<div class=\"system_log\"></div>\r\n");
      out.write("\t\t\t<div class=\"login_body\">\r\n");
      out.write("                   <form action=\"Index\" method=\"post\">\r\n");
      out.write("                   \t  <input type=\"text\" class=\"loginuser\" placeholder=\"请输入用户名\"  name=\"user\" autofocus/>\r\n");
      out.write("                   \t  <input type=\"password\"  class=\"loginpassword\" placeholder=\"请输入密码\" name=\"pwd\"/>\r\n");
      out.write("                   \t  <input type=\"submit\" value=\"登录\" class=\"loginsubmit\"/>\r\n");
      out.write("                   \t  <input type=\"checkbox\" checked=\"checked\"   /> <span>记住密码    忘记密码</span>\r\n");
      out.write("                   </form>\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
