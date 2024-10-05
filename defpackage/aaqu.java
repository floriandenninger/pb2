package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaqu {
    public Long a;
    public String b;
    public Integer c;
    public amru d;
    public aarx e;
    private Integer f;

    public final aaqv a() {
        String str;
        Integer num;
        Long l = this.a;
        if (l == null || (str = this.b) == null || (num = this.f) == null || this.c == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" parsingTimeMillis");
            }
            if (this.b == null) {
                sb.append(" rpcName");
            }
            if (this.f == null) {
                sb.append(" responseProtoByteSize");
            }
            if (this.c == null) {
                sb.append(" retryCount");
            }
            if (this.d == null) {
                sb.append(" networkHealthAnnotations");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new aaqv(l, str, num.intValue(), this.c.intValue(), this.d, this.e);
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }
}
