/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-08-18 07:42:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div class=\"content\">\r\n");
      out.write("\t<div class=\"setting\">\r\n");
      out.write("\t\t<div class=\"limit_setting\">\r\n");
      out.write("\t\t\t<form action=\"\" method=\"get\">\r\n");
      out.write("\t\t\t\t<select name=\"limit\">\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">5</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"10\" selected=\"selected\">10</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"15\">15</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"20\">20</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t개씩 보기\r\n");
      out.write("\t\t\t\t<input class=\"submit\" type=\"submit\" value=\"선택\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<span>글 개수 :</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<table class=\"list\" width=\"100%\">\r\n");
      out.write("\t\t<tr class=\"list_col\" align=\"center\" valign=\"middle\">\r\n");
      out.write("\t\t\t<td width=\"8%\">\r\n");
      out.write("\t\t\t\t<div align=\"center\">번호</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"40%\">\r\n");
      out.write("\t\t\t\t<div align=\"center\">제목</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"10%\">\r\n");
      out.write("\t\t\t\t<div align=\"center\">작성자</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"15%\">\r\n");
      out.write("\t\t\t\t<div align=\"center\">날짜</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td width=\"8%\">\r\n");
      out.write("\t\t\t\t<div align=\"center\">조회수</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr class=\"list_contents\" align=\"center\" valign=\"middle\"\r\n");
      out.write("\t\t\tonmouseover=\"this.style.backgroundColor='#E8E8E8'\"\r\n");
      out.write("\t\t\tonmouseout=\"this.style.backgroundColor=''\">\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div align=\"center\">1</div>\r\n");
      out.write("\t\t\t</td>\t\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div align=\"left\">글제목ㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱㄱ</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div align=\"center\">수빈</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div align=\"center\">2016/01/13</div>\r\n");
      out.write("\t\t\t</td>\t\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div align=\"center\">34</div>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"register_btn\" align=\"right\">\r\n");
      out.write("\t\t<a href=\"\">[글쓰기]</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"paging\" align=\"center\">\r\n");
      out.write("\t[이전]&nbsp;[다음]\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"search\" align=\"center\">\r\n");
      out.write("\t\t<form action=\"\" method=\"get\">\r\n");
      out.write("\t\t\t<select name=\"keyField\">\r\n");
      out.write("\t\t\t\t<option value=\"BOARD_NUM\">번호</option>\r\n");
      out.write("\t\t\t\t<option value=\"BOARD_ID\">작성자</option>\r\n");
      out.write("\t\t\t\t<option value=\"BOARD_SUBJECT\">제목</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"keyWord\"/>\r\n");
      out.write("\t\t\t<input class=\"submit\" type=\"submit\" value=\"검색\"/>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
