package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.extensions.accountlinking.AccountLinkingController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gvv {
    public final Activity a;
    public final AccountLinkingController b;
    public final ajut c;
    public boolean d;
    public kem e;
    private final acra f;
    private boolean g;
    private boolean h;

    public gvv(Activity activity, AccountLinkingController accountLinkingController, ajut ajutVar, yqw yqwVar, acra acraVar) {
        this.a = activity;
        this.b = accountLinkingController;
        this.c = ajutVar;
        this.f = acraVar;
        accountLinkingController.d.U().i(aypg.LATEST).h(wbs.M(yqwVar.a())).X(new ayrs() { // from class: gvu
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gvv gvvVar = gvv.this;
                gvvVar.d = ((Boolean) obj).booleanValue();
                gvvVar.c();
            }
        });
    }

    public final void a() {
        acqx a = acqx.a(this.b.g());
        if (a == null) {
            return;
        }
        this.f.D(a);
        if (this.h) {
            this.f.u(a, null);
        } else {
            this.f.q(a, null);
        }
    }

    public final void b(boolean z) {
        this.g = z;
        c();
    }

    public final void c() {
        boolean z = this.g && this.d && this.e != null;
        if (z == this.h) {
            return;
        }
        this.h = z;
        if (!z) {
            kem kemVar = this.e;
            kemVar.c = "";
            kemVar.g(false);
            return;
        }
        aouj g = this.b.g();
        if (g == null || (g.b & 1) == 0) {
            throw new IllegalStateException("Presence is shared but unable to show disclosure");
        }
        kem kemVar2 = this.e;
        aqyg aqygVar = g.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        kemVar2.c = ajcq.b(aqygVar).toString();
        this.e.g(true);
    }
}
