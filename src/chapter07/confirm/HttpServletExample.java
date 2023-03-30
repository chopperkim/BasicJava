package chapter07.confirm;

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}
	
	public static void method(HttpServlet servlet) {// HttpServlet servlet = new LoginServlet();
		servlet.service();
	}
}
