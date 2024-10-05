package j$.util;

import j$.util.function.Consumer;

/* loaded from: classes5.dex */
public interface Iterator {

    /* compiled from: D8$$SyntheticClass */
    /* renamed from: j$.util.Iterator$-EL, reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class EL {
        public static /* synthetic */ void forEachRemaining(java.util.Iterator it, Consumer consumer) {
            if (it instanceof Iterator) {
                ((Iterator) it).forEachRemaining(consumer);
            } else {
                CC.$default$forEachRemaining(it, consumer);
            }
        }
    }

    void forEachRemaining(Consumer consumer);

    boolean hasNext();

    Object next();

    void remove();

    /* renamed from: j$.util.Iterator$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static void $default$remove(java.util.Iterator it) {
            throw new UnsupportedOperationException("remove");
        }

        public static void $default$forEachRemaining(java.util.Iterator it, Consumer consumer) {
            consumer.getClass();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }
}
