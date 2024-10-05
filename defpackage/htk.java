package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import android.provider.MediaStore;
import com.google.android.libraries.youtube.edit.common.AutoValue_DeviceLocalFile;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class htk extends AsyncTask {
    private final WeakReference a;

    public htk(htl htlVar) {
        this.a = new WeakReference(htlVar);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        htl htlVar = (htl) this.a.get();
        if (htlVar == null || !etx.S(htlVar)) {
            return null;
        }
        Context qR = htlVar.qR();
        zoj zojVar = qR == null ? null : new zoj(qR);
        if (zojVar == null) {
            htlVar.ah = true;
            return null;
        }
        DeviceLocalFile a = zojVar.a(zojVar.e(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, (String[]) zoj.c.toArray(new String[0])), 1);
        DeviceLocalFile b = zojVar.b();
        if (a != null || b != null) {
            if (b != null) {
                if (a != null) {
                    try {
                        if (((AutoValue_DeviceLocalFile) a).d >= ((AutoValue_DeviceLocalFile) b).d) {
                        }
                    } catch (Exception unused) {
                        zga.b("Failed getting photo/video thumbnail as gallery button icon");
                        return null;
                    }
                }
                a = b;
            }
            Bitmap extractThumbnail = ThumbnailUtils.extractThumbnail(zwr.a(htlVar.qR(), a, null), 96, 96, 2);
            if (extractThumbnail != null && !extractThumbnail.isRecycled()) {
                int width = extractThumbnail.getWidth() + 5;
                int height = extractThumbnail.getHeight() + 5;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                BitmapShader bitmapShader = new BitmapShader(extractThumbnail, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(null);
                paint.setColor(-1);
                int dimension = (int) (htlVar.qX().getDimension(R.dimen.reels_camera_gallery_waiting_icon_corner_radius) / 1.2f);
                int dimension2 = (int) (htlVar.qX().getDimension(R.dimen.reels_camera_gallery_waiting_icon_stroke_width) / 1.2f);
                float f = dimension;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), f, f, paint);
                paint.setShader(bitmapShader);
                float f2 = dimension2;
                canvas.drawRoundRect(new RectF(f2, f2, width - dimension2, height - dimension2), f, f, paint);
                return createBitmap;
            }
            return null;
        }
        htlVar.ah = true;
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        htl htlVar = (htl) this.a.get();
        if (htlVar == null || !etx.S(htlVar)) {
            return;
        }
        if (!htlVar.ah) {
            htlVar.aq.setEnabled(true);
            whu.I(htlVar.aq, true ^ htlVar.am.I());
            htlVar.c.n(new acqx(acsb.c(39304)));
            htlVar.c.w(new acqx(acsb.c(39304)), null);
            if (bitmap == null) {
                htlVar.aq.setImageDrawable(htlVar.qX().getDrawable(R.drawable.reel_gallery_button_waiting_icon_v2));
                return;
            } else {
                htlVar.aq.setImageBitmap(bitmap);
                return;
            }
        }
        htlVar.aq.setEnabled(false);
    }
}
