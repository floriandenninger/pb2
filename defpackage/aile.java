package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aile {
    public static final aile a = new aile(1, null);
    private static final aile d = new aile(3, null);
    public final aigr b;
    public final int c;

    private aile(int i, aigr aigrVar) {
        this.c = i;
        this.b = aigrVar;
    }

    public static void a(ykl yklVar, aigr aigrVar) {
        yklVar.b(null, new aile(2, aigrVar));
    }

    public static void b(ykl yklVar) {
        yklVar.b(null, d);
    }
}
