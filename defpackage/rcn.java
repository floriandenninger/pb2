package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rcn extends rdh {
    final /* synthetic */ Bundle a;
    final /* synthetic */ rdq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcn(rdq rdqVar, Bundle bundle) {
        super(rdqVar);
        this.b = rdqVar;
        this.a = bundle;
    }

    @Override // defpackage.rdh
    public final void a() {
        rcf rcfVar = this.b.f;
        qip.an(rcfVar);
        rcfVar.setConditionalUserProperty(this.a, this.f);
    }
}
