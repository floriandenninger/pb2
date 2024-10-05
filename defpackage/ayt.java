package defpackage;

import android.media.MediaDrm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayt {
    public static int a(Throwable th) {
        return plh.b(pts.h(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }

    public static boolean b(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static final bda c(bda... bdaVarArr) {
        return new bbd(bdaVarArr);
    }
}
