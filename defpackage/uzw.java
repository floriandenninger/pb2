package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzw implements Runnable {
    final /* synthetic */ uzv a;

    public uzw(uzv uzvVar) {
        this.a = uzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uzx.a.add(this.a);
        if (uzx.b != -1) {
            this.a.b(uzx.b);
        }
    }
}
