package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abgy implements Runnable {
    public final Object a;
    public final long b;
    public final long c;
    public apxf d;
    final /* synthetic */ abha e;
    private final String f;

    public abgy(abha abhaVar, String str, Object obj, long j, long j2) {
        this.e = abhaVar;
        this.f = str;
        this.a = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b.remove(this.a);
        this.e.c.remove(this.f);
    }
}
