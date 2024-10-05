package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyp implements kyr {
    private final apmd a;

    public kyp(apmd apmdVar) {
        this.a = apmdVar;
    }

    @Override // defpackage.kyr
    public final apxf a() {
        apmd apmdVar = this.a;
        if ((apmdVar.b & 4) == 0) {
            return null;
        }
        apxf apxfVar = apmdVar.g;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.kyr
    public final aqyg b() {
        aqyg aqygVar = this.a.d;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    @Override // defpackage.kyr
    public final aqyg c() {
        aqyg aqygVar = this.a.c;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    @Override // defpackage.kyr
    public final avgg d() {
        apmd apmdVar = this.a;
        if ((apmdVar.b & 64) == 0) {
            return null;
        }
        avgg avggVar = apmdVar.k;
        return avggVar == null ? avgg.a : avggVar;
    }

    @Override // defpackage.kyr
    public final List e() {
        return this.a.e;
    }

    @Override // defpackage.kyr
    public final List f() {
        return this.a.f;
    }

    @Override // defpackage.kyr
    public final byte[] g() {
        return this.a.l.I();
    }

    @Override // defpackage.kyr
    public final int h() {
        apmd apmdVar = this.a;
        if ((apmdVar.b & 32) == 0) {
            return 0;
        }
        int aM = anaf.aM(apmdVar.j);
        if (aM == 0) {
            return 1;
        }
        return aM;
    }
}
