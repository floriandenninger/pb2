package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afao extends pou {
    private final long a;
    private final pnd b;

    public afao(pnd pndVar) {
        pnc pncVar = pndVar.b;
        afki.a(pncVar);
        Object obj = pncVar.h;
        afki.a(obj);
        this.a = pts.r(((aezf) obj).b().d);
        this.b = pndVar;
    }

    @Override // defpackage.pou
    public final pos a(int i, pos posVar, boolean z) {
        pse.i(i, 1);
        posVar.e(true != z ? null : "YtVodPeriodId", true == z ? "YtVodPeriodUid" : null, this.a, 0L);
        return posVar;
    }

    @Override // defpackage.pou
    public final pot b(int i, pot potVar, long j) {
        pse.i(i, 1);
        potVar.e(pot.a, this.b, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, this.a, 0L);
        return potVar;
    }

    @Override // defpackage.pou
    public final int d(Object obj) {
        return "YtVodPeriodUid".equals(obj) ? 0 : -1;
    }

    @Override // defpackage.pou
    public final int g() {
        return 1;
    }

    @Override // defpackage.pou
    public final int h() {
        return 1;
    }

    @Override // defpackage.pou
    public final Object i(int i) {
        pse.i(i, 1);
        return "YtVodPeriodUid";
    }
}
