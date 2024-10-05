package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hts implements Runnable {
    final /* synthetic */ htu a;
    private final /* synthetic */ int b;

    public hts(htu htuVar, int i) {
        this.b = i;
        this.a = htuVar;
    }

    public /* synthetic */ hts(htu htuVar, int i, byte[] bArr) {
        this.b = i;
        this.a = htuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            htu htuVar = this.a;
            if (htuVar.al != null) {
                htuVar.aS();
                return;
            }
            return;
        }
        this.a.aX();
    }
}
