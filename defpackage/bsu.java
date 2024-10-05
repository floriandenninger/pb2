package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsu {
    public boolean a;
    public PreferenceScreen b;
    public bst c;
    public bsr d;
    public bss e;
    private final Context f;
    private long g = 0;
    private SharedPreferences h;
    private SharedPreferences.Editor i;
    private String j;

    public bsu(Context context) {
        this.f = context;
        g(context.getPackageName() + "_preferences");
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.g;
            this.g = 1 + j;
        }
        return j;
    }

    public final SharedPreferences.Editor b() {
        if (!this.a) {
            return c().edit();
        }
        if (this.i == null) {
            this.i = c().edit();
        }
        return this.i;
    }

    public final SharedPreferences c() {
        if (this.h == null) {
            this.h = this.f.getSharedPreferences(this.j, 0);
        }
        return this.h;
    }

    public final Preference d(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.b;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l(charSequence);
    }

    public final PreferenceScreen e(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.A(this);
        return preferenceScreen;
    }

    public final void f(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.i) != null) {
            editor.apply();
        }
        this.a = z;
    }

    public final void g(String str) {
        this.j = str;
        this.h = null;
    }

    public final void h(Preference preference) {
        bsr bsrVar = this.d;
        if (bsrVar != null) {
            bsrVar.r(preference);
        }
    }
}
