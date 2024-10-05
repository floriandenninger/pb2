package com.google.android.libraries.youtube.systemhealth.termination;

import android.content.Context;
import defpackage.acpl;
import defpackage.afsi;
import defpackage.aktq;
import defpackage.avdv;
import defpackage.yny;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NativeCrashDetector {
    public final aktq a;
    public final acpl b;
    private final Context c;

    public NativeCrashDetector(Context context, aktq aktqVar, acpl acplVar) {
        this.c = context;
        this.a = aktqVar;
        this.b = acplVar;
    }

    private native void setupCrashDetector(String str, long j);

    public final File a() {
        File filesDir = this.c.getFilesDir();
        String str = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("systemhealth");
        sb.append(str);
        sb.append("nativecrash");
        return new File(filesDir, sb.toString());
    }

    public final void b() {
        avdv avdvVar = this.a.get().l;
        if (avdvVar == null) {
            avdvVar = avdv.a;
        }
        if (avdvVar.b) {
            try {
                yny.g(this.c, "nativecrashdetector");
                setupCrashDetector(a().getAbsolutePath(), 0L);
            } catch (UnsatisfiedLinkError e) {
                afsi.c(1, 27, "Unable to link native crash library.", e);
            }
        }
    }
}
