package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymd {
    public final String a;
    public final long[] b;
    public boolean c;
    public ymc d;
    final /* synthetic */ ymf e;

    public ymd(ymf ymfVar, String str) {
        this.e = ymfVar;
        this.a = str;
        this.b = new long[ymfVar.b];
    }

    public static final IOException e(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() != 0 ? "unexpected journal line: ".concat(valueOf) : new String("unexpected journal line: "));
    }

    public final File a(int i) {
        File file = this.e.a;
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        return new File(file, sb.toString());
    }

    public final String b() {
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

    public final File d() {
        File file = this.e.a;
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append(str);
        sb.append(".0.tmp");
        return new File(file, sb.toString());
    }
}
