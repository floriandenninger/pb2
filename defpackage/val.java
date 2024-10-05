package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class val extends vak {
    public val() {
        super(Arrays.asList(vaj.COLLAPSED, vaj.FULLY_EXPANDED));
    }

    @Override // defpackage.vak
    public final vaj a(vaj vajVar) {
        return vajVar == vaj.EXPANDED ? vaj.FULLY_EXPANDED : vajVar;
    }

    @Override // defpackage.vak
    public final vaj b(vaj vajVar) {
        vaj vajVar2 = vajVar.e;
        return vajVar2 == vaj.EXPANDED ? vaj.COLLAPSED : vajVar2;
    }
}
