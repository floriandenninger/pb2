package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class izi {
    private final Object a;
    private final ammv b;
    private final ammv c;
    private final ammv d;
    private final ammv e;
    private final ammv f;
    private final ammv g;
    private final ammv h;

    private izi(Object obj, aulz aulzVar) {
        atde atdeVar;
        atnz atnzVar;
        apql apqlVar;
        arih arihVar;
        atdb atdbVar;
        atni atniVar;
        this.a = obj;
        aulzVar.getClass();
        int i = aulzVar.b;
        amkq.F(((i & 4) == 0 && (i & 1) == 0 && (i & 16) == 0 && (i & 32) == 0 && (i & 8) == 0 && (i & 2) == 0 && (i & 512) == 0) ? false : true, "At least one renderer must be non-null");
        aujo aujoVar = null;
        if ((aulzVar.b & 4) != 0) {
            atdeVar = aulzVar.e;
            if (atdeVar == null) {
                atdeVar = atde.a;
            }
        } else {
            atdeVar = null;
        }
        this.b = ammv.i(atdeVar);
        if ((aulzVar.b & 1) != 0) {
            atnzVar = aulzVar.c;
            if (atnzVar == null) {
                atnzVar = atnz.a;
            }
        } else {
            atnzVar = null;
        }
        this.c = ammv.i(atnzVar);
        if ((aulzVar.b & 16) != 0) {
            apqlVar = aulzVar.g;
            if (apqlVar == null) {
                apqlVar = apql.a;
            }
        } else {
            apqlVar = null;
        }
        this.d = ammv.i(apqlVar);
        if ((aulzVar.b & 32) != 0) {
            arihVar = aulzVar.h;
            if (arihVar == null) {
                arihVar = arih.a;
            }
        } else {
            arihVar = null;
        }
        this.e = ammv.i(arihVar);
        if ((aulzVar.b & 8) != 0) {
            atdbVar = aulzVar.f;
            if (atdbVar == null) {
                atdbVar = atdb.a;
            }
        } else {
            atdbVar = null;
        }
        this.f = ammv.i(atdbVar);
        if ((aulzVar.b & 2) != 0) {
            atniVar = aulzVar.d;
            if (atniVar == null) {
                atniVar = atni.a;
            }
        } else {
            atniVar = null;
        }
        this.g = ammv.i(atniVar);
        if ((aulzVar.b & 512) != 0 && (aujoVar = aulzVar.i) == null) {
            aujoVar = aujo.a;
        }
        this.h = ammv.i(aujoVar);
    }

    public static izi a(Object obj, aulz aulzVar) {
        return new izi(obj, aulzVar);
    }

    public ammv b() {
        return this.e;
    }

    public ammv c() {
        return this.f;
    }

    public ammv d() {
        return this.b;
    }

    public ammv e() {
        return this.g;
    }

    public ammv f() {
        return this.c;
    }

    public ammv g() {
        return this.h;
    }

    public Object h() {
        return this.a;
    }
}
