package com.musicapp.android.allure.utils;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by MOJISOLA on 23/08/2017.
 */

public class Lists {
    /** This class is never instantiated */
    public Lists() {
    }

    /**
     * Creates an empty {@code ArrayList} instance.
     * @return a newly-created, initially-empty {@code ArrayList}
     */
    public static final <E> ArrayList<E> newArrayList() {
        return new ArrayList<E>();
    }

    /**
     * Creates an empty {@code LinkedList} instance.
     * @return a newly-created, initially-empty {@code LinkedList}
     */
    public static final <E> LinkedList<E> newLinkedList() {
        return new LinkedList<E>();
    }
}
