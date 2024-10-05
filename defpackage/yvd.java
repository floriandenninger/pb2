package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yvd implements Runnable {
    private final yvo a;
    private final cnm b;

    public yvd(yvo yvoVar, cnm cnmVar) {
        this.a = yvoVar;
        this.b = cnmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c()) {
            this.a.ql(this.b.a);
        } else {
            this.a.o(this.b.c);
        }
    }
}
