package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.BookLibrary;
import com.beans.BookMapLibrary;
import com.beans.BookNameMapLibrary;
import com.beans.BookSetLibrary;

public class BookRun {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("book.xml");
		System.out.println("Context Loaded...");

		System.out.println("List of Books:");
		BookLibrary bookList = (BookLibrary) context.getBean("bookList");
		bookList.displayBooks();

		System.out.println("------------------------------");
		System.out.println("Set of Books:");
		BookSetLibrary bookSet = (BookSetLibrary) context.getBean("bookSet");
		bookSet.display();

		System.out.println("------------------------------");
		System.out.println("Map of Books:");
		BookMapLibrary bookMap = (BookMapLibrary) context.getBean("bookMap");
		bookMap.display();

		System.out.println("------------------------------");
		System.out.println("Map of Books Group By Type of Book:");
		BookNameMapLibrary bookNameMap = (BookNameMapLibrary) context.getBean("bookNameMap");
		bookNameMap.display();
	}
}
