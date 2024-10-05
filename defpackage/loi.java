package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class loi implements zdj {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ ywr b;

    public loi(SharedPreferences sharedPreferences, ywr ywrVar) {
        this.a = sharedPreferences;
        this.b = ywrVar;
    }

    @Override // defpackage.zdj
    public final anhy a() {
        boolean z = this.a.getBoolean(aghv.WIFI_POLICY, false);
        return anfq.h(this.b.b(new eou(z, 14)), new eou(z, 15), angq.a);
    }

    @Override // defpackage.zdj
    public final /* bridge */ /* synthetic */ anhy b(Object obj) {
        Boolean bool = (Boolean) obj;
        this.a.edit().putBoolean(aghv.WIFI_POLICY, bool.booleanValue()).apply();
        return this.b.b(new lod(bool, 3));
    }
}
