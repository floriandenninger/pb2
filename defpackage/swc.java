package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swc {
    private static final Map a = new HashMap();

    protected static int a(Context context, String str, String str2) {
        int intValue;
        Map map = a;
        synchronized (map) {
            String valueOf = String.valueOf(str2);
            String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            Integer num = (Integer) map.get(concat);
            if (num == null) {
                intValue = context.getResources().getIdentifier(str2, str, context.getPackageName());
                map.put(concat, Integer.valueOf(intValue));
            } else {
                intValue = num.intValue();
            }
        }
        return intValue;
    }

    public static int b(Context context, awpf awpfVar) {
        int x;
        for (int i = 0; i < awpfVar.c.size(); i++) {
            awph awphVar = (awph) awpfVar.c.get(i);
            if (awphVar.c == 3) {
                awpe awpeVar = (awpe) awphVar.d;
                if ((awpeVar.b & 2) != 0) {
                    String str = awpeVar.c;
                    int x2 = awxr.x(awpfVar.f);
                    return a(context, ((x2 != 0 && x2 == 5) || ((x = awxr.x(awpfVar.f)) != 0 && x == 4)) ? "raw" : "drawable", str);
                }
            }
        }
        return 0;
    }

    public static int c(Context context, aoam aoamVar) {
        for (int i = 0; i < aoamVar.aa(); i++) {
            aoam aK = aoamVar.ab(i).aK();
            if (aK != null) {
                int b = aK.b(6);
                String e = b != 0 ? aK.e(b + aK.a) : null;
                if (e != null) {
                    return a(context, "drawable", e);
                }
            }
        }
        return 0;
    }
}
