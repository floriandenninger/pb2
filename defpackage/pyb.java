package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pyb extends pyc {
    public pyb(String str, String str2) {
        super(1, str, str2);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(this.b, (String) this.c);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        if (!bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            return (String) this.c;
        }
        String str2 = this.b;
        return bundle.getString(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag."));
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.b, (String) this.c);
    }
}
