package com.ExceptionBasic;

import com.UserException;

public class ExceptionThrower {
    public static void throwException(String message) throws Exception{
    throw new Exception(message);
    }

    public static void throwCustomException(String message) throws UserException{
        throw new UserException(message);
    }
}
