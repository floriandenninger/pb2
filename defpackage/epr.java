package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class epr implements View.OnClickListener {
    public final /* synthetic */ epv a;
    private final /* synthetic */ int b;

    public /* synthetic */ epr(epv epvVar, int i) {
        this.b = i;
        this.a = epvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ci ciVar = this.a.c;
            ciVar.startActivity(fav.b(ciVar));
            return;
        }
        if (i == 1) {
            final epv epvVar = this.a;
            ynm.n(epvVar.c, ((wjt) epvVar.g.get()).a(epvVar.h.c()), ept.a, new zfi() { // from class: eps
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    epv epvVar2 = epv.this;
                    AccountId accountId = (AccountId) obj;
                    if (accountId != null) {
                        Intent b = fav.b(epvVar2.c);
                        alxb.a(b, accountId);
                        epvVar2.c.startActivity(b);
                    }
                }
            });
            return;
        }
        epv epvVar2 = this.a;
        aloh.f(epvVar2.c);
        gcl gclVar = (gcl) epvVar2.b.get();
        gcm d = gcq.d();
        d.k(epvVar2.c.getString(R.string.user_turn_on_bedtime_snackbar_confirmation));
        d.m(epvVar2.c.getString(R.string.user_turn_on_bedtime_snackbar_settings), epvVar2.a());
        gclVar.j(d.b());
    }
}
