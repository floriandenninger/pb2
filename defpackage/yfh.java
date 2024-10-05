package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfh {
    public static final /* synthetic */ int c = 0;
    private static final String d = "yfh";
    public final ci a;
    public final azrw b;
    private final afsy e;
    private final Context f;
    private final wcf g;

    public yfh(ci ciVar, azrw azrwVar, wcf wcfVar, afsy afsyVar, Context context) {
        this.a = ciVar;
        this.b = azrwVar;
        this.g = wcfVar;
        this.e = afsyVar;
        this.f = context;
    }

    public final void a(aaeb aaebVar, final yeu yeuVar) {
        try {
            Account a = this.g.a(this.e.c());
            ci ciVar = this.a;
            Context context = this.f;
            rrc rrcVar = new rrc();
            final int i = 1;
            rrcVar.b(aaebVar != aaeb.PRODUCTION ? 3 : 1);
            rrcVar.b = a;
            rrj a2 = rre.a(context, rrcVar.a());
            WalletCustomTheme walletCustomTheme = new WalletCustomTheme();
            walletCustomTheme.a();
            final int i2 = 0;
            GetClientTokenRequest getClientTokenRequest = new GetClientTokenRequest(walletCustomTheme, false, 1);
            qof qofVar = a2.D;
            rrs rrsVar = new rrs(qofVar, getClientTokenRequest);
            qofVar.a(rrsVar);
            ynm.n(ciVar, rwh.Y(qar.h(rrsVar, new rri(0))), new zfi() { // from class: yff
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i == 0) {
                        yeu yeuVar2 = yeuVar;
                        int i3 = yfh.c;
                        final yev yevVar = yeuVar2.b;
                        apxf apxfVar = yeuVar2.a;
                        arbn arbnVar = (arbn) apxfVar.pX(arbn.b);
                        aaxn aaxnVar = yevVar.e;
                        abec abecVar = new abec(aaxnVar.f, aaxnVar.a.c(), null, null, null);
                        abecVar.a = arbnVar.c;
                        abecVar.l(apxfVar.c);
                        abecVar.b = aomf.x((byte[]) obj);
                        aaxn aaxnVar2 = yevVar.e;
                        ynm.k(aaxnVar2.b.b(abecVar, yevVar.d), yevVar.d, new ynk() { // from class: yes
                            @Override // defpackage.zfi
                            /* renamed from: b */
                            public final void a(Throwable th) {
                                yev yevVar2 = yev.this;
                                yevVar2.c.dismiss();
                                yevVar2.b.e(th);
                            }
                        }, new ynl() { // from class: yet
                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj2) {
                                yev yevVar2 = yev.this;
                                arrv arrvVar = (arrv) obj2;
                                yevVar2.c.dismiss();
                                if ((arrvVar.b & 2) != 0) {
                                    aahd aahdVar = yevVar2.a;
                                    apxf apxfVar2 = arrvVar.d;
                                    if (apxfVar2 == null) {
                                        apxfVar2 = apxf.a;
                                    }
                                    aahdVar.a(apxfVar2);
                                }
                            }
                        });
                        return;
                    }
                    int i4 = yfh.c;
                    yeuVar.a((Throwable) obj);
                }
            }, new zfi() { // from class: yff
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i2 == 0) {
                        yeu yeuVar2 = yeuVar;
                        int i3 = yfh.c;
                        final yev yevVar = yeuVar2.b;
                        apxf apxfVar = yeuVar2.a;
                        arbn arbnVar = (arbn) apxfVar.pX(arbn.b);
                        aaxn aaxnVar = yevVar.e;
                        abec abecVar = new abec(aaxnVar.f, aaxnVar.a.c(), null, null, null);
                        abecVar.a = arbnVar.c;
                        abecVar.l(apxfVar.c);
                        abecVar.b = aomf.x((byte[]) obj);
                        aaxn aaxnVar2 = yevVar.e;
                        ynm.k(aaxnVar2.b.b(abecVar, yevVar.d), yevVar.d, new ynk() { // from class: yes
                            @Override // defpackage.zfi
                            /* renamed from: b */
                            public final void a(Throwable th) {
                                yev yevVar2 = yev.this;
                                yevVar2.c.dismiss();
                                yevVar2.b.e(th);
                            }
                        }, new ynl() { // from class: yet
                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj2) {
                                yev yevVar2 = yev.this;
                                arrv arrvVar = (arrv) obj2;
                                yevVar2.c.dismiss();
                                if ((arrvVar.b & 2) != 0) {
                                    aahd aahdVar = yevVar2.a;
                                    apxf apxfVar2 = arrvVar.d;
                                    if (apxfVar2 == null) {
                                        apxfVar2 = apxf.a;
                                    }
                                    aahdVar.a(apxfVar2);
                                }
                            }
                        });
                        return;
                    }
                    int i4 = yfh.c;
                    yeuVar.a((Throwable) obj);
                }
            });
        } catch (RemoteException | qnk | qnl e) {
            zga.f(d, "Error getting signed-in account", e);
            yeuVar.a(e);
        }
    }
}
