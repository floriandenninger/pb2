package defpackage;

import j$.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class opy implements Predicate {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ opy(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.b != 0 ? Predicate.CC.$default$and(this, predicate) : Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return this.b != 0 ? Predicate.CC.$default$negate(this) : Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.b != 0 ? Predicate.CC.$default$or(this, predicate) : Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        if (this.b != 0) {
            return ((opl) obj).c == this.a;
        }
        return ((opl) obj).b == this.a;
    }
}
