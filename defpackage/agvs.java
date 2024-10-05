package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agvs implements Runnable {
    public final /* synthetic */ agvx a;
    public final /* synthetic */ agnz b;
    private final /* synthetic */ int c;

    public /* synthetic */ agvs(agvx agvxVar, agnz agnzVar, int i) {
        this.c = i;
        this.a = agvxVar;
        this.b = agnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            agvx agvxVar = this.a;
            agnz agnzVar = this.b;
            if (agtw.ae(agnzVar.f)) {
                if (agnzVar.b == avjo.TRANSFER_STATE_COMPLETE) {
                    ((agon) agvxVar.f.get()).A(agnzVar);
                    return;
                }
                if (agnzVar.b == avjo.TRANSFER_STATE_FAILED) {
                    ((agon) agvxVar.f.get()).B(agnzVar);
                    return;
                } else {
                    if (agnzVar.b == avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE && agtw.ai(agnzVar)) {
                        agvxVar.n(agnzVar, false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        agvx agvxVar2 = this.a;
        ((agon) agvxVar2.f.get()).z(this.b);
    }
}
