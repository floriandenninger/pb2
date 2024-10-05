package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcq extends rdh {
    final /* synthetic */ Activity a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ rdq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcq(rdq rdqVar, Activity activity, String str, String str2) {
        super(rdqVar);
        this.d = rdqVar;
        this.a = activity;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.d.f;
        qip.an(rcfVar);
        rcfVar.setCurrentScreen(qve.a(this.a), this.b, this.c, this.f);
    }
}
