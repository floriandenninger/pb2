package defpackage;

import android.database.sqlite.SQLiteDiskIOException;
import android.os.Environment;
import android.os.StatFs;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akrc implements Thread.UncaughtExceptionHandler {
    static final String a = zga.a("LowStorage");
    Thread.UncaughtExceptionHandler b;
    private final aadw c;

    public akrc(aadw aadwVar) {
        this.c = aadwVar;
    }

    public final void a() {
        this.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        avdj avdjVar = this.c.b().u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        if (avdjVar.i) {
            try {
                if ((th instanceof SQLiteDiskIOException) && th.getMessage() != null && th.getMessage().contains("code 4874")) {
                    String str = a;
                    StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                    long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                    StringBuilder sb = new StringBuilder(81);
                    sb.append("Caught exception for low storage space with bytes available: ");
                    sb.append(availableBlocksLong);
                    zga.m(str, sb.toString());
                }
            } catch (RuntimeException e) {
                String str2 = a;
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 31);
                sb2.append("Could not get available bytes: ");
                sb2.append(valueOf);
                zga.m(str2, sb2.toString());
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
