/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.0.M2
 * Generated at: 2017-08-28 02:46:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/C:/Users/nando/.m2/repository/org/springframework/spring-webmvc/4.2.4.RELEASE/spring-webmvc-4.2.4.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1450320450000L));
    _jspx_dependants.put("file:/C:/Users/nando/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1488169635704L));
    _jspx_dependants.put("jar:file:/C:/Users/nando/.m2/repository/org/apache/tiles/tiles-jsp/3.0.5/tiles-jsp-3.0.5.jar!/META-INF/tld/tiles-jsp.tld", Long.valueOf(1411353130000L));
    _jspx_dependants.put("file:/C:/Users/nando/.m2/repository/org/apache/tiles/tiles-jsp/3.0.5/tiles-jsp-3.0.5.jar", Long.valueOf(1488169630195L));
    _jspx_dependants.put("file:/C:/Users/nando/.m2/repository/org/springframework/spring-webmvc/4.2.4.RELEASE/spring-webmvc-4.2.4.RELEASE.jar", Long.valueOf(1488169619890L));
    _jspx_dependants.put("jar:file:/C:/Users/nando/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153395882000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("<!-- ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("  <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("  <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- %@ taglib uri=\"http://www.springframework.org/security/tags\" prefix=\"security\"%>  -->\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var tags = [ \"c++\", \"java\", \"php\", \"coldfusion\", \"javascript\", \"asp\", \"ruby\" ];\r\n");
      out.write("$( \"#autocomplete\" ).autocomplete({\r\n");
      out.write("  source: function( request, response ) {\r\n");
      out.write("          var matcher = new RegExp( \"^\" + $.ui.autocomplete.escapeRegex( request.term ), \"i\" );\r\n");
      out.write("          response( $.grep( tags, function( item ){\r\n");
      out.write("              return matcher.test( item );\r\n");
      out.write("          }) );\r\n");
      out.write("      }\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<aside class=\"main-sidebar\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- sidebar: style can be found in sidebar.less -->\r\n");
      out.write("\t<section class=\"sidebar\">\r\n");
      out.write("\t\t<!-- Sidebar user panel (optional) -->\r\n");
      out.write("\t\t<div class=\"user-panel\">\r\n");
      out.write("\t\t\t<div class=\"pull-left image\">\r\n");
      out.write("\t\t\t\t <img src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" class=\"img-circle\" alt=\"User Image\"> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"pull-left info\">\r\n");
      out.write("\t\t\t\t<p>Luiz Botton</p>\r\n");
      out.write("\t\t\t\t<!-- Status -->\r\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- search form (Optional) -->\r\n");
      out.write("\t\t<form action=\"#\" method=\"get\" class=\"sidebar-form\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Procurar...\"> \r\n");
      out.write("\t\t\t\t<span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" name=\"search\" id=\"search-btn\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"btn btn-flat\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<!-- /.search form -->\r\n");
      out.write("\t\t<!-- sidebar menu: : style can be found in sidebar.less -->\r\n");
      out.write("\t\t<ul class=\"sidebar-menu\">\r\n");
      out.write("\t\t\t<li class=\"header\">Admin</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> \r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-users\"></i>\r\n");
      out.write("\t\t\t\t\t<span>Usuarios</span> <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href='");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\t\t\t<i class=\"glyphicon glyphicon-list-alt\"></i>Lista de Usuarios</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> \r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-newspaper-o\"></i>\r\n");
      out.write("\t\t\t\t\t<span>Noticias</span> <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href='");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"glyphicon glyphicon-list-alt\"></i>Noticias</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> \r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-newspaper-o\"></i>\r\n");
      out.write("\t\t\t\t\t<span>Alunos</span> <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href='");
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"glyphicon glyphicon-list-alt\"></i>Alunos</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> \r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-newspaper-o\"></i>\r\n");
      out.write("\t\t\t\t\t<span>Turmas</span> <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href='");
      if (_jspx_meth_spring_005furl_005f3(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"glyphicon glyphicon-list-alt\"></i>Turmas</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> \r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-newspaper-o\"></i>\r\n");
      out.write("\t\t\t\t\t<span>Avaliacoes</span> <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href='");
      if (_jspx_meth_spring_005furl_005f4(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"glyphicon glyphicon-list-alt\"></i>Avaliacoes</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> \r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-newspaper-o\"></i>\r\n");
      out.write("\t\t\t\t\t<span>Perguntas</span> <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href='");
      if (_jspx_meth_spring_005furl_005f5(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"glyphicon glyphicon-list-alt\"></i>Perguntas</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"treeview\">\r\n");
      out.write("\t\t\t\t<a href=\"#\"> \r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-newspaper-o\"></i>\r\n");
      out.write("\t\t\t\t\t<span>Respostas</span> <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul class=\"treeview-menu\">\r\n");
      out.write("\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t<a href='");
      if (_jspx_meth_spring_005furl_005f6(_jspx_page_context))
        return;
      out.write("'>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"glyphicon glyphicon-list-alt\"></i>Respostas</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<!-- /.sidebar menu -->\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- /.sidebar -->\r\n");
      out.write("</aside>");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/layout/menu.jsp(2,5) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/layout/menu.jsp(32,15) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/dist/img/user2-160x160.jpg");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/layout/menu.jsp(64,18) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/users.html");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/layout/menu.jsp(76,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/noticias.html");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/layout/menu.jsp(89,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue("/alunos.html");
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f3 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f3.setParent(null);
    // /WEB-INF/layout/menu.jsp(102,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f3.setValue("/turmas.html");
    int[] _jspx_push_body_count_spring_005furl_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f3 = _jspx_th_spring_005furl_005f3.doStartTag();
      if (_jspx_th_spring_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f4 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f4.setParent(null);
    // /WEB-INF/layout/menu.jsp(115,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f4.setValue("/avaliacoes.html");
    int[] _jspx_push_body_count_spring_005furl_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f4 = _jspx_th_spring_005furl_005f4.doStartTag();
      if (_jspx_th_spring_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f5 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f5.setParent(null);
    // /WEB-INF/layout/menu.jsp(128,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f5.setValue("/perguntas.html");
    int[] _jspx_push_body_count_spring_005furl_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f5 = _jspx_th_spring_005furl_005f5.doStartTag();
      if (_jspx_th_spring_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f6 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f6.setParent(null);
    // /WEB-INF/layout/menu.jsp(141,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f6.setValue("/respostas.html");
    int[] _jspx_push_body_count_spring_005furl_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f6 = _jspx_th_spring_005furl_005f6.doStartTag();
      if (_jspx_th_spring_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f6.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f6);
    }
    return false;
  }
}
