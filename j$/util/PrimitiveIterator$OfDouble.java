package j$.util;

import j$.util.function.Consumer;
import j$.util.function.DoubleConsumer;

/* loaded from: classes5.dex */
public interface PrimitiveIterator$OfDouble extends java.util.Iterator {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    @Override // java.util.Iterator
    Double next();

    double nextDouble();

    /* renamed from: j$.util.PrimitiveIterator$OfDouble$-CC */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        /* renamed from: $default$next */
        public static /* bridge */ /* synthetic */ Object m169$default$next(PrimitiveIterator$OfDouble primitiveIterator$OfDouble) {
            return primitiveIterator$OfDouble.next();
        }

        public static void $default$forEachRemaining(PrimitiveIterator$OfDouble primitiveIterator$OfDouble, DoubleConsumer doubleConsumer) {
            doubleConsumer.getClass();
            while (primitiveIterator$OfDouble.hasNext()) {
                doubleConsumer.accept(primitiveIterator$OfDouble.nextDouble());
            }
        }

        public static Double $default$next(PrimitiveIterator$OfDouble primitiveIterator$OfDouble) {
            if (Tripwire.ENABLED) {
                Tripwire.trip(primitiveIterator$OfDouble.getClass(), "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            }
            return Double.valueOf(primitiveIterator$OfDouble.nextDouble());
        }

        public static void $default$forEachRemaining(PrimitiveIterator$OfDouble primitiveIterator$OfDouble, Consumer consumer) {
            if (consumer instanceof DoubleConsumer) {
                primitiveIterator$OfDouble.forEachRemaining((DoubleConsumer) consumer);
                return;
            }
            consumer.getClass();
            if (Tripwire.ENABLED) {
                Tripwire.trip(primitiveIterator$OfDouble.getClass(), "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            }
            primitiveIterator$OfDouble.forEachRemaining(new PrimitiveIterator$OfDouble$$ExternalSyntheticLambda0(consumer));
        }
    }
}
