package com.tazine.boot.aop.security;

/**
 * CurrentUserHolder
 *
 * @author frank
 * @since 1.0.0
 */
public class CurrentUserHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get() {
        return holder.get();
    }

    public static void set(String s) {
        holder.set(s);
    }
}
