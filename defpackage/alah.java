package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alah {
    public final ContentResolver a;
    public final Map b;

    public alah(Context context) {
        this.a = context.getContentResolver();
        ArrayMap arrayMap = new ArrayMap(3);
        this.b = arrayMap;
        alaa alaaVar = new alaa();
        arrayMap.put("content", alaaVar);
        arrayMap.put("file", alaaVar);
        arrayMap.put("streaming", new alap());
    }

    public final avuc a(Uri uri, String str, String str2) {
        String scheme = uri.getScheme();
        if (scheme == null || !b(scheme)) {
            throw new UnsupportedOperationException("Uri scheme not supported for resource extraction");
        }
        alag alagVar = (alag) this.b.get(scheme);
        if (alagVar == null) {
            throw new UnsupportedOperationException("Resource extraction not available for scheme");
        }
        return alagVar.c(str, str2);
    }

    public final boolean b(String str) {
        return !TextUtils.isEmpty(str) && this.b.containsKey(str);
    }

    public final boolean c(Uri uri) {
        return b(uri.getScheme());
    }
}
