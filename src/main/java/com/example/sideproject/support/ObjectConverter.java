package com.example.sideproject.support;

/**
 * @author 윤수경 (trrw0531@gmail.com)
 */
public interface ObjectConverter<T, R> {
    T from(R r);

    R to(T t);
}
