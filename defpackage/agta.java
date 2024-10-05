package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agta {
    private final adxr a;

    public agta(adxr adxrVar) {
        this.a = adxrVar;
    }

    public final agtg a(agnm agnmVar) {
        agtf agtfVar = new agtf();
        agtfVar.a = agnmVar;
        agtfVar.c = 2;
        agtfVar.b = 0;
        if (aaoq.v().contains(Integer.valueOf(agnmVar.a()))) {
            return agtfVar.a();
        }
        if (!this.a.g(agnmVar.g(), agnmVar.a(), agnmVar.h(), 0L, 1)) {
            agtfVar.b(0L);
        }
        return agtfVar.a();
    }
}
