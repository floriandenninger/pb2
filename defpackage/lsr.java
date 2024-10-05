package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lsr implements lyo {
    public final gcl a;
    public final ci b;
    private final gni c;
    private final ywr d;
    private final afsy e;
    private final wjt f;
    private final wju g;
    private gng h;

    public lsr(ci ciVar, gcl gclVar, gni gniVar, ywr ywrVar, afsy afsyVar, wjt wjtVar, wju wjuVar) {
        ciVar.getClass();
        this.b = ciVar;
        gclVar.getClass();
        this.a = gclVar;
        this.c = gniVar;
        this.h = gniVar.b();
        this.d = ywrVar;
        this.e = afsyVar;
        this.f = wjtVar;
        this.g = wjuVar;
    }

    public final gcq a(AccountId accountId) {
        gcm d = gcq.d();
        d.k(this.b.getString(R.string.theme_not_match_with_system_theme));
        String string = this.b.getString(R.string.settings_button);
        final Intent b = fav.b(this.b);
        if (accountId != null) {
            alxb.a(b, accountId);
        }
        d.m(string, new View.OnClickListener() { // from class: lsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lsr lsrVar = lsr.this;
                lsrVar.b.startActivity(b);
            }
        });
        return d.b();
    }

    @Override // defpackage.lyo
    public final void b(gng gngVar) {
        gcq b;
        if (Build.VERSION.SDK_INT > 28) {
            if (!((gnh) this.d.c()).c) {
                if (this.b.getString(R.string.app_theme_appearance_system).equals(((gnh) this.d.c()).f) && this.h != gngVar) {
                    gcl gclVar = this.a;
                    gng gngVar2 = gng.LIGHT;
                    int ordinal = gngVar.ordinal();
                    if (ordinal == 0) {
                        gcm d = gcq.d();
                        d.k(this.b.getString(R.string.auto_switched_to_light_by_device_theme));
                        b = d.b();
                    } else if (ordinal == 1) {
                        gcm d2 = gcq.d();
                        d2.k(this.b.getString(R.string.auto_switched_to_dark_by_device_theme));
                        b = d2.b();
                    } else {
                        throw new AssertionError();
                    }
                    gclVar.j(b);
                    ynm.n(this.b, this.d.b(loc.h), llq.g, ynm.b);
                    this.h = gngVar;
                }
            }
            if (amkq.b(((gnh) this.d.c()).f, this.b.getString(R.string.app_theme_appearance_dark)) && this.c.c() != gng.DARK && this.c.b() == gng.DARK && gngVar == gng.DARK && !((gnh) this.d.c()).d) {
                if (!this.g.a()) {
                    this.a.j(a(null));
                } else {
                    ynm.n(this.b, this.f.a(this.e.c()), llq.h, new zfi() { // from class: lsq
                        @Override // defpackage.zfi
                        public final void a(Object obj) {
                            lsr lsrVar = lsr.this;
                            AccountId accountId = (AccountId) obj;
                            accountId.getClass();
                            lsrVar.a.j(lsrVar.a(accountId));
                        }
                    });
                }
                ynm.n(this.b, this.d.b(loc.i), llq.i, ynm.b);
            }
            this.h = gngVar;
        }
    }

    @Override // defpackage.lyo
    public final void c(Bundle bundle) {
        if (bundle != null) {
            this.h = (gng) gng.a(bundle.getInt("current_theme")).e(this.h);
        }
    }

    @Override // defpackage.lyo
    public final void d(Bundle bundle) {
        bundle.putInt("current_theme", this.h.c);
    }
}
