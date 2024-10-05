package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ica {
    public final ajjz b;
    public final ffv c;
    public final Executor d;
    public final icn e;
    private final Map g = DesugarCollections.synchronizedMap(new HashMap());
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public int f = 3;

    public ica(Context context, ajjz ajjzVar, Executor executor, icn icnVar) {
        this.b = ajjzVar;
        this.d = executor;
        this.e = icnVar;
        this.c = new ffv(context);
    }

    public static boolean c(Uri uri) {
        return uri.getLastPathSegment().endsWith(".png");
    }

    public static byte[] d(byte[] bArr, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        aekb aekbVar = new aekb(null, null);
        decodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, aekbVar);
        return aekbVar.toByteArray();
    }

    public final void a(final Uri uri, final ykl yklVar) {
        if (uri == null) {
            yklVar.a(Uri.EMPTY, new NullPointerException());
            return;
        }
        if (this.g.containsKey(uri)) {
            try {
                yklVar.b(uri, this.c.b((byte[]) this.g.get(uri)));
                return;
            } catch (zjg e) {
                yklVar.a(uri, e);
                return;
            }
        }
        final ykn c = ykn.c(yklVar);
        this.a.put(uri, c);
        final int i = this.f;
        this.d.execute(new Runnable() { // from class: ibx
            @Override // java.lang.Runnable
            public final void run() {
                ammv ammvVar;
                ica icaVar = ica.this;
                Uri uri2 = uri;
                int i2 = i;
                ykn yknVar = c;
                ykl yklVar2 = yklVar;
                icn icnVar = icaVar.e;
                String lastPathSegment = uri2.getLastPathSegment();
                yjk.e();
                if (!icnVar.a.h() || lastPathSegment == null) {
                    ammvVar = amlr.a;
                } else {
                    zom zomVar = (zom) icnVar.a.c();
                    yjk.e();
                    File file = zomVar.a;
                    byte[] bArr = null;
                    if (file != null) {
                        try {
                            File file2 = new File(file, lastPathSegment);
                            if (file2.exists()) {
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = fileInputStream.read(bArr2);
                                    if (read <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    }
                                }
                                bArr = byteArrayOutputStream.toByteArray();
                            }
                        } catch (IOException | SecurityException e2) {
                            zga.d("Error getting file", e2);
                        }
                    }
                    ammvVar = ammv.i(bArr);
                }
                if (!ammvVar.h()) {
                    icaVar.b.m(uri2, new ibz(icaVar, yknVar, uri2, icaVar.f));
                    return;
                }
                byte[] bArr3 = (byte[]) ammvVar.c();
                if (ica.c(uri2)) {
                    bArr3 = ica.d((byte[]) ammvVar.c(), i2);
                }
                icaVar.b(uri2, bArr3);
                try {
                    yknVar.b(uri2, icaVar.c.b(bArr3));
                } catch (zjg e3) {
                    yklVar2.a(uri2, e3);
                }
            }
        });
    }

    public final void b(Uri uri, byte[] bArr) {
        this.g.put(uri, bArr);
    }
}
