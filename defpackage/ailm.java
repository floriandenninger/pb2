package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ailm {
    private static final Pattern d = Pattern.compile("bytes=(\\d*)-(\\d*)");
    public final long a;
    public final long b;
    public final long c;
    private final boolean e;

    private ailm(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.e = z;
    }

    public static ailm a(Header header, long j) {
        long j2 = j - 1;
        if (header == null) {
            return new ailm(0L, j2, j, false);
        }
        Matcher matcher = d.matcher(header.getValue());
        if (!matcher.matches()) {
            return new ailm(0L, j2, j, false);
        }
        String group = matcher.group(1);
        long parseLong = !TextUtils.isEmpty(group) ? Long.parseLong(group) : 0L;
        String group2 = matcher.group(2);
        if (!TextUtils.isEmpty(group2)) {
            j2 = Long.parseLong(group2);
        }
        return new ailm(parseLong, j2, j, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r9.setStatusCode(206);
        r0 = r8.a;
        r2 = r8.b;
        r4 = r8.c;
        r6 = new java.lang.StringBuilder(68);
        r6.append("bytes ");
        r6.append(r0);
        r6.append("-");
        r6.append(r2);
        r6.append("/");
        r6.append(r4);
        r9.setHeader("Content-Range", r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        r9.setStatusCode(200);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001f, code lost:
    
        if (r4 <= r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r8.a >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r8.e == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(org.apache.http.HttpResponse r9) {
        /*
            r8 = this;
            long r0 = r8.c
            r2 = 0
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L11
            long r0 = r8.a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L61
            goto L22
        L11:
            long r4 = r8.a
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L61
            long r2 = r8.b
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L61
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L22
            goto L61
        L22:
            boolean r0 = r8.e
            if (r0 == 0) goto L5a
            r0 = 206(0xce, float:2.89E-43)
            r9.setStatusCode(r0)
            long r0 = r8.a
            long r2 = r8.b
            long r4 = r8.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r7 = 68
            r6.<init>(r7)
            java.lang.String r7 = "bytes "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = "-"
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = "/"
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "Content-Range"
            r9.setHeader(r1, r0)
            goto L5f
        L5a:
            r0 = 200(0xc8, float:2.8E-43)
            r9.setStatusCode(r0)
        L5f:
            r9 = 1
            return r9
        L61:
            r0 = 416(0x1a0, float:5.83E-43)
            r9.setStatusCode(r0)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ailm.b(org.apache.http.HttpResponse):boolean");
    }
}
