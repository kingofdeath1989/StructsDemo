package cn.bw.util;

import java.lang.reflect.Method;
import java.util.Map;

public class validateUtil {

	public static boolean validate(Object actionObject, String rule, Map<String, Object> param) {
		boolean flag = false;
		try {
			Method addFieldErroMethod = actionObject.getClass().getMethod("addFieldError", String.class, String.class);
			Method textMethod = actionObject.getClass().getMethod("getText", String.class);
			String result[] = rule.split("\\|") ;
			String text = null ;
			for(int x=0;x<result.length;x++) {
				String temp[] = result[x].split(":");
				String paramValue[] = (String[])param.get(temp[0]) ;
				for(int i=0;i<paramValue.length;i++) {
					System.out.println("param["+i+"]:"+paramValue[i]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

}
