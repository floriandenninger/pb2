package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aacq implements ynk {
    public final /* synthetic */ aacs a;
    private final /* synthetic */ int b;

    public /* synthetic */ aacq(aacs aacsVar, int i) {
        this.b = i;
        this.a = aacsVar;
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ynk
    public final void b(Throwable th) {
        if (this.b == 0) {
            aacs aacsVar = this.a;
            zga.d("LogAttestationRequest failed with error.", th);
            aacsVar.b(7);
        } else {
            aacs aacsVar2 = this.a;
            zga.d("Request to get attestation challenge failed.", th);
            aacsVar2.b(2);
        }
    }
}
