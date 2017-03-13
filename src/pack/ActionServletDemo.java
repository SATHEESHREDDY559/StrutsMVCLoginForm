package pack;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * Servlet implementation class ActionServlet
 */
@WebServlet("/ActionServlet")
public class ActionServletDemo extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
	String name=request.getParameter("uname");
	String password=request.getParameter("password");
	LoginBean bean= new LoginBean();
	String str=bean.validate(name,password);
	if(str==null){
		return mapping.findForward("error");
	}
	else
		return mapping.findForward("str");
		
		
		
	}
	
	
	
	
	
	}

	
