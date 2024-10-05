package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rub {
    private final Context a;
    private final aybv b;
    private final anib c;
    private final ammv d;
    private final ammv e;
    private final Object f;
    private final Map g;

    public rub(Context context, aybv aybvVar, anib anibVar, ammv ammvVar, ammv ammvVar2) {
        context.getClass();
        this.a = context;
        this.b = aybvVar;
        this.c = anibVar;
        this.d = ammvVar;
        this.e = ammvVar2;
        this.f = new Object();
        this.g = new HashMap();
    }

    public final anhy a(int i, Account account, String str, int i2) {
        aone createBuilder = aobu.a.createBuilder();
        aocq d = d(i);
        createBuilder.copyOnWrite();
        aobu aobuVar = (aobu) createBuilder.instance;
        d.getClass();
        aobuVar.b = d;
        aone createBuilder2 = aocc.a.createBuilder();
        createBuilder2.copyOnWrite();
        aocc aoccVar = (aocc) createBuilder2.instance;
        str.getClass();
        aoccVar.b = str;
        createBuilder.copyOnWrite();
        aobu aobuVar2 = (aobu) createBuilder.instance;
        aocc aoccVar2 = (aocc) createBuilder2.build();
        aoccVar2.getClass();
        aobuVar2.c = aoccVar2;
        createBuilder.copyOnWrite();
        ((aobu) createBuilder.instance).d = i2;
        final aobu aobuVar3 = (aobu) createBuilder.build();
        return b(account, new rua() { // from class: rtu
            @Override // defpackage.rua
            public final anhy a(aobp aobpVar) {
                aobu aobuVar4 = aobu.this;
                axzp axzpVar = aobpVar.a;
                aych aychVar = aobq.c;
                if (aychVar == null) {
                    synchronized (aobq.class) {
                        aychVar = aobq.c;
                        if (aychVar == null) {
                            ayce a = aych.a();
                            a.c = aycg.UNARY;
                            a.d = aych.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "DeleteLink");
                            a.b();
                            a.a = ayom.b(aobu.a);
                            a.b = ayom.b(aobv.a);
                            aychVar = a.a();
                            aobq.c = aychVar;
                        }
                    }
                }
                return ayox.a(axzpVar.a(aychVar, aobpVar.b), aobuVar4);
            }
        });
    }

    public final anhy b(Account account, rua ruaVar) {
        return aney.i(c(account, ruaVar), Throwable.class, jom.e, angq.a);
    }

    public final anhy c(Account account, final rua ruaVar) {
        aobp aobpVar;
        synchronized (this.f) {
            if (!this.g.containsKey(account)) {
                aobp aobpVar2 = (aobp) aobp.c(new amko(2), axzw.b(this.b, new rts(this.a, account), new rud(this.a)));
                if (this.e.h() && !((List) this.e.c()).isEmpty()) {
                    List list = (List) this.e.c();
                    aycd aycdVar = new aycd();
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("x-goog-ext-");
                    sb.append(202964622);
                    sb.append("-bin");
                    ayca e = ayca.e(sb.toString(), aycd.e);
                    amru C = amru.C(amvb.a, list);
                    aone createBuilder = anrx.a.createBuilder();
                    int i = ((amvj) C).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        aomf x = aomf.x(Base64.decode((String) C.get(i2), 8));
                        createBuilder.copyOnWrite();
                        anrx anrxVar = (anrx) createBuilder.instance;
                        aony aonyVar = anrxVar.b;
                        if (!aonyVar.c()) {
                            anrxVar.b = aonm.mutableCopy(aonyVar);
                        }
                        anrxVar.b.add(x);
                    }
                    aycdVar.f(e, ((anrx) createBuilder.build()).toByteArray());
                    aobpVar2 = (aobp) aobpVar2.e(aynu.b(aycdVar));
                }
                this.g.put(account, aobpVar2);
            }
            aobpVar = (aobp) ((aobp) this.g.get(account)).d(12L, TimeUnit.SECONDS);
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            anhy O = anaf.O(aobpVar);
            ruaVar.getClass();
            return anfq.i(O, new anfz() { // from class: rtt
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    return rua.this.a((aobp) obj);
                }
            }, this.c);
        }
        return ruaVar.a(aobpVar);
    }

    public final aocq d(int i) {
        aone createBuilder = aocq.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aocq) createBuilder.instance).c = i;
        createBuilder.copyOnWrite();
        ((aocq) createBuilder.instance).d = 1;
        if (this.d.h()) {
            String str = (String) this.d.c();
            createBuilder.copyOnWrite();
            ((aocq) createBuilder.instance).b = str;
        }
        return (aocq) createBuilder.build();
    }
}
