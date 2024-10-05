package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgw extends akbc {
    private final SharedPreferences a;

    public lgw(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    @Override // defpackage.akbc
    public final String a() {
        String string = this.a.getString(fav.COUNTRY, "");
        return !TextUtils.isEmpty(string) ? string.toLowerCase(Locale.ENGLISH) : "";
    }
}
