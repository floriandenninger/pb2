package org.chromium.base.memory;

import android.os.Debug;
import defpackage.badx;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class JavaHeapDumpGenerator {
    private JavaHeapDumpGenerator() {
    }

    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            badx.e("JavaHprofGenerator", "Error writing to file " + str + ". Error: " + e.getMessage(), new Object[0]);
            return false;
        }
    }
}
