package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdf implements ykl {
    final /* synthetic */ AccountIdentity a;
    final /* synthetic */ wdj b;

    public wdf(wdj wdjVar, AccountIdentity accountIdentity) {
        this.b = wdjVar;
        this.a = accountIdentity;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.a.r(false);
        this.b.d.d(new afto());
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        aata aataVar = (aata) obj2;
        String i = aataVar.i();
        C$AutoValue_AccountIdentity c$AutoValue_AccountIdentity = (C$AutoValue_AccountIdentity) this.a;
        AccountIdentity n = AccountIdentity.n(i, c$AutoValue_AccountIdentity.b, c$AutoValue_AccountIdentity.c, aataVar.h());
        this.b.a.o(n);
        this.b.d.d(new aftm(n));
        this.b.b.q(new wdk(((C$AutoValue_AccountIdentity) this.a).b, aataVar));
        this.b.d.d(new wdl());
    }
}
