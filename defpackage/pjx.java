package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pjx implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ pka c;

    public pjx(pka pkaVar, long j, long j2) {
        this.c = pkaVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pjz pjzVar = this.c.b;
        String valueOf = String.valueOf(pka.l());
        String concat = valueOf.length() != 0 ? "libvpx".concat(valueOf) : new String("libvpx");
        long j = this.a;
        pjzVar.c(concat, j, j - this.b);
    }
}
