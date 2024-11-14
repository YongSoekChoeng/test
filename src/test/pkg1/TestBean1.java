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
		main 작업3
		main 작업4
		main 작업5
		******************** main 작업 끝 ********************/
		
		/******************** development 작업 시작 ******************
		development 작업1
		******************** development 작업 끝 ********************/

		/******************** 공동 작업 시작 ******************
		dev01 작업5
		dev01 작업6
		dev01 작업7
		dev02 작업3-수정
        dev02 작업4
		******************** 공동 작업 끝 ********************/
		
		/******************** dev01 작업 시작 ******************
		dev01 작업1
		dev01 작업2
		dev01 작업3
		dev01 작업4
		******************** dev01 작업 끝 ********************/

		/******************** dev02 작업 시작 ******************
		dev02 작업1
		dev02 작업2
		******************** dev02 작업 끝 ********************/
	}
}
