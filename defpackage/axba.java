package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axba implements Runnable {
    private final axam a;
    private final awxr b;

    public axba(awxr awxrVar, axam axamVar, byte[] bArr) {
        this.b = awxrVar;
        this.a = axamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.a);
    }
}
