package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cja {
    public final float[] a;
    public final int[] b;

    public cja(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{0.0f, 1.0f};
    }

    public cja(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{0.0f, 0.5f, 1.0f};
    }

    public cja(List list, List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            this.b[i] = ((Integer) list.get(i)).intValue();
            this.a[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public cja(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final int a() {
        return this.b.length;
    }
}
