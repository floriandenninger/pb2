package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class bsw extends wx {
    final RecyclerView d;
    final ic e;
    final ic f;

    public bsw(RecyclerView recyclerView) {
        super(recyclerView);
        this.e = ((wx) this).c;
        this.f = new bsv(this);
        this.d = recyclerView;
    }

    @Override // defpackage.wx
    public final ic k() {
        return this.f;
    }
}
