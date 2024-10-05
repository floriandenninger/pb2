package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzv {
    private Object a;
    private WeakReference b;
    private boolean c = false;
    private boolean d = true;

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized Object a() {
        if (!this.c) {
            this.c = true;
            uzx.a(this);
        }
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        WeakReference weakReference = this.b;
        Paint paint = weakReference == null ? 0 : weakReference.get();
        if (paint == 0) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
            if (this.d) {
                this.a = paint;
                this.b = null;
            } else {
                this.b = new WeakReference(paint);
            }
        }
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(int i) {
        boolean z = i < 20;
        if (z == this.d) {
            return;
        }
        this.d = z;
        if (!z) {
            Object obj = this.a;
            if (obj != null) {
                this.b = new WeakReference(obj);
                this.a = null;
            }
        } else if (this.a == null) {
            WeakReference weakReference = this.b;
            Object obj2 = weakReference == null ? null : weakReference.get();
            if (obj2 != null) {
                this.a = obj2;
            } else {
                this.b = null;
            }
        }
    }
}
