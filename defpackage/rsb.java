package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rsb {
    static HashMap f;
    private static Object l;
    private static boolean m;
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    public static final AtomicBoolean e = new AtomicBoolean();
    static final HashMap g = new HashMap();
    static final HashMap h = new HashMap();
    static final HashMap i = new HashMap();
    static final HashMap j = new HashMap();
    static String[] k = new String[0];

    public static int a(ContentResolver contentResolver, String str, int i2) {
        Object b2 = b(contentResolver);
        Integer num = (Integer) i(h, str, Integer.valueOf(i2));
        if (num != null) {
            return num.intValue();
        }
        String c2 = c(contentResolver, str);
        if (c2 != null) {
            try {
                int parseInt = Integer.parseInt(c2);
                num = Integer.valueOf(parseInt);
                i2 = parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        m(b2, h, str, num);
        return i2;
    }

    public static Object b(ContentResolver contentResolver) {
        Object obj;
        synchronized (rsb.class) {
            k(contentResolver);
            obj = l;
        }
        return obj;
    }

    @Deprecated
    public static String c(ContentResolver contentResolver, String str) {
        return d(contentResolver, str, null);
    }

    public static String d(ContentResolver contentResolver, String str, String str2) {
        synchronized (rsb.class) {
            k(contentResolver);
            Object obj = l;
            if (f.containsKey(str)) {
                String str3 = (String) f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
                return str2;
            }
            for (String str4 : k) {
                if (str.startsWith(str4)) {
                    if (!m || f.isEmpty()) {
                        j(contentResolver, k);
                        if (f.containsKey(str)) {
                            String str5 = (String) f.get(str);
                            if (str5 != null) {
                                str2 = str5;
                            }
                            return str2;
                        }
                    }
                    return str2;
                }
            }
            Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
            if (query == null) {
                return str2;
            }
            try {
                if (!query.moveToFirst()) {
                    l(obj, str, null);
                    return str2;
                }
                String string = query.getString(1);
                if (string != null && string.equals(str2)) {
                    string = str2;
                }
                l(obj, str, string);
                if (string != null) {
                    str2 = string;
                }
                return str2;
            } finally {
                query.close();
            }
        }
    }

    public static Map e(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    public static void f(ContentResolver contentResolver, String... strArr) {
        String[] strArr2;
        synchronized (rsb.class) {
            k(contentResolver);
            HashSet hashSet = new HashSet((((k.length + 1) * 4) / 3) + 1);
            hashSet.addAll(Arrays.asList(k));
            ArrayList arrayList = new ArrayList();
            String str = strArr[0];
            if (hashSet.add(str)) {
                arrayList.add(str);
            }
            if (arrayList.isEmpty()) {
                strArr2 = new String[0];
            } else {
                k = (String[]) hashSet.toArray(new String[hashSet.size()]);
                strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            if (m && !f.isEmpty()) {
                if (strArr2.length != 0) {
                    j(contentResolver, strArr2);
                }
            }
            j(contentResolver, k);
        }
    }

    public static boolean g(ContentResolver contentResolver, String str, boolean z) {
        Object b2 = b(contentResolver);
        HashMap hashMap = g;
        Boolean bool = (Boolean) i(hashMap, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String c2 = c(contentResolver, str);
        if (c2 != null && !c2.equals("")) {
            if (c.matcher(c2).matches()) {
                bool = true;
                z = true;
            } else if (d.matcher(c2).matches()) {
                bool = false;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + c2 + "\") as boolean");
            }
        }
        m(b2, hashMap, str, bool);
        return z;
    }

    public static long h(ContentResolver contentResolver, long j2) {
        Object b2 = b(contentResolver);
        Long l2 = (Long) i(i, "android_id", Long.valueOf(j2));
        if (l2 != null) {
            return l2.longValue();
        }
        String c2 = c(contentResolver, "android_id");
        if (c2 != null) {
            try {
                long parseLong = Long.parseLong(c2);
                l2 = Long.valueOf(parseLong);
                j2 = parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        m(b2, i, "android_id", l2);
        return j2;
    }

    private static Object i(HashMap hashMap, String str, Object obj) {
        synchronized (rsb.class) {
            if (!hashMap.containsKey(str)) {
                return null;
            }
            Object obj2 = hashMap.get(str);
            if (obj2 != null) {
                obj = obj2;
            }
            return obj;
        }
    }

    private static void j(ContentResolver contentResolver, String[] strArr) {
        f.putAll(e(contentResolver, strArr));
        m = true;
    }

    private static void k(ContentResolver contentResolver) {
        if (f == null) {
            e.set(false);
            f = new HashMap();
            l = new Object();
            m = false;
            contentResolver.registerContentObserver(a, true, new rsa());
            return;
        }
        if (e.getAndSet(false)) {
            f.clear();
            g.clear();
            h.clear();
            i.clear();
            j.clear();
            l = new Object();
            m = false;
        }
    }

    private static void l(Object obj, String str, String str2) {
        synchronized (rsb.class) {
            if (obj == l) {
                f.put(str, str2);
            }
        }
    }

    private static void m(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (rsb.class) {
            if (obj == l) {
                hashMap.put(str, obj2);
                f.remove(str);
            }
        }
    }
}
