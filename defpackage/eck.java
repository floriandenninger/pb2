package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eck {
    public final ebe a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public eck(ebe ebeVar, String str, String str2, Class... clsArr) {
        this.a = ebeVar;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        ebeVar.b.submit(new ecj(this));
    }

    public static final String a(byte[] bArr, String str) {
        return new String(eaq.a(bArr, str), "UTF-8");
    }
}
