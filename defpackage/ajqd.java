package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajqd {
    public final ajom a;
    public final ajom b;
    public final long c;
    public final Runnable d;
    public final Runnable e;
    public final Runnable f;
    public final Runnable g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public ajqd() {
    }

    public ajqd(ajom ajomVar, ajom ajomVar2, long j, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, int i, int i2, int i3, int i4) {
        this.a = ajomVar;
        this.b = ajomVar2;
        this.c = j;
        this.d = runnable;
        this.e = runnable2;
        this.f = runnable3;
        this.g = runnable4;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public static ajqc a() {
        return new ajqc();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqd) {
            ajqd ajqdVar = (ajqd) obj;
            if (this.a.equals(ajqdVar.a) && this.b.equals(ajqdVar.b) && this.c == ajqdVar.c && this.d.equals(ajqdVar.d) && this.e.equals(ajqdVar.e) && this.f.equals(ajqdVar.f) && this.g.equals(ajqdVar.g) && this.h == ajqdVar.h && this.i == ajqdVar.i && this.j == ajqdVar.j && this.k == ajqdVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        long j = this.c;
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        long j = this.c;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int i = this.h;
        int i2 = this.i;
        int i3 = this.j;
        int i4 = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 198 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ReplaceParameters{oldPresenter=");
        sb.append(valueOf);
        sb.append(", newPresenter=");
        sb.append(valueOf2);
        sb.append(", duration=");
        sb.append(j);
        sb.append(", oldOnStart=");
        sb.append(valueOf3);
        sb.append(", oldOnEnd=");
        sb.append(valueOf4);
        sb.append(", newOnStart=");
        sb.append(valueOf5);
        sb.append(", newOnEnd=");
        sb.append(valueOf6);
        sb.append(", fromX=");
        sb.append(i);
        sb.append(", fromY=");
        sb.append(i2);
        sb.append(", toX=");
        sb.append(i3);
        sb.append(", toY=");
        sb.append(i4);
        sb.append("}");
        return sb.toString();
    }
}
