package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gez implements gfb {
    private final aqeq a;

    public gez(aqeq aqeqVar) {
        this.a = aqeqVar;
    }

    @Override // defpackage.gfb
    public final apxf a() {
        aqeq aqeqVar = this.a;
        return aqeqVar.c == 3 ? (apxf) aqeqVar.d : apxf.a;
    }

    @Override // defpackage.gfb
    public final apxf b() {
        aqeq aqeqVar = this.a;
        return aqeqVar.c == 2 ? (apxf) aqeqVar.d : apxf.a;
    }

    @Override // defpackage.gfb
    public final arfs c() {
        arfs arfsVar = this.a.e;
        return arfsVar == null ? arfs.a : arfsVar;
    }

    @Override // defpackage.gfb
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.gfb
    public final String e() {
        aqeq aqeqVar = this.a;
        if ((aqeqVar.b & 8) == 0) {
            return null;
        }
        aots aotsVar = aqeqVar.f;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }
}
