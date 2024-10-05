package defpackage;

import android.accounts.Account;
import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rsv extends anu {
    public static final amyi b;
    private static final amrz n = amrz.n("accountlinking-pa.googleapis.com", aort.ENVIRONMENT_PROD, "staging-accountlinking-pa.sandbox.googleapis.com", aort.ENVIRONMENT_STAGING, "stagingqual-accountlinking-pa.sandbox.googleapis.com", aort.ENVIRONMENT_TEST_STAGING, "autopush-accountlinking-pa.googleapis.com", aort.ENVIRONMENT_AUTOPUSH);
    private static final amrz o;
    public final rsy c;
    public int d;
    public final rul e;
    public final rul f;
    public final rul g;
    public final aow h;
    public final rub i;
    public aorv j;
    public boolean k;
    public boolean l;
    public String m;
    private final Set p;
    private final qlm q;
    private sky r;

    static {
        amrw amrwVar = new amrw();
        amrwVar.g(aorv.STATE_ACCOUNT_SELECTION, aoru.EVENT_ACCOUNT_SELECTION_CANCEL);
        amrwVar.g(aorv.STATE_PROVIDER_CONSENT, aoru.EVENT_PROVIDER_CONSENT_CANCEL);
        amrwVar.g(aorv.STATE_ACCOUNT_CREATION, aoru.EVENT_ACCOUNT_CREATION_CANCEL);
        amrwVar.g(aorv.STATE_LINKING_INFO, aoru.EVENT_LINKING_INFO_CANCEL_LINKING);
        amrwVar.g(aorv.STATE_USAGE_NOTICE, aoru.EVENT_USAGE_NOTICE_CANCEL_LINKING);
        o = amrwVar.c();
        b = rwh.k();
    }

    public rsv(Application application, rsy rsyVar, ruf rufVar) {
        super(application);
        this.p = amkq.an();
        this.j = aorv.STATE_START;
        this.k = false;
        this.l = false;
        this.c = rsyVar;
        this.d = 0;
        this.e = new rul();
        this.g = new rul();
        this.h = new aow();
        this.f = new rul();
        rue rueVar = (rue) rufVar;
        this.i = new rub(application, rueVar.a, rueVar.b, ammv.i(rsyVar.f), ammv.i(rsyVar.p));
        this.q = new qlm(application.getApplicationContext(), "OAUTH_INTEGRATIONS", rsyVar.c.name);
    }

    private final aone k() {
        aone createBuilder = aosb.a.createBuilder();
        String packageName = this.a.getPackageName();
        createBuilder.copyOnWrite();
        aosb aosbVar = (aosb) createBuilder.instance;
        packageName.getClass();
        aosbVar.b |= 64;
        aosbVar.h = packageName;
        createBuilder.copyOnWrite();
        aosb aosbVar2 = (aosb) createBuilder.instance;
        aosbVar2.b |= 8;
        aosbVar2.e = "100";
        String str = this.c.i;
        createBuilder.copyOnWrite();
        aosb aosbVar3 = (aosb) createBuilder.instance;
        str.getClass();
        aosbVar3.b |= 32;
        aosbVar3.g = str;
        aort aortVar = (aort) n.getOrDefault(this.c.g, aort.ENVIRONMENT_UNKNOWN);
        createBuilder.copyOnWrite();
        aosb aosbVar4 = (aosb) createBuilder.instance;
        aosbVar4.f = aortVar.getNumber();
        aosbVar4.b |= 16;
        return createBuilder;
    }

    private final sky l() {
        if (this.r == null) {
            this.r = sky.a(this.a.getApplicationContext(), new baar(0));
        }
        return this.r;
    }

    public final void a(String str) {
        rub rubVar = this.i;
        rsy rsyVar = this.c;
        int i = rsyVar.e;
        Account account = rsyVar.c;
        String str2 = rsyVar.i;
        ArrayList arrayList = new ArrayList(rsyVar.l);
        aone createBuilder = aobw.a.createBuilder();
        aocq d = rubVar.d(i);
        createBuilder.copyOnWrite();
        aobw aobwVar = (aobw) createBuilder.instance;
        d.getClass();
        aobwVar.b = d;
        createBuilder.copyOnWrite();
        aobw aobwVar2 = (aobw) createBuilder.instance;
        str2.getClass();
        aobwVar2.c = str2;
        createBuilder.copyOnWrite();
        aobw aobwVar3 = (aobw) createBuilder.instance;
        aony aonyVar = aobwVar3.d;
        if (!aonyVar.c()) {
            aobwVar3.d = aonm.mutableCopy(aonyVar);
        }
        aolo.addAll((Iterable) arrayList, (List) aobwVar3.d);
        aone createBuilder2 = aocn.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((aocn) createBuilder2.instance).b = 3;
        createBuilder2.copyOnWrite();
        aocn aocnVar = (aocn) createBuilder2.instance;
        str.getClass();
        aocnVar.c = str;
        aocn aocnVar2 = (aocn) createBuilder2.build();
        createBuilder.copyOnWrite();
        aobw aobwVar4 = (aobw) createBuilder.instance;
        aocnVar2.getClass();
        aobwVar4.e = aocnVar2;
        final aobw aobwVar5 = (aobw) createBuilder.build();
        anaf.Y(rubVar.b(account, new rua() { // from class: rtv
            @Override // defpackage.rua
            public final anhy a(aobp aobpVar) {
                aobw aobwVar6 = aobw.this;
                axzp axzpVar = aobpVar.a;
                aych aychVar = aobq.b;
                if (aychVar == null) {
                    synchronized (aobq.class) {
                        aychVar = aobq.b;
                        if (aychVar == null) {
                            ayce a = aych.a();
                            a.c = aycg.UNARY;
                            a.d = aych.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "DepositGoogleCredential");
                            a.b();
                            a.a = ayom.b(aobw.a);
                            a.b = ayom.b(aobx.a);
                            aychVar = a.a();
                            aobq.b = aychVar;
                        }
                    }
                }
                return ayox.a(axzpVar.a(aychVar, aobpVar.b), aobwVar6);
            }
        }), new rss(this, str), angq.a);
    }

    public final void b(Throwable th, rsl rslVar, String str) {
        rsj l = rwh.l(th);
        ((amyf) ((amyf) b.k().h(th)).i("com/google/android/libraries/accountlinking/activity/AccountLinkingViewModel", "handleGrpcFailure", 402, "AccountLinkingViewModel.java")).u("A gRPC error occurred when finishing flow: \"%s\", with error message: \"%s\"", rslVar, str);
        if (l.a == 2) {
            c(aoru.EVENT_NETWORK_ERROR);
        }
        i(rqr.g(l.a, l.getMessage()));
    }

    public final void c(aoru aoruVar) {
        aone k = k();
        aorv aorvVar = aorv.STATE_ERROR;
        k.copyOnWrite();
        aosb aosbVar = (aosb) k.instance;
        aosb aosbVar2 = aosb.a;
        aosbVar.c = aorvVar.getNumber();
        aosbVar.b |= 1;
        qli c = this.q.c(((aosb) k.build()).toByteArray());
        c.m = l();
        c.c(aoruVar.getNumber());
        c.d(this.c.e);
        c.b();
    }

    public final void e() {
        aoru aoruVar = (aoru) o.get(this.j);
        aoruVar.getClass();
        aone k = k();
        aorv aorvVar = this.j;
        k.copyOnWrite();
        aosb aosbVar = (aosb) k.instance;
        aosb aosbVar2 = aosb.a;
        aosbVar.c = aorvVar.getNumber();
        aosbVar.b |= 1;
        qli c = this.q.c(((aosb) k.build()).toByteArray());
        c.m = l();
        c.c(aoruVar.getNumber());
        c.d(this.c.e);
        c.b();
    }

    public final void f(aoru aoruVar) {
        aone k = k();
        aorv aorvVar = this.j;
        k.copyOnWrite();
        aosb aosbVar = (aosb) k.instance;
        aosb aosbVar2 = aosb.a;
        aosbVar.c = aorvVar.getNumber();
        aosbVar.b |= 1;
        qli c = this.q.c(((aosb) k.build()).toByteArray());
        c.m = l();
        c.c(aoruVar.getNumber());
        c.d(this.c.e);
        c.b();
    }

    public final void g(aorv aorvVar) {
        aone k = k();
        k.copyOnWrite();
        aosb aosbVar = (aosb) k.instance;
        aosb aosbVar2 = aosb.a;
        aosbVar.c = aorvVar.getNumber();
        aosbVar.b |= 1;
        aorv aorvVar2 = this.j;
        k.copyOnWrite();
        aosb aosbVar3 = (aosb) k.instance;
        aosbVar3.d = aorvVar2.getNumber();
        aosbVar3.b |= 2;
        aosb aosbVar4 = (aosb) k.build();
        this.j = aorvVar;
        qli c = this.q.c(aosbVar4.toByteArray());
        c.m = l();
        c.c(1);
        c.d(this.c.e);
        c.b();
    }

    public final void h(rtc rtcVar, String str) {
        rsw g;
        if (rtc.a.contains(Integer.valueOf(rtcVar.d))) {
            g = rqr.g(3, "Linking denied by user.");
        } else if (rtc.b.contains(Integer.valueOf(rtcVar.d))) {
            g = rqr.g(4, "Linking cancelled by user.");
        } else {
            g = rqr.g(1, str);
        }
        i(g);
    }

    public final void i(final rsw rswVar) {
        anaf.U(this.p).d(new Runnable() { // from class: rsp
            @Override // java.lang.Runnable
            public final void run() {
                rsv rsvVar = rsv.this;
                rsvVar.g.j(rswVar);
            }
        }, angq.a);
    }

    public final void j(int i, int i2, int i3, String str) {
        Set set = this.p;
        rub rubVar = this.i;
        rsy rsyVar = this.c;
        int i4 = rsyVar.e;
        Account account = rsyVar.c;
        String str2 = rsyVar.i;
        Integer valueOf = Integer.valueOf(i3);
        aone createBuilder = aobr.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aobr) createBuilder.instance).b = i - 2;
        if (i2 != 0) {
            createBuilder.copyOnWrite();
            aobr aobrVar = (aobr) createBuilder.instance;
            if (i2 != 1) {
                aobrVar.c = i2 - 2;
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        int intValue = valueOf.intValue();
        createBuilder.copyOnWrite();
        ((aobr) createBuilder.instance).d = intValue;
        if (str != null) {
            createBuilder.copyOnWrite();
            ((aobr) createBuilder.instance).e = str;
        }
        aone createBuilder2 = aoco.a.createBuilder();
        aocq d = rubVar.d(i4);
        createBuilder2.copyOnWrite();
        aoco aocoVar = (aoco) createBuilder2.instance;
        d.getClass();
        aocoVar.b = d;
        createBuilder2.copyOnWrite();
        aoco aocoVar2 = (aoco) createBuilder2.instance;
        str2.getClass();
        aocoVar2.c = str2;
        createBuilder2.copyOnWrite();
        aoco aocoVar3 = (aoco) createBuilder2.instance;
        aobr aobrVar2 = (aobr) createBuilder.build();
        aobrVar2.getClass();
        aocoVar3.d = aobrVar2;
        final aoco aocoVar4 = (aoco) createBuilder2.build();
        set.add(rubVar.b(account, new rua() { // from class: rty
            @Override // defpackage.rua
            public final anhy a(aobp aobpVar) {
                aoco aocoVar5 = aoco.this;
                axzp axzpVar = aobpVar.a;
                aych aychVar = aobq.g;
                if (aychVar == null) {
                    synchronized (aobq.class) {
                        aychVar = aobq.g;
                        if (aychVar == null) {
                            ayce a = aych.a();
                            a.c = aycg.UNARY;
                            a.d = aych.c("google.internal.identity.accountlinking.v1.AccountLinkingService", "ReportAppFlipOutcome");
                            a.b();
                            a.a = ayom.b(aoco.a);
                            a.b = ayom.b(aocp.a);
                            aychVar = a.a();
                            aobq.g = aychVar;
                        }
                    }
                }
                return ayox.a(axzpVar.a(aychVar, aobpVar.b), aocoVar5);
            }
        }));
    }
}
