package defpackage;

import android.content.SharedPreferences;
import android.os.StatFs;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agsm {
    public final SharedPreferences a;
    public final afsy b;
    public final azrw c;
    private final aadw d;

    public agsm(SharedPreferences sharedPreferences, aadw aadwVar, afsy afsyVar, azrw azrwVar) {
        this.a = sharedPreferences;
        this.d = aadwVar;
        this.b = afsyVar;
        this.c = azrwVar;
    }

    public final long a() {
        agna a;
        agej b = ((agof) this.c.get()).a().b();
        if (b == null || (a = b.a()) == null) {
            return 0L;
        }
        return Math.max(0L, a.a());
    }

    public final long b() {
        agej b = ((agof) this.c.get()).a().b();
        if (b == null) {
            return 0L;
        }
        return c(b.d());
    }

    public final long c(File file) {
        if (file == null) {
            return 0L;
        }
        return wbs.aB(this.d.b(), file);
    }

    public final long d() {
        File d;
        agej b = ((agof) this.c.get()).a().b();
        long j = 0;
        if (b == null || (d = b.d()) == null) {
            return 0L;
        }
        apwy b2 = this.d.b();
        if (d.exists()) {
            try {
                StatFs statFs = new StatFs(d.getAbsolutePath());
                j = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
            } catch (IllegalArgumentException unused) {
            }
        }
        return wbs.aA(j, b2);
    }
}
