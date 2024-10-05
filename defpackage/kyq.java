package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyq implements kyr {
    private final atop a;

    public kyq(atop atopVar) {
        this.a = atopVar;
    }

    @Override // defpackage.kyr
    public final apxf a() {
        apxf apxfVar = this.a.f;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.kyr
    public final aqyg b() {
        aqyg aqygVar = this.a.c;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    @Override // defpackage.kyr
    public final aqyg c() {
        aqyg aqygVar = this.a.b;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    @Override // defpackage.kyr
    public final avgg d() {
        avgg avggVar = this.a.i;
        return avggVar == null ? avgg.a : avggVar;
    }

    @Override // defpackage.kyr
    public final List e() {
        return this.a.d;
    }

    @Override // defpackage.kyr
    public final List f() {
        return this.a.e;
    }

    @Override // defpackage.kyr
    public final byte[] g() {
        return null;
    }

    @Override // defpackage.kyr
    public final int h() {
        int aM = anaf.aM(this.a.h);
        if (aM == 0) {
            return 1;
        }
        return aM;
    }
}
