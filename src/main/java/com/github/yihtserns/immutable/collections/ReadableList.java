/*
 * Copyright (C) RevTech Lab Sdn Bhd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.yihtserns.immutable.collections;

import java.util.Collection;

/**
 * @author yihtserns
 */
public interface ReadableList<T> extends ReadableCollection<T> {

    T get(int index);

    int indexOf(T element);

    int lastIndexOf(T element);

    ReadableList<T> subList(int from, int to);
}
