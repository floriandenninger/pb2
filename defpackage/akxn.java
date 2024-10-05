package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akxn extends aase {
    public akxn(ajoy ajoyVar, afsx afsxVar, aone aoneVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, afsxVar, "upload/register", aoneVar, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        aone aoneVar = (aone) a();
        zhq.m(((asdm) aoneVar.instance).d);
        int dq = amkq.dq(((asdm) aoneVar.instance).e);
        boolean z = true;
        if (dq != 0 && dq == 1) {
            z = false;
        }
        amkq.E(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final boolean p() {
        return false;
    }
}
