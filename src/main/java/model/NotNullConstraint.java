package model;

import java.util.function.Predicate;

/**
 * @author rajuraghuwanshi
 */
public class NotNullConstraint<T> extends Constraint<T> {

    @Override
    public boolean test(T t) {
        return t != null;
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

    @Override
    public String toString() {
        return "Value can not be null";
    }
}
