package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhq implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ boolean e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ String h;
    final /* synthetic */ rid i;

    public rhq(rid ridVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.i = ridVar;
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = bundle;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.x(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
