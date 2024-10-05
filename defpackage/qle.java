package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qle {
    private static final qkw a = new qkw("MetadataUtils");
    private static final String[] b;
    private static final String c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        b = strArr;
        String valueOf = String.valueOf(strArr[0]);
        c = valueOf.length() != 0 ? "yyyyMMdd'T'HHmmss".concat(valueOf) : new String("yyyyMMdd'T'HHmmss");
    }

    public static Calendar a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c2 = c(str);
        if (TextUtils.isEmpty(c2)) {
            return null;
        }
        String d = d(str);
        if (TextUtils.isEmpty(d)) {
            str2 = "yyyyMMdd";
        } else {
            String valueOf = String.valueOf(c2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(d).length());
            sb.append(valueOf);
            sb.append("T");
            sb.append(d);
            c2 = sb.toString();
            str2 = d.length() == 6 ? "yyyyMMdd'T'HHmmss" : c;
        }
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(c2));
            return gregorianCalendar;
        } catch (ParseException e) {
            a.c(e, "Error parsing string", new Object[0]);
            return null;
        }
    }

    public static void b(List list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                try {
                    Uri uri = Uri.EMPTY;
                    if (jSONObject.has("url")) {
                        try {
                            uri = Uri.parse(jSONObject.getString("url"));
                        } catch (JSONException unused) {
                        }
                    }
                    list.add(new WebImage(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
                } catch (IllegalArgumentException unused2) {
                }
            }
        } catch (JSONException unused3) {
        }
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e) {
            a.c(e, "Error extracting the date", new Object[0]);
            return null;
        }
    }

    private static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(84);
        int i = indexOf + 1;
        if (indexOf != 8) {
            return null;
        }
        try {
            String substring = str.substring(i);
            if (substring.length() == 6) {
                return substring;
            }
            char charAt = substring.charAt(6);
            if (charAt == '+' || charAt == '-') {
                int length = substring.length();
                String[] strArr = b;
                if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                    return substring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                }
            } else {
                if (charAt == 'Z' && substring.length() == b[0].length() + 6) {
                    return String.valueOf(substring.substring(0, substring.length() - 1)).concat("+0000");
                }
                return null;
            }
            return null;
        } catch (IndexOutOfBoundsException e) {
            a.c(e, "Error extracting the time substring: %s", new Object[0]);
            return null;
        }
    }
}
