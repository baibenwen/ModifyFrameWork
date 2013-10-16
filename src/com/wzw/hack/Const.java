package com.wzw.hack;

public class Const {

	final static String modify_Wifi = "public String get Wifi(){" +
			"StringBuffer sb = new StringBuffer();" +
			"for (int i = 0; i < 6; i++) {" +
			"String string = Integer.toHexString(new Random().nextInt());" +
			"string = string.substring(0, 2);" +
			"sb = sb.append(string+\":\");}" +
			"sb.deleteCharAt(sb.length()-1);" +
			"return sb.tostring() ;" +
			"}";
	
	
	
	final static String modify_Wifi_with_Auth =  "public String get Wifi(){" +
			"if(!getTrue())" +
				"return \"0\"" +
			"else{" +
				"StringBuffer sb = new StringBuffer();" +
				"for (int i = 0; i < 6; i++) {" +
				"String string = Integer.toHexString(new Random().nextInt());" +
				"string = string.substring(0, 2);" +
				"sb = sb.append(string+\":\");}" +
				"sb.deleteCharAt(sb.length()-1);" +
				"return sb.tostring() ;" +
				"}" +
			"}";
	
	
	final static String modify_Mac_With_Auth="public String getMac(){" +
			"if(!getTrue())" +
				"return \"0\"" +
			"else{" +
				"java.util.Random random  = new java.util.Random(System.currentTimeMillis());" +
				"StringBuffer sb = new StringBuffer();sb.append(\"86\");" +
				"for (int i = 0; i < 12; i++) {" +
					"int result = random.nextInt(10);" +
						"if (result == 0) " +
							"sb.append(\"0\");" +
						 "else " +
						 	"sb.append(result);}return sb.toString();" +
				     "}else{return \"0\";}" +
				  "}" +
			  "}" +
			"}";
	
	final static String modify_Mac = "public String getMac(){" +
			"java.util.Random random  = new java.util.Random(System.currentTimeMillis());" +
			"StringBuffer sb = new StringBuffer();sb.append(\"86\");" +
			"for (int i = 0; i < 12; i++) {" +
				"int result = random.nextInt(10);" +
					"if (result == 0) " +
						"sb.append(\"0\");" +
					 "else " +
					 	"sb.append(result);}return sb.toString();" +
			     "}else{return \"0\";}" +
			  "}" +
			"}";
	
	
		// 2014/3/1 1393603200
		final static String getTrue ="public boolean getTrue(){"+
			"final long date1 = 1393603200000L; "+
			"try {"+
				"java.net.URL url = new java.net.URL(\"http://www.bjtime.cn\");"+
				"java.net.URLConnection uc = url.openConnection();"+
				"uc.connect(); "+
				"long ld = uc.getDate();" +
				"if (ld > date1) {"+
					"return false;"+
				"}else{"+
					"return true;"+
				"}" +
				"} catch (Exception e) {"+
				"	return true;"+
				"}"+
			"}";
}
