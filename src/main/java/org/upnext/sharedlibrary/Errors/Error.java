package org.upnext.sharedlibrary.Errors;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Error {
    String code;
    String message;
    HttpStatus statusCode;

    public static final Error NONE = new Error("", "", null);
}

