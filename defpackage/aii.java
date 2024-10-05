package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aii {
    public static Drawable a(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File b(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static int c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static float d(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }
}
