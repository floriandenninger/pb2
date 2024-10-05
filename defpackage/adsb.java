package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.onegoogle.accountmanagement.AccountsModelUpdater;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsb implements adru, ypd {
    public final adsw a;
    public final adsq b;
    public final adsi c;
    public final acra d;
    public final ypa e;
    public ml g;
    public adsv h;
    public uhi i;
    public final adti k;
    private final azrw l;
    private final azrw m;
    private final ukk n;
    public boolean j = false;
    public final Handler f = new Handler(Looper.getMainLooper());

    public adsb(adsw adswVar, adsq adsqVar, adsi adsiVar, adti adtiVar, azrw azrwVar, azrw azrwVar2, ukk ukkVar, acra acraVar, ypa ypaVar) {
        this.a = adswVar;
        this.b = adsqVar;
        this.c = adsiVar;
        this.k = adtiVar;
        this.l = azrwVar;
        this.m = azrwVar2;
        this.n = ukkVar;
        this.d = acraVar;
        this.e = ypaVar;
    }

    @Override // defpackage.adru
    public final boolean a(ml mlVar, String str, ammv ammvVar, boolean z) {
        uik uikVar;
        uim uimVar;
        if (mlVar == null) {
            zga.m("MDX.tvsignin.ExpressTvSignInDrawerController", "Sign in request is invalid or the View cannot be placed.");
        } else if (this.h != null) {
            zga.m("MDX.tvsignin.ExpressTvSignInDrawerController", "There is already a sign in request active. Exiting.");
        } else {
            adsv g = this.a.g();
            if (g != null && g.b() != null) {
                this.g = mlVar;
                adsv g2 = this.a.g();
                this.h = g2;
                this.j = false;
                Object[] objArr = new Object[3];
                objArr[0] = g2.d.c();
                adsv adsvVar = this.h;
                int i = adsvVar.e;
                objArr[1] = i != 0 ? i != 1 ? i != 2 ? "mdx message" : "mdx assisted" : "passive" : "seamless";
                objArr[2] = adsvVar.a;
                String.format("Showing Express Sign In Layout for screen=%s, type=%s, signInSessionId=%s", objArr);
                int k = alkd.k(this.g, R.attr.isLightTheme, "MDX.tvsignin.ExpressTvSignInDrawerController");
                if ((k != 0) ^ ((this.g.getResources().getConfiguration().uiMode & 48) == 16)) {
                    this.g.getDelegate().u(k != 0 ? 1 : 2);
                }
                if (z) {
                    uikVar = (uik) this.m.get();
                } else {
                    uikVar = (uik) this.l.get();
                }
                ml mlVar2 = this.g;
                uhg uhgVar = new uhg(null);
                if (uikVar != null) {
                    uhgVar.a = uikVar;
                    ufl g3 = AccountsModelUpdater.g();
                    g3.a = uikVar.a;
                    g3.b = this.n;
                    uhgVar.c = ammv.j(new AccountsModelUpdater(g3.a, new ufp(g3.b), g3.b));
                    uil uilVar = new uil();
                    uilVar.a = uis.a().a();
                    uilVar.b = new adrv(this);
                    uip uipVar = new uip(null);
                    if (str != null) {
                        uipVar.a = str;
                        uipVar.b = ammv.j((String) ((amna) ammvVar).a);
                        uir a = uis.a();
                        a.b = amlr.a;
                        String str2 = uipVar.a;
                        if (str2 == null) {
                            throw new IllegalStateException("Missing required properties: title");
                        }
                        a.a = ammv.j(new uiq(str2, uipVar.b, uipVar.c, uipVar.d));
                        a.b(tyo.K(this.g.getApplicationContext(), new Runnable() { // from class: adrw
                            @Override // java.lang.Runnable
                            public final void run() {
                                adsb adsbVar = adsb.this;
                                boolean z2 = true;
                                if (adsbVar.j) {
                                    adsbVar.d.I(3, new acqx(acsb.c(50662)), null);
                                    adsi adsiVar = adsbVar.c;
                                    anhy anhyVar = adsiVar.e;
                                    if (anhyVar != null) {
                                        anhyVar.cancel(true);
                                    }
                                    adsiVar.c();
                                } else {
                                    adsv adsvVar2 = adsbVar.h;
                                    if (adsvVar2 == null || adsvVar2.e != 1) {
                                        adsbVar.d.I(3, new acqx(acsb.c(36380)), null);
                                    } else {
                                        adsbVar.d.I(3, new acqx(acsb.c(108702)), null);
                                    }
                                }
                                adsv adsvVar3 = adsbVar.h;
                                if ((adsvVar3 == null || adsvVar3.e == 1) && !adsbVar.j) {
                                    z2 = false;
                                }
                                adsbVar.b(z2);
                            }
                        }));
                        uilVar.a = a.a();
                        uhgVar.b = uilVar.a();
                        uik uikVar2 = uhgVar.a;
                        if (uikVar2 == null || (uimVar = uhgVar.b) == null) {
                            StringBuilder sb = new StringBuilder();
                            if (uhgVar.a == null) {
                                sb.append(" expressSignInManager");
                            }
                            if (uhgVar.b == null) {
                                sb.append(" expressSignInSpec");
                            }
                            String valueOf = String.valueOf(sb);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                            sb2.append("Missing required properties:");
                            sb2.append(valueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        uhi uhiVar = new uhi(mlVar2.getApplicationContext(), mlVar2.getSupportFragmentManager(), new uhh(uikVar2, uimVar, uhgVar.c), mlVar2);
                        this.i = uhiVar;
                        uhf b = uhi.b(uhiVar.a);
                        if (b == null) {
                            b = new uhf();
                            uhiVar.a(b);
                        }
                        ci ciVar = uhiVar.b;
                        if ((ciVar == null || !ciVar.isFinishing()) && !b.ar() && !uhiVar.a.Y()) {
                            b.qh(uhiVar.a, uhf.ae);
                        }
                        this.d.d(acsb.b(this.h.e == 1 ? 108701 : 36382), null, null);
                        this.d.n(new acqx(acsb.c(36381)));
                        this.d.n(new acqx(acsb.c(36380)));
                        if (this.h.e == 1) {
                            this.d.n(new acqx(acsb.c(108702)));
                        }
                        this.e.g(this);
                        return true;
                    }
                    throw new NullPointerException("Null title");
                }
                throw new NullPointerException("Null expressSignInManager");
            }
        }
        return false;
    }

    public final void b(final boolean z) {
        this.f.post(new Runnable() { // from class: adrx
            @Override // java.lang.Runnable
            public final void run() {
                adsv adsvVar;
                adsb adsbVar = adsb.this;
                if (z && (adsvVar = adsbVar.h) != null) {
                    adsbVar.b.a(adsvVar.b, "canceled");
                    zga.c("MDX.tvsignin.ExpressTvSignInDrawerController", "sending cancel message");
                }
                adsbVar.e.m(adsbVar);
                uhi uhiVar = adsbVar.i;
                if (uhiVar != null) {
                    uqq.j();
                    uhf b = uhi.b(uhiVar.a);
                    if (b != null) {
                        b.dismiss();
                    }
                }
                adsbVar.g = null;
                adsbVar.j = false;
                adsbVar.h = null;
                adsbVar.i = null;
            }
        });
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adsu.class};
        }
        if (i == 0) {
            adsu adsuVar = (adsu) obj;
            if (adsuVar.e() && adsuVar.c().equals(this.h.b)) {
                return null;
            }
            b(this.h.e != 1);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
