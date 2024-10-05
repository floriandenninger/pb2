package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pxz extends pyc {
    public pxz(String str, Long l) {
        super(1, str, l);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.b, ((Long) this.c).longValue()));
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        if (!bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            return (Long) this.c;
        }
        String str2 = this.b;
        return Long.valueOf(bundle.getLong(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.b, ((Long) this.c).longValue()));
    }
}
