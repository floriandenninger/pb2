package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anzg {
    public final SharedPreferences a;

    public anzg(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public anzg(SharedPreferences sharedPreferences, byte[] bArr) {
        yjk.f();
        this.a = sharedPreferences;
    }

    private static final String i(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    public final synchronized anzf a(String str, String str2) {
        return anzf.a(this.a.getString(i(str, str2), null));
    }

    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3, String str4) {
        String b = anzf.b(str3, str4, System.currentTimeMillis());
        if (b == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(i(str, str2), b);
        edit.commit();
    }

    public final synchronized boolean d() {
        return this.a.getAll().isEmpty();
    }

    public final int e() {
        return this.a.getInt("mdx.last_lr_notification_shown_id", -1);
    }

    public final long f() {
        return this.a.getLong("mdx.lr_notification_last_notif_shown_time_ms", 0L);
    }

    public final String g() {
        return this.a.getString("mdx.last_lr_notification_shown_tag", "");
    }

    public final void h() {
        this.a.edit().putInt("mdx.last_lr_notification_shown_id", -1).apply();
        this.a.edit().putString("mdx.last_lr_notification_shown_tag", "").apply();
    }

    public anzg(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(aii.b(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (!file.createNewFile() || d()) {
                } else {
                    b();
                }
            } catch (IOException unused) {
            }
        }
    }
}
