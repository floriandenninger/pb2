package defpackage;

import android.net.ProxyInfo;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafj {
    public static final bafj a = new bafj("", 0, "", new String[0]);
    public final String b;
    public final int c;
    public final String d;
    public final String[] e;

    public bafj(String str, int i, String str2, String[] strArr) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = strArr;
    }

    public static bafj a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return null;
        }
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        return new bafj(proxyInfo.getHost(), proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
    }
}
