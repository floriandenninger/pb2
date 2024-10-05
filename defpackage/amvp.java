package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amvp extends amtg {
    final /* synthetic */ amvr a;

    public amvp(amvr amvrVar) {
        this.a = amvrVar;
    }

    @Override // defpackage.amtg
    public final Object c(int i) {
        return this.a.b.g(i);
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b.c;
    }
}
