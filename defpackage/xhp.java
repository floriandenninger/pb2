package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhp extends ahbx {
    private Pattern a;
    private Pattern b;
    private Pattern c;
    private final aloh d;

    public xhp(aloh alohVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = alohVar;
    }

    private final boolean K(String str) {
        if (this.a == null) {
            this.a = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.a.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    private final boolean L(String str) {
        if (this.c == null) {
            this.c = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID_FOR_CONVERSION_TRACKING)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.c.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    private final boolean M(String str) {
        if (this.b == null) {
            this.b = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_LAT)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.b.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    @Override // defpackage.ahbx
    public final Uri a(Uri uri) {
        yjk.e();
        uri.getClass();
        String uri2 = uri.toString();
        if (!TextUtils.isEmpty(uri2)) {
            boolean K = K(uri2);
            boolean L = L(uri2);
            boolean M = M(uri2);
            if (!K && !L && !M) {
                return uri;
            }
            try {
                pvg e = this.d.e();
                boolean z = e.b;
                if (M) {
                    uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_LAT)(?:\\]|%5D|%5d)", true != z ? "0" : "1");
                }
                String str = e.a;
                if (str != null) {
                    if (K && !z) {
                        uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID)(?:\\]|%5D|%5d)", str);
                    }
                    if (L) {
                        uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID_FOR_CONVERSION_TRACKING)(?:\\]|%5D|%5d)", str);
                    }
                }
            } catch (Exception e2) {
                zga.d("Failed to get advertising id", e2);
            }
            try {
                return wbs.ai(uri2);
            } catch (MalformedURLException unused) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb.append("Failed macro substitution for URI: ");
                sb.append(valueOf);
                zga.l(sb.toString());
            }
        }
        return uri;
    }

    @Override // defpackage.ahbx
    public final boolean b(Uri uri) {
        if (uri == null) {
            return false;
        }
        String uri2 = uri.toString();
        return L(uri2) || K(uri2) || M(uri2);
    }
}
