package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ek implements Runnable {
    final /* synthetic */ el a;
    final /* synthetic */ eo b;
    private final /* synthetic */ int c;

    public ek(eo eoVar, el elVar, int i) {
        this.c = i;
        this.b = eoVar;
        this.a = elVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.b.b.remove(this.a);
            this.b.c.remove(this.a);
        } else if (this.b.b.contains(this.a)) {
            el elVar = this.a;
            ej.r(elVar.e, elVar.a.O);
        }
    }
}
