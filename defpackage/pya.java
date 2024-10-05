package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pya extends pyc {
    public pya(String str, Float f) {
        super(1, str, f);
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.b, ((Float) this.c).floatValue()));
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        if (!bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            return (Float) this.c;
        }
        String str2 = this.b;
        return Float.valueOf(bundle.getFloat(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // defpackage.pyc
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.b, ((Float) this.c).floatValue()));
    }
}
