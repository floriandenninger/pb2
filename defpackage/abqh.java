package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.IntBuffer;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class abqh implements abrp, abqx {
    protected final abqy a = new abqy(this);
    protected abqg b;
    private int[] c;
    private IntBuffer d;

    @Override // defpackage.abqx
    public final void a(int i) {
    }

    @Override // defpackage.abqx
    public synchronized void b() {
        abqy abqyVar = this.a;
        int i = abqyVar.a;
        int i2 = abqyVar.b;
        int[] iArr = this.c;
        int i3 = 0;
        if (iArr == null || iArr.length < i * i2) {
            int i4 = i * i2;
            int[] iArr2 = new int[i4];
            this.c = iArr2;
            this.d = IntBuffer.wrap(iArr2, 0, i4);
        }
        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, this.d);
        while (true) {
            int[] iArr3 = this.c;
            if (i3 >= iArr3.length) {
                break;
            }
            int i5 = iArr3[i3];
            iArr3[i3] = ((i5 & PrivateKeyType.INVALID) << 16) | ((-16711936) & i5) | ((i5 >> 16) & PrivateKeyType.INVALID);
            i3++;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.c, (i2 - 1) * i, -i, i, i2, Bitmap.Config.ARGB_8888);
        abqg abqgVar = this.b;
        Matrix matrix = new Matrix();
        if (((acld) abqgVar).a) {
            matrix.postScale(-1.0f, 1.0f);
        }
        ((acld) abqgVar).f.c.runOnUiThread(new aclc((acld) abqgVar, Bitmap.createBitmap(createBitmap, ((acld) abqgVar).b, ((acld) abqgVar).c, ((acld) abqgVar).d.x, ((acld) abqgVar).d.y, matrix, true)));
    }

    @Override // defpackage.abrp
    public final void c(abqu abquVar) {
        this.a.a();
    }

    public final synchronized void d(abqg abqgVar) {
        this.b = abqgVar;
    }

    @Override // defpackage.abrp
    public synchronized boolean e(boolean z, abrr abrrVar, abqu abquVar) {
        boolean z2;
        if (this.b != null) {
            this.a.e(z, abrrVar, abquVar);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }
}
