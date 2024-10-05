package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anyr {
    final /* synthetic */ FirebaseMessaging a;
    private final anwd b;
    private boolean c;
    private anwb d;
    private Boolean e;

    public anyr(FirebaseMessaging firebaseMessaging, anwd anwdVar) {
        this.a = firebaseMessaging;
        this.b = anwdVar;
    }

    final synchronized void a() {
        ApplicationInfo applicationInfo;
        if (this.c) {
            return;
        }
        Context a = this.a.c.a();
        SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
        Boolean bool = null;
        if (sharedPreferences.contains("auto_init")) {
            bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.e = bool;
        if (bool == null) {
            anwb anwbVar = new anwb() { // from class: anyq
                @Override // defpackage.anwb
                public final void a(anwa anwaVar) {
                    anyr anyrVar = anyr.this;
                    if (anyrVar.b()) {
                        anyrVar.a.h();
                    }
                }
            };
            this.d = anwbVar;
            this.b.b(ansv.class, anwbVar);
        }
        this.c = true;
    }

    public final synchronized boolean b() {
        boolean j;
        a();
        Boolean bool = this.e;
        if (bool != null) {
            j = bool.booleanValue();
        } else {
            j = this.a.c.j();
        }
        return j;
    }
}
