/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-08-11 06:43:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class text9_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>ALI AL_Arkawazi 9 </title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"text9.css\">\r\n");
      out.write("<style>\r\n");
      out.write("    body{\r\n");
      out.write("        background-image: linear-gradient(to right,red , #2600ff);\r\n");
      out.write("        margin-top:0px !important;\r\n");
      out.write("    }\r\n");
      out.write("input[value=\"GET STARTED\"]:hover {\r\n");
      out.write("background-blend-mode: color;\r\n");
      out.write("    background: #deff15;\r\n");
      out.write("    width: 90px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("}\r\n");
      out.write("    .h1{\r\n");
      out.write("        text-align: center;\r\n");
      out.write("     }\r\n");
      out.write(".button:hover{\r\n");
      out.write("    background-blend-mode: color;\r\n");
      out.write("    background: rebeccapurple;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    width: 90px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("}\r\n");
      out.write("    .button1:hover{\r\n");
      out.write("        background-blend-mode: color;\r\n");
      out.write("        background: rebeccapurple;\r\n");
      out.write("        target-name: modal;\r\n");
      out.write("        width: 90px;\r\n");
      out.write("        height: 50px;\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"ALI 9\">\r\n");
      out.write("    <button class=\"button\" style=\"color: red\">Sing Up</button>\r\n");
      out.write("    <button class=\"button1\">Log in</button>\r\n");
      out.write("    <br><br><br>\r\n");
      out.write("    <h1 class=\"h1\" style=\"color: darkorange\">Sing Up For Free</h1>\r\n");
      out.write("<br><br>\r\n");
      out.write("    <input type=\"text\"  placeholder=\"First_Name\" style=\"color: black\">\r\n");
      out.write("<input type=\"text\" placeholder=\"Last_Name\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<input type=\"email\" placeholder=\"Email\">\r\n");
      out.write("<br><br>\r\n");
      out.write("<input type=\"password\" placeholder=\"Password\">\r\n");
      out.write("<br><br>\r\n");
      out.write("    <input type=\"text\" placeholder=\"Gender\">\r\n");
      out.write("    <select autofocus disabled>\r\n");
      out.write("    <option>Male</option>\r\n");
      out.write("    <option>female</option>\r\n");
      out.write("</select>\r\n");
      out.write("    <br><br><br>\r\n");
      out.write("<input type=\"submit\" value=\"GET STARTED\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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