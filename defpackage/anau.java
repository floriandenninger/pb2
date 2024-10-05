package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anau implements anaq {
    public int a = 0;
    public int b = -1;
    public final Object[] c;
    public final StringBuilder d;
    public int e;
    private final amzp f;

    public anau(amzp amzpVar, Object[] objArr, StringBuilder sb) {
        anaf.d(amzpVar, "context");
        this.f = amzpVar;
        this.e = 0;
        this.c = (Object[]) anaf.d(objArr, "arguments");
        this.d = sb;
    }

    public static void d(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(amyr.b(obj));
        sb.append("]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if ((r8 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
    
        if ((r8 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    @Override // defpackage.anaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r8, defpackage.amyk r9, defpackage.amyl r10) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anau.a(java.lang.Object, amyk, amyl):void");
    }

    public final anav b() {
        return this.f.a;
    }

    public final String c() {
        return this.f.b;
    }
}
