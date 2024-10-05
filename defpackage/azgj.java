package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgj implements Runnable {
    final /* synthetic */ azgk a;
    private final Object b;

    public azgj(azgk azgkVar, Object obj) {
        this.a = azgkVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.c(this.b);
    }
}
