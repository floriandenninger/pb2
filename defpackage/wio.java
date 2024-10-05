package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wio implements Runnable {
    final /* synthetic */ AccountIdentity a;
    final /* synthetic */ aata b;
    final /* synthetic */ apxf c;
    final /* synthetic */ wir d;

    public wio(wir wirVar, AccountIdentity accountIdentity, aata aataVar, apxf apxfVar) {
        this.d = wirVar;
        this.a = accountIdentity;
        this.b = aataVar;
        this.c = apxfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wir wirVar = this.d;
        AccountIdentity accountIdentity = this.a;
        wirVar.d(accountIdentity, new wdk(((C$AutoValue_AccountIdentity) accountIdentity).b, this.b), this.c);
    }
}
