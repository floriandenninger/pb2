package defpackage;

import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alaw implements akwp {
    private final long a;
    private final long b;

    public alaw(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.akwp
    public final akzs a(akzs akzsVar) {
        if (akzsVar == null) {
            return null;
        }
        aone builder = akzsVar.toBuilder();
        long j = this.a;
        builder.copyOnWrite();
        akzs akzsVar2 = (akzs) builder.instance;
        akzsVar2.b |= 1073741824;
        akzsVar2.C = j;
        long j2 = this.b;
        builder.copyOnWrite();
        akzs akzsVar3 = (akzs) builder.instance;
        akzsVar3.b |= CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        akzsVar3.D = j2;
        return (akzs) builder.build();
    }
}
