package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvh extends hsh {
    public final hxq e;

    public hvh(Context context, hxq hxqVar) {
        super(context);
        this.e = hxqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hsh
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((ReelEditModel) obj).d().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hsh
    public final /* bridge */ /* synthetic */ hsn b(Object obj, int i) {
        Boolean bool;
        ReelEditModel reelEditModel = (ReelEditModel) obj;
        final ReelItemEditModel reelItemEditModel = (ReelItemEditModel) reelEditModel.d().get(i);
        vsy h = reelItemEditModel.h();
        long k = h.K() ? h.k() - h.m() : TimeUnit.MICROSECONDS.toMillis(reelItemEditModel.c().g);
        hsm hsmVar = new hsm(null);
        hsmVar.a = reelItemEditModel.d().f ? amlr.a : ammv.j(Long.valueOf(k));
        hsmVar.c = Boolean.valueOf(i == reelEditModel.a());
        hsmVar.b = new azrw() { // from class: hvg
            @Override // defpackage.azrw
            public final Object get() {
                ammv ammvVar;
                Integer num;
                hvh hvhVar = hvh.this;
                ReelItemEditModel reelItemEditModel2 = reelItemEditModel;
                if (reelItemEditModel2.d().f) {
                    hxq hxqVar = hvhVar.e;
                    Uri uri = reelItemEditModel2.c().a;
                    uri.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        ammvVar = hxqVar.a(uri);
                    } else {
                        try {
                            ammvVar = ammv.i(MediaStore.Images.Media.getBitmap(hxqVar.a.getContentResolver(), uri));
                        } catch (IOException e) {
                            afsi.c(1, 24, "Failed loading thumbnail", e);
                            ammvVar = amlr.a;
                        }
                    }
                } else {
                    hxq hxqVar2 = hvhVar.e;
                    Uri uri2 = reelItemEditModel2.c().a;
                    long n = reelItemEditModel2.h().n();
                    boolean z = !reelItemEditModel2.d().e;
                    uri2.getClass();
                    if (Build.VERSION.SDK_INT < 29 || n > 0 || !z) {
                        hxqVar2.b.setDataSource(hxqVar2.a, uri2);
                        try {
                            ammvVar = ammv.i(hxqVar2.b.getFrameAtTime(n, 0));
                        } catch (SecurityException e2) {
                            afsi.c(1, 24, "Failed loading thumbnail", e2);
                            ammvVar = amlr.a;
                        }
                    } else {
                        ammvVar = hxqVar2.a(uri2);
                    }
                }
                if (!ammvVar.h()) {
                    return ammvVar;
                }
                hxh hxhVar = new hxh();
                hxhVar.a = (Bitmap) ammvVar.c();
                hxhVar.f = Integer.valueOf(hvhVar.d);
                hxhVar.d = Integer.valueOf(hvhVar.c);
                hxhVar.e = 0;
                hxhVar.b = Integer.valueOf(hvhVar.a);
                hxhVar.c = Integer.valueOf(hvhVar.b);
                Bitmap bitmap = hxhVar.a;
                if (bitmap == null || (num = hxhVar.b) == null || hxhVar.c == null || hxhVar.d == null || hxhVar.e == null || hxhVar.f == null) {
                    StringBuilder sb = new StringBuilder();
                    if (hxhVar.a == null) {
                        sb.append(" bitmap");
                    }
                    if (hxhVar.b == null) {
                        sb.append(" targetWidth");
                    }
                    if (hxhVar.c == null) {
                        sb.append(" targetHeight");
                    }
                    if (hxhVar.d == null) {
                        sb.append(" cornerRadius");
                    }
                    if (hxhVar.e == null) {
                        sb.append(" borderWidth");
                    }
                    if (hxhVar.f == null) {
                        sb.append(" borderColor");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                hxi hxiVar = new hxi(bitmap, num.intValue(), hxhVar.c.intValue(), hxhVar.d.intValue(), hxhVar.e.intValue(), hxhVar.f.intValue());
                Bitmap bitmap2 = hxiVar.a;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    return amlr.a;
                }
                Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(hxiVar.a, hxiVar.b, hxiVar.c, 0);
                int width = extractThumbnail.getWidth() + hxiVar.e;
                int height = extractThumbnail.getHeight() + hxiVar.e;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                BitmapShader bitmapShader = new BitmapShader(extractThumbnail, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                if (hxiVar.e > 0) {
                    paint.setShader(null);
                    paint.setColor(hxiVar.f);
                    RectF rectF = new RectF(0.0f, 0.0f, width, height);
                    float f = hxiVar.d;
                    canvas.drawRoundRect(rectF, f, f, paint);
                }
                int i2 = hxiVar.e / 2;
                paint.setShader(bitmapShader);
                float f2 = i2;
                RectF rectF2 = new RectF(f2, f2, width - i2, height - i2);
                float f3 = hxiVar.d;
                canvas.drawRoundRect(rectF2, f3, f3, paint);
                return ammv.j(createBitmap);
            }
        };
        azrw azrwVar = hsmVar.b;
        if (azrwVar == null || (bool = hsmVar.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (hsmVar.b == null) {
                sb.append(" thumbnailBitmapProvider");
            }
            if (hsmVar.c == null) {
                sb.append(" isSelected");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new hsn(hsmVar.a, azrwVar, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hsh
    public final /* bridge */ /* synthetic */ ammv c(Object obj) {
        return ammv.j(Integer.valueOf(((ReelEditModel) obj).a()));
    }
}
