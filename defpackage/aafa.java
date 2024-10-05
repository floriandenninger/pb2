package defpackage;

import j$.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aafa implements Predicate {
    public final /* synthetic */ aonk a;
    private final /* synthetic */ int b;

    public /* synthetic */ aafa(aonk aonkVar, int i) {
        this.b = i;
        this.a = aonkVar;
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
        if (this.b == 0) {
            return ((awmp) obj).pY(this.a);
        }
        return ((awmp) obj).pY(this.a);
    }
}
