package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amrb extends amrd {
    final /* synthetic */ amre a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrb(amre amreVar) {
        super(amreVar);
        this.a = amreVar;
    }

    @Override // defpackage.amrd
    public final Object a(int i) {
        return this.a.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int bt = amkq.bt(obj);
        int f = this.a.f(obj, bt);
        if (f == -1) {
            return false;
        }
        this.a.k(f, bt);
        return true;
    }
}
