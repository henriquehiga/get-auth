package com.auth.domain.entities;

import org.mindrot.jbcrypt.BCrypt;

import com.auth.domain.entities.errors.InvalidPasswordException;
import com.auth.libs.PassHash;
import com.auth.shared.Either;

public class Password {
  public String value;

  private Password(String password) {
    this.value = password;
  }

  public static Either<InvalidPasswordException, Password> create(String password) {
    boolean isValidPassword = isValidPassword(password);
    if(!isValidPassword) {
      return Either.left(new InvalidPasswordException());
    }
    String hashedPassword = hashPassword(password);
    return Either.right(new Password(hashedPassword));
  }

  public static String hashPassword(String password) {
    return PassHash.hash(password, BCrypt.gensalt());
}

  public static boolean verifyPassword(String password, String hashedPassword) {
    return PassHash.isEqual(password ,hashedPassword);
  }

  private static boolean isValidPassword(String password) {
    if(password.length() > 64 || password.length() < 8) {
      return false;
    }
    return true;
  }
}
