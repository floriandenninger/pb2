package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bajs extends IllegalArgumentException {
    private static final long serialVersionUID = 6305711765985447737L;
    public String a;

    public bajs(bajj bajjVar, Number number, Number number2, Number number3) {
        super(a(bajjVar.z, number, number2, number3, null));
        this.a = super.getMessage();
    }

    private static String a(String str, Number number, Number number2, Number number3, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Value ");
        sb.append(number);
        sb.append(" for ");
        sb.append(str);
        sb.append(' ');
        if (number2 == null) {
            if (number3 == null) {
                sb.append("is not supported");
            } else {
                sb.append("must not be larger than ");
                sb.append(number3);
            }
        } else if (number3 == null) {
            sb.append("must not be smaller than ");
            sb.append(number2);
        } else {
            sb.append("must be in the range [");
            sb.append(number2);
            sb.append(',');
            sb.append(number3);
            sb.append(']');
        }
        if (str2 != null) {
            sb.append(": ");
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    public bajs(bajj bajjVar, Number number, String str) {
        super(a(bajjVar.z, number, null, null, str));
        this.a = super.getMessage();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bajs(defpackage.bajj r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r3 = r3.z
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "Value "
            r0.append(r1)
            r1 = 34
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = " for "
            r0.append(r4)
            r0.append(r3)
            r3 = 32
            r0.append(r3)
            java.lang.String r3 = "is not supported"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.lang.String r3 = super.getMessage()
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bajs.<init>(bajj, java.lang.String):void");
    }
}
