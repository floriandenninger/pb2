package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajeq extends ajjg {
    public final ajhd q;
    public final acra r;
    public final sqq s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajeq(ajhd ajhdVar, sqq sqqVar, acra acraVar) {
        super(ajhdVar.n, ajhdVar.o);
        new HashSet(Arrays.asList(tbz.LAYOUT));
        this.q = ajhdVar;
        this.s = sqqVar;
        this.r = acraVar;
    }

    @Override // defpackage.tby
    public final void f() {
        super.d();
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.aF(this.e);
            this.c.removeOnLayoutChangeListener(this.f);
        }
        vw vwVar = this.b;
        if (vwVar != null) {
            vwVar.v(this.g);
        }
        this.b = null;
        this.c = null;
        this.p = null;
        this.j.clear();
        this.h = -1;
        this.i = -1;
        this.k = -1;
        this.l = -1;
        this.m = 1;
        this.n = -1;
        this.o = -1;
        this.a.clear();
    }
}
