package com.example.demo.AES.util;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class AESEncryptUtils {
	private static final String KEY = "abcdef0123456789";
//	private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";
	private static final String ALGORITHMSTR = "AES/CBC/PKCS5Padding";
	private static final String IV_STRING = "16-Bytes--String";//CBC所需

	public static String base64Encode(byte[] bytes) {
		return Base64.encodeBase64String(bytes);
	}

	public static byte[] base64Decode(String base64Code) throws Exception {
		return Base64.decodeBase64(base64Code);
	}

	//ECB加密
//	public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
//		KeyGenerator kgen = KeyGenerator.getInstance("AES");
//		kgen.init(128);
//		Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
//		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));
//		return cipher.doFinal(content.getBytes("utf-8"));
//	}

	//CBC加密
	public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		kgen.init(128);
		
		byte[] initParam = IV_STRING.getBytes();
        IvParameterSpec ivParameterSpec = new IvParameterSpec(initParam);
		
		Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"),ivParameterSpec);
		return cipher.doFinal(content.getBytes("utf-8"));
	}
	
	public static String aesEncrypt(String content, String encryptKey) throws Exception {
		return base64Encode(aesEncryptToBytes(content, encryptKey));
	}
	
	//ECB解密
//	public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
//		KeyGenerator kgen = KeyGenerator.getInstance("AES");
//		kgen.init(128);
//		Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
//		cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"));
//		byte[] decryptBytes = cipher.doFinal(encryptBytes);
//		return new String(decryptBytes);
//	}

	//CBC解密
	public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		kgen.init(128);
		
		 //使用CBC模式，需要一个向量iv，可增加加密算法的强度
        byte[] initParam = IV_STRING.getBytes();
        IvParameterSpec ivParameterSpec = new IvParameterSpec(initParam);
		
		Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
		cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"),ivParameterSpec);
		byte[] decryptBytes = cipher.doFinal(encryptBytes);
		return new String(decryptBytes);
	}
	
	
	public static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {
		return aesDecryptByBytes(base64Decode(encryptStr), decryptKey);
	}

	public static void main(String[] args) throws Exception {
		String content = "123123123";
		System.out.println("加密前：" + content);

		String encrypt = aesEncrypt(content, "abcdef0123456789");
		System.out.println(encrypt.length() + ":加密后：" + encrypt);

		String decrypt = aesDecrypt(encrypt, KEY);
		System.out.println("解密后：" + decrypt);
	}
	
}