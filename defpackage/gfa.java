package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gfa implements gfb {
    private final ardu a;

    public gfa(ardu arduVar) {
        this.a = arduVar;
    }

    @Override // defpackage.gfb
    public final apxf a() {
        ardu arduVar = this.a;
        if (arduVar == null) {
            return null;
        }
        return arduVar.c == 3 ? (apxf) arduVar.d : apxf.a;
    }

    @Override // defpackage.gfb
    public final apxf b() {
        ardu arduVar = this.a;
        if (arduVar == null) {
            return null;
        }
        return arduVar.c == 2 ? (apxf) arduVar.d : apxf.a;
    }

    @Override // defpackage.gfb
    public final arfs c() {
        ardu arduVar = this.a;
        if (arduVar == null) {
            return null;
        }
        arfs arfsVar = arduVar.e;
        return arfsVar == null ? arfs.a : arfsVar;
    }

    @Override // defpackage.gfb
    public final Object d() {
        return this.a;
    }

    @Override // defpackage.gfb
    public final String e() {
        ardu arduVar = this.a;
        if (arduVar == null || (arduVar.b & 8) == 0) {
            return null;
        }
        aots aotsVar = arduVar.f;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        return aotsVar.c;
    }
}
