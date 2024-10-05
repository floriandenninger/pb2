package j$.util.function;

import j$.util.function.IntPredicate;

/* loaded from: classes5.dex */
public interface IntPredicate {
    IntPredicate and(IntPredicate intPredicate);

    IntPredicate negate();

    IntPredicate or(IntPredicate intPredicate);

    boolean test(int i);

    /* renamed from: j$.util.function.IntPredicate$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static IntPredicate $default$and(final IntPredicate intPredicate, final IntPredicate intPredicate2) {
            intPredicate2.getClass();
            return new IntPredicate() { // from class: j$.util.function.IntPredicate$$ExternalSyntheticLambda1
                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate and(IntPredicate intPredicate3) {
                    return IntPredicate.CC.$default$and(this, intPredicate3);
                }

                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate negate() {
                    return IntPredicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate or(IntPredicate intPredicate3) {
                    return IntPredicate.CC.$default$or(this, intPredicate3);
                }

                @Override // j$.util.function.IntPredicate
                public final boolean test(int i) {
                    return IntPredicate.CC.lambda$and$0(IntPredicate.this, intPredicate2, i);
                }
            };
        }

        public static /* synthetic */ boolean lambda$and$0(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
            return intPredicate.test(i) && intPredicate2.test(i);
        }

        public static IntPredicate $default$negate(final IntPredicate intPredicate) {
            return new IntPredicate() { // from class: j$.util.function.IntPredicate$$ExternalSyntheticLambda0
                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate and(IntPredicate intPredicate2) {
                    return IntPredicate.CC.$default$and(this, intPredicate2);
                }

                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate negate() {
                    return IntPredicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate or(IntPredicate intPredicate2) {
                    return IntPredicate.CC.$default$or(this, intPredicate2);
                }

                @Override // j$.util.function.IntPredicate
                public final boolean test(int i) {
                    return IntPredicate.CC.lambda$negate$1(IntPredicate.this, i);
                }
            };
        }

        public static /* synthetic */ boolean lambda$negate$1(IntPredicate intPredicate, int i) {
            return !intPredicate.test(i);
        }

        public static IntPredicate $default$or(final IntPredicate intPredicate, final IntPredicate intPredicate2) {
            intPredicate2.getClass();
            return new IntPredicate() { // from class: j$.util.function.IntPredicate$$ExternalSyntheticLambda2
                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate and(IntPredicate intPredicate3) {
                    return IntPredicate.CC.$default$and(this, intPredicate3);
                }

                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate negate() {
                    return IntPredicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.IntPredicate
                public /* synthetic */ IntPredicate or(IntPredicate intPredicate3) {
                    return IntPredicate.CC.$default$or(this, intPredicate3);
                }

                @Override // j$.util.function.IntPredicate
                public final boolean test(int i) {
                    return IntPredicate.CC.lambda$or$2(IntPredicate.this, intPredicate2, i);
                }
            };
        }

        public static /* synthetic */ boolean lambda$or$2(IntPredicate intPredicate, IntPredicate intPredicate2, int i) {
            return intPredicate.test(i) || intPredicate2.test(i);
        }
    }
}
