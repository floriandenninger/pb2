package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzk {
    public static final vzk a = new vzk(0.0f, 0.0f, 0);
    public final float b;
    public final float c;
    public final int d;

    public vzk(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzk)) {
            return false;
        }
        vzk vzkVar = (vzk) obj;
        return this.d == vzkVar.d && this.c == vzkVar.c && this.b == vzkVar.b;
    }
}
