package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rfs implements Runnable {
    private final rfr a;
    private final int b;
    private final Throwable c;
    private final byte[] d;
    private final String e;
    private final Map f;

    public rfs(String str, rfr rfrVar, int i, Throwable th, byte[] bArr, Map map) {
        qip.an(rfrVar);
        this.a = rfrVar;
        this.b = i;
        this.c = th;
        this.d = bArr;
        this.e = str;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.e, this.b, this.c, this.d, this.f);
    }
}
