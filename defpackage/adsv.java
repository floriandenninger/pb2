package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adsv {
    public final String a;
    public final ScreenId b;
    public final adfs c;
    public final adgb d;
    public final int e;
    public String f;

    public adsv(String str, ScreenId screenId, adfs adfsVar, adgb adgbVar, int i, String str2) {
        this.a = str;
        this.b = screenId;
        this.c = adfsVar;
        this.d = adgbVar;
        this.e = i;
        this.f = str2;
    }

    public static Optional a(String str, String str2, ScreenId screenId, adfs adfsVar, adgb adgbVar, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || screenId == null) {
            return Optional.empty();
        }
        return Optional.of(new adsv(str2, screenId, adfsVar, adgbVar, i, str));
    }

    public final String b() {
        adfy adfyVar;
        Uri uri;
        adgb adgbVar = this.d;
        if (!(adgbVar instanceof adfy) || (uri = (adfyVar = (adfy) adgbVar).b) == null || TextUtils.isEmpty(uri.toString())) {
            return null;
        }
        return adfyVar.b.toString();
    }
}
