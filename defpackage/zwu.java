package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwu {
    public ammv a;
    public ammv b;
    private zwt c;
    private Integer d;
    private String e;

    public zwu() {
    }

    public zwu(byte[] bArr) {
        this.a = amlr.a;
        this.b = amlr.a;
    }

    public final zwv a() {
        Integer num;
        zwt zwtVar = this.c;
        if (zwtVar == null || (num = this.d) == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" albumType");
            }
            if (this.d == null) {
                sb.append(" fileCount");
            }
            if (this.e == null) {
                sb.append(" name");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new zwv(zwtVar, this.a, num.intValue(), this.e, this.b);
    }

    public final void b(zwt zwtVar) {
        if (zwtVar == null) {
            throw new NullPointerException("Null albumType");
        }
        this.c = zwtVar;
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.e = str;
    }
}
