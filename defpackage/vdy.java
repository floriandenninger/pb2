package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vdy {
    private static final Pattern a = Pattern.compile("(\\w+).*");

    public static amru a(Uri uri) {
        amru q;
        amrp f = amru.f();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            q = amru.q();
        } else {
            q = amru.n(amnm.c("+").a().f(encodedFragment.substring(10)));
        }
        int size = q.size();
        for (int i = 0; i < size; i++) {
            String str = (String) q.get(i);
            Matcher matcher = a.matcher(str);
            if (matcher.matches()) {
                f.h(matcher.group(1));
            } else {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid fragment spec: ".concat(valueOf) : new String("Invalid fragment spec: "));
            }
        }
        return f.g();
    }

    public static String b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        String valueOf = String.valueOf(ammr.b("+").d(list));
        return valueOf.length() != 0 ? "transform=".concat(valueOf) : new String("transform=");
    }
}
