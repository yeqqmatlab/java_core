package com.yqq.dataStructure;

/**
 * created by yqq 2020/4/13
 */
public class BTKeyValue<K extends Comparable<K>, V> {

    protected K mKey;
    protected V mValue;

    public BTKeyValue(K mKey, V mValue) {
        super();
        this.mKey = mKey;
        this.mValue = mValue;
    }
}
