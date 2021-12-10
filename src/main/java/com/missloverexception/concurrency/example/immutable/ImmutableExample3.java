package com.missloverexception.concurrency.example.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.missloverexception.concurrency.annotations.NotThreadSafe;
import com.missloverexception.concurrency.annotations.ThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Collections.unmodifiable***
 */
@ThreadSafe
public class ImmutableExample3 {

    private final static ImmutableList list = ImmutableList.of(1, 2, 3);

    private final static ImmutableSet set = ImmutableSet.copyOf(list);

    private final static ImmutableMap<Integer, Integer> map = ImmutableMap.of(1, 2, 3, 4);

    private final static ImmutableMap<Integer, Integer> map2
            = ImmutableMap.<Integer, Integer>builder().put(1, 2).put(3, 4).put(5, 6).build();

    public static void main(String[] args) {
//        list.add(4);
//        set.add(4);
//        map2.put(1 ,4);
        System.out.println(map.get(3));
    }
}
