package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acst implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ acsw c;

    public acst(acsw acswVar, String str, long j) {
        this.c = acswVar;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.i(this.a, this.b);
    }
}
