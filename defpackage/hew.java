package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hew {
    private Float a;
    private String b;
    private String c;
    private Integer d;
    private String e;

    public final hex a() {
        Float f = this.a;
        if (f == null || this.b == null || this.c == null || this.d == null || this.e == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" speed");
            }
            if (this.b == null) {
                sb.append(" animationTitle");
            }
            if (this.c == null) {
                sb.append(" text");
            }
            if (this.d == null) {
                sb.append(" icon");
            }
            if (this.e == null) {
                sb.append(" contentDescription");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new hex(f.floatValue(), this.b, this.c, this.d.intValue(), this.e);
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null animationTitle");
        }
        this.b = str;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null contentDescription");
        }
        this.e = str;
    }

    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void e(float f) {
        this.a = Float.valueOf(f);
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.c = str;
    }
}
