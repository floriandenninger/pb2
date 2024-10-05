package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahsk implements Runnable {
    final /* synthetic */ ahsl a;
    private final /* synthetic */ int b;

    public ahsk(ahsl ahslVar, int i) {
        this.b = i;
        this.a = ahslVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.h.i();
            return;
        }
        ahsl ahslVar = this.a;
        if (ahslVar.q && ahslVar.r) {
            ahslVar.r = false;
        }
        ahslVar.g();
    }
}
