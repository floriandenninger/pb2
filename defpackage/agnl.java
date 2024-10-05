package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnl {
    public byte[] a;
    public byte[] b;
    public awyz c;
    public String d;
    public String e;
    public Uri f;
    private FormatStreamModel g;
    private Boolean h;
    private Long i;
    private Integer j;
    private Long k;
    private Integer l;
    private Boolean m;
    private int n;

    public final agnm a() {
        Boolean bool;
        FormatStreamModel formatStreamModel = this.g;
        if (formatStreamModel == null || (bool = this.h) == null || this.i == null || this.j == null || this.k == null || this.n == 0 || this.l == null || this.m == null) {
            StringBuilder sb = new StringBuilder();
            if (this.g == null) {
                sb.append(" formatStream");
            }
            if (this.h == null) {
                sb.append(" audioOnly");
            }
            if (this.i == null) {
                sb.append(" bytesTransferred");
            }
            if (this.j == null) {
                sb.append(" streamStatus");
            }
            if (this.k == null) {
                sb.append(" streamStatusTimestamp");
            }
            if (this.n == 0) {
                sb.append(" offlineStorageFormat");
            }
            if (this.l == null) {
                sb.append(" streamEncryptionKeyType");
            }
            if (this.m == null) {
                sb.append(" streamExpired");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new agnm(formatStreamModel, bool.booleanValue(), this.i.longValue(), this.j.intValue(), this.k.longValue(), this.n, this.a, this.b, this.c, this.d, this.l.intValue(), this.e, this.m.booleanValue(), this.f);
    }

    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void c(long j) {
        this.i = Long.valueOf(j);
    }

    public final void d(FormatStreamModel formatStreamModel) {
        if (formatStreamModel == null) {
            throw new NullPointerException("Null formatStream");
        }
        this.g = formatStreamModel;
    }

    public final void e(int i) {
        this.l = Integer.valueOf(i);
    }

    public final void f(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    public final void g(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void h(long j) {
        this.k = Long.valueOf(j);
    }

    public final void i(int i) {
        if (i == 0) {
            throw new NullPointerException("Null offlineStorageFormat");
        }
        this.n = i;
    }
}
