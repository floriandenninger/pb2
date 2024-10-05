package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeor extends zgd {
    final /* synthetic */ aeot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeor(aeot aeotVar) {
        super("recentTFLiteBandwidthSamples");
        this.a = aeotVar;
    }

    @Override // defpackage.zgd
    protected final /* bridge */ /* synthetic */ Object a() {
        afim afimVar;
        aeot aeotVar = this.a;
        try {
            if (aeotVar.b()) {
                awvr awvrVar = (awvr) aeotVar.a.c();
                if ((awvrVar.b & 512) != 0) {
                    afimVar = awvrVar.r;
                    if (afimVar == null) {
                        afimVar = afim.a;
                    }
                } else {
                    afimVar = null;
                }
                if (afimVar != null) {
                    return new aeos(afimVar);
                }
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            aeotVar.a();
        }
        return aeos.a;
    }
}
