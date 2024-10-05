package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baky extends balk {
    private final bakp a;

    public baky(bakp bakpVar) {
        super(bajj.c);
        this.a = bakpVar;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        return this.a.Z(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int b(Locale locale) {
        return bakz.a(locale).j;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return 1;
    }

    @Override // defpackage.bajh
    public final int d() {
        return 0;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long g(long j) {
        if (a(j) == 1) {
            return this.a.ah(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, i, 0, 1);
        if (a(j) == i) {
            return j;
        }
        return this.a.ah(j, -this.a.Z(j));
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long i(long j, String str, Locale locale) {
        Integer num = (Integer) bakz.a(locale).g.get(str);
        if (num != null) {
            return h(j, num.intValue());
        }
        throw new bajs(bajj.c, str);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String l(int i, Locale locale) {
        return bakz.a(locale).a[i];
    }

    @Override // defpackage.balk, defpackage.bajh
    public final bajp p() {
        return balz.j(bajr.a);
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return null;
    }
}
