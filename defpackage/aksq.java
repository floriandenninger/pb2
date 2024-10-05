package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksq {
    public final File a;
    public boolean b = false;

    public aksq(Context context) {
        this.a = new File(context.getCacheDir(), "anr_detection.journal");
    }
}
