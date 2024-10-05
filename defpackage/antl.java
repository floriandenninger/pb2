package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class antl {
    public static final List a;
    public static final List b;
    private static final List c;

    static {
        new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
        a = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        c = Arrays.asList("auto", "app", "am");
        b = Arrays.asList("_r", "_dbg");
        String[][] strArr = {rhk.a, rhk.b};
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i += strArr[i2].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i);
        int length = strArr[0].length;
        for (char c2 = 1; c2 < 2; c2 = 2) {
            String[] strArr2 = strArr[1];
            int length2 = strArr2.length;
            System.arraycopy(strArr2, 0, copyOf, length, length2);
            length += length2;
        }
        Arrays.asList((String[]) copyOf);
        Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, Bundle bundle) {
        if (!"_cmp".equals(str)) {
            return true;
        }
        if (!b()) {
            return false;
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    public static boolean b() {
        return !c.contains("fcm");
    }
}
