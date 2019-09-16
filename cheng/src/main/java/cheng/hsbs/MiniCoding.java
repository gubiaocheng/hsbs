package cheng.hsbs;

import java.util.ArrayList;
import java.util.List;

public class MiniCoding {
	
	public String[] mappingArray = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	 
	public void getMapping(String arr) {
		MiniCoding solution = new MiniCoding();
        List<String> list = solution.letterCombinations(arr);
        StringBuilder sbOut = new StringBuilder(); 
        for (String str : list) {
        	sbOut.append(str+" ");
        }
        System.out.println("Intput: "+arr);
        System.out.println("Output: "+ sbOut.toString());
	}
	
    /**
     * 判断电话号码是否为空,如果为空,返回空集合,否则返回组合后的结果
     * @param phone 电话号码
     * @return 电话号码的字母组合后的结果
     */
    public List<String> letterCombinations(String phone) {
        List<String> list = new ArrayList<String>();
        if (phone.length() == 0) {
            return list;
        }
        mapping(phone, 0, "", list);
        return list;
    }
	 
    /**
     * 计算电话号码的字母组合
     * @param target 电话号码
     * @param count  当前处理的号码位数
     * @param tempStr    临时字符串,保存组合结果
     * @param list   组合完后的结果
     */
    public void mapping(String target, int count, String tempStr, List<String> list) {
        if (target.length() == count) {
            list.add(tempStr);
            return;
        }
        int temp = target.charAt(count) - '0';
        if (temp == 0 || temp == 1) {
        	mapping(target, count + 1, tempStr, list);
        } else {
            for (int i = 0; i < mappingArray[temp].length(); i++) {
            	mapping(target, count + 1, tempStr + mappingArray[temp].charAt(i), list);
            }
        }
    }

}
