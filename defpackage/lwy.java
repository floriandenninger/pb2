package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lwy extends BroadcastReceiver {
    public final ml a;
    public final gcl b;
    public final ywr c;
    public final aok d;
    public boolean e;
    public PowerManager f;
    public anhy g;
    public final aadw h;
    private final fxj i;
    private final gni j;
    private final afsy k;
    private final wjt l;
    private final wju m;

    public lwy(ml mlVar, aok aokVar, aadw aadwVar, gcl gclVar, fxj fxjVar, gni gniVar, ywr ywrVar, afsy afsyVar, wjt wjtVar, wju wjuVar) {
        mlVar.getSavedStateRegistry().b("auto_dark_theme_bundle", new bub() { // from class: lww
            @Override // defpackage.bub
            public final Bundle a() {
                lwy lwyVar = lwy.this;
                Bundle bundle = new Bundle();
                if (!evr.bC(lwyVar.c)) {
                    bundle.putBoolean("auto_dark_theme_user_toggle", true);
                }
                return bundle;
            }
        });
        Bundle a = mlVar.getSavedStateRegistry().a("auto_dark_theme_bundle");
        this.a = mlVar;
        this.d = aokVar;
        this.h = aadwVar;
        this.b = gclVar;
        this.i = fxjVar;
        this.j = gniVar;
        this.c = ywrVar;
        this.k = afsyVar;
        this.l = wjtVar;
        this.m = wjuVar;
        anhy anhyVar = null;
        if (a != null && a.getBoolean("auto_dark_theme_snackbar_msg", false)) {
            if (wjuVar.a()) {
                anhyVar = anfq.h(anht.q(wjtVar.a(afsyVar.c())), new amml() { // from class: lwu
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        return lwy.this.a((AccountId) obj);
                    }
                }, angq.a);
            } else {
                anhyVar = anaf.O(a(null));
            }
        }
        this.g = anhyVar;
        if ((a == null || !a.getBoolean("auto_dark_theme_user_toggle", false)) && ((gnh) ywrVar.c()).h) {
            ynm.n(aokVar, ywrVar.b(loc.l), llq.l, ynm.b);
        }
    }

    public final gcq a(AccountId accountId) {
        Intent b = fav.b(this.a);
        if (accountId != null) {
            alxb.a(b, accountId);
        }
        gcm d = gcq.d();
        d.k(this.a.getString(R.string.auto_switched_to_dark_theme));
        d.m(this.a.getString(R.string.settings_button), new lwv(this, b, 1));
        return d.b();
    }

    public final gcq b(AccountId accountId) {
        Intent b = fav.b(this.a);
        if (accountId != null) {
            alxb.a(b, accountId);
        }
        gcm d = gcq.d();
        d.k(this.a.getString(R.string.switch_to_dark_theme));
        d.m(this.a.getString(R.string.settings_button), new lwv(this, b, 0));
        return d.b();
    }

    public final boolean c() {
        PowerManager powerManager = this.f;
        return powerManager != null && powerManager.isPowerSaveMode();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.e && "android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction()) && this.i.b) {
            if (this.j.a() == (c() ? gng.DARK : gng.LIGHT) || !c()) {
                return;
            }
            if (!this.m.a()) {
                this.b.j(b(null));
            } else {
                ynm.n(this.a, this.l.a(this.k.c()), llq.m, new lwx(this, 0));
            }
        }
    }
}
