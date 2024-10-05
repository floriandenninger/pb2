package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bako extends balt {
    public bako() {
        super(bajj.o, bakp.r, bakp.s);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int b(Locale locale) {
        return bakz.a(locale).m;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long i(long j, String str, Locale locale) {
        String[] strArr = bakz.a(locale).f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new bajs(bajj.o, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return h(j, length);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String l(int i, Locale locale) {
        return bakz.a(locale).f[i];
    }
}
