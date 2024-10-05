package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acvc {
    public adle a;
    private String b;
    private String c;
    private Integer d;
    private int e;

    public acvc() {
    }

    public acvc(acvd acvdVar) {
        this.b = acvdVar.a;
        this.e = acvdVar.e;
        this.c = acvdVar.b;
        this.d = Integer.valueOf(acvdVar.c);
        this.a = acvdVar.d;
    }

    public final acvd a() {
        int i;
        String str;
        Integer num;
        String str2 = this.b;
        if (str2 == null || (i = this.e) == 0 || (str = this.c) == null || (num = this.d) == null || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" routeId");
            }
            if (this.e == 0) {
                sb.append(" sessionType");
            }
            if (this.c == null) {
                sb.append(" deviceName");
            }
            if (this.d == null) {
                sb.append(" timeoutSeconds");
            }
            if (this.a == null) {
                sb.append(" playbackDescriptor");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new acvd(str2, i, str, num.intValue(), this.a);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null deviceName");
        }
        this.c = str;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null routeId");
        }
        this.b = str;
    }

    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void e(int i) {
        if (i == 0) {
            throw new NullPointerException("Null sessionType");
        }
        this.e = i;
    }
}
