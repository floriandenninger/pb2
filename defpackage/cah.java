package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cah {
    public static final String a = ajbh.S("WrkDbPathHelper");
    public static final String[] b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    public static String b() {
        return "androidx.work.workdb";
    }
}
