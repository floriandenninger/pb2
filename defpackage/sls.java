package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sls {
    public String a;
    public String b;
    public String c;
    public String d;
    public awnw e;
    public awnw f;
    public swu g;
    public DialogInterface.OnKeyListener h;
    public slt i;
    public Object j;
    public aomf k;
    public int l;
    private Integer m;

    public final slu a() {
        Integer num;
        int i = this.l;
        if (i == 0 || (num = this.m) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.l == 0) {
                sb.append(" dialogType");
            }
            if (this.m == null) {
                sb.append(" requestedOrientation");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new slu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, i, num.intValue(), this.i, this.j, this.k);
    }

    public final void b(int i) {
        this.m = Integer.valueOf(i);
    }
}
