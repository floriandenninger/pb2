package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzl {
    public static final uzl a;
    public static final uzl b;
    public final boolean c;
    public final boolean d = false;
    public final amru e;

    static {
        uzk a2 = a();
        amkq.O(a2.a == null, "A SourcePolicy can only set internal() or external() once.");
        a2.a = false;
        a = a2.a();
        uzk a3 = a();
        amkq.O(a3.a == null, "A SourcePolicy can only set internal() or external() once.");
        a3.a = true;
        b = a3.a();
    }

    public uzl(boolean z, amru amruVar) {
        this.c = z;
        this.e = amruVar;
    }

    public static uzk a() {
        return new uzk();
    }
}
