package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hyf implements ici {
    public final /* synthetic */ hyh a;
    private final /* synthetic */ int b;

    public /* synthetic */ hyf(hyh hyhVar, int i) {
        this.b = i;
        this.a = hyhVar;
    }

    @Override // defpackage.ici
    public final void a(axdj axdjVar) {
        axed axedVar;
        if (this.b == 0) {
            this.a.b.aI(axdjVar);
            return;
        }
        hyh hyhVar = this.a;
        hyhVar.b.aI(axdjVar);
        axdi i = ((axdk) axdjVar.instance).i();
        if (i.c == 7) {
            axedVar = (axed) i.d;
        } else {
            axedVar = axed.a;
        }
        axee axeeVar = axedVar.e;
        if (axeeVar == null) {
            axeeVar = axee.a;
        }
        if (axeeVar.d.size() > 1) {
            hyhVar.e.d(axdjVar);
        }
    }
}
