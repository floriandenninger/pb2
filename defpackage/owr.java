package defpackage;

import android.content.ContentResolver;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class owr {
    public static final Pattern a = Pattern.compile(" +");
    private static final Pattern d = Pattern.compile("\\W");
    private static owr e = new owr(new owp[0]);
    private static Object f;
    public final owp[] b;
    public final Pattern c;

    public owr(owp[] owpVarArr) {
        Arrays.sort(owpVarArr);
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < owpVarArr.length; i++) {
            if (i > 0) {
                sb.append(")|(");
            }
            sb.append(d.matcher(owpVarArr[i].c).replaceAll("\\\\$0"));
        }
        sb.append(")");
        this.c = Pattern.compile(sb.toString());
        this.b = owpVarArr;
    }

    public static synchronized owr a(ContentResolver contentResolver) {
        synchronized (owr.class) {
            Object b = rsb.b(contentResolver);
            if (b == f) {
                return e;
            }
            Map e2 = rsb.e(contentResolver, "url:");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : e2.entrySet()) {
                try {
                    String substring = ((String) entry.getKey()).substring(4);
                    String str = (String) entry.getValue();
                    if (str != null && str.length() != 0) {
                        arrayList.add(new owp(substring, str));
                    }
                } catch (owq e3) {
                    Log.e("UrlRules", "Invalid rule from Gservices", e3);
                }
            }
            owr owrVar = new owr((owp[]) arrayList.toArray(new owp[arrayList.size()]));
            e = owrVar;
            f = b;
            return owrVar;
        }
    }
}
