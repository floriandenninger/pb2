package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zxw implements Runnable {
    final /* synthetic */ zxz a;
    private final /* synthetic */ int b;

    public zxw(zxz zxzVar, int i) {
        this.b = i;
        this.a = zxzVar;
    }

    public /* synthetic */ zxw(zxz zxzVar, int i, byte[] bArr) {
        this.b = i;
        this.a = zxzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.by();
        } else if (i != 1) {
            this.a.bz(null);
        } else {
            this.a.aE.getLooper().quit();
        }
    }
}
