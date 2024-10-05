package defpackage;

import android.text.TextUtils;
import j$.net.URLEncoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ysi {
    public final long b;
    public final String c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ysi(long j, String str) {
        this.b = Math.max(j, -1L);
        this.c = str;
    }

    public static ysi d(Map map, String str) {
        if (true == TextUtils.isEmpty(str)) {
            str = "ISO-8859-1";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), str));
            sb.append('=');
            sb.append(URLEncoder.encode((String) entry.getValue(), str));
        }
        return e(sb.toString().getBytes(str), "application/x-www-form-urlencoded");
    }

    public static ysi e(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        return new ysg(bArr, bArr.length, str);
    }

    public abstract InputStream a();

    public ByteBuffer b() {
        byte[] c = c();
        if (c != null) {
            return ByteBuffer.wrap(c);
        }
        return null;
    }

    public byte[] c() {
        throw null;
    }

    public final boolean f() {
        return this.b == -1;
    }
}
