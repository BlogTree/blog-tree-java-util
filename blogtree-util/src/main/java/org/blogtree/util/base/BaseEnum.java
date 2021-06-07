package org.blogtree.util.base;

import org.blogtree.util.util.EnumUtil;

/**
 * 枚举类接口
 */
public interface BaseEnum<T extends BaseEnum> {

    Integer getValue();

    String getText();

    T[] getList();

    default boolean isEqual(Integer value) {
        return this.getValue().equals(value);
    }

    default boolean isNotEqual(Integer value) {
        return !this.getValue().equals(value);
    }
}
