package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class aygq implements Runnable {
    private final ayai a;

    /* JADX INFO: Access modifiers changed from: protected */
    public aygq(ayai ayaiVar) {
        this.a = ayaiVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        ayai a = this.a.a();
        try {
            a();
        } finally {
            this.a.c(a);
        }
    }
}
