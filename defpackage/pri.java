package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pri {
    private static final Pattern a = Pattern.compile("\\s+");
    private static final amsx b = amsx.s("auto", "none");
    private static final amsx c = amsx.t("dot", "sesame", "circle");
    private static final amsx d = amsx.s("filled", "open");
    private static final amsx e = amsx.t("after", "before", "outside");

    private pri() {
    }

    public static pri a(String str) {
        if (str == null) {
            return null;
        }
        String c2 = amkq.c(str.trim());
        if (c2.isEmpty()) {
            return null;
        }
        amsx q = amsx.q(TextUtils.split(c2, a));
        amwe am = amkq.am(b, q);
        if (!am.isEmpty()) {
            return new pri();
        }
        amwe am2 = amkq.am(d, q);
        amwe am3 = amkq.am(c, q);
        if (am2.isEmpty() && am3.isEmpty()) {
            return new pri();
        }
        return new pri();
    }
}
