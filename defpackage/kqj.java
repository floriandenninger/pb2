package defpackage;

import android.content.Intent;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kqj implements zfi {
    public final /* synthetic */ kqm a;
    private final /* synthetic */ int b;

    public /* synthetic */ kqj(kqm kqmVar, int i) {
        this.b = i;
        this.a = kqmVar;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        akby f;
        if (this.b == 0) {
            kqm kqmVar = this.a;
            AccountId accountId = (AccountId) obj;
            if (accountId != null) {
                Intent a = fav.a(kqmVar.b);
                alxb.a(a, accountId);
                kqmVar.b(a);
                return;
            }
            return;
        }
        kqm kqmVar2 = this.a;
        kqs kqsVar = (kqs) obj;
        if (kqsVar == null || kqsVar.f >= 2) {
            return;
        }
        long j = kqsVar.e;
        if (j != 0) {
            long c = kqmVar2.c.c() - j;
            if (c < 0 || c < kqm.a) {
                return;
            }
        }
        if ((kqsVar.b & 1) == 0) {
            akbw akbwVar = kqmVar2.e;
            if (!kqmVar2.d.b() || kqmVar2.d.c()) {
                akbx e = kqmVar2.e.m().e(R.drawable.quantum_ic_accessibility_new_googblue_48);
                e.d = kqmVar2.b.getString(R.string.accessibility_settings_edu_opt_out_text);
                f = e.c(kqmVar2.b.getString(R.string.settings_button), kqmVar2.a()).a(kqmVar2.b.getString(R.string.dismiss), ipu.f).f();
            } else {
                akbx e2 = kqmVar2.e.m().e(R.drawable.quantum_ic_accessibility_new_googblue_48);
                e2.d = kqmVar2.b.getString(R.string.accessibility_settings_edu_opt_in_text);
                f = e2.a(kqmVar2.b.getString(R.string.settings_button), kqmVar2.a()).c(kqmVar2.b.getString(R.string.dismiss), ipu.e).f();
            }
            akbwVar.o(f);
            kqmVar2.h.n(new acqx(acsb.c(100673)));
            ajoy ajoyVar = kqmVar2.m;
            ((vgz) ajoyVar.a.get()).b(new kql(kqmVar2.c.c()), angq.a).d(bqc.g, angq.a);
        }
    }
}
