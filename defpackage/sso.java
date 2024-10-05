package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sso implements sxr {
    final /* synthetic */ szx a;
    final /* synthetic */ sxs b;
    final /* synthetic */ swt c;
    final /* synthetic */ sxc d;
    final /* synthetic */ sst e;

    public sso(sst sstVar, szx szxVar, sxs sxsVar, swt swtVar, sxc sxcVar) {
        this.e = sstVar;
        this.a = szxVar;
        this.b = sxsVar;
        this.c = swtVar;
        this.d = sxcVar;
    }

    @Override // defpackage.sxr
    public final void b(View view, View view2) {
        this.e.d(this.e.b.b(this.a.a(), sst.f(view, view2, null, this.b, this.c, this.d)).Q(), this.d);
    }

    @Override // defpackage.sxr
    public final void d(View view) {
        b(view, null);
    }
}
