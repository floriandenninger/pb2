package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ssn implements sxr {
    final /* synthetic */ axon a;
    final /* synthetic */ szx b;
    final /* synthetic */ sxs c;
    final /* synthetic */ swt d;
    final /* synthetic */ sxc e;
    final /* synthetic */ sst f;

    public ssn(sst sstVar, axon axonVar, szx szxVar, sxs sxsVar, swt swtVar, sxc sxcVar) {
        this.f = sstVar;
        this.a = axonVar;
        this.b = szxVar;
        this.c = sxsVar;
        this.d = swtVar;
        this.e = sxcVar;
    }

    @Override // defpackage.sxr
    public final /* synthetic */ void b(View view, View view2) {
        rwh.ai(this, view);
    }

    @Override // defpackage.sxr
    public final void d(View view) {
        if (sst.a.containsKey(this.a.b)) {
            return;
        }
        sst.a.put(this.a.b, true);
        this.f.d(this.f.b.b(this.b.a(), sst.g(view, null, this.c, this.d, this.e)).Q(), this.e);
    }
}
