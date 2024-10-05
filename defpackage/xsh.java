package defpackage;

import android.content.Context;
import com.google.mediapipe.framework.Graph;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xsh {
    public final Context a;
    public Graph b;

    static {
        try {
            System.loadLibrary("drishti_jni_native");
        } catch (UnsatisfiedLinkError unused) {
            zga.b("Failed to load drishti_jni_native");
        }
    }

    public xsh(Context context) {
        this.a = context;
    }
}
