package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lmt {
    public final Activity a;
    public final aahd b;
    public final SettingsDataAccess c;
    public final acra d;
    public final aloh e;

    public lmt(Activity activity, aahd aahdVar, SettingsDataAccess settingsDataAccess, acra acraVar, aloh alohVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = activity;
        this.b = aahdVar;
        this.c = settingsDataAccess;
        this.d = acraVar;
        this.e = alohVar;
    }

    public final String a(int i) {
        return this.a.getString(i);
    }
}
