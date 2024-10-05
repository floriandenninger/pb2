package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhy implements Runnable {
    final /* synthetic */ akce a;
    private final /* synthetic */ int b;

    public akhy(akce akceVar, int i) {
        this.b = i;
        this.a = akceVar;
    }

    public /* synthetic */ akhy(akce akceVar, int i, byte[] bArr) {
        this.b = i;
        this.a = akceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            akce akceVar = this.a;
            if (akceVar.f()) {
                akceVar.b();
                return;
            }
            return;
        }
        akce akceVar2 = this.a;
        if (akceVar2 == null || !akceVar2.f()) {
            return;
        }
        akceVar2.b();
    }
}
