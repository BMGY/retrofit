package retrofit;

import java.io.Serializable;

public class Config implements Serializable {

	private static String _charset = "UTF-8";

	public static String getCharset() {
		return _charset;
	}

	public static void setCharset(String charset) {
		if (charset.equals("") || charset == null)
			return;
		_charset = charset;
	}

}