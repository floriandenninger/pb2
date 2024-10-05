package defpackage;

import android.graphics.Rect;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tex {
    public final double a;
    public final double b;
    public final double c;
    public final Integer d;
    public final amru e;
    private final double f;
    private final double g;
    private final double h;
    private final double i;
    private final double j;
    private final double k;
    private final Rect l;
    private final Rect m;

    public tex() {
    }

    public tex(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Rect rect, Rect rect2, Integer num, amru amruVar) {
        this.a = d;
        this.f = d2;
        this.g = d3;
        this.b = d4;
        this.h = d5;
        this.i = d6;
        this.c = d7;
        this.j = d8;
        this.k = d9;
        this.l = rect;
        this.m = rect2;
        this.d = num;
        this.e = amruVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static tew a() {
        tew tewVar = new tew();
        tewVar.b(-1.0d);
        tewVar.c(-1.0d);
        tewVar.f(-1.0d);
        tewVar.k(-1.0d);
        tewVar.e(-1.0d);
        tewVar.h(-1.0d);
        tewVar.j(-1.0d);
        tewVar.d(-1.0d);
        tewVar.g(-1.0d);
        tewVar.i(amru.v(0L, 0L, 0L, 0L, 0L));
        return tewVar;
    }

    public final Double[] b() {
        return g(this.g, this.a, this.f);
    }

    public final Double[] c() {
        return g(this.k, this.c, this.j);
    }

    public final Double[] d() {
        return g(this.i, this.b, this.h);
    }

    public final Integer[] e() {
        Rect rect = this.m;
        if (rect != null) {
            return new Integer[]{Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.bottom), Integer.valueOf(rect.right)};
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Rect rect;
        Rect rect2;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tex) {
            tex texVar = (tex) obj;
            if (Double.doubleToLongBits(this.a) == Double.doubleToLongBits(texVar.a) && Double.doubleToLongBits(this.f) == Double.doubleToLongBits(texVar.f) && Double.doubleToLongBits(this.g) == Double.doubleToLongBits(texVar.g) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(texVar.b) && Double.doubleToLongBits(this.h) == Double.doubleToLongBits(texVar.h) && Double.doubleToLongBits(this.i) == Double.doubleToLongBits(texVar.i) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(texVar.c) && Double.doubleToLongBits(this.j) == Double.doubleToLongBits(texVar.j) && Double.doubleToLongBits(this.k) == Double.doubleToLongBits(texVar.k) && ((rect = this.l) != null ? rect.equals(texVar.l) : texVar.l == null) && ((rect2 = this.m) != null ? rect2.equals(texVar.m) : texVar.m == null) && ((num = this.d) != null ? num.equals(texVar.d) : texVar.d == null) && amkq.aV(this.e, texVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final Integer[] f() {
        Rect rect = this.l;
        Integer[] numArr = new Integer[4];
        if (rect != null) {
            numArr[0] = Integer.valueOf(rect.top);
            numArr[1] = Integer.valueOf(rect.left);
            numArr[2] = Integer.valueOf(rect.bottom);
            numArr[3] = Integer.valueOf(rect.right);
        } else {
            numArr[0] = 0;
            numArr[1] = 0;
            numArr[2] = 0;
            numArr[3] = 0;
        }
        return numArr;
    }

    public final int hashCode() {
        int doubleToLongBits = (((((((((((((((((((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f) >>> 32) ^ Double.doubleToLongBits(this.f)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.g) >>> 32) ^ Double.doubleToLongBits(this.g)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.h) >>> 32) ^ Double.doubleToLongBits(this.h)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.i) >>> 32) ^ Double.doubleToLongBits(this.i)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.c) >>> 32) ^ Double.doubleToLongBits(this.c)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.j) >>> 32) ^ Double.doubleToLongBits(this.j)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.k) >>> 32) ^ Double.doubleToLongBits(this.k)))) * 1000003;
        Rect rect = this.l;
        int hashCode = (doubleToLongBits ^ (rect == null ? 0 : rect.hashCode())) * 1000003;
        Rect rect2 = this.m;
        int hashCode2 = (hashCode ^ (rect2 == null ? 0 : rect2.hashCode())) * 1000003;
        Integer num = this.d;
        return this.e.hashCode() ^ ((hashCode2 ^ (num != null ? num.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        double d = this.a;
        double d2 = this.f;
        double d3 = this.g;
        double d4 = this.b;
        double d5 = this.h;
        double d6 = this.i;
        double d7 = this.c;
        double d8 = this.j;
        double d9 = this.k;
        String valueOf = String.valueOf(this.l);
        String valueOf2 = String.valueOf(this.m);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 418 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("QuartileSnapshot{exposure=");
        sb.append(d);
        sb.append(", maxExposure=");
        sb.append(d2);
        sb.append(", minExposure=");
        sb.append(d3);
        sb.append(", volume=");
        sb.append(d4);
        sb.append(", maxVolume=");
        sb.append(d5);
        sb.append(", minVolume=");
        sb.append(d6);
        sb.append(", screenShare=");
        sb.append(d7);
        sb.append(", maxScreenShare=");
        sb.append(d8);
        sb.append(", minScreenShare=");
        sb.append(d9);
        sb.append(", position=");
        sb.append(valueOf);
        sb.append(", containerPosition=");
        sb.append(valueOf2);
        sb.append(", instantaneousState=");
        sb.append(valueOf3);
        sb.append(", mtosBuckets=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    private static Double[] g(double d, double d2, double d3) {
        return (d == d2 && d3 == d2) ? new Double[]{Double.valueOf(d2)} : new Double[]{Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
    }
}
