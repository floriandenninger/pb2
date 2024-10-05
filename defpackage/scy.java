package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class scy {
    public final aes a;
    private final scx b;

    private scy(aes aesVar, scx scxVar) {
        this.a = aesVar;
        this.b = scxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static scy a(aes aesVar) {
        return new scy(aesVar, sdg.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static scy b(aes aesVar, scx scxVar) {
        return new scy(aesVar, scxVar);
    }

    public final void c(Object obj) {
        this.a.c(this.b.a(obj));
    }
}
