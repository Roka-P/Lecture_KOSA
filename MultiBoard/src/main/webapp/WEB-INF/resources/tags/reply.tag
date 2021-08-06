<%@ tag language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ tag body-content="empty" %>
<%@ attribute name="replynum" type="java.lang.Integer" required="true"%>
<%@ attribute name="replystep" type="java.lang.Integer" required="true"%>
<%
if(replynum==0) {
	out.print("");
} else {
	for(int i=0; i<replystep; i++) {
		out.print("&nbsp;");
	}
	out.print("└");
}
%>