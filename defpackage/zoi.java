package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.edit.common.AutoValue_DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zoi {
    public String a;
    private Long b;
    private Uri c;
    private String d;
    private Long e;
    private Long f;
    private Long g;
    private Integer h;

    public final DeviceLocalFile a() {
        Long l = this.b;
        if (l == null || this.c == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" id");
            }
            if (this.c == null) {
                sb.append(" uri");
            }
            if (this.d == null) {
                sb.append(" displayName");
            }
            if (this.e == null) {
                sb.append(" size");
            }
            if (this.f == null) {
                sb.append(" duration");
            }
            if (this.g == null) {
                sb.append(" lastModifiedTime");
            }
            if (this.h == null) {
                sb.append(" fileType");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        AutoValue_DeviceLocalFile autoValue_DeviceLocalFile = new AutoValue_DeviceLocalFile(l.longValue(), this.c, this.d, this.a, this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h.intValue());
        amkq.O(autoValue_DeviceLocalFile.a != Long.MIN_VALUE || autoValue_DeviceLocalFile.e == 2, "encountered non-IMAGE_FROM_FILE file without unique ID specified");
        long j = autoValue_DeviceLocalFile.c;
        amkq.S(j >= 0, "encountered file (%s) with negative size (%s)", autoValue_DeviceLocalFile.b, j);
        long j2 = autoValue_DeviceLocalFile.d;
        amkq.S(j2 >= 0, "encountered file (%s) with negative lastModifiedTime (%s)", autoValue_DeviceLocalFile.b, j2);
        return autoValue_DeviceLocalFile;
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayName");
        }
        this.d = str;
    }

    public final void c(long j) {
        this.f = Long.valueOf(j);
    }

    public final void d(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void e(long j) {
        this.b = Long.valueOf(j);
    }

    public final void f(long j) {
        this.g = Long.valueOf(j);
    }

    public final void g(long j) {
        this.e = Long.valueOf(j);
    }

    public final void h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.c = uri;
    }
}
