/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
<<<<<<< HEAD
 * Generated at: 2016-08-19 07:32:21 UTC
=======
<<<<<<< HEAD
 * Generated at: 2016-08-19 06:41:07 UTC
=======
<<<<<<< HEAD
 * Generated at: 2016-08-19 05:00:36 UTC
=======
 * Generated at: 2016-08-18 15:27:49 UTC
>>>>>>> a1e14330cc56f5985cb47b0468fa4c1d28eb3eaa
>>>>>>> 5d18c4e12ed14c66a4b5b60c2478e0f9f15e83ea
>>>>>>> 9476964a23513f0ffd5f2aefadae99951c7dfe8f
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

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1471412687289L));
    _jspx_dependants.put("jar:file:/D:/railro/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Railro/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/railro/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Railro/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
  }

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
      out.write("\t<table>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>글번호</th>\r\n");
      out.write("\t\t\t<th>제목</th>\r\n");
      out.write("\t\t\t<th>작성자</th>\r\n");
      out.write("\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t<th>작성일</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>테스트 번호</td>\r\n");
      out.write("\t\t\t<td>테스트 제목</td>\r\n");
      out.write("\t\t\t<td>테스트 작성자</td>\r\n");
      out.write("\t\t\t<td>테스트 조회수</td>\r\n");
      out.write("\t\t\t<td>테스트 작성일</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"button\"><span>글등록</span></div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 검색입력 폼 -->\r\n");
      out.write("\t<div class=\"aaa\">\r\n");
      out.write("\t<form method=\"post\" action='list.php'>\r\n");
      out.write("\t\t<select name =src_name>\r\n");
      out.write("\t\t<option value=name>이름 </option>\r\n");
      out.write("\t\t<option value=subject selected>제목 </option>\r\n");
      out.write("\t\t<option value=memo>내용 </option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t\r\n");
<<<<<<< HEAD
      out.write("\t\t<input type=text name = src_value size=30>\r\n");
      out.write("\t\t<input type=submit value = 검색>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
=======
      out.write("   \t\t<colgroup>\r\n");
      out.write("   \t\t\t<col width=\"20%\">\r\n");
      out.write("   \t\t\t<col width=\"80%\">\r\n");
      out.write("   \t\t\t\r\n");
      out.write("   \t\t</colgroup>\r\n");
      out.write("   \t\r\n");
      out.write("\r\n");
      out.write("\t\t<table summary=\"테이블 구성\" >\r\n");
      out.write("\t\t<caption>글 수정하기</caption>\t\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("\t\t\t\t<td>작성자</td>\r\n");
      out.write("\t\t\t\t<td><input type=text name=name size=10 maxlength=8></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t \t\t\t<td>E-Mail</td>\r\n");
      out.write("\t \t\t\t<td><input type=text name=email size=30></td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("     \t\t\t<td>홈페이지</td>\r\n");
      out.write("     \t\t\t<td><input type=text name=homepage size=30></td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("     \t\t\t<td>제 목</td>\r\n");
      out.write("     \t\t\t<td><input type=text name=title></td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("     \t\t\t<td>내 용</td>\r\n");
      out.write("     \t\t\t<td><textarea name=content rows =\"10\" cols=\"100\"></textarea></td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("     \t\t\t<td>비밀번호</td> \r\n");
      out.write("     \t\t\t<td><input type=password name=password size=15 maxlength=15></td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("     \t\t\t<td colspan=2><hr size=1></td>\r\n");
      out.write("    \t\t</tr>\r\n");
      out.write("    \t\t<tr>\r\n");
      out.write("     \t\t\t<td colspan=\"2\"><div align=\"center\">\r\n");
      out.write("     \t\t\t<input type=\"submit\" value=\"수정\">&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<input type=reset value=\"다시 수정\"> \r\n");
      out.write("         \t\t<input type=\"button\" value=\"뒤로\" onclick=\"move('Board_List.jsp');\"></div>\r\n");
      out.write("     \t\t\t</td>\r\n");
      out.write("    \t\t</tr> \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form> \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
=======
      out.write("<div id=\"content\">\r\n");
      out.write("\t<form action=\"\" method=\"post\" enctype=\"multipart/form-data\" name=\"\">\r\n");
      out.write("\t\t<table class=\"detail\" width=\"100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"10\">\r\n");
      out.write("\t\t\t\t\t<span class=\"title\">제목이 들어가는 부분</span> \r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t|\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<span class=\"subject\">분류가 들어가는 부분</span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"info\">\r\n");
      out.write("\t\t\t\t<td width=\"73%\" >\r\n");
      out.write("\t\t\t\t \tsubin0113\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"5%\" style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t \t2016/01/13\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"11%\" style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t \t조회 수 3\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"11%\" style=\"text-align: right;\">\r\n");
      out.write("\t\t\t\t \t댓글 수 3\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"10\">\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t\t내용부분\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"10\">\r\n");
      out.write("\t\t\t\t\t첨부파일 목록\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"btn\">\r\n");
      out.write("\t\t\t<span><a href=\"\">수정</a></span>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<span><a href=\"\">삭제</a></span>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t<span><a href=\"javascript:history.go(-1)\">취소</a></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
<<<<<<< HEAD
      out.write("</div>");
=======
      out.write("</div>\r\n");
>>>>>>> a1e14330cc56f5985cb47b0468fa4c1d28eb3eaa
>>>>>>> 5d18c4e12ed14c66a4b5b60c2478e0f9f15e83ea
>>>>>>> 9476964a23513f0ffd5f2aefadae99951c7dfe8f
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
