package j$.util.function;

import j$.util.function.BiPredicate;

/* loaded from: classes5.dex */
public interface BiPredicate {
    BiPredicate and(BiPredicate biPredicate);

    BiPredicate negate();

    BiPredicate or(BiPredicate biPredicate);

    boolean test(Object obj, Object obj2);

    /* renamed from: j$.util.function.BiPredicate$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static BiPredicate $default$and(final BiPredicate biPredicate, final BiPredicate biPredicate2) {
            biPredicate2.getClass();
            return new BiPredicate() { // from class: j$.util.function.BiPredicate$$ExternalSyntheticLambda1
                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate and(BiPredicate biPredicate3) {
                    return BiPredicate.CC.$default$and(this, biPredicate3);
                }

                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate negate() {
                    return BiPredicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate or(BiPredicate biPredicate3) {
                    return BiPredicate.CC.$default$or(this, biPredicate3);
                }

                @Override // j$.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return BiPredicate.CC.lambda$and$0(BiPredicate.this, biPredicate2, obj, obj2);
                }
            };
        }

        public static /* synthetic */ boolean lambda$and$0(BiPredicate biPredicate, BiPredicate biPredicate2, Object obj, Object obj2) {
            return biPredicate.test(obj, obj2) && biPredicate2.test(obj, obj2);
        }

        public static BiPredicate $default$negate(final BiPredicate biPredicate) {
            return new BiPredicate() { // from class: j$.util.function.BiPredicate$$ExternalSyntheticLambda0
                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate and(BiPredicate biPredicate2) {
                    return BiPredicate.CC.$default$and(this, biPredicate2);
                }

                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate negate() {
                    return BiPredicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate or(BiPredicate biPredicate2) {
                    return BiPredicate.CC.$default$or(this, biPredicate2);
                }

                @Override // j$.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return BiPredicate.CC.lambda$negate$1(BiPredicate.this, obj, obj2);
                }
            };
        }

        public static /* synthetic */ boolean lambda$negate$1(BiPredicate biPredicate, Object obj, Object obj2) {
            return !biPredicate.test(obj, obj2);
        }

        public static BiPredicate $default$or(final BiPredicate biPredicate, final BiPredicate biPredicate2) {
            biPredicate2.getClass();
            return new BiPredicate() { // from class: j$.util.function.BiPredicate$$ExternalSyntheticLambda2
                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate and(BiPredicate biPredicate3) {
                    return BiPredicate.CC.$default$and(this, biPredicate3);
                }

                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate negate() {
                    return BiPredicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.BiPredicate
                public /* synthetic */ BiPredicate or(BiPredicate biPredicate3) {
                    return BiPredicate.CC.$default$or(this, biPredicate3);
                }

                @Override // j$.util.function.BiPredicate
                public final boolean test(Object obj, Object obj2) {
                    return BiPredicate.CC.lambda$or$2(BiPredicate.this, biPredicate2, obj, obj2);
                }
            };
        }

        public static /* synthetic */ boolean lambda$or$2(BiPredicate biPredicate, BiPredicate biPredicate2, Object obj, Object obj2) {
            return biPredicate.test(obj, obj2) || biPredicate2.test(obj, obj2);
        }
    }
}
