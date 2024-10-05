package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amxu implements Runnable {
    final /* synthetic */ amxt a;
    final /* synthetic */ fy b;

    public amxu(fy fyVar, amxt amxtVar, byte[] bArr) {
        this.b = fyVar;
        this.a = amxtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.h.remove(this.a);
    }
}
