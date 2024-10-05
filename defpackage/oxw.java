package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxw implements Runnable {
    final /* synthetic */ oxz a;
    final /* synthetic */ oyb b;

    public oxw(oyb oybVar, oxz oxzVar) {
        this.b = oybVar;
        this.a = oxzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.b(this.a);
    }
}
