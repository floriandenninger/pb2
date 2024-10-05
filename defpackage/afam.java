package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afam implements Runnable {
    public final /* synthetic */ afan a;
    private final /* synthetic */ int b;

    public /* synthetic */ afam(afan afanVar, int i) {
        this.b = i;
        this.a = afanVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            afan afanVar = this.a;
            afanVar.rw(new afao(afanVar.h));
            return;
        }
        afan afanVar2 = this.a;
        afanVar2.g.aK();
        afak afakVar = afanVar2.i;
        if (afakVar != null) {
            afakVar.k();
        }
        afanVar2.g.aJ();
    }
}
