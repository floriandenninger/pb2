package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axnb {
    public static final axnb a = new axnb(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final axnb b = new axnb(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final axnb c = new axnb(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final axnb d = new axnb(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;

    public axnb(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.e = d6;
        this.f = d7;
        this.g = d8;
        this.h = d2;
        this.i = d3;
        this.j = d4;
        this.k = d5;
        this.l = d9;
        this.m = d10;
    }

    public static axnb a(ByteBuffer byteBuffer) {
        double ae = did.ae(byteBuffer);
        double ae2 = did.ae(byteBuffer);
        double ad = did.ad(byteBuffer);
        return new axnb(ae, ae2, did.ae(byteBuffer), did.ae(byteBuffer), ad, did.ad(byteBuffer), did.ad(byteBuffer), did.ae(byteBuffer), did.ae(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        did.W(byteBuffer, this.h);
        did.W(byteBuffer, this.i);
        did.V(byteBuffer, this.e);
        did.W(byteBuffer, this.j);
        did.W(byteBuffer, this.k);
        did.V(byteBuffer, this.f);
        did.W(byteBuffer, this.l);
        did.W(byteBuffer, this.m);
        did.V(byteBuffer, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axnb axnbVar = (axnb) obj;
        return Double.compare(axnbVar.h, this.h) == 0 && Double.compare(axnbVar.i, this.i) == 0 && Double.compare(axnbVar.j, this.j) == 0 && Double.compare(axnbVar.k, this.k) == 0 && Double.compare(axnbVar.l, this.l) == 0 && Double.compare(axnbVar.m, this.m) == 0 && Double.compare(axnbVar.e, this.e) == 0 && Double.compare(axnbVar.f, this.f) == 0 && Double.compare(axnbVar.g, this.g) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f);
        long doubleToLongBits3 = Double.doubleToLongBits(this.g);
        long doubleToLongBits4 = Double.doubleToLongBits(this.h);
        long doubleToLongBits5 = Double.doubleToLongBits(this.i);
        long doubleToLongBits6 = Double.doubleToLongBits(this.j);
        long doubleToLongBits7 = Double.doubleToLongBits(this.k);
        long doubleToLongBits8 = Double.doubleToLongBits(this.l);
        long doubleToLongBits9 = Double.doubleToLongBits(this.m);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(a)) {
            return "Rotate 0°";
        }
        if (equals(b)) {
            return "Rotate 90°";
        }
        if (equals(c)) {
            return "Rotate 180°";
        }
        if (equals(d)) {
            return "Rotate 270°";
        }
        double d2 = this.e;
        double d3 = this.f;
        double d4 = this.g;
        double d5 = this.h;
        double d6 = this.i;
        double d7 = this.j;
        double d8 = this.k;
        double d9 = this.l;
        double d10 = this.m;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
