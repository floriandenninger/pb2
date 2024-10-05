package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzh {
    public String a;
    public Bitmap b;
    public byte[] c;
    public Uri d;

    public final akzi a() {
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: frontendId");
        }
        return new akzi(str, this.b, this.c, this.d);
    }
}
