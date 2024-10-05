package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.Supplier;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class Optional {
    private static final Optional EMPTY = new Optional();
    private final Object value;

    private Optional() {
        this.value = null;
    }

    public static Optional empty() {
        return EMPTY;
    }

    private Optional(Object obj) {
        obj.getClass();
        this.value = obj;
    }

    public static Optional of(Object obj) {
        return new Optional(obj);
    }

    public static Optional ofNullable(Object obj) {
        return obj == null ? empty() : of(obj);
    }

    public Object get() {
        Object obj = this.value;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.value != null;
    }

    public void ifPresent(Consumer consumer) {
        Object obj = this.value;
        if (obj != null) {
            consumer.accept(obj);
        }
    }

    public Optional filter(Predicate predicate) {
        predicate.getClass();
        if (isPresent() && !predicate.test(this.value)) {
            return empty();
        }
        return this;
    }

    public Optional map(Function function) {
        function.getClass();
        if (!isPresent()) {
            return empty();
        }
        return ofNullable(function.apply(this.value));
    }

    public Optional flatMap(Function function) {
        function.getClass();
        if (!isPresent()) {
            return empty();
        }
        Optional optional = (Optional) function.apply(this.value);
        optional.getClass();
        return optional;
    }

    public Object orElse(Object obj) {
        Object obj2 = this.value;
        return obj2 != null ? obj2 : obj;
    }

    public Object orElseGet(Supplier supplier) {
        Object obj = this.value;
        return obj != null ? obj : supplier.get();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.value, ((Optional) obj).value);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.value);
    }

    public String toString() {
        Object obj = this.value;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
