package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cup {
    private final ddj a = new ddj(1000);
    private final hy b = ddu.b(10, new cun(0));

    public final String a(cqi cqiVar) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.f(cqiVar);
        }
        if (str == null) {
            cuo cuoVar = (cuo) this.b.a();
            did.ap(cuoVar);
            try {
                cqiVar.a(cuoVar.a);
                byte[] digest = cuoVar.a.digest();
                synchronized (ddn.b) {
                    char[] cArr = ddn.b;
                    for (int i = 0; i < digest.length; i++) {
                        int i2 = digest[i] & 255;
                        int i3 = i + i;
                        cArr[i3] = ddn.a[i2 >>> 4];
                        cArr[i3 + 1] = ddn.a[i2 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(cuoVar);
            }
        }
        synchronized (this.a) {
            this.a.g(cqiVar, str);
        }
        return str;
    }
}
