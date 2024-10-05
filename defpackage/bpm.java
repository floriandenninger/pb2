package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bpm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bpn b;
    private final /* synthetic */ int c;

    public bpm(bpn bpnVar, int i, int i2) {
        this.c = i2;
        this.b = bpnVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            bpv bpvVar = this.b.b.c.s;
            if (bpvVar != null) {
                bpvVar.e(this.a);
                return;
            }
            return;
        }
        bpv bpvVar2 = this.b.b.c.s;
        if (bpvVar2 != null) {
            bpvVar2.f(this.a);
        }
    }
}
