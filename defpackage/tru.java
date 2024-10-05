package defpackage;

import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tru {
    public final Executor a;

    public tru(Executor executor) {
        this.a = executor;
    }

    public tru(Executor executor, byte[] bArr) {
        this.a = executor;
    }

    public tru(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    public final void a(File file) {
        try {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    a(file2);
                }
            }
            file.delete();
        } catch (Exception e) {
            String valueOf = String.valueOf(file.getPath());
            zga.d(valueOf.length() != 0 ? "Error attempting to delete ".concat(valueOf) : new String("Error attempting to delete "), e);
        }
    }
}
