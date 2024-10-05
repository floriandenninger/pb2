package defpackage;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bajk {
    public static volatile Map a;
    private static final aynu b;
    private static volatile aynu c;

    static {
        aynu aynuVar = new aynu();
        b = aynuVar;
        c = aynuVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", bajn.a);
        linkedHashMap.put("UTC", bajn.a);
        linkedHashMap.put("GMT", bajn.a);
        h(linkedHashMap, "EST", "America/New_York");
        h(linkedHashMap, "EDT", "America/New_York");
        h(linkedHashMap, "CST", "America/Chicago");
        h(linkedHashMap, "CDT", "America/Chicago");
        h(linkedHashMap, "MST", "America/Denver");
        h(linkedHashMap, "MDT", "America/Denver");
        h(linkedHashMap, "PST", "America/Los_Angeles");
        h(linkedHashMap, "PDT", "America/Los_Angeles");
        a = Collections.unmodifiableMap(linkedHashMap);
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final long b(baka bakaVar) {
        if (bakaVar == null) {
            return a();
        }
        return bakaVar.st();
    }

    public static final DateFormatSymbols c(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final bajf d(bajf bajfVar) {
        return bajfVar == null ? bale.O() : bajfVar;
    }

    public static final bajf e(baka bakaVar) {
        if (bakaVar == null) {
            return bale.O();
        }
        bajf su = bakaVar.su();
        return su == null ? bale.O() : su;
    }

    public static final bajn f(bajn bajnVar) {
        return bajnVar == null ? bajn.k() : bajnVar;
    }

    public static final bajy g() {
        return bajy.d();
    }

    private static void h(Map map, String str, String str2) {
        try {
            map.put(str, bajn.i(str2));
        } catch (RuntimeException unused) {
        }
    }
}
