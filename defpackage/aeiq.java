package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeiq implements aejd {
    private final adyj a;
    private final adxr b;
    private final amml c;
    private final ScheduledExecutorService d;
    private final ayqi e;
    private final ScheduledExecutorService f;
    private final aaoz g;
    private final aeie h;
    private final afhf i;
    private final aejq j;
    private final aaea k;
    private final afhw l;
    private final aejn m;
    private final amnv n;
    private final shf o;
    private final aejl p;
    private final aekm q;
    private final aadw r;
    private final aexw s;
    private final afhs t;

    public aeiq(aekm aekmVar, adyj adyjVar, adyl adylVar, amml ammlVar, ScheduledExecutorService scheduledExecutorService, ayqi ayqiVar, ScheduledExecutorService scheduledExecutorService2, aaoz aaozVar, aeie aeieVar, afhf afhfVar, aejq aejqVar, aaea aaeaVar, aadw aadwVar, afhs afhsVar, afhw afhwVar, aejn aejnVar, aexw aexwVar, amnv amnvVar, shf shfVar, aejl aejlVar) {
        this.a = adyjVar;
        this.b = adylVar;
        this.c = ammlVar;
        this.d = scheduledExecutorService;
        this.e = ayqiVar;
        this.f = scheduledExecutorService2;
        this.g = aaozVar;
        this.h = aeieVar;
        this.i = afhfVar;
        this.j = aejqVar;
        this.k = aaeaVar;
        this.r = aadwVar;
        this.t = afhsVar;
        this.l = afhwVar;
        this.m = aejnVar;
        this.q = aekmVar;
        this.s = aexwVar;
        this.n = amnvVar;
        this.o = shfVar;
        this.p = aejlVar;
    }

    @Override // defpackage.aejd
    public final /* bridge */ /* synthetic */ aejb a(aaox aaoxVar, aelw aelwVar, aelb aelbVar, afjf afjfVar, aarn aarnVar) {
        amnv amnvVar;
        aekm aekmVar = this.q;
        aeyr aeyrVar = this.s.a;
        aeiz aeizVar = null;
        if (aeyrVar != null) {
            aeyrVar.p(null);
        }
        aeks aeksVar = new aeks(aekmVar.c, aekmVar.a, aekmVar.b, afjfVar);
        adyj adyjVar = this.a;
        adxr adxrVar = this.b;
        Object apply = this.c.apply(aaoxVar.b);
        ScheduledExecutorService scheduledExecutorService = this.d;
        ayqi ayqiVar = this.e;
        ScheduledExecutorService scheduledExecutorService2 = this.f;
        aaoz aaozVar = this.g;
        aeie aeieVar = this.h;
        afhf afhfVar = this.i;
        aejq aejqVar = this.j;
        aaea aaeaVar = this.k;
        aadw aadwVar = this.r;
        afhs afhsVar = this.t;
        afhw afhwVar = this.l;
        aejn aejnVar = this.m;
        amnv amnvVar2 = this.n;
        if (aelbVar == null || aarnVar == null) {
            amnvVar = amnvVar2;
        } else {
            amnvVar = amnvVar2;
            aeizVar = new aeiz(aarnVar, aelbVar, aelwVar);
        }
        aeis aeisVar = new aeis(aaoxVar, aeksVar, adyjVar, adxrVar, (atk) apply, scheduledExecutorService, ayqiVar, scheduledExecutorService2, aaozVar, aeieVar, afhfVar, aejqVar, aaeaVar, aadwVar, afhsVar, afhwVar, aejnVar, amnvVar, aelwVar, afjfVar, aeizVar, this.o, this.p, ammv.i(aelbVar), ammv.i(aarnVar));
        String str = aaoxVar.g;
        if (str != null) {
            aeisVar.g(str);
        }
        return aeisVar;
    }
}
