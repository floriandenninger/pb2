package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bakx extends balu {
    private final bakp b;

    public bakx(bakp bakpVar, bajp bajpVar) {
        super(bajj.n, bajpVar);
        this.b = bakpVar;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        return this.b.P(j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int b(Locale locale) {
        return bakz.a(locale).k;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return 7;
    }

    @Override // defpackage.balu, defpackage.bajh
    public final int d() {
        return 1;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String j(int i, Locale locale) {
        return bakz.a(locale).c[i];
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String l(int i, Locale locale) {
        return bakz.a(locale).b[i];
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return this.b.d;
    }

    @Override // defpackage.balk
    protected final int sv(String str, Locale locale) {
        Integer num = (Integer) bakz.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new bajs(bajj.n, str);
    }
}
