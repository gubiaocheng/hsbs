package cheng.hsbs.test;

import java.util.Scanner;
import org.junit.Test;
import cheng.hsbs.MiniCoding;

public class NumberMappingTest {
	
	/**
	 * 任意数字组合的映射
	 */
	@Test
	public void numberToMapping() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入任意大小号码,回车表示输入完毕	");
		String inputString = sc.nextLine();
		MiniCoding miniCoding = new MiniCoding();
		miniCoding.getMapping(inputString);
		sc.close();
	}

}
