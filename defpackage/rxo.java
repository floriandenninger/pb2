package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxo implements rxw {
    private static final float[] b = {0.01f, 0.02f, 0.025f, 0.03f, 0.04f, 0.05f, 0.06f, 0.07f, 0.08f, 0.09f, 0.1f, 0.2f, 0.25f, 0.3f, 0.4f, 0.5f, 0.6f, 0.7f, 0.8f, 0.9f, 1.0f, 2.0f, 2.5f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f};
    private int e;
    private int f;
    private Double[] g;
    private List i;
    private double j;
    private double k;
    private int l;
    private int m;
    private boolean n;
    public boolean a = true;
    private Integer c = null;
    private Integer d = null;
    private int h = 0;

    private static final double c(double d) {
        double pow = Math.pow(10.0d, Math.ceil(Math.log10(Math.abs(d))));
        double d2 = d < 0.0d ? -1 : 1;
        Double.isNaN(d2);
        return pow * d2;
    }

    private static final double d(double d) {
        if (d > 100.0d) {
            return Math.round(d);
        }
        double round = Math.round(d * 100000.0d);
        Double.isNaN(round);
        return round / 100000.0d;
    }

    public final void a(Integer num) {
        if (num.intValue() <= 1) {
            num = null;
        }
        this.d = num;
        this.c = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (r0.i == null) goto L127;
     */
    @Override // defpackage.rxw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.util.List r36, defpackage.ryv r37, int r38, defpackage.rwl r39, defpackage.rxu r40, defpackage.rxl r41, defpackage.rze r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxo.b(java.util.List, ryv, int, rwl, rxu, rxl, rze, boolean):java.util.List");
    }
}
