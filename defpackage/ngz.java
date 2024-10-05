package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ngz implements Runnable {
    public boolean a;
    private final ypa b;
    private final Object c;

    public ngz(ypa ypaVar, Object obj) {
        ypaVar.getClass();
        this.b = ypaVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.b.d(aacj.a(this.c));
    }
}
