package test.pkg1;

public class TestBean1 { 

	public void test1(String name) {
		System.out.println("name["+name+"]222");
	}
	
	public void test2(String name) {
		System.out.println("name["+name+"]");
	}
	
	public void test3(String name) { 
		System.out.println("name["+name+"]");
	}
	
	public void test4(String name) {
		System.out.println("name["+name+"]");
	}
		
	public void testBranch() {
		
		/******************** main 작업 시작 ******************
		main 작업1
		main 작업2
		******************** main 작업 끝 ********************/
		
		/******************** 공동 작업 시작 ******************
		공동 main-작업1
		******************** 공동 작업 끝 ********************/
		
		/******************** 브랜치1 작업 시작 ******************
		브랜치1 작업1
		브랜치1 작업2
		******************** 브랜치1 작업 끝 ********************/
	}
}
