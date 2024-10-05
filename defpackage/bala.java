package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bala extends bakt {
    public bala(bakp bakpVar) {
        super(bakpVar);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int b(Locale locale) {
        return bakz.a(locale).l;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String j(int i, Locale locale) {
        return bakz.a(locale).e[i];
    }

    @Override // defpackage.balk, defpackage.bajh
    public final String l(int i, Locale locale) {
        return bakz.a(locale).d[i];
    }

    @Override // defpackage.balk
    protected final int sv(String str, Locale locale) {
        Integer num = (Integer) bakz.a(locale).i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new bajs(bajj.i, str);
    }
}
