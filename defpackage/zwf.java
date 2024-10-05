package defpackage;

import android.support.v7.widget.GridLayoutManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zwf extends uu {
    final /* synthetic */ GridLayoutManager c;
    final /* synthetic */ zwh d;

    public zwf(zwh zwhVar, GridLayoutManager gridLayoutManager) {
        this.d = zwhVar;
        this.c = gridLayoutManager;
    }

    @Override // defpackage.uu
    public final int b(int i) {
        if (this.d.e.C(i)) {
            return this.c.b;
        }
        return 1;
    }
}
