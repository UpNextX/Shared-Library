package org.upnext.sharedlibrary.Errors;

import lombok.Getter;

public class Result<T> {
    public Result(T value, Boolean isSuccess, Error error) {
        if ((isSuccess && error != Error.NONE) || (!isSuccess && error == Error.NONE)) {
            throw new IllegalArgumentException("Invalid result");
        }
        this.value = value;
        this.isSuccess = isSuccess;
        this.error = error;
    }

    @Getter
    private T value;
    @Getter
    private boolean isSuccess;
    @Getter
    private boolean isFailure = !isSuccess;
    @Getter
    private Error error = null;


    public static Result<Void> success() {
        return new Result<>(null, true, Error.NONE);
    }

//    public static Result<Void> failure(Error error) {
//        return new Result<>(null, false, error);
//    }

    public static <T> Result<T> success(T value) {
        return new Result<>(value, true, Error.NONE);
    }

    public  static <T> Result<T> failure(Error error) {
        return new Result<>(null, false, error);
    }
}

