package com.CCL.view.other.son;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class Send {

	public static int sendMessage(String tel,String text) {

		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://sms.webchinese.cn/web_api/");
		post.addRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=gbk");// ��ͷ�ļ�������ת��
		NameValuePair[] data = { new NameValuePair("Uid", Util_pro.readData("id")), // ע����û���
				new NameValuePair("Key", Util_pro.readData("key")), // ע��ɹ���,��¼��վʹ�õ���Կ
				new NameValuePair("smsMob", tel), // �ֻ�����
				new NameValuePair("smsText",text) };// ���ö�������
		post.setRequestBody(data);

		try {
			client.executeMethod(post);
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Header[] headers = post.getResponseHeaders();
		int statusCode = post.getStatusCode();
		System.out.println("statusCode:" + statusCode);

		for (Header h : headers) {
			System.out.println(h.toString());
		}
		String result = "-1";
		try {
			result = new String(post.getResponseBodyAsString().getBytes("gbk"));
			// System.out.println(result);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		post.releaseConnection();
		return Integer.parseInt( result);

	}

}