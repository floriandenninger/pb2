package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class als {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final ame b;
    public volatile int c = 0;

    public als(ame ameVar, int i) {
        this.b = ameVar;
        this.a = i;
    }

    public final int a(int i) {
        bvj e = e();
        int a = e.a(16);
        if (a != 0) {
            return e.b.getInt(e.b(a) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        bvj e = e();
        int a = e.a(16);
        if (a != 0) {
            return e.c(a);
        }
        return 0;
    }

    public final int c() {
        bvj e = e();
        int a = e.a(4);
        if (a != 0) {
            return e.b.getInt(a + e.a);
        }
        return 0;
    }

    public final short d() {
        bvj e = e();
        int a = e.a(14);
        if (a != 0) {
            return e.b.getShort(a + e.a);
        }
        return (short) 0;
    }

    public final bvj e() {
        ThreadLocal threadLocal = d;
        bvj bvjVar = (bvj) threadLocal.get();
        if (bvjVar == null) {
            bvjVar = new bvj();
            threadLocal.set(bvjVar);
        }
        bvj bvjVar2 = this.b.d;
        int i = this.a;
        int a = bvjVar2.a(6);
        if (a != 0) {
            int b = bvjVar2.b(a) + (i * 4);
            bvjVar.d(b + bvjVar2.b.getInt(b), bvjVar2.b);
        }
        return bvjVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
