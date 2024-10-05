package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abrx {
    private final File a;
    private final shf b;

    public abrx(Context context, shf shfVar) {
        this.b = shfVar;
        File file = new File(context.getFilesDir(), "livecreation");
        this.a = file;
        file.mkdir();
    }

    public static byte[] f(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    public final Bitmap a(String str) {
        yjk.e();
        try {
            return BitmapFactory.decodeStream(new FileInputStream(b(str)));
        } catch (FileNotFoundException e) {
            zga.d("Failed to load thumbnail.", e);
            return null;
        }
    }

    public final File b(String str) {
        return new File(this.a, String.valueOf(str).concat(".jpg"));
    }

    public final void c() {
        yjk.e();
        for (File file : this.a.listFiles()) {
            file.delete();
        }
    }

    public final void d(String str, ajjz ajjzVar, Uri uri, long j, ykl yklVar) {
        File b = b(str);
        if (!b.exists() || this.b.c() - b.lastModified() >= j) {
            ajjzVar.l(uri, new abrw(this, str, yklVar));
            return;
        }
        Bitmap a = a(str);
        if (a != null) {
            yklVar.b(uri, a);
        } else {
            yklVar.a(uri, new FileNotFoundException());
        }
    }

    public final boolean e(Bitmap bitmap, String str) {
        FileOutputStream fileOutputStream;
        yjk.e();
        byte[] f = f(bitmap);
        File b = b(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (!b.exists()) {
                    b.createNewFile();
                }
                fileOutputStream = new FileOutputStream(b);
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(f, 0, f.length);
            try {
                fileOutputStream.close();
                return true;
            } catch (IOException unused2) {
                zga.b("Failed to close output stream.");
                return true;
            }
        } catch (IOException unused3) {
            fileOutputStream2 = fileOutputStream;
            zga.b("Failed to save bitmap.");
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
                zga.b("Failed to close output stream.");
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            try {
                fileOutputStream2.close();
            } catch (IOException unused5) {
                zga.b("Failed to close output stream.");
            }
            throw th;
        }
    }
}
