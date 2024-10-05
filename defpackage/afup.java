package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afup implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ ykl b;
    final /* synthetic */ afuq c;

    public afup(afuq afuqVar, Object obj, ykl yklVar) {
        this.c = afuqVar;
        this.a = obj;
        this.b = yklVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.a.c(this.a, this.b);
        } catch (Exception e) {
            zga.l("target requester should catch exception and pass to callback.onError");
            this.b.a(this.a, e);
        }
    }
}
