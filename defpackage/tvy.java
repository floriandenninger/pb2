package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tvy {
    public Throwable a;
    public int b;

    public final twc a() {
        int i = this.b;
        if (i == 0) {
            throw new IllegalStateException("Missing required properties: code");
        }
        return new twc(i, this.a);
    }
}
