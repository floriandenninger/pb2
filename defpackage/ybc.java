package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.wallet.firstparty.InitializeBuyFlowRequest;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ybc {
    public final Context a;
    private final aaea b;
    private final afsy c;
    private final abep d;
    private final ysy e;
    private final wcf f;

    public ybc(wcf wcfVar, aaea aaeaVar, Context context, afsy afsyVar, abep abepVar, ysy ysyVar) {
        this.f = wcfVar;
        this.b = aaeaVar;
        this.a = context;
        this.c = afsyVar;
        this.d = abepVar;
        this.e = ysyVar;
    }

    public final void a() {
        List q;
        int i;
        final Account account;
        arfd a = this.b.a();
        if (a != null) {
            aqbc aqbcVar = a.r;
            if (aqbcVar == null) {
                aqbcVar = aqbc.b;
            }
            if (aqbcVar.e) {
                apue b = apue.b(this.e.a());
                if (b == null) {
                    b = apue.CONN_UNKNOWN;
                }
                arfd a2 = this.b.a();
                if (a2 != null) {
                    aqbc aqbcVar2 = a2.r;
                    if (aqbcVar2 == null) {
                        aqbcVar2 = aqbc.b;
                    }
                    q = new aonw(aqbcVar2.f, aqbc.a);
                } else {
                    q = amru.q();
                }
                if (q.contains(b)) {
                    return;
                }
                int availableProcessors = Runtime.getRuntime().availableProcessors();
                arfd a3 = this.b.a();
                if (a3 != null) {
                    aqbc aqbcVar3 = a3.r;
                    if (aqbcVar3 == null) {
                        aqbcVar3 = aqbc.b;
                    }
                    i = aqbcVar3.g;
                } else {
                    i = 0;
                }
                if (availableProcessors >= i) {
                    try {
                        account = this.f.a(this.c.c());
                    } catch (RemoteException | qnk | qnl e) {
                        zga.d("exception occurred while trying to get account", e);
                        account = null;
                    }
                    if (account == null) {
                        return;
                    }
                    final ynl ynlVar = new ynl() { // from class: ybb
                        @Override // defpackage.ynl, defpackage.zfi
                        public final void a(Object obj) {
                            ybc ybcVar = ybc.this;
                            Account account2 = account;
                            aaeb aaebVar = (aaeb) obj;
                            int i2 = (aaebVar == aaeb.PRODUCTION || aaebVar == aaeb.RELEASE) ? 1 : 0;
                            aone createBuilder = aogt.a.createBuilder();
                            createBuilder.copyOnWrite();
                            aogt aogtVar = (aogt) createBuilder.instance;
                            aogtVar.b |= 1;
                            aogtVar.c = "YOUTUBE_APP_OPEN";
                            aogt aogtVar2 = (aogt) createBuilder.build();
                            Context context = ybcVar.a;
                            rrc rrcVar = new rrc();
                            rrcVar.b(i2);
                            rrcVar.b = account2;
                            final rrj a4 = rre.a(context, rrcVar.a());
                            final InitializeBuyFlowRequest initializeBuyFlowRequest = new InitializeBuyFlowRequest(1, new byte[][]{aogtVar2.toByteArray()});
                            qrd b2 = qre.b();
                            b2.a = new qqu() { // from class: rrg
                                @Override // defpackage.qqu
                                public final void a(Object obj2, Object obj3) {
                                    rrj rrjVar = rrj.this;
                                    InitializeBuyFlowRequest initializeBuyFlowRequest2 = initializeBuyFlowRequest;
                                    rrh rrhVar = new rrh((rpv) obj3);
                                    rro rroVar = (rro) ((rrr) obj2).D();
                                    Bundle k = rrr.k(rrjVar.c, rrjVar.a.getPackageName(), rrjVar.b, rrjVar.d, false);
                                    Parcel pn = rroVar.pn();
                                    ecr.g(pn, initializeBuyFlowRequest2);
                                    ecr.g(pn, k);
                                    ecr.i(pn, rrhVar);
                                    rroVar.pq(13, pn);
                                }
                            };
                            b2.b = new Feature[]{rqy.d};
                            b2.b();
                            b2.c = 23709;
                            a4.w(b2.a());
                        }
                    };
                    ynm.k(this.d.c(), angq.a, new ynk() { // from class: yba
                        @Override // defpackage.zfi
                        /* renamed from: b */
                        public final void a(Throwable th) {
                            ynl.this.a(aaeb.PRODUCTION);
                        }
                    }, ynlVar);
                }
            }
        }
    }
}
