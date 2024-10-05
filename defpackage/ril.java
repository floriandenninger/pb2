package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ril implements Runnable {
    final /* synthetic */ rij a;
    final /* synthetic */ rij b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rip e;

    public ril(rip ripVar, rij rijVar, rij rijVar2, long j, boolean z) {
        this.e = ripVar;
        this.a = rijVar;
        this.b = rijVar2;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.r(this.a, this.b, this.c, this.d, null);
    }
}
