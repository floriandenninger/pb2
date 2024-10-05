package j$.util.function;

import j$.util.function.Predicate;

/* loaded from: classes5.dex */
public interface Predicate {
    Predicate and(Predicate predicate);

    Predicate negate();

    Predicate or(Predicate predicate);

    boolean test(Object obj);

    /* renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class CC {
        public static Predicate $default$and(final Predicate predicate, final Predicate predicate2) {
            predicate2.getClass();
            return new Predicate() { // from class: j$.util.function.Predicate$$ExternalSyntheticLambda2
                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate3) {
                    return Predicate.CC.$default$and(this, predicate3);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate or(Predicate predicate3) {
                    return Predicate.CC.$default$or(this, predicate3);
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return Predicate.CC.lambda$and$0(Predicate.this, predicate2, obj);
                }
            };
        }

        public static /* synthetic */ boolean lambda$and$0(Predicate predicate, Predicate predicate2, Object obj) {
            return predicate.test(obj) && predicate2.test(obj);
        }

        public static Predicate $default$negate(final Predicate predicate) {
            return new Predicate() { // from class: j$.util.function.Predicate$$ExternalSyntheticLambda1
                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return Predicate.CC.$default$and(this, predicate2);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return Predicate.CC.$default$or(this, predicate2);
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return Predicate.CC.lambda$negate$1(Predicate.this, obj);
                }
            };
        }

        public static /* synthetic */ boolean lambda$negate$1(Predicate predicate, Object obj) {
            return !predicate.test(obj);
        }

        public static Predicate $default$or(final Predicate predicate, final Predicate predicate2) {
            predicate2.getClass();
            return new Predicate() { // from class: j$.util.function.Predicate$$ExternalSyntheticLambda3
                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate3) {
                    return Predicate.CC.$default$and(this, predicate3);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate negate() {
                    return Predicate.CC.$default$negate(this);
                }

                @Override // j$.util.function.Predicate
                public /* synthetic */ Predicate or(Predicate predicate3) {
                    return Predicate.CC.$default$or(this, predicate3);
                }

                @Override // j$.util.function.Predicate
                public final boolean test(Object obj) {
                    return Predicate.CC.lambda$or$2(Predicate.this, predicate2, obj);
                }
            };
        }

        public static /* synthetic */ boolean lambda$or$2(Predicate predicate, Predicate predicate2, Object obj) {
            return predicate.test(obj) || predicate2.test(obj);
        }
    }
}
