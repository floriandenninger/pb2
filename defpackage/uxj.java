package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxj {
    private final String a;
    private final boolean b;
    private final boolean c;

    public uxj(String str) {
        this(str, false, false);
    }

    private uxj(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final uxe a(String str, double d) {
        return new uxe(this.a, str, Double.valueOf(d), new uwf(this.b, this.c, uxf.c, new uxh(Double.class, 0)));
    }

    public final uxe b(String str, long j) {
        return new uxe(this.a, str, Long.valueOf(j), new uwf(this.b, this.c, uxf.d, new uxh(Long.class, 2)));
    }

    public final uxe c(String str, String str2) {
        return new uxe(this.a, str, str2, new uwf(this.b, this.c, uxf.b, new uxh(String.class, 3)));
    }

    public final uxe d(String str, boolean z) {
        return new uxe(this.a, str, Boolean.valueOf(z), new uwf(this.b, this.c, uxf.a, new uxh(Boolean.class, 1)));
    }

    public final uxe e(String str, Object obj, final uxi uxiVar) {
        final int i = 0;
        final int i2 = 1;
        return new uxe(this.a, str, obj, new uwf(this.b, this.c, new uxi() { // from class: uxg
            @Override // defpackage.uxi
            public final Object a(Object obj2) {
                return i != 0 ? uxiVar.a((byte[]) obj2) : uxiVar.a(Base64.decode((String) obj2, 3));
            }
        }, new uxi() { // from class: uxg
            @Override // defpackage.uxi
            public final Object a(Object obj2) {
                return i2 != 0 ? uxiVar.a((byte[]) obj2) : uxiVar.a(Base64.decode((String) obj2, 3));
            }
        }));
    }

    public final uxj f() {
        return new uxj(this.a, true, this.c);
    }

    public final uxj g() {
        return new uxj(this.a, this.b, true);
    }
}
