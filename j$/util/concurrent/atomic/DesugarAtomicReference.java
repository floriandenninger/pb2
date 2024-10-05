package j$.util.concurrent.atomic;

import j$.util.function.UnaryOperator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class DesugarAtomicReference {
    public static Object updateAndGet(AtomicReference atomicReference, UnaryOperator unaryOperator) {
        Object obj;
        Object apply;
        do {
            obj = atomicReference.get();
            apply = unaryOperator.apply(obj);
        } while (!atomicReference.compareAndSet(obj, apply));
        return apply;
    }
}
