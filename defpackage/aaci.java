package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaci extends aaco {
    private final ammv a;
    private final ammv b;
    private final Map c;

    private aaci(atnz atnzVar, atnc atncVar, Map map) {
        super(ammv.i(yjj.s(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        this.a = ammv.i(atnzVar);
        this.b = ammv.i(atncVar);
        this.c = map == null ? amvo.b : map;
    }

    public static aaci a(atnc atncVar) {
        atncVar.getClass();
        return new aaci(null, atncVar, null);
    }

    public static aaci b(atnz atnzVar) {
        atnzVar.getClass();
        return new aaci(atnzVar, null, null);
    }

    public static aaci c(atnc atncVar, Map map) {
        atncVar.getClass();
        return new aaci(null, atncVar, map);
    }

    public static aaci d(atnz atnzVar, Map map) {
        atnzVar.getClass();
        return new aaci(atnzVar, null, map);
    }

    public ammv e() {
        return this.b;
    }

    public ammv f() {
        return this.a;
    }

    public Map g() {
        return this.c;
    }
}
