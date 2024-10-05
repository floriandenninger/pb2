package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ria implements Runnable {
    final /* synthetic */ ren a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ rid e;
    private final /* synthetic */ int f;

    public ria(rid ridVar, ren renVar, int i, long j, boolean z, int i2) {
        this.f = i2;
        this.e = ridVar;
        this.a = renVar;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f == 0) {
            this.e.R(this.a);
            this.e.G(this.a, this.b, this.c, false, this.d);
        } else {
            this.e.R(this.a);
            this.e.G(this.a, this.b, this.c, false, this.d);
        }
    }
}
