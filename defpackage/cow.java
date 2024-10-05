package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cow {
    public final String a;
    public final long[] b;
    File[] c;
    File[] d;
    public boolean e;
    public cov f;
    final /* synthetic */ coy g;

    public cow(coy coyVar, String str) {
        this.g = coyVar;
        this.a = str;
        int i = coyVar.d;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < coyVar.d; i2 = 1) {
            sb.append(0);
            this.c[0] = new File(coyVar.a, sb.toString());
            sb.append(".tmp");
            this.d[0] = new File(coyVar.a, sb.toString());
            sb.setLength(length);
        }
    }

    public static final IOException e(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() != 0 ? "unexpected journal line: ".concat(valueOf) : new String("unexpected journal line: "));
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.b;
        int length = jArr.length;
        for (int i = 0; i < length; i = 1) {
            long j = jArr[0];
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }

    public final File c() {
        return this.c[0];
    }

    public final File d() {
        return this.d[0];
    }
}
