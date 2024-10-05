package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alra {
    public final Context a;

    public alra(Context context) {
        this.a = context;
    }

    public final SharedPreferences a() {
        return this.a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    public final Set b() {
        Set<String> hashSet;
        synchronized (alra.class) {
            try {
                hashSet = a().getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }
}
