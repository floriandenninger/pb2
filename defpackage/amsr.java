package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amsr extends amss implements amuw {
    private transient amru a;
    private transient amsx b;

    @Override // defpackage.amrl
    public final int b(Object[] objArr, int i) {
        amxd listIterator = j().listIterator();
        while (listIterator.hasNext()) {
            amux amuxVar = (amux) listIterator.next();
            Arrays.fill(objArr, i, amuxVar.a() + i, amuxVar.a);
            i += amuxVar.a();
        }
        return i;
    }

    @Override // defpackage.amuw
    @Deprecated
    public final int c(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return amkq.aE(this, obj);
    }

    @Override // defpackage.amuw
    @Deprecated
    public final void f(Object obj, int i) {
        throw null;
    }

    @Override // defpackage.amrl
    public final amru g() {
        amru amruVar = this.a;
        if (amruVar != null) {
            return amruVar;
        }
        amru g = super.g();
        this.a = g;
        return g;
    }

    @Override // defpackage.amuw
    @Deprecated
    public final boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return amkq.ak(j());
    }

    @Override // defpackage.amuw
    public /* bridge */ /* synthetic */ Set i() {
        throw null;
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return new amsn(j().listIterator());
    }

    public abstract amsx n();

    @Override // defpackage.amuw
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final amsx j() {
        amsx amsxVar = this.b;
        if (amsxVar == null) {
            if (isEmpty()) {
                amsxVar = amvs.a;
            } else {
                amsxVar = new amsp(this);
            }
            this.b = amsxVar;
        }
        return amsxVar;
    }

    public abstract amux p(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }

    @Override // defpackage.amrl
    abstract Object writeReplace();
}
