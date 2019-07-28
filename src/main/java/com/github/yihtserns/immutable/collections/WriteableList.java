/*
 * Copyright (C) RevTech Lab Sdn Bhd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.yihtserns.immutable.collections;

import java.util.Collection;

import static javafx.scene.input.KeyCode.T;

/**
 * @author yihtserns
 */
public interface WriteableList<T> extends ReadableList<T>, WriteableCollection<T> {

    boolean addAll(int index, Collection<? extends T> that);

    T set(int index, T element);

    void add(int index, T element);

    T remove(int index);
}
