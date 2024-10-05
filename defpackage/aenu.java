package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aenu extends zgd {
    final /* synthetic */ aenv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenu(aenv aenvVar) {
        super("recentBandwidthSamples");
        this.a = aenvVar;
    }

    @Override // defpackage.zgd
    protected final /* bridge */ /* synthetic */ Object a() {
        afil afilVar;
        aenv aenvVar = this.a;
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (aenvVar.c()) {
                awvr awvrVar = (awvr) aenvVar.b.c();
                if ((awvrVar.b & 2) != 0) {
                    afilVar = awvrVar.e;
                    if (afilVar == null) {
                        afilVar = afil.a;
                    }
                } else {
                    afilVar = null;
                }
                if (afilVar != null) {
                    arrayDeque.addAll(afilVar.b);
                }
            }
        } catch (ClassCastException | IllegalArgumentException e) {
            afsi.c(1, 6, "Invalid persisted bandwidth samples. Ignored.", e);
        }
        return arrayDeque;
    }
}
