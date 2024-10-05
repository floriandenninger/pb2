package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdg implements ykl {
    final /* synthetic */ wdj a;

    public wdg(wdj wdjVar) {
        this.a = wdjVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        aata aataVar = (aata) obj2;
        this.a.a.o(AccountIdentity.n(aataVar.i(), aataVar.g(), aataVar.j(), aataVar.h()));
        this.a.b.q(new wdk(aataVar.g(), aataVar));
    }
}
