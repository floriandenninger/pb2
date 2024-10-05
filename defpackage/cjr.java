package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjr extends cjp {
    private final Paint h;
    private final Rect i;
    private final Rect j;
    private chk k;
    private chk l;

    public cjr(cfz cfzVar, cjs cjsVar) {
        super(cfzVar, cjsVar);
        this.h = new cgl(3);
        this.i = new Rect();
        this.j = new Rect();
    }

    private final Bitmap p() {
        cib cibVar;
        Bitmap bitmap;
        chk chkVar = this.l;
        if (chkVar != null && (bitmap = (Bitmap) chkVar.e()) != null) {
            return bitmap;
        }
        String str = this.c.f;
        cfz cfzVar = this.b;
        if (cfzVar.getCallback() == null) {
            cibVar = null;
        } else {
            cib cibVar2 = cfzVar.g;
            if (cibVar2 != null) {
                Drawable.Callback callback = cfzVar.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                if ((context != null || cibVar2.a != null) && !cibVar2.a.equals(context)) {
                    cfzVar.g = null;
                }
            }
            if (cfzVar.g == null) {
                cfzVar.g = new cib(cfzVar.getCallback(), cfzVar.h, cfzVar.a.b);
            }
            cibVar = cfzVar.g;
        }
        if (cibVar == null) {
            cfj cfjVar = cfzVar.a;
            cga cgaVar = cfjVar == null ? null : (cga) cfjVar.b.get(str);
            if (cgaVar == null) {
                return null;
            }
            return cgaVar.e;
        }
        cga cgaVar2 = (cga) cibVar.c.get(str);
        if (cgaVar2 == null) {
            return null;
        }
        Bitmap bitmap2 = cgaVar2.e;
        if (bitmap2 != null) {
            return bitmap2;
        }
        String str2 = cgaVar2.d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                cibVar.a(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e) {
                cll.b("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(cibVar.b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            AssetManager assets = cibVar.a.getAssets();
            String valueOf = String.valueOf(cibVar.b);
            try {
                Bitmap e2 = cls.e(BitmapFactory.decodeStream(assets.open(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf)), null, options), cgaVar2.a, cgaVar2.b);
                cibVar.a(str, e2);
                return e2;
            } catch (IllegalArgumentException e3) {
                cll.b("Unable to decode image.", e3);
                return null;
            }
        } catch (IOException e4) {
            cll.b("Unable to open asset.", e4);
            return null;
        }
    }

    @Override // defpackage.cjp, defpackage.cih
    public final void a(Object obj, clu cluVar) {
        super.a(obj, cluVar);
        if (obj == cge.E) {
            this.k = new chz(cluVar);
        } else if (obj == cge.H) {
            this.l = new chz(cluVar);
        }
    }

    @Override // defpackage.cjp, defpackage.cgq
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        if (p() != null) {
            rectF.set(0.0f, 0.0f, r3.getWidth() * cls.a(), r3.getHeight() * cls.a());
            this.a.mapRect(rectF);
        }
    }

    @Override // defpackage.cjp
    public final void i(Canvas canvas, Matrix matrix, int i) {
        Bitmap p = p();
        if (p == null || p.isRecycled()) {
            return;
        }
        float a = cls.a();
        this.h.setAlpha(i);
        chk chkVar = this.k;
        if (chkVar != null) {
            this.h.setColorFilter((ColorFilter) chkVar.e());
        }
        canvas.save();
        canvas.concat(matrix);
        this.i.set(0, 0, p.getWidth(), p.getHeight());
        this.j.set(0, 0, (int) (p.getWidth() * a), (int) (p.getHeight() * a));
        canvas.drawBitmap(p, this.i, this.j, this.h);
        canvas.restore();
    }
}
