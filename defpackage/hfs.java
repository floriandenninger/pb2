package defpackage;

import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.AutoValue_ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfs {
    private Uri a;
    private Integer b;
    private Integer c;
    private Long d;

    public final ShortsVideoMetadata a() {
        Integer num;
        Uri uri = this.a;
        if (uri == null || (num = this.b) == null || this.c == null || this.d == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" path");
            }
            if (this.b == null) {
                sb.append(" width");
            }
            if (this.c == null) {
                sb.append(" height");
            }
            if (this.d == null) {
                sb.append(" videoDurationMs");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_ShortsVideoMetadata(uri, num.intValue(), this.c.intValue(), this.d.longValue());
    }

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null path");
        }
        this.a = uri;
    }

    public final void d(long j) {
        this.d = Long.valueOf(j);
    }

    public final void e(int i) {
        this.b = Integer.valueOf(i);
    }
}
