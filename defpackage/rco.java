package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rco extends rdh {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ rdq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rco(rdq rdqVar, String str, String str2, Bundle bundle) {
        super(rdqVar);
        this.d = rdqVar;
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.d.f;
        qip.an(rcfVar);
        rcfVar.clearConditionalUserProperty(this.a, this.b, this.c);
    }
}
