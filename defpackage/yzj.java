package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yzj extends yoh {
    public yzj(yoi yoiVar) {
        super(yoiVar, "ScheduledTaskProto");
    }

    @Override // defpackage.yoh
    protected final /* bridge */ /* synthetic */ long a(Object obj) {
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yoh
    public final /* bridge */ /* synthetic */ Object c(byte[] bArr) {
        try {
            return (owj) aonm.parseFrom(owj.a, bArr, aomw.b());
        } catch (aoob unused) {
            return null;
        }
    }

    @Override // defpackage.yoh
    protected final /* synthetic */ byte[] m(Object obj) {
        return ((owj) obj).toByteArray();
    }
}
