package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajjc implements syl {
    public long a;

    @Override // defpackage.syl
    public final aomu a() {
        return aumx.b;
    }

    public final MotionEvent b(long j, int i, szk szkVar) {
        return MotionEvent.obtain(this.a, j, i, szkVar.a, szkVar.b, 0);
    }

    @Override // defpackage.syn
    public final /* bridge */ /* synthetic */ void c(dhe dheVar, sxc sxcVar, String str, Object obj, sxs sxsVar, swt swtVar) {
        if (((aumx) obj).c) {
            akav c = akaw.c();
            sxsVar.n(new ajiz(this, c));
            sxsVar.o(new ajja(this, c));
            sxsVar.m(new ajjb(this, c));
        }
    }

    @Override // defpackage.syn
    public final /* synthetic */ void e(sxs sxsVar) {
        throw null;
    }
}
