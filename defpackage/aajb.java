package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aajb {
    public final String a;
    public final Class b;
    public final amru c;
    public final amru d;

    public aajb(String str, Class cls, amru amruVar, amru amruVar2) {
        amkq.E(!str.startsWith("QT_") ? false : str.matches("\\w+"));
        if (((amvj) amruVar2).c > 0) {
            throw null;
        }
        this.a = str;
        this.b = cls;
        this.c = amruVar;
        this.d = amruVar2;
    }

    public static aaja a(Class cls, String str) {
        return new aaja(cls, str);
    }

    public final void b(vin vinVar) {
        vinVar.b(this.a);
    }

    public final void c(aajc aajcVar) {
        amkq.E(this.c.contains(aajcVar));
    }
}
