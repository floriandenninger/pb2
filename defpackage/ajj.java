package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajj implements Runnable {
    final /* synthetic */ hw a;
    final /* synthetic */ Object b;

    public ajj(hw hwVar, Object obj) {
        this.a = hwVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.accept(this.b);
    }
}
