package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rdf extends rdh {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rdq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdf(rdq rdqVar, String str, String str2, Bundle bundle, boolean z) {
        super(rdqVar);
        this.e = rdqVar;
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = z;
    }

    @Override // defpackage.rdh
    public final void a() {
        long j = this.f;
        rcf rcfVar = this.e.f;
        qip.an(rcfVar);
        rcfVar.logEvent(this.a, this.b, this.c, this.d, true, j);
    }
}
