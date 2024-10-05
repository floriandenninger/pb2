package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sde implements AutoCloseable {
    public final ExperienceJni a;

    public sde(ExperienceJni experienceJni) {
        this.a = experienceJni;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ExperienceJni experienceJni = this.a;
        long j = experienceJni.b;
        if (j != 0) {
            experienceJni.nativeDestroy(j);
            experienceJni.b = 0L;
        }
    }
}
