package defpackage;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import java.lang.ref.SoftReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alto extends Drawable {
    private static SoftReference a;
    private static Path[] b;
    private static int[] c;
    private final int d;
    private final Paint e = new Paint(1);

    public alto(int i) {
        this.d = Color.argb(204, Color.red(i), Color.green(i), Color.blue(i));
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
    
        if (r8 < 1152.0f) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r7 < 2049.0f) goto L17;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alto.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
