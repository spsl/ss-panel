package tool;

import play.api.libs.Codecs;

public class PasswordCreater {
	public static String create(String pass) {
		 return Codecs.sha1("$_o_0#" + pass + pass.length());
	}
}
