package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class llu {
    private final Activity a;
    private final fjs b;
    private final SettingsDataAccess c;

    public llu(Activity activity, fjs fjsVar, SettingsDataAccess settingsDataAccess) {
        this.a = activity;
        this.b = fjsVar;
        this.c = settingsDataAccess;
    }

    public final abck a() {
        if (!d()) {
            return null;
        }
        for (Object obj : this.c.i()) {
            if (obj instanceof abck) {
                return (abck) obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        boolean e = e();
        boolean c = c();
        if (e && c) {
            return this.a.getString(R.string.pref_background_and_offline_category);
        }
        if (e) {
            return this.a.getString(R.string.pref_offline_category);
        }
        if (c) {
            return this.a.getString(R.string.pref_background_category);
        }
        return null;
    }

    public final boolean c() {
        return fhe.G(this.c.i(), abcd.class);
    }

    public final boolean d() {
        return fhe.G(this.c.i(), abck.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return d() || this.b.h();
    }
}
