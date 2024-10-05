package defpackage;

import android.app.Activity;
import j$.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class han implements Predicate {
    public final /* synthetic */ Class a;
    private final /* synthetic */ int b;

    public /* synthetic */ han(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i = this.b;
        if (i == 0) {
            return Predicate.CC.$default$and(this, predicate);
        }
        if (i == 1) {
            return Predicate.CC.$default$and(this, predicate);
        }
        if (i != 2) {
            return i != 3 ? Predicate.CC.$default$and(this, predicate) : Predicate.CC.$default$and(this, predicate);
        }
        return Predicate.CC.$default$and(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        int i = this.b;
        if (i == 0) {
            return Predicate.CC.$default$negate(this);
        }
        if (i == 1) {
            return Predicate.CC.$default$negate(this);
        }
        if (i != 2) {
            return i != 3 ? Predicate.CC.$default$negate(this) : Predicate.CC.$default$negate(this);
        }
        return Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i = this.b;
        if (i == 0) {
            return Predicate.CC.$default$or(this, predicate);
        }
        if (i == 1) {
            return Predicate.CC.$default$or(this, predicate);
        }
        if (i != 2) {
            return i != 3 ? Predicate.CC.$default$or(this, predicate) : Predicate.CC.$default$or(this, predicate);
        }
        return Predicate.CC.$default$or(this, predicate);
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.b;
        if (i == 0) {
            return this.a.isInstance((ce) obj);
        }
        if (i == 1) {
            return this.a.isInstance((gir) obj);
        }
        if (i != 2) {
            return i != 3 ? this.a.isInstance((Activity) obj) : this.a.isInstance(obj);
        }
        return this.a.isInstance((ce) obj);
    }
}
