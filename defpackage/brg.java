package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class brg {
    public int a;
    private final Bitmap b;
    private final List c;
    private final List d;
    private Rect e;

    public brg(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = 16;
        ArrayList arrayList2 = new ArrayList();
        this.d = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(brj.f);
        this.b = bitmap;
        arrayList.add(brk.a);
        arrayList.add(brk.b);
        arrayList.add(brk.c);
        arrayList.add(brk.d);
        arrayList.add(brk.e);
        arrayList.add(brk.f);
    }

    @Deprecated
    public final AsyncTask a(brh brhVar) {
        gn.g(brhVar);
        return new brf(this, brhVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.b);
    }

    public final brj b() {
        double d;
        bsc[] bscVarArr;
        Bitmap bitmap = this.b;
        int width = bitmap.getWidth() * bitmap.getHeight();
        if (width > 12544) {
            double d2 = width;
            Double.isNaN(d2);
            d = Math.sqrt(12544.0d / d2);
        } else {
            d = -1.0d;
        }
        char c = 0;
        if (d > 0.0d) {
            double width2 = bitmap.getWidth();
            Double.isNaN(width2);
            int ceil = (int) Math.ceil(width2 * d);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            bitmap = Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * d), false);
        }
        Rect rect = this.e;
        if (bitmap != this.b && rect != null) {
            double width3 = bitmap.getWidth();
            double width4 = this.b.getWidth();
            Double.isNaN(width3);
            Double.isNaN(width4);
            double d3 = width3 / width4;
            double d4 = rect.left;
            Double.isNaN(d4);
            rect.left = (int) Math.floor(d4 * d3);
            double d5 = rect.top;
            Double.isNaN(d5);
            rect.top = (int) Math.floor(d5 * d3);
            double d6 = rect.right;
            Double.isNaN(d6);
            rect.right = Math.min((int) Math.ceil(d6 * d3), bitmap.getWidth());
            double d7 = rect.bottom;
            Double.isNaN(d7);
            rect.bottom = Math.min((int) Math.ceil(d7 * d3), bitmap.getHeight());
        }
        int width5 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int[] iArr = new int[width5 * height2];
        bitmap.getPixels(iArr, 0, width5, 0, 0, width5, height2);
        Rect rect2 = this.e;
        if (rect2 != null) {
            int width6 = rect2.width();
            int height3 = this.e.height();
            int[] iArr2 = new int[width6 * height3];
            for (int i = 0; i < height3; i++) {
                System.arraycopy(iArr, ((this.e.top + i) * width5) + this.e.left, iArr2, i * width6, width6);
            }
            iArr = iArr2;
        }
        int i2 = this.a;
        bri briVar = null;
        if (this.d.isEmpty()) {
            bscVarArr = null;
        } else {
            List list = this.d;
            bscVarArr = (bsc[]) list.toArray(new bsc[list.size()]);
        }
        bre breVar = new bre(iArr, i2, bscVarArr, null);
        if (bitmap != this.b) {
            bitmap.recycle();
        }
        brj brjVar = new brj(breVar.c, this.c);
        int size = brjVar.b.size();
        int i3 = 0;
        while (i3 < size) {
            brk brkVar = (brk) brjVar.b.get(i3);
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < 3; i4++) {
                float f3 = brkVar.i[i4];
                if (f3 > 0.0f) {
                    f2 += f3;
                }
            }
            if (f2 != 0.0f) {
                for (int i5 = 0; i5 < 3; i5++) {
                    float[] fArr = brkVar.i;
                    float f4 = fArr[i5];
                    if (f4 > 0.0f) {
                        fArr[i5] = f4 / f2;
                    }
                }
            }
            aeg aegVar = brjVar.c;
            int size2 = brjVar.a.size();
            bri briVar2 = briVar;
            int i6 = 0;
            float f5 = 0.0f;
            while (i6 < size2) {
                bri briVar3 = (bri) brjVar.a.get(i6);
                float[] c2 = briVar3.c();
                float f6 = c2[1];
                float[] fArr2 = brkVar.g;
                if (f6 >= fArr2[c] && f6 <= fArr2[2]) {
                    float f7 = c2[2];
                    float[] fArr3 = brkVar.h;
                    if (f7 >= fArr3[c] && f7 <= fArr3[2] && !brjVar.d.get(briVar3.a)) {
                        float[] c3 = briVar3.c();
                        bri briVar4 = brjVar.e;
                        float c4 = (brkVar.c() > f ? brkVar.c() * (1.0f - Math.abs(c3[1] - brkVar.g[1])) : 0.0f) + (brkVar.a() > f ? brkVar.a() * (1.0f - Math.abs(c3[2] - brkVar.h[1])) : 0.0f) + (brkVar.b() > 0.0f ? brkVar.b() * (briVar3.b / (briVar4 != null ? briVar4.b : 1)) : 0.0f);
                        if (briVar2 == null || c4 > f5) {
                            briVar2 = briVar3;
                            f5 = c4;
                        }
                        i6++;
                        f = 0.0f;
                        c = 0;
                    }
                }
                i6++;
                f = 0.0f;
                c = 0;
            }
            if (briVar2 != null) {
                boolean z = brkVar.j;
                brjVar.d.append(briVar2.a, true);
            }
            aegVar.put(brkVar, briVar2);
            i3++;
            c = 0;
            briVar = null;
        }
        brjVar.d.clear();
        return brjVar;
    }

    public final void c(int i, int i2, int i3) {
        if (this.e == null) {
            this.e = new Rect();
        }
        this.e.set(0, 0, this.b.getWidth(), this.b.getHeight());
        if (!this.e.intersect(0, i, i2, i3)) {
            throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
        }
    }
}
