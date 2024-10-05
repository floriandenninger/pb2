package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cem implements Runnable {
    private final cen a;
    private final String b;

    public cem(cen cenVar, String str) {
        this.a = cenVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            if (((cem) this.a.b.remove(this.b)) == null) {
                ajbh X = ajbh.X();
                String.format("Timer with %s is already marked as complete.", this.b);
                X.T(new Throwable[0]);
            } else {
                cel celVar = (cel) this.a.c.remove(this.b);
                if (celVar != null) {
                    celVar.b(this.b);
                }
            }
        }
    }
}
