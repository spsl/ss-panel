package common.utils;

import java.util.Random;

/**
 * Created by sunsai on 2016/4/16 - 12:30.
 */
public class RandStrCreator {

  private static final String ALL_CHAR = "0123456789abcdefghijklnmopqrstuvwxyzABCKZFGHIJKLMNOPQRSTUVWXYZ_-/";

  private static final int ALL_CHAR_LENGTH = ALL_CHAR.length();

  private static final Random rand = new Random();

  public static String createRandomStr(int length) {

    StringBuffer sb = new StringBuffer();

    length = length < 6 ? 6 : length;

    for (int i = 0; i < length; i++) {
      sb.append(ALL_CHAR.charAt(rand.nextInt(ALL_CHAR_LENGTH)));
    }

    return sb.toString();
  }

}
