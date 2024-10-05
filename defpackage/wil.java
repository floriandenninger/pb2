package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wil implements Runnable {
    final /* synthetic */ AccountIdentity a;
    final /* synthetic */ wdk b;
    final /* synthetic */ apxf c;
    final /* synthetic */ wir d;

    public wil(wir wirVar, AccountIdentity accountIdentity, wdk wdkVar, apxf apxfVar) {
        this.d = wirVar;
        this.a = accountIdentity;
        this.b = wdkVar;
        this.c = apxfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d(this.a, this.b, this.c);
    }
}
