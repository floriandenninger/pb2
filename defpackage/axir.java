package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axir {
    public final bapa a = new bapa(6407);
    public bapq b;
    public int c;
    private int d;

    public final void a(int i, int i2) {
        int min;
        bapq baoyVar;
        float min2 = Math.min(1.0f, this.c / Math.max(i, i2));
        this.a.b(Math.round(i * min2), Math.round(i2 * min2));
        GLES20.glBindFramebuffer(36160, this.a.a);
        bapa bapaVar = this.a;
        int i3 = bapaVar.c;
        int i4 = bapaVar.d;
        if (i3 >= i) {
            min = 1;
        } else {
            int i5 = i / i3;
            if (i % i3 != 0 || i2 % i4 != 0 || (i5 & 1) != 0) {
                min = Math.min(8, i5);
            } else {
                min = Math.min(8, i5 >> 1);
            }
        }
        bapq bapqVar = this.b;
        if (bapqVar != null && min != this.d) {
            bapqVar.c();
            this.b = null;
        }
        if (this.b == null) {
            if (min == 1) {
                baoyVar = new baoy();
            } else if (min == 2) {
                baoyVar = new axit("uniform vec2 xUnit;\nuniform vec2 yUnit;\n\nvoid main() {\n  vec2 halfX = 0.5 * xUnit;\n  vec2 halfY = 0.5 * yUnit;\n  gl_FragColor = 0.25 * ((sample(tc - halfX - halfY) + sample(tc + halfX - halfY))\n      + (sample(tc - halfX + halfY) + sample(tc + halfX + halfY)));\n}\n", new axis(min));
            } else {
                baoyVar = new axit("uniform vec2 xUnit;\nuniform vec2 yUnit;\nuniform int samplingFactor;\n\nvoid main() {\n  float k = float(samplingFactor - 1) / -2.0;\n  vec4 sum = vec4(0.0);\n  vec2 dx = xUnit * k;\n  for (int ix = 0; ix < samplingFactor; ++ix) {\n    vec2 dy = yUnit * k;\n    for (int iy = 0; iy < samplingFactor; ++iy) {\n      sum += sample(tc + dx + dy);\n      dy += yUnit;\n    }\n    dx += xUnit;\n  }\n  gl_FragColor = sum / float(samplingFactor * samplingFactor);\n}\n", new axis(min));
            }
            this.b = baoyVar;
            this.d = min;
        }
    }
}
