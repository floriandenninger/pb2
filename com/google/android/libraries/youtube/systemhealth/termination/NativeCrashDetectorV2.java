package com.google.android.libraries.youtube.systemhealth.termination;

import defpackage.afsi;
import defpackage.aktg;
import defpackage.yny;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NativeCrashDetectorV2 {
    public final aktg a;

    public NativeCrashDetectorV2(aktg aktgVar) {
        this.a = aktgVar;
    }

    private native void setupCrashDetector(String str, long j);

    public final File a() {
        File filesDir = this.a.b.getFilesDir();
        String str = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("systemhealth");
        sb.append(str);
        sb.append("nativecrash");
        return new File(filesDir, sb.toString());
    }

    public final void b() {
        try {
            yny.g(this.a.b, "nativecrashdetector");
            setupCrashDetector(a().getAbsolutePath(), this.a.c);
        } catch (UnsatisfiedLinkError e) {
            afsi.c(1, 27, "Unable to link native crash library.", e);
        }
    }
}
