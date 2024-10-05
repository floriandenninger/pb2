package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class igj implements ekf {
    private final acqz a;
    private final azrw b;
    private final azrw c;

    public igj(acqz acqzVar, azrw azrwVar, azrw azrwVar2) {
        this.a = acqzVar;
        this.b = azrwVar;
        this.c = azrwVar2;
    }

    @Override // defpackage.ekf
    public final ekk a() {
        return new ekk((ajdw) this.b.get(), this.a.mM(), ((axqv) this.c).get());
    }
}
