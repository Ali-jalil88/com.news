/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-08-11 07:27:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"test.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/controller\" method=\"post\">\r\n");
      out.write("</form>\r\n");
      out.write("<div class=\"navigator\">\r\n");
      out.write("    <a class=\"item\" href=\"\">NEWS</a>\r\n");
      out.write("    <a class=\"item\" href=\"\">HOME</a>\r\n");
      out.write("    <a class=\"item\" href=\"\">ABOUT</a>\r\n");
      out.write("    <a class=\"item\" href=\"\">PORTFOLIO</a>\r\n");
      out.write("    <a class=\"item\" href=\"\">HOME</a>\r\n");
      out.write("    <a class=\"item\" href=\"\">LOGIN</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"navigator1\">\r\n");
      out.write("    <h1 style=\"color: white\">TOROLA</h1>\r\n");
      out.write("    <h3><p>Handcrafted For Talented People</p></h3>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("    <a class=\"div3\" href=\"\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/default.jpg\">\r\n");
      out.write("        <h4>MAIN DEMO </h4>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <a class=\"div3\" href=\"\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/onepage-personal.jpg\">\r\n");
      out.write("        <h4>ONEPAGE PERSONAL</h4>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"div3\" href=\"\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/onepage-agency.jpg\">\r\n");
      out.write("        <h4>ONEPAGE AGENCY</h4>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"div3\" href=\"\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/masonry.jpg\">\r\n");
      out.write("        <h4>MASONRY</h4>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"div3\" href=\"\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/grid.jpg\">\r\n");
      out.write("        <h4>PORTFOLIOGRID</h4>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"div3\" href=\"\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/horizontal.jpg\">\r\n");
      out.write("        <h4>HORIZONTAL</h4>\r\n");
      out.write("    </a>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/reveal.jpg\">\r\n");
      out.write("        <h4>REVEL</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/split.jpg\">\r\n");
      out.write("        <h4>SPLIT</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/hover-list.jpg\">\r\n");
      out.write("        <h4>HOVER</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/hover-grid.jpg\">\r\n");
      out.write("        <h4>HOVERGRID</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/video-thumbs.jpg\">\r\n");
      out.write("        <h4>VIDEOS</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/slider-thumbs.jpg\">\r\n");
      out.write("        <h4>SLIDER</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/horizontal-title.jpg\">\r\n");
      out.write("        <h4>WITHTITLE</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/photography.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC </h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/entrance-image.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 1</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/entrance-video.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 2</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/justified.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 3</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/portfolio-background.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 4</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/kenburns.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 5</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/parallax-hero.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 6</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/single-image.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 7</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/single-video.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 8</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/classic-portfolio.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 9</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/fullscreen-slider.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 10</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/vertical-slider.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 11</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"div3\">\r\n");
      out.write("        <img src=\"http://achtungthemes.org/torola/img/demo/screens/parallax-sections.jpg\">\r\n");
      out.write("        <h4>PHOTOGRAPHIC 12</h4>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"navigator3\">\r\n");
      out.write("    <h1>Start With Torola</h1>\r\n");
      out.write("    <input type=\"button\" value=\"PURCHASE NOW\">\r\n");
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
