package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajhs implements ykl {
    public final Context a;
    public final ImageView b;
    public final aoam c;
    private final szn d;
    private final afri e;
    private final ajjn f;
    private final shf g;
    private final syd h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final ykl j;

    public ajhs(aoam aoamVar, Context context, ImageView imageView, szn sznVar, afri afriVar, ajjn ajjnVar, shf shfVar, ykl yklVar, syd sydVar) {
        this.c = aoamVar;
        this.a = context;
        this.b = imageView;
        this.d = sznVar;
        this.e = afriVar;
        this.f = ajjnVar;
        this.g = shfVar;
        this.j = yklVar;
        this.h = sydVar;
    }

    public static Uri c(Uri uri) {
        return uri.buildUpon().appendQueryParameter("bitmap", "true").build();
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
        if (this.c != null) {
            if (this.i.get()) {
                return;
            }
            final aoam aoamVar = this.c;
            this.b.post(new Runnable() { // from class: ajhr
                @Override // java.lang.Runnable
                public final void run() {
                    ajhs ajhsVar = ajhs.this;
                    ahbn.m(aoamVar, ajhsVar.b, ajhsVar.a);
                }
            });
        }
        ykl yklVar = this.j;
        if (yklVar != null) {
            yklVar.a(uri, exc);
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        byte[] bArr = (byte[]) obj2;
        ykl yklVar = this.j;
        if (yklVar != null) {
            yklVar.b(uri, bArr);
        }
        Uri c = c(uri);
        try {
            Drawable drawable = (Drawable) this.e.b(bArr);
            if (!(drawable instanceof BitmapDrawable)) {
                if (drawable instanceof FrameSequenceDrawable) {
                    final FrameSequenceDrawable frameSequenceDrawable = (FrameSequenceDrawable) drawable;
                    final szn sznVar = this.d;
                    if (this.i.get()) {
                        return;
                    }
                    this.b.post(new Runnable() { // from class: ajhq
                        @Override // java.lang.Runnable
                        public final void run() {
                            ajhs ajhsVar = ajhs.this;
                            FrameSequenceDrawable frameSequenceDrawable2 = frameSequenceDrawable;
                            szn sznVar2 = sznVar;
                            ajhsVar.b.setImageDrawable(frameSequenceDrawable2);
                            sznVar2.b(frameSequenceDrawable2);
                            sznVar2.c();
                        }
                    });
                    return;
                }
                aoam aoamVar = this.c;
                if (aoamVar != null) {
                    ahbn.m(aoamVar, this.b, this.a);
                }
                syd sydVar = this.h;
                String valueOf = String.valueOf(drawable == null ? "null" : drawable.getClass().getName());
                sydVar.b(28, valueOf.length() != 0 ? "Failed to decode Animated Drawable in ByteImageLoadListener. Expected FrameSequenceDrawable or BitmapDrawable, but got ".concat(valueOf) : new String("Failed to decode Animated Drawable in ByteImageLoadListener. Expected FrameSequenceDrawable or BitmapDrawable, but got "));
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            this.f.b().d(c, new afpz(bitmapDrawable.getBitmap(), this.g.c()));
            d(bitmapDrawable.getBitmap());
        } catch (IOException | zjg unused) {
            aoam aoamVar2 = this.c;
            if (aoamVar2 != null) {
                ahbn.m(aoamVar2, this.b, this.a);
            }
        }
    }

    public final void d(final Bitmap bitmap) {
        if (this.i.get()) {
            return;
        }
        this.b.post(new Runnable() { // from class: ajhp
            @Override // java.lang.Runnable
            public final void run() {
                ajhs ajhsVar = ajhs.this;
                Bitmap bitmap2 = bitmap;
                if (bitmap2 != null) {
                    ajhsVar.b.setImageBitmap(bitmap2);
                    return;
                }
                aoam aoamVar = ajhsVar.c;
                if (aoamVar != null) {
                    ahbn.m(aoamVar, ajhsVar.b, ajhsVar.a);
                }
            }
        });
    }

    public final void e() {
        this.i.set(true);
    }
}
