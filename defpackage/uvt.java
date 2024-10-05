package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uvt implements uvb {
    private static final Map a = new adz();
    private final SharedPreferences b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (uvt.class) {
            Map map = a;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                uvt uvtVar = (uvt) it.next();
                SharedPreferences sharedPreferences = uvtVar.b;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = uvtVar.c;
                throw null;
            }
            map.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static uvt c() {
        uvt uvtVar;
        if (!slf.f()) {
            synchronized (uvt.class) {
                uvtVar = (uvt) a.get(null);
                if (uvtVar == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return uvtVar;
        }
        throw null;
    }

    @Override // defpackage.uvb
    public final Object b(String str) {
        throw null;
    }
}
