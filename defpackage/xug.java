package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xug {
    public Drawable a;
    public argf b;
    public String c;
    private Uri d;
    private Integer e;
    private Integer f;

    public xug() {
    }

    public xug(xuh xuhVar) {
        this.d = xuhVar.a;
        this.e = Integer.valueOf(xuhVar.b);
        this.a = xuhVar.c;
        this.b = xuhVar.d;
        this.f = Integer.valueOf(xuhVar.e);
        this.c = xuhVar.f;
    }

    public final xuh a() {
        Integer num;
        Uri uri = this.d;
        if (uri == null || (num = this.e) == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == null) {
                sb.append(" uri");
            }
            if (this.e == null) {
                sb.append(" rotationAngle");
            }
            if (this.f == null) {
                sb.append(" uploadingState");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xuh(uri, num.intValue(), this.a, this.b, this.f.intValue(), this.c);
    }

    public final void b(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.d = uri;
    }
}
