package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tbn {
    public String a;
    public Integer b;
    public Status c;
    public String d;
    public String e;
    public Integer f;
    public Boolean g;
    public aksx h;
    private amsx i;
    private Integer j;

    public final tbo a() {
        Integer num;
        amsx amsxVar = this.i;
        if (amsxVar == null || (num = this.j) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.i == null) {
                sb.append(" templateUris");
            }
            if (this.j == null) {
                sb.append(" materializationCount");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new tbo(amsxVar, this.h, this.a, this.b, this.c, this.d, this.e, this.f, this.g, num.intValue(), null);
    }

    public final void b(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void c(amsx amsxVar) {
        if (amsxVar == null) {
            throw new NullPointerException("Null templateUris");
        }
        this.i = amsxVar;
    }
}
