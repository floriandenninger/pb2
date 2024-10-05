package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aip {
    public final air a;

    static {
        a(new Locale[0]);
    }

    private aip(air airVar) {
        this.a = airVar;
    }

    public static aip a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? c(new LocaleList(localeArr)) : new aip(new aiq(localeArr));
    }

    public static aip b() {
        return Build.VERSION.SDK_INT >= 24 ? c(LocaleList.getDefault()) : a(Locale.getDefault());
    }

    public static aip c(LocaleList localeList) {
        return new aip(new ais(localeList));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale d(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            int length = split.length;
            if (length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            int length2 = split2.length;
            if (length2 > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (length2 > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (length2 == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public final Locale e() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aip) && this.a.equals(((aip) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
