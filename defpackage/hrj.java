package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrj {
    public static final hrj a = new hrj(0.0f, 0.0f, 0);
    public final float b;
    public final float c;
    public final int d;

    public hrj(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrj)) {
            return false;
        }
        hrj hrjVar = (hrj) obj;
        return this.d == hrjVar.d && this.c == hrjVar.c && this.b == hrjVar.b;
    }
}
