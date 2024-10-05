package org.chromium.base;

import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import defpackage.badp;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LocaleUtils {
    private LocaleUtils() {
    }

    public static String a(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == 3365) {
            if (str.equals("in")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == 3374) {
            if (str.equals("iw")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode == 3391) {
            if (str.equals("ji")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 3405) {
            if (hashCode == 3704 && str.equals("tl")) {
                c = 3;
            }
            c = 65535;
        } else {
            if (str.equals("jw")) {
                c = 4;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? str : "jv" : "fil" : "id" : "yi" : "he";
    }

    public static String b(Locale locale) {
        String a = a(locale.getLanguage());
        String country = locale.getCountry();
        if (a.equals("no") && country.equals("NO") && locale.getVariant().equals("NY")) {
            return "nn-NO";
        }
        if (country.isEmpty()) {
            return a;
        }
        return a + "-" + country;
    }

    private static String getDefaultCountryCode() {
        badp a = badp.a();
        if (a.c()) {
            return a.b();
        }
        return Locale.getDefault().getCountry();
    }

    public static String getDefaultLocaleListString() {
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < localeList.size(); i++) {
                Locale locale = localeList.get(i);
                String language = locale.getLanguage();
                String a = a(language);
                if (!a.equals(language)) {
                    locale = new Locale.Builder().setLocale(locale).setLanguage(a).build();
                }
                arrayList.add(b(locale));
            }
            return TextUtils.join(",", arrayList);
        }
        return getDefaultLocaleString();
    }

    public static String getDefaultLocaleString() {
        return b(Locale.getDefault());
    }
}
