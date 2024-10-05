package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydn {
    public static final String a = "ydn";
    protected final aben b;
    public final azrw c;
    public final ycs d;
    public final acqz e;
    public final acpl f;
    public final azrw g;
    public final ci h;
    public boolean i;
    public ydl j;
    public ydk k;
    public final ykz l;
    public yep m;
    public final aaxn n;
    private final afsy o;
    private final azrw p;
    private final zaw q;
    private final rrl r;
    private final aaea s;
    private final wcf t;

    public ydn(ykz ykzVar, aben abenVar, aaxn aaxnVar, afsy afsyVar, wcf wcfVar, azrw azrwVar, azrw azrwVar2, zaw zawVar, Context context, acqz acqzVar, acpl acplVar, azrw azrwVar3, ci ciVar, aaea aaeaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.l = ykzVar;
        this.b = abenVar;
        this.n = aaxnVar;
        this.o = afsyVar;
        this.t = wcfVar;
        this.p = azrwVar;
        this.c = azrwVar2;
        this.q = zawVar;
        this.r = new rrl(context);
        this.e = acqzVar;
        this.f = acplVar;
        this.g = azrwVar3;
        this.h = ciVar;
        this.s = aaeaVar;
        ycs ycsVar = new ycs();
        this.d = ycsVar;
        ycsVar.b = new DialogInterface.OnKeyListener() { // from class: ydf
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                boolean z;
                ydn ydnVar = ydn.this;
                if (i == 4) {
                    ykz ykzVar2 = ydnVar.l;
                    if (ykzVar2.b.a(906)) {
                        ykzVar2.a.finishActivity(906);
                        z = true;
                    } else {
                        z = false;
                    }
                    ydnVar.i = !z;
                    ydnVar.d.dismiss();
                }
                return true;
            }
        };
    }

    private final Intent h(aaeb aaebVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Account account;
        WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
        walletCustomTheme.a();
        try {
            account = this.t.a(this.o.c());
            if (account == null) {
                i("Failure: Buyer account is null.");
            }
        } catch (RemoteException | qnk | qnl e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Failed to get buyer account in buy flow: ");
            sb.append(valueOf);
            i(sb.toString());
            account = null;
        }
        arfd a2 = this.s.a();
        if (a2 != null) {
            aqbc aqbcVar = a2.r;
            if (aqbcVar == null) {
                aqbcVar = aqbc.b;
            }
            if (aqbcVar.h && account == null) {
                return null;
            }
        }
        this.r.b(account);
        rrl rrlVar = this.r;
        rrlVar.d((aaebVar == aaeb.PRODUCTION || aaebVar == aaeb.RELEASE) ? 1 : 0);
        rrlVar.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS", bArr);
        rrlVar.e();
        if (!z) {
            try {
                this.r.c(walletCustomTheme);
            } catch (UnsupportedOperationException unused) {
            }
        }
        if (bArr2 != null && bArr2.length > 0) {
            this.r.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN", bArr2);
        }
        if (bArr3 != null && bArr3.length > 0) {
            rrl rrlVar2 = this.r;
            rrlVar2.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS", bArr3);
            rrlVar2.a.putExtra("com.google.android.gms.wallet.firstparty.EXTRA_CLIENT_PARAMETERS", bArr3);
        } else {
            String str = a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79);
            sb2.append("youtubePayment::");
            sb2.append(str);
            sb2.append(" buyFlowClientParameters is not found, fallback to non-NGBF UI.");
            afsi.b(1, 11, sb2.toString());
        }
        Intent a3 = this.r.a();
        a3.setPackage("com.google.android.gms");
        return a3;
    }

    private static final void i(String str) {
        String str2 = a;
        zga.c(str2, str);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str).length());
        sb.append("youtubePayment::");
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        afsi.b(2, 11, sb.toString());
    }

    public final void a(asfy asfyVar, aaeb aaebVar) {
        aqaz aqazVar;
        Intent h = h(aaebVar, asfyVar.o, (asfyVar.c == 7 ? (aomf) asfyVar.d : aomf.b).I(), asfyVar.m.I(), asfyVar.q.I());
        if (h == null) {
            if ((asfyVar.b & 4096) != 0) {
                acpl acplVar = this.f;
                ydr ydrVar = new ydr();
                ydrVar.a = asfyVar.n;
                ydrVar.c = 2;
                acplVar.c(ydrVar.b());
            } else {
                acpl acplVar2 = this.f;
                ydr ydrVar2 = new ydr();
                ydrVar2.c = 2;
                acplVar2.c(ydrVar2.b());
            }
            d(null);
            return;
        }
        if (this.l.a(h, 906, new ydm(this, asfyVar))) {
            if ((asfyVar.b & 16) == 0) {
                aqazVar = aqaz.a;
            } else {
                aone createBuilder = aqaz.a.createBuilder();
                String str = asfyVar.h;
                createBuilder.copyOnWrite();
                aqaz aqazVar2 = (aqaz) createBuilder.instance;
                str.getClass();
                aqazVar2.b |= 1;
                aqazVar2.c = str;
                aqazVar = (aqaz) createBuilder.build();
            }
            arpn a2 = arpp.a();
            a2.copyOnWrite();
            ((arpp) a2.instance).ci(aqazVar);
            this.f.c((arpp) a2.build());
            if ((asfyVar.b & 4096) == 0) {
                this.f.c(new ydr().e());
            } else {
                acpl acplVar3 = this.f;
                ydr ydrVar3 = new ydr();
                ydrVar3.a = asfyVar.n;
                acplVar3.c(ydrVar3.e());
            }
            ydl ydlVar = this.j;
            if (ydlVar != null) {
                ydlVar.a();
            }
        }
    }

    public final void b(asfy asfyVar) {
        aqdt aqdtVar;
        yep yepVar;
        awhq awhqVar;
        asgd asgdVar = asfyVar.k;
        if (asgdVar == null) {
            asgdVar = asgd.a;
        }
        CharSequence charSequence = null;
        if (asgdVar.b == 64099105) {
            asgd asgdVar2 = asfyVar.k;
            if (asgdVar2 == null) {
                asgdVar2 = asgd.a;
            }
            if (asgdVar2.b == 64099105) {
                aqdtVar = (aqdt) asgdVar2.c;
            } else {
                aqdtVar = aqdt.a;
            }
        } else {
            aqdtVar = null;
        }
        if (aqdtVar == null) {
            asgd asgdVar3 = asfyVar.k;
            if (asgdVar3 == null) {
                asgdVar3 = asgd.a;
            }
            if (asgdVar3.b == 65500215) {
                asgd asgdVar4 = asfyVar.k;
                if (asgdVar4 == null) {
                    asgdVar4 = asgd.a;
                }
                if (asgdVar4.b == 65500215) {
                    awhqVar = (awhq) asgdVar4.c;
                } else {
                    awhqVar = awhq.a;
                }
                charSequence = yjj.j(awhqVar);
            }
            if (charSequence == null) {
                if ((asfyVar.b & 128) != 0 && (yepVar = this.m) != null) {
                    asgd asgdVar5 = asfyVar.k;
                    if (asgdVar5 == null) {
                        asgdVar5 = asgd.a;
                    }
                    CharSequence a2 = yepVar.a(asgdVar5);
                    if (a2 != null) {
                        String.valueOf(String.valueOf(a2)).length();
                        e(a2);
                        return;
                    }
                }
                int aP = anaf.aP(asfyVar.s);
                if (aP == 0 || aP != 2) {
                    if (asfyVar.c == 15) {
                        ydl ydlVar = this.j;
                        ydlVar.getClass();
                        asfyVar.getClass();
                        ydu yduVar = new ydu();
                        yduVar.ae = ydlVar;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("get_cart_response", asfyVar.toByteArray());
                        yduVar.af(bundle);
                        yduVar.qh(this.h.getSupportFragmentManager(), "upgrade_dialog");
                        return;
                    }
                    ci ciVar = this.h;
                    ynm.n(ciVar, anaf.O(false), oph.q, new ydg(this, asfyVar, 0));
                    return;
                }
                zga.h(a, "Use BILLING_FLOW_TYPE_CONSOLIDATED");
                aahd aahdVar = (aahd) this.g.get();
                apxf apxfVar = asfyVar.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
                return;
            }
            String.valueOf(String.valueOf(charSequence)).length();
            e(charSequence);
            return;
        }
        ajdf.n(this.h, aqdtVar, (aahd) this.g.get(), this.e.mM(), null);
        c();
    }

    public final void c() {
        ydl ydlVar = this.j;
        if (ydlVar != null) {
            ydlVar.b();
        }
    }

    public final void d(Throwable th) {
        e(this.q.b(th));
    }

    public final void e(CharSequence charSequence) {
        ydl ydlVar = this.j;
        if (ydlVar != null) {
            ydlVar.c(charSequence);
        }
    }

    public final void f(String str, byte[] bArr, byte[] bArr2, asfy asfyVar) {
        if ((!asfyVar.h.isEmpty() ? 1 : 0) + (!asfyVar.i.isEmpty() ? 1 : 0) + (asfyVar.j.d() == 0 ? 0 : 1) != 1) {
            zga.b("More than one kind of offer params or none set. Complete transaction request aborted");
            if ((asfyVar.b & 4096) != 0) {
                acpl acplVar = this.f;
                ydr ydrVar = new ydr();
                ydrVar.a = asfyVar.n;
                ydrVar.c = 18;
                acplVar.c(ydrVar.b());
            }
            d(null);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if ((asfyVar.b & 4096) != 0) {
                acpl acplVar2 = this.f;
                ydr ydrVar2 = new ydr();
                ydrVar2.a = asfyVar.n;
                ydrVar2.c = 17;
                acplVar2.c(ydrVar2.b());
            }
            d(null);
            return;
        }
        abeh a2 = this.b.a();
        a2.a = abeh.i(asfyVar.h);
        a2.b = abeh.i(asfyVar.i);
        a2.d = asfyVar.j;
        a2.u = bArr;
        a2.v = bArr2;
        a2.c = aomf.z(str);
        ydl ydlVar = this.j;
        if (ydlVar != null) {
            ydlVar.d(a2);
        }
        a2.m(asfyVar.l.I());
        this.d.show(this.h.getFragmentManager(), ycs.a);
        this.b.d(a2, new ydi(this, asfyVar));
    }

    public final void g(abei abeiVar) {
        acpl acplVar = this.f;
        ydr ydrVar = new ydr();
        arpn a2 = arpp.a();
        awfv g = ydrVar.g();
        a2.copyOnWrite();
        ((arpp) a2.instance).ds(g);
        acplVar.c((arpp) a2.build());
        this.d.show(this.h.getFragmentManager(), ycs.a);
        aben abenVar = this.b;
        abenVar.g.e(abeiVar, new ydh(this));
    }
}
