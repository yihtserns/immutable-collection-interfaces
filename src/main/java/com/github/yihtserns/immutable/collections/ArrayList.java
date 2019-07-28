/*
 * Copyright (C) RevTech Lab Sdn Bhd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.github.yihtserns.immutable.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author yihtserns
 */
public class ArrayList<T> implements WriteableList<T> {

    private List<T> actual;

    public ArrayList() {
        this(new java.util.ArrayList<T>());
    }

    private ArrayList(List<T> actual) {
        this.actual = actual;
    }

    @Override
    public int lastIndexOf(T element) {
        return actual.lastIndexOf(element);
    }

    @Override
    public boolean remove(T element) {
        return actual.remove(element);
    }

    @Override
    public int indexOf(T element) {
        return actual.indexOf(element);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> that) {
        return actual.addAll(index, that);
    }

    @Override
    public T set(int index, T element) {
        return actual.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        actual.add(index, element);
    }

    @Override
    public T remove(int index) {
        return actual.remove(index);
    }

    @Override
    public T get(int index) {
        return actual.get(index);
    }

    @Override
    public ReadableList<T> subList(int from, int to) {
        return new ArrayList<T>(actual.subList(from, to));
    }

    @Override
    public boolean add(T element) {
        return actual.add(element);
    }

    @Override
    public boolean addAll(Collection<? extends T> that) {
        return actual.addAll(that);
    }

    @Override
    public boolean removeAll(Collection<? extends T> that) {
        return actual.removeAll(that);
    }

    @Override
    public boolean retainAll(Collection<? extends T> that) {
        return actual.retainAll(that);
    }

    @Override
    public void clear() {
        actual.clear();
    }

    @Override
    public int size() {
        return actual.size();
    }

    @Override
    public boolean isEmpty() {
        return actual.isEmpty();
    }

    @Override
    public boolean contains(T element) {
        return actual.contains(element);
    }

    @Override
    public Iterator<T> iterator() {
        return actual.iterator();
    }

    @Override
    public Object[] toArray() {
        return actual.toArray();
    }
}
