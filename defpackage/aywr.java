package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywr implements Runnable {
    final /* synthetic */ ayws a;
    private final Object b;

    public aywr(ayws aywsVar, Object obj) {
        this.a = aywsVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.c(this.b);
    }
}
