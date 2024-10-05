package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class iaa extends dk {
    public int a;
    final SparseArray c;
    final /* synthetic */ iac d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iaa(iac iacVar, dd ddVar) {
        super(ddVar);
        this.d = iacVar;
        this.a = 0;
        this.c = new SparseArray();
    }

    @Override // defpackage.dk
    public final ce b(int i) {
        return new iao();
    }

    @Override // defpackage.dk, defpackage.bxz
    public final Object c(ViewGroup viewGroup, int i) {
        Object c = super.c(viewGroup, this.d.as.y(i));
        this.c.put(i, c);
        return c;
    }

    @Override // defpackage.dk, defpackage.bxz
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        this.c.remove(i);
        super.d(viewGroup, i, obj);
    }

    @Override // defpackage.bxz
    public final int j() {
        return this.a;
    }

    public final ce o(int i) {
        return (ce) this.c.get(this.d.as.y(i));
    }
}
