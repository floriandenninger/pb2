package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wcm {
    public final aatg a;
    public final wkk b;
    public final Executor c;
    public final aftj d;
    public final wgv e;
    private final Executor f;

    public wcm(aatg aatgVar, wkk wkkVar, aftj aftjVar, Executor executor, Executor executor2, wgv wgvVar) {
        aatgVar.getClass();
        this.a = aatgVar;
        wkkVar.getClass();
        this.b = wkkVar;
        aftjVar.getClass();
        this.d = aftjVar;
        executor.getClass();
        this.f = executor;
        executor2.getClass();
        this.c = executor2;
        wgvVar.getClass();
        this.e = wgvVar;
    }

    public static boolean a(aati aatiVar) {
        for (aata aataVar : aatiVar.c()) {
            if (aataVar.l() && (aataVar.p() || aataVar.m())) {
                aatj aatjVar = aataVar.c;
                if (aatjVar.h == null) {
                    aatjVar.b();
                }
                Boolean bool = aatjVar.h;
                if (bool == null || !bool.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(AccountIdentity accountIdentity, cnl cnlVar) {
        this.f.execute(new wci(this, accountIdentity, new WeakReference(cnlVar)));
    }
}
