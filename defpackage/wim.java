package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wim implements Runnable {
    final /* synthetic */ AccountIdentity a;
    final /* synthetic */ apxf b;
    final /* synthetic */ wir c;

    public wim(wir wirVar, AccountIdentity accountIdentity, apxf apxfVar) {
        this.c = wirVar;
        this.a = accountIdentity;
        this.b = apxfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d(this.a, wdk.a, this.b);
    }
}
