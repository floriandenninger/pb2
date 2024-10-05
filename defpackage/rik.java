package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rik implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ rij b;
    final /* synthetic */ rij c;
    final /* synthetic */ long d;
    final /* synthetic */ rip e;

    public rik(rip ripVar, Bundle bundle, rij rijVar, rij rijVar2, long j) {
        this.e = ripVar;
        this.a = bundle;
        this.b = rijVar;
        this.c = rijVar2;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rip ripVar = this.e;
        Bundle bundle = this.a;
        rij rijVar = this.b;
        rij rijVar2 = this.c;
        long j = this.d;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        ripVar.r(rijVar, rijVar2, j, true, ripVar.N().w(null, "screen_view", bundle, null, false));
    }
}
