package model;

import java.util.function.Predicate;

/**
 * @author rajuraghuwanshi
 */
public class NotEmptyConstraint<T> extends Constraint<T> {
    @Override
    public boolean test(T t) {
        return false;
    }

    @Override
    public Predicate<T> and(Predicate<? super T> other) {
        return null;
    }

    @Override
    public Predicate<T> negate() {
        return null;
    }

    @Override
    public Predicate<T> or(Predicate<? super T> other) {
        return null;
    }
}
