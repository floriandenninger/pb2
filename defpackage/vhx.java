package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vhx {
    final /* synthetic */ vid a;

    public vhx(vid vidVar) {
        this.a = vidVar;
    }

    public final void a() {
        synchronized (this.a.h) {
            int i = this.a.k;
            amkq.P(i > 0, "Refcount went negative!", i);
            r1.k--;
            this.a.c();
        }
    }
}
