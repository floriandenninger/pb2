package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhz implements Runnable {
    final /* synthetic */ ren a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ rid f;

    public rhz(rid ridVar, ren renVar, long j, int i, long j2, boolean z) {
        this.f = ridVar;
        this.a = renVar;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.R(this.a);
        this.f.y(this.b, false);
        this.f.G(this.a, this.c, this.d, true, this.e);
    }
}
