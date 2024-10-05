package defpackage;

import android.opengl.EGLContext;
import org.webrtc.EglBase10Impl;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class baoe {
    static {
        Object obj = baom.b;
    }

    public static int a(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            if (iArr[i] == 12352) {
                int i2 = iArr[i + 1];
                if (i2 != 4) {
                    return i2 != 64 ? 1 : 3;
                }
                return 2;
            }
        }
        return 1;
    }

    public static baof b() {
        return new baof();
    }

    public static baoj c(EGLContext eGLContext, int[] iArr) {
        return new baol(eGLContext, iArr);
    }

    public static baom d(baog baogVar, int[] iArr) {
        if (baogVar == null) {
            int i = baol.a;
            boolean z = baol.a >= 18;
            StringBuilder sb = new StringBuilder(49);
            sb.append("SDK version: ");
            sb.append(i);
            sb.append(". isEGL14Supported: ");
            sb.append(z);
            Logging.a("EglBase14Impl", sb.toString());
            if (baol.a < 18) {
                return new EglBase10Impl(null, iArr);
            }
            return new baol(null, iArr);
        }
        if (baogVar instanceof baok) {
            return new baol(((baok) baogVar).a, iArr);
        }
        if (baogVar instanceof baoh) {
            return new EglBase10Impl(((baoh) baogVar).a(), iArr);
        }
        throw new IllegalArgumentException("Unrecognized Context");
    }
}
