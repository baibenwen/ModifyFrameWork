package com.wzw.hack;

import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class Main {
	
	

	public static void main(String[] args) {
		Main main = new Main();
		main.hack();
		//System.out.println("istrue?"+main.getTrue());
	}

	
	void hack() {
		try {
			final String jarFilePath = "C:\\Users\\Administrator\\Desktop\\x.jar";
			final String classFilePath = "android.telephony.TelephonyManager";
			
			ClassPool classPool = ClassPool.getDefault();
			classPool.insertClassPath(jarFilePath);
			CtClass ctClass = classPool.get(classFilePath);
			CtMethod method = ctClass.getDeclaredMethod("getDeviceId");
			method.insertBefore("return getIMEI1();");
			ctClass.writeFile("C:\\Users\\Administrator\\Desktop\\g");
			System.out.print("over");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	boolean getTrue(){
		//2014/3/1
		 final long date1 = 1393603200000L; 
		 try {
			 java.net.URL url = new URL("http://www.bjtime.cn");// 取得资源对象
				URLConnection uc = url.openConnection();// 生成连接对象
				uc.connect(); // 发出连接
				long ld = uc.getDate(); // 取得网站日期时间（时间戳）
				System.out.println("ld = " +  ld);
				if (ld > date1) {
					return false;
				}else{
					return true;
				}
		} catch (Exception e) {
			return true;
		}
	}
	
	String getRandomWifiString(){
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			String string = Integer.toHexString(new Random().nextInt());
			string = string.substring(0, 2);
			sb = sb.append(string+":");
		}
		sb.deleteCharAt(sb.length()-1);
		showLog(sb.toString());
		return sb.toString();
	}
	
	public static void showLog(String s ){
		System.out.println(s);
	}
	
}
