package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rdk extends rdh {
    final /* synthetic */ Activity a;
    final /* synthetic */ rdp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdk(rdp rdpVar, Activity activity) {
        super(rdpVar.a);
        this.b = rdpVar;
        this.a = activity;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.b.a.f;
        qip.an(rcfVar);
        rcfVar.onActivityResumed(qve.a(this.a), this.g);
    }
}
