/*
 * Copyright (C) RevTech Lab Sdn Bhd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.yihtserns.immutable.collections;

/**
 * @author yihtserns
 */
public class Main {

    public static void main(String[] args) {
        ReadableList<String> list = immutableListOf("A", "B", "C");

        for (String s : list) {
            System.out.println(s);
        }
    }

    private static ReadableList<String> immutableListOf(String... values) {
        WriteableList<String> list = new ArrayList<>();
        for (String value : values) {
            list.add(value);
        }

        return list;
    }
}
