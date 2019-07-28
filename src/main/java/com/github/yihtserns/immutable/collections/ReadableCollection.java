/*
 * Copyright (C) RevTech Lab Sdn Bhd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.yihtserns.immutable.collections;

import java.util.Iterator;

/**
 * @author yihtserns
 */
public interface ReadableCollection<T> extends Iterable<T> {

    int size();

    boolean isEmpty();

    boolean contains(T element);

    Iterator<T> iterator();

    Object[] toArray();

    @Override
    boolean equals(Object that);

    int hashCode();
}
