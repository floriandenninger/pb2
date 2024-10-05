package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anzk {
    private static WeakReference a;
    private final SharedPreferences b;
    private anze c;
    private final Executor d;

    private anzk(SharedPreferences sharedPreferences, Executor executor) {
        this.d = executor;
        this.b = sharedPreferences;
    }

    public static synchronized anzk b(Context context, Executor executor) {
        synchronized (anzk.class) {
            WeakReference weakReference = a;
            anzk anzkVar = weakReference != null ? (anzk) weakReference.get() : null;
            if (anzkVar != null) {
                return anzkVar;
            }
            anzk anzkVar2 = new anzk(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
            anzkVar2.e();
            a = new WeakReference(anzkVar2);
            return anzkVar2;
        }
    }

    private final synchronized void e() {
        anze anzeVar = new anze(this.b, this.d);
        synchronized (anzeVar.d) {
            anzeVar.d.clear();
            String string = anzeVar.a.getString(anzeVar.b, "");
            if (!TextUtils.isEmpty(string) && string.contains(anzeVar.c)) {
                String[] split = string.split(anzeVar.c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        anzeVar.d.add(str);
                    }
                }
            }
        }
        this.c = anzeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized anzj a() {
        String str;
        anze anzeVar = this.c;
        synchronized (anzeVar.d) {
            str = (String) anzeVar.d.peek();
        }
        return anzj.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(anzj anzjVar) {
        anze anzeVar = this.c;
        String str = anzjVar.c;
        if (!TextUtils.isEmpty(str) && !str.contains(anzeVar.c)) {
            synchronized (anzeVar.d) {
                anzeVar.a(anzeVar.d.add(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(anzj anzjVar) {
        anze anzeVar = this.c;
        String str = anzjVar.c;
        synchronized (anzeVar.d) {
            anzeVar.a(anzeVar.d.remove(str));
        }
    }
}
