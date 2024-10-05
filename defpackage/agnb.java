package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnb {
    public final String a;
    public final String b;
    public final aami c;
    public final atot d;
    public final boolean e;

    public agnb(String str, String str2, boolean z, aami aamiVar, atot atotVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = aamiVar;
        this.e = z;
        this.d = atotVar;
    }

    public static agnb a(atot atotVar) {
        if (atotVar == null || (atotVar.b & 1) == 0) {
            return null;
        }
        atos atosVar = atotVar.c;
        if (atosVar == null) {
            atosVar = atos.a;
        }
        avgg avggVar = atosVar.d;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return b(atotVar, new aami(avggVar));
    }

    public static agnb b(atot atotVar, aami aamiVar) {
        if (atotVar == null || (atotVar.b & 1) == 0) {
            return null;
        }
        atos atosVar = atotVar.c;
        if (atosVar == null) {
            atosVar = atos.a;
        }
        return new agnb(atosVar.c, atosVar.e, atosVar.f, aamiVar, atotVar);
    }
}
