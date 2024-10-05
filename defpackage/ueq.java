package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ueq {
    public final WeakReference a;
    public final Object b;
    public final uix c;
    public boolean d;
    private final Executor e;

    public ueq(Object obj, uix uixVar, ImageView imageView, Executor executor) {
        imageView.getClass();
        this.a = new WeakReference(imageView);
        this.c = uixVar;
        this.b = obj;
        this.e = executor;
    }

    public final Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        amru amruVar = this.c.c;
        if (amruVar != null && !amruVar.isEmpty()) {
            int i = ((amvj) amruVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                uiw uiwVar = (uiw) amruVar.get(i2);
                uiw uiwVar2 = uiw.a;
                if (uiwVar.ordinal() == 0) {
                    Map map = uer.a;
                    int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    float f = min / 2;
                    canvas.drawCircle(f, f, f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, (min - r3) / 2, (min - r4) / 2, paint);
                    bitmap = createBitmap;
                }
            }
        }
        return bitmap;
    }

    public final void b() {
        uqq.j();
        ImageView imageView = (ImageView) this.a.get();
        if (this.d || imageView == null) {
            return;
        }
        uer.a(imageView, null);
    }

    public final void c(Runnable runnable) {
        if (uqq.n()) {
            this.e.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void d(final Drawable drawable, boolean z) {
        e(new ueg() { // from class: ueh
            @Override // defpackage.ueg
            public final Drawable a() {
                return drawable;
            }
        }, z);
    }

    public final void e(ueg uegVar, boolean z) {
        final ImageView imageView = (ImageView) this.a.get();
        if (this.d || imageView == null) {
            return;
        }
        final uep uepVar = new uep(this, uegVar, z);
        imageView.addOnAttachStateChangeListener(uepVar);
        if (jw.aj(imageView)) {
            imageView.post(new Runnable() { // from class: uel
                @Override // java.lang.Runnable
                public final void run() {
                    uepVar.onViewAttachedToWindow(imageView);
                }
            });
        }
    }
}
