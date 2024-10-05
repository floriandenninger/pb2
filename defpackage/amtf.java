package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amtf extends amru {
    final /* synthetic */ amtg a;

    public amtf(amtg amtgVar) {
        this.a = amtgVar;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return this.a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
