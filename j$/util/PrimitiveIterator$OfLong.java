package j$.util;

import j$.util.function.Consumer;
import j$.util.function.LongConsumer;

/* loaded from: classes5.dex */
public interface PrimitiveIterator$OfLong extends java.util.Iterator {
    void forEachRemaining(LongConsumer longConsumer);

    @Override // java.util.Iterator
    Long next();

    long nextLong();

    /* renamed from: j$.util.PrimitiveIterator$OfLong$-CC */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        /* renamed from: $default$next */
        public static /* bridge */ /* synthetic */ Object m171$default$next(PrimitiveIterator$OfLong primitiveIterator$OfLong) {
            return primitiveIterator$OfLong.next();
        }

        public static void $default$forEachRemaining(PrimitiveIterator$OfLong primitiveIterator$OfLong, LongConsumer longConsumer) {
            longConsumer.getClass();
            while (primitiveIterator$OfLong.hasNext()) {
                longConsumer.accept(primitiveIterator$OfLong.nextLong());
            }
        }

        public static Long $default$next(PrimitiveIterator$OfLong primitiveIterator$OfLong) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(primitiveIterator$OfLong.getClass(), "{0} calling PrimitiveIterator.OfLong.nextLong()");
            }
            return Long.valueOf(primitiveIterator$OfLong.nextLong());
        }

        public static void $default$forEachRemaining(PrimitiveIterator$OfLong primitiveIterator$OfLong, Consumer consumer) {
            if (consumer instanceof LongConsumer) {
                primitiveIterator$OfLong.forEachRemaining((LongConsumer) consumer);
                return;
            }
            consumer.getClass();
            if (Tripwire.ENABLED) {
                Tripwire.trip(primitiveIterator$OfLong.getClass(), "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            }
            primitiveIterator$OfLong.forEachRemaining(new PrimitiveIterator$OfLong$$ExternalSyntheticLambda0(consumer));
        }
    }
}
