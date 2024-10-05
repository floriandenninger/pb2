package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yoe {
    public final String a;
    public final Object b;

    private yoe(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public static yoe a(String str, Object obj) {
        return new yoe(str, obj);
    }
}
