package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awns {
    public final aong a;

    public awns(int i) {
        aong aongVar = (aong) tge.a.createBuilder();
        this.a = aongVar;
        aongVar.copyOnWrite();
        tge tgeVar = (tge) aongVar.instance;
        tgeVar.c = i - 1;
        tgeVar.b |= 1;
    }

    public awns(aong aongVar) {
        this.a = aongVar;
    }

    public final void a() {
        new awnt((awnw) this.a.build());
    }

    public final avgj b(aakv aakvVar) {
        return new avgj((avgg) this.a.build(), aakvVar);
    }

    public final asug c(aakv aakvVar) {
        return new asug((asuh) this.a.build(), aakvVar);
    }

    public final aqyd d(aakv aakvVar) {
        return new aqyd((aqyg) this.a.build(), aakvVar);
    }

    public final apxe e(aakv aakvVar) {
        return new apxe((apxf) this.a.build(), aakvVar);
    }

    public final tgc f() {
        return new tgc((tge) this.a.build());
    }

    private awns() {
        awnw awnwVar = awnw.a;
        throw null;
    }
}
