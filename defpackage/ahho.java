package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahho {
    public final float[] a;
    public final int b;

    public ahho(float[] fArr, int i) {
        this.a = fArr;
        this.b = i;
    }

    public final float a(ahho ahhoVar) {
        float f = 0.0f;
        for (int i = 0; i < this.b; i++) {
            f += this.a[i] * ahhoVar.a[i];
        }
        return f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = this.b - 1;
            if (i < i2) {
                float f = this.a[i];
                StringBuilder sb2 = new StringBuilder(17);
                sb2.append(f);
                sb2.append(", ");
                sb.append(sb2.toString());
                i++;
            } else {
                sb.append(this.a[i2]);
                return sb.toString();
            }
        }
    }
}
