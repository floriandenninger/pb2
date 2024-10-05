package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anwu {
    final SharedPreferences a;
    final Context b;
    private final Map c = new adz();

    public anwu(Context context) {
        this.b = context;
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

    static String e(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    private static final String g(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + str3.length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public final synchronized anwt a(String str, String str2, String str3) {
        return anwt.a(this.a.getString(g(str, str2, str3), null));
    }

    public final synchronized void b() {
        this.c.clear();
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3, String str4, String str5) {
        String b = anwt.b(str4, str5, System.currentTimeMillis());
        if (b == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(g(str, str2, str3), b);
        edit.commit();
    }

    public final synchronized boolean d() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized void f(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.a.contains(e(str))) {
            String string = this.a.getString(e(str), null);
            if (string != null) {
                try {
                    currentTimeMillis = Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
            currentTimeMillis = 0;
        } else {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(e(str), String.valueOf(currentTimeMillis));
            edit.commit();
        }
        this.c.put(str, Long.valueOf(currentTimeMillis));
    }
}
