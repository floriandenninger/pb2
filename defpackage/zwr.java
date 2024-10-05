package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Size;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwr {
    private static final Point a = new Point(512, 384);

    public static Bitmap a(Context context, DeviceLocalFile deviceLocalFile, CancellationSignal cancellationSignal) {
        File file;
        Bitmap bitmap;
        context.getClass();
        deviceLocalFile.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = false;
        Bitmap bitmap2 = null;
        if (deviceLocalFile.a() == 2) {
            try {
                file = new File(URI.create(deviceLocalFile.f().toString()));
            } catch (IllegalArgumentException e) {
                afsi.c(1, 9, "Failed finding bitmap file from Uri", e);
                file = null;
            }
            if (file != null) {
                try {
                    bitmap = BitmapFactory.decodeStream(new FileInputStream(file));
                } catch (FileNotFoundException e2) {
                    afsi.c(1, 9, "Failed opening thumbnail file", e2);
                    bitmap = null;
                }
                if (bitmap != null) {
                    Matrix matrix = new Matrix();
                    RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                    Point point = a;
                    matrix.setRectToRect(rectF, new RectF(0.0f, 0.0f, point.x, point.y), Matrix.ScaleToFit.CENTER);
                    bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 29) {
            try {
                Point point2 = a;
                int max = Math.max(point2.x, point2.y);
                bitmap2 = contentResolver.loadThumbnail(deviceLocalFile.f(), new Size(max, max), cancellationSignal);
                z = true;
            } catch (Exception e3) {
                if (!(e3 instanceof OperationCanceledException)) {
                    afsi.c(1, 9, "Failed loading thumbnail", e3);
                }
            }
        } else if (DocumentsContract.isDocumentUri(context, deviceLocalFile.f())) {
            try {
                bitmap2 = DocumentsContract.getDocumentThumbnail(contentResolver, deviceLocalFile.f(), a, cancellationSignal);
            } catch (Exception e4) {
                afsi.c(1, 9, "Failed retrieving document thumbnail", e4);
            }
        } else if (deviceLocalFile.a() == 0) {
            bitmap2 = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, deviceLocalFile.c(), 1, null);
        } else {
            bitmap2 = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, deviceLocalFile.c(), 1, null);
        }
        return (bitmap2 == null || deviceLocalFile.a() != 1 || z) ? bitmap2 : ahbw.O(bitmap2, contentResolver, deviceLocalFile.f());
    }
}
