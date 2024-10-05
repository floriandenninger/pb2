package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxf implements cqq {
    public static final cqm a = cqm.c("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final cqm b = cqm.b("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final ctk c;

    @Deprecated
    public cxf() {
        this.c = null;
    }

    public cxf(ctk ctkVar) {
        this.c = ctkVar;
    }

    @Override // defpackage.cpx
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cqn cqnVar) {
        Bitmap bitmap = (Bitmap) ((ctd) obj).c();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) cqnVar.b(b);
        if (compressFormat == null) {
            if (bitmap.hasAlpha()) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        }
        bitmap.getWidth();
        bitmap.getHeight();
        ddi.b();
        int intValue = ((Integer) cqnVar.b(a)).intValue();
        OutputStream outputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ctk ctkVar = this.c;
                outputStream = ctkVar != null ? new cqu(fileOutputStream, ctkVar) : fileOutputStream;
                bitmap.compress(compressFormat, intValue, outputStream);
                outputStream.close();
                try {
                    outputStream.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (IOException unused2) {
                outputStream = fileOutputStream;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                outputStream = fileOutputStream;
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.cqq
    public final int b() {
        return 2;
    }
}
