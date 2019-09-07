package practice14;

import org.junit.*;

public class BankTest {
	@Test(expected = IllegalArgumentException.class)
	public void setName2Characters() {
		setNameTest("ab");//失敗する
	}
	@Test
	public void setName3Characters() {
		setNameTest("abc");//成功する
	}
	@Test
	public void setName4Characters() {
		setNameTest("abcd");//成功する
	}
	@Test(expected = IllegalArgumentException.class)
	public void setName2JpaneseCharacters() {
		setNameTest("あい");
	}
	@Test
	public void setName3JpaneseCharacters() {
		setNameTest("あいう");
	}
	@Test
	public void setName4JpaneseCharacters() {
		setNameTest("あいうえ");
	}
	@Test(expected = NullPointerException.class)
	public void setNameNull() {
		setNameTest(null);
	}
	public void setNameTest(String s) {
		Bank bank = new Bank();
		bank.setName(s);
		Assert.assertEquals(bank.getName(), s);
	}
}
