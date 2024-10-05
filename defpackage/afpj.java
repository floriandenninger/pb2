package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpj extends yoh {
    public afpj(yoi yoiVar) {
        super(yoiVar, "OfflineHttpRequestProto");
    }

    @Override // defpackage.yoh
    protected final /* bridge */ /* synthetic */ long a(Object obj) {
        owe oweVar = (owe) obj;
        amkq.F((oweVar.b & 32) != 0, "Must have stored time set");
        return oweVar.i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yoh
    public final /* bridge */ /* synthetic */ Object c(byte[] bArr) {
        try {
            return (owe) aonm.parseFrom(owe.a, bArr, aomw.b());
        } catch (aoob unused) {
            return owe.a;
        }
    }

    @Override // defpackage.yoh
    protected final /* synthetic */ byte[] m(Object obj) {
        return ((owe) obj).toByteArray();
    }
}
