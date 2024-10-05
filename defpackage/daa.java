package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daa {
    final Class a;
    public final Class b;
    public final czz c;

    public daa(Class cls, Class cls2, czz czzVar) {
        this.a = cls;
        this.b = cls2;
        this.c = czzVar;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
    }
}
