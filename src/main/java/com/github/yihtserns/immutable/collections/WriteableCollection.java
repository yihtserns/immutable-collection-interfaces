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
public interface WriteableCollection<T> extends ReadableCollection<T> {

    boolean add(T element);

    boolean remove(T element);

    boolean addAll(Collection<? extends T> that);

    boolean removeAll(Collection<? extends T> that);

    boolean retainAll(Collection<? extends T> that);

    void clear();
}
