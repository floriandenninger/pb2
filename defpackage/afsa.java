package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afsa extends yoh {
    public afsa(yoi yoiVar) {
        super(yoiVar, "DelayedEventProto");
    }

    @Override // defpackage.yoh
    protected final /* bridge */ /* synthetic */ long a(Object obj) {
        aone aoneVar = (aone) obj;
        amkq.F((((ovz) aoneVar.instance).b & 8) != 0, "Must have stored time set");
        return ((ovz) aoneVar.instance).f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yoh
    public final /* bridge */ /* synthetic */ Object c(byte[] bArr) {
        try {
            return ((ovz) aonm.parseFrom(ovz.a, bArr, aomw.b())).toBuilder();
        } catch (aoob unused) {
            return ovz.a.createBuilder();
        }
    }

    @Override // defpackage.yoh
    protected final /* bridge */ /* synthetic */ byte[] m(Object obj) {
        return ((ovz) ((aone) obj).build()).toByteArray();
    }
}
