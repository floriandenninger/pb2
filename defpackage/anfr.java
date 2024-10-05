package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anfr implements Runnable {
    final /* synthetic */ anhy a;
    final /* synthetic */ int b;
    final /* synthetic */ anft c;

    public anfr(anft anftVar, anhy anhyVar, int i) {
        this.c = anftVar;
        this.a = anhyVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.isCancelled()) {
                anft anftVar = this.c;
                anftVar.a = null;
                anftVar.cancel(false);
            } else {
                this.c.h(this.b, this.a);
            }
        } finally {
            this.c.i(null);
        }
    }
}
