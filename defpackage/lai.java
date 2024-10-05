package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lai implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final azrw a;
    private final SharedPreferences b;
    private int c;

    public lai(SharedPreferences sharedPreferences, azrw azrwVar) {
        azrwVar.getClass();
        this.a = azrwVar;
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        this.c = -1;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized int a() {
        int i = this.c;
        if (i != -1) {
            return i;
        }
        int i2 = this.b.getInt("animated_previews_setting", 2);
        this.c = i2;
        return i2;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("animated_previews_setting".equals(str)) {
            this.c = this.b.getInt("animated_previews_setting", 2);
        }
    }
}
