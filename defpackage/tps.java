package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tps implements amml {
    public final /* synthetic */ SharedPreferences a;
    private final /* synthetic */ int b;

    public /* synthetic */ tps(SharedPreferences sharedPreferences, int i) {
        this.b = i;
        this.a = sharedPreferences;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b == 0) {
            SharedPreferences sharedPreferences = this.a;
            boolean z = tqd.a;
            sharedPreferences.edit().putBoolean("mdd_migrated_to_offroad", true).commit();
            return null;
        }
        this.a.edit().putString(aghv.QUALITY, ((lox) obj).d).apply();
        return null;
    }
}
