package solutions;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class VerifyURL {

	@Test
	public void test1() {
		Assert.assertTrue(urlIsValid("uid=swg2C1247123456"));
		Assert.assertTrue(urlIsValid("uid=swg2C1123456"));
		Assert.assertTrue(urlIsValid("uid=swg2C1123456"));
		Assert.assertFalse(urlIsValid("uid=swg124712"));
		Assert.assertFalse(urlIsValid("uid=swgC8123456"));
		Assert.assertFalse(urlIsValid(""));
		Assert.assertFalse(urlIsValid("uid=swg2Ra123213"));
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(urlIsValid("uid=isgA1234567"));
		Assert.assertTrue(urlIsValid("uid=isgz2134512"));
		Assert.assertTrue(urlIsValid("uid=isgZ1123456"));
		Assert.assertFalse(urlIsValid("uid=isg124712"));
		Assert.assertFalse(urlIsValid("uid=isgC812345"));
		Assert.assertFalse(urlIsValid("uid=isg2Ra123213"));
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(urlIsValid("uid=nas12345678910123"));
		Assert.assertTrue(urlIsValid("uid=nas21323153451456254635756"));
		Assert.assertTrue(urlIsValid("uid=nas1234567"));
		Assert.assertFalse(urlIsValid("uid=nas12"));
		Assert.assertFalse(urlIsValid("uid=nasC8123"));
		Assert.assertFalse(urlIsValid("uid=nas2Ra1232"));
	}

	@Test
	public void test4() {
		Assert.assertTrue(urlIsValid("uid=ssgS1234567"));
		Assert.assertTrue(urlIsValid("uid=ssgs1234567"));
		Assert.assertTrue(urlIsValid("uid=ssgS9998888"));
		Assert.assertFalse(urlIsValid("uid=ssgR1288888"));
		Assert.assertFalse(urlIsValid("uid=ssgC8123"));
		Assert.assertFalse(urlIsValid("uid=ssgD12345678776"));
	}

	@Test
	public void test5() {
		Assert.assertTrue(urlIsValid("uid=isgqwerrtryryuituyituioeqrqwertyuio"));
		Assert.assertTrue(urlIsValid("uid=isgqwerrtryryuituyituioeqrqwertyuioqwerrtryryuituyituioeqrqwertyuio"));
		Assert.assertTrue(urlIsValid("uid=isgqwerrtryryuituyituioewewrewrwere"));
		Assert.assertFalse(urlIsValid("uid=isgR128"));
		Assert.assertFalse(urlIsValid("uid=isg/C8123"));
		Assert.assertFalse(urlIsValid("uid=isg(D12345678776"));
	}

	private static Boolean urlIsValid(String publicUrl) {

		if (publicUrl.isEmpty())
			return false;

		boolean result = false;

		if (Pattern.compile("uid=swg2*([C]?[1247]\\d{6})").matcher(publicUrl).find()) {
			result = true;
		} else if (Pattern.compile("uid=isg3*([A-Za-z]\\d{7})").matcher(publicUrl).find()) {
			result = true;
		} else if (Pattern.compile("uid=nas8*(\\d{7})").matcher(publicUrl).find()) {
			result = true;
		} else if (Pattern.compile("uid=ssg1*([Ss]\\d{7})").matcher(publicUrl).find()) {
			result = true;
		} else if (Pattern.compile("uid=isg2*(\\w{32})").matcher(publicUrl).find()) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}
