package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahll extends ahln {
    private final float[] a;
    private final float[] b;
    private final float[] c;

    @Override // defpackage.ahln
    public final float a(float f) {
        int length = this.a.length;
        if (Float.isNaN(f)) {
            return f;
        }
        float[] fArr = this.a;
        int i = 0;
        if (f <= fArr[0]) {
            return this.b[0];
        }
        int i2 = length - 1;
        if (f >= fArr[i2]) {
            return this.b[i2];
        }
        while (true) {
            float[] fArr2 = this.a;
            int i3 = i + 1;
            float f2 = fArr2[i3];
            if (f < f2) {
                return this.b[i] + (this.c[i] * (f - fArr2[i]));
            }
            if (f == f2) {
                return this.b[i3];
            }
            i = i3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.a.length;
        sb.append("LinearSpline{[");
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(this.a[i]);
            sb.append(", ");
            sb.append(this.b[i]);
            if (i < length - 1) {
                sb.append(": ");
                sb.append(this.c[i]);
            }
            sb.append(")");
        }
        sb.append("]}");
        return sb.toString();
    }

    public ahll(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        if (length == fArr2.length) {
            int i = length - 1;
            this.c = new float[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                this.c[i2] = (fArr2[i3] - fArr2[i2]) / (fArr[i3] - fArr[i2]);
                i2 = i3;
            }
            this.a = fArr;
            this.b = fArr2;
            return;
        }
        throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
    }
}
