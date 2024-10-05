package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rtr extends axzu {
    final /* synthetic */ rts a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rtr(rts rtsVar, axzr axzrVar) {
        super(axzrVar);
        this.a = rtsVar;
    }

    @Override // defpackage.axzu
    protected final void a(ayaw ayawVar, aycd aycdVar) {
        try {
            rts rtsVar = this.a;
            String e = qde.e(rtsVar.b, rtsVar.c, "oauth2:https://www.googleapis.com/auth/oauth_integrations");
            ayca c = ayca.c("Authorization", aycd.a);
            String valueOf = String.valueOf(e);
            aycdVar.f(c, valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
        } catch (IOException | qcw e2) {
            ((amyf) ((amyf) ((amyf) rts.a.g()).h(e2)).i("com/google/android/libraries/accountlinking/rpc/AuthClientInterceptor$1", "checkedStart", 50, "AuthClientInterceptor.java")).q("Failed to get an auth token via GoogleAuthUtil#getToken()");
        }
        this.b.k(ayawVar, aycdVar);
    }
}
