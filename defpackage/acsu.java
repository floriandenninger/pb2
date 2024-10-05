package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acsu implements Runnable {
    final /* synthetic */ asmb a;
    final /* synthetic */ long b;
    final /* synthetic */ acsw c;

    public acsu(acsw acswVar, asmb asmbVar, long j) {
        this.c = acswVar;
        this.a = asmbVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.g(this.a, this.b);
    }
}
