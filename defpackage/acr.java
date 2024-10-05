package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acr implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ax b;

    public acr(ax axVar, int i) {
        this.b = axVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abu abuVar = this.b.a;
        int i = this.a;
        abu abuVar2 = ((she) abuVar).a;
        if (abuVar2 != null) {
            if (i == 6) {
                Object obj = ((ajda) abuVar2).a;
                nst nstVar = (nst) obj;
                acsa acsaVar = nstVar.d;
                if (acsaVar != null) {
                    ((nop) obj).a.q(acsaVar, null);
                }
                nstVar.c();
                return;
            }
            if (i == 5) {
                Object obj2 = ((ajda) abuVar2).a;
                nst nstVar2 = (nst) obj2;
                acsa acsaVar2 = nstVar2.d;
                if (acsaVar2 != null) {
                    nop nopVar = (nop) obj2;
                    nopVar.a.D(acsaVar2);
                    nopVar.a.u(nstVar2.d, null);
                }
            }
        }
    }
}
