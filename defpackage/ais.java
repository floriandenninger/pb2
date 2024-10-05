package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ais implements air {
    private final LocaleList a;

    public ais(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // defpackage.air
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.air
    public final Locale b(String[] strArr) {
        return this.a.getFirstMatch(strArr);
    }

    @Override // defpackage.air
    public final Locale c() {
        return this.a.get(0);
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((air) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
