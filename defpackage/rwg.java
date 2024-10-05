package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum rwg {
    CLIP_PATH(17),
    CLIP_RECT(17),
    PATH_EFFECT(1000);

    private final int e;

    rwg(int i) {
        this.e = i;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= this.e;
    }
}
