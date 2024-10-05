package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rdn extends rdh {
    final /* synthetic */ Activity a;
    final /* synthetic */ rdp b;
    final /* synthetic */ rch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdn(rdp rdpVar, Activity activity, rch rchVar) {
        super(rdpVar.a);
        this.b = rdpVar;
        this.a = activity;
        this.c = rchVar;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.b.a.f;
        qip.an(rcfVar);
        rcfVar.onActivitySaveInstanceState(qve.a(this.a), this.c, this.g);
    }
}
