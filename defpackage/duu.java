package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class duu extends YogaNodeJNIBase {
    public duu() {
        super(YogaNative.jni_YGNodeNew());
    }

    protected final void finalize() {
        try {
            long j = this.a;
            if (j != 0) {
                this.a = 0L;
                YogaNative.jni_YGNodeFree(j);
            }
        } finally {
            super.finalize();
        }
    }

    public duu(dus dusVar) {
        super(YogaNative.jni_YGNodeNewWithConfig(dusVar.a));
    }
}
