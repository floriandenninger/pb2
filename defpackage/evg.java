package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Spanned;
import com.google.android.youtube.R;
import com.google.apps.tiktok.account.AccountId;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class evg extends fks implements ypd {
    public static final Duration a = Duration.ofSeconds(30);
    public final ml b;
    public final evh c;
    public final gcl d;
    public final agxh e;
    public final shf f;
    public final aaea g;
    public long h;
    public boolean i;
    public avul j;
    public apxi k;
    public aqkv l;
    public atnz m;
    public acra n;
    public aphx o;
    public final ajzf p;
    public final afsy q;
    public final wjt r;
    public final wju s;
    public int t;
    public final aadw u;
    public final mjf v;
    private final ypa w;
    private AlertDialog x;
    private AlertDialog y;
    private final aahd z;

    public evg(fln flnVar, ml mlVar, ypa ypaVar, evh evhVar, gcl gclVar, agxh agxhVar, acra acraVar, shf shfVar, aaea aaeaVar, aadw aadwVar, aahd aahdVar, ajzf ajzfVar, mjf mjfVar, afsy afsyVar, wjt wjtVar, wju wjuVar) {
        super(flnVar);
        this.b = mlVar;
        this.w = ypaVar;
        this.c = evhVar;
        this.d = gclVar;
        this.e = agxhVar;
        this.n = acraVar;
        this.f = shfVar;
        this.g = aaeaVar;
        this.u = aadwVar;
        this.z = aahdVar;
        this.p = ajzfVar;
        this.v = mjfVar;
        this.q = afsyVar;
        this.r = wjtVar;
        this.s = wjuVar;
        this.t = 1;
    }

    private final Intent m() {
        return fav.c(this.b).putExtra(":android:no_headers", true);
    }

    private final void n() {
        ynm.m(this.c.a(), egw.g);
    }

    public final void d() {
        this.j = null;
        this.l = null;
        this.m = null;
        this.i = false;
        this.k = null;
    }

    public final void e() {
        this.t = 1;
        this.h = 0L;
        d();
    }

    public final void g(AccountId accountId) {
        Intent m = m();
        if (accountId != null) {
            alxb.a(m, accountId);
        }
        if (this.x == null) {
            eve eveVar = new eve(this, m, 1);
            AlertDialog.Builder title = new AlertDialog.Builder(this.b).setTitle(R.string.background_settings_is_on_title);
            ml mlVar = this.b;
            this.x = title.setMessage(mlVar.getString(R.string.background_settings_notification_message, new Object[]{evr.C(this.g, mlVar)})).setNegativeButton(R.string.settings, eveVar).setNegativeButton(R.string.edit_settings_action, eveVar).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).create();
        }
        this.x.show();
        n();
    }

    public final void h(AccountId accountId) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        Spanned spanned;
        Intent m = m();
        if (accountId != null) {
            alxb.a(m, accountId);
        }
        if (this.y == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
            aphx aphxVar = this.o;
            if ((aphxVar.b & 1) != 0) {
                aqygVar = aphxVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            AlertDialog.Builder title = builder.setTitle(ajcq.b(aqygVar));
            aphx aphxVar2 = this.o;
            if ((aphxVar2.b & 2) != 0) {
                aqygVar2 = aphxVar2.d;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            AlertDialog.Builder message = title.setMessage(ajcq.b(aqygVar2));
            aphx aphxVar3 = this.o;
            if ((aphxVar3.b & 4) != 0) {
                aqygVar3 = aphxVar3.e;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            AlertDialog.Builder negativeButton = message.setNegativeButton(ajcq.b(aqygVar3), new eve(this, m, 0));
            apmh apmhVar = this.o.f;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            if (apmhVar != null) {
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                if ((apmgVar.b & 256) != 0) {
                    apmg apmgVar2 = apmhVar.c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    aqyg aqygVar4 = apmgVar2.i;
                    if (aqygVar4 == null) {
                        aqygVar4 = aqyg.a;
                    }
                    spanned = ajcq.b(aqygVar4);
                    this.y = negativeButton.setPositiveButton(spanned, (DialogInterface.OnClickListener) null).create();
                }
            }
            spanned = null;
            this.y = negativeButton.setPositiveButton(spanned, (DialogInterface.OnClickListener) null).create();
        }
        this.y.show();
        n();
    }

    public final boolean j() {
        if (aij.c()) {
            return this.b.isInPictureInPictureMode();
        }
        return false;
    }

    public final void k(int i, boolean z, acra acraVar) {
        this.t = i;
        this.h = this.f.c();
        this.n = acraVar;
        if (z) {
            d();
        } else {
            this.i = true;
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        this.w.m(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.w.g(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            AlertDialog alertDialog = this.x;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.x.dismiss();
            }
            AlertDialog alertDialog2 = this.y;
            if (alertDialog2 == null || !alertDialog2.isShowing()) {
                return null;
            }
            this.y.dismiss();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void i() {
        apxi apxiVar = this.k;
        if (apxiVar == null) {
            return;
        }
        int i = apxiVar.b;
        if ((i & 1) != 0) {
            aahd aahdVar = this.z;
            apxf apxfVar = apxiVar.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.a(apxfVar);
            return;
        }
        if ((i & 2) != 0) {
            aahd aahdVar2 = this.z;
            apxf apxfVar2 = apxiVar.d;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.a(apxfVar2);
            acra acraVar = this.n;
            if (acraVar != null) {
                acraVar.u(new acqx(this.k.f), null);
            }
        }
    }
}
