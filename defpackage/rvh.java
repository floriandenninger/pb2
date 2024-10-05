package defpackage;

import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvh {
    public static final /* synthetic */ int a = 0;
    private static final Set b;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add('.');
        hashSet.add('!');
        hashSet.add('?');
        hashSet.add(':');
        hashSet.add('\n');
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String b2 = ((rvj) it.next()).b();
            if (b2 != null) {
                String trim = b2.trim();
                if (!trim.equals("")) {
                    sb.append(trim);
                    if (!b.contains(Character.valueOf(trim.charAt(trim.length() - 1)))) {
                        sb.append('.');
                    }
                    if (it.hasNext()) {
                        sb.append(" ");
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void b(ViewGroup viewGroup) {
        viewGroup.notifySubtreeAccessibilityStateChanged(viewGroup, viewGroup, 1);
    }
}
