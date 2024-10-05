package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aizl implements axqr {
    private final azrw a;
    private final /* synthetic */ int b;

    public aizl(azrw azrwVar, int i) {
        this.b = i;
        this.a = azrwVar;
    }

    public static aizl A(azrw azrwVar) {
        return new aizl(azrwVar, 19);
    }

    public static aizl B(azrw azrwVar) {
        return new aizl(azrwVar, 20);
    }

    public static aizl a(azrw azrwVar) {
        return new aizl(azrwVar, 0);
    }

    public static aizs b(qtv qtvVar) {
        return new aizs(qtvVar);
    }

    public static zih c(final ajbq ajbqVar) {
        ajbqVar.getClass();
        return new zih() { // from class: ajbn
            @Override // defpackage.zih
            public final Object a() {
                return ajbq.this.c;
            }
        };
    }

    public static zih d(final aiqc aiqcVar) {
        aiqcVar.getClass();
        return new zih() { // from class: ajbm
            @Override // defpackage.zih
            public final Object a() {
                return aiqc.this.b;
            }
        };
    }

    public static zih e(acsx acsxVar) {
        return new aifl(acsxVar);
    }

    public static ajfb f(ajfm ajfmVar) {
        return new ajfb(ajfmVar);
    }

    public static String g() {
        String w = ajgj.w();
        ayaw.k(w);
        return w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ajgq h(Object obj) {
        return new ajgq(obj);
    }

    public static aizl i(azrw azrwVar) {
        return new aizl(azrwVar, 1);
    }

    public static aizl j(azrw azrwVar) {
        return new aizl(azrwVar, 2);
    }

    public static aizl k(azrw azrwVar) {
        return new aizl(azrwVar, 3);
    }

    public static aizl l(azrw azrwVar) {
        return new aizl(azrwVar, 4);
    }

    public static aizl m(azrw azrwVar) {
        return new aizl(azrwVar, 5);
    }

    public static aizl n(azrw azrwVar) {
        return new aizl(azrwVar, 6);
    }

    public static aizl o(azrw azrwVar) {
        return new aizl(azrwVar, 7);
    }

    public static aizl p(azrw azrwVar) {
        return new aizl(azrwVar, 8);
    }

    public static aizl q(azrw azrwVar) {
        return new aizl(azrwVar, 9);
    }

    public static aizl r(azrw azrwVar) {
        return new aizl(azrwVar, 10);
    }

    public static aizl s(azrw azrwVar) {
        return new aizl(azrwVar, 11);
    }

    public static aizl t(azrw azrwVar) {
        return new aizl(azrwVar, 12);
    }

    public static aizl u(azrw azrwVar) {
        return new aizl(azrwVar, 13);
    }

    public static aizl v(azrw azrwVar) {
        return new aizl(azrwVar, 14);
    }

    public static aizl w(azrw azrwVar) {
        return new aizl(azrwVar, 15);
    }

    public static aizl x(azrw azrwVar) {
        return new aizl(azrwVar, 16);
    }

    public static aizl y(azrw azrwVar) {
        return new aizl(azrwVar, 17);
    }

    public static aizl z(azrw azrwVar) {
        return new aizl(azrwVar, 18);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        Object obj = null;
        switch (this.b) {
            case 0:
                return ((azqv) this.a.get()).G();
            case 1:
                return ((azqv) this.a.get()).G();
            case 2:
                return ((azqv) this.a.get()).G();
            case 3:
                return b(((ouo) this.a).get());
            case 4:
                return c((ajbq) this.a.get());
            case 5:
                awdk awdkVar = (awdk) ((axqs) this.a).a;
                return (awdkVar == null || (obj = awdkVar.c) != null) ? obj : awdi.a;
            case 6:
                return d((aiqc) this.a.get());
            case 7:
                awdk awdkVar2 = (awdk) ((axqs) this.a).a;
                return (awdkVar2 == null || (obj = awdkVar2.b) != null) ? obj : awdj.a;
            case 8:
                return e((acsx) ((axqs) this.a).a);
            case 9:
                return new ajbq((shf) this.a.get());
            case 10:
                return new aoae(((axqw) this.a).get());
            case 11:
                return new ajby((ScheduledExecutorService) this.a.get());
            case 12:
                return new ajdo((acsy) this.a.get());
            case 13:
                return f((ajfm) this.a.get());
            case 14:
                ajfm ajfmVar = (ajfm) this.a.get();
                int i = ajgj.a;
                ayaw.k(ajfmVar);
                return ajfmVar;
            case 15:
                return g();
            case 16:
                return ajgj.c(((ajep) this.a).get());
            case 17:
                return ajgj.d((ajgq) this.a.get());
            case 18:
                return Integer.valueOf(ajgj.b((ajhe) this.a.get()));
            case 19:
                return Boolean.valueOf(ajgj.o((ajhe) this.a.get()));
            default:
                return h(((ajgr) this.a).get());
        }
    }
}
