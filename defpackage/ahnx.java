package defpackage;

import android.opengl.GLES20;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnx {
    private static final float[] a = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
    private static final float[] b = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
    private static final float[] c = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
    private static final String[] d = {"uTextureY", "uTextureU", "uTextureV"};
    private final int e;
    private final int g;
    private final int h;
    private ahlp j;
    private final ahnr k;
    private final int[] f = new int[3];
    private int i = -1;

    public ahnx(ahnt ahntVar, boolean z) {
        if (z) {
            for (int i = 0; i < 3; i++) {
                this.f[i] = ahntVar.f(d[i]);
            }
            this.g = ahntVar.f("uColorConversion");
            this.e = -1;
        } else {
            this.e = ahntVar.f("uTexture");
            this.g = -1;
        }
        this.h = ahntVar.f("uCropRight");
        this.k = new ahnr(ahntVar);
    }

    public static String a(ahod ahodVar, boolean z) {
        String str = true != z ? "" : "#define ENABLE_YUV\n";
        String a2 = ahodVar.a(R.raw.gl_rgb_and_yuv_program_ext_frag);
        return a2.length() != 0 ? str.concat(a2) : new String(str);
    }

    public static String b(ahod ahodVar) {
        return ahodVar.a(R.raw.gl_rgb_and_yuv_program_ext_vert);
    }

    public final void c() {
        ahnr ahnrVar = this.k;
        int[] iArr = ahnrVar.l;
        if (iArr[0] != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            Boolean bool = ahkt.a;
            ahnrVar.l[0] = 0;
        }
    }

    public final void d(boolean z, byte[] bArr, long j, long j2) {
        this.k.b(z, bArr, j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        r7.k.d(r8, r4, r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r7.j != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.ahky r8) {
        /*
            r7 = this;
            int r0 = r8.j()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L6f
            r0 = 0
        La:
            r1 = 3
            if (r0 >= r1) goto L17
            int[] r1 = r7.f
            r1 = r1[r0]
            android.opengl.GLES20.glUniform1i(r1, r0)
            int r0 = r0 + 1
            goto La
        L17:
            int r0 = r7.h
            float r4 = r8.a()
            android.opengl.GLES20.glUniform1f(r0, r4)
            ahlp r0 = r8.d()
            int r4 = r8.b()
            int r5 = r7.i
            if (r5 != r4) goto L54
            if (r0 == 0) goto L49
            ahlp r5 = r7.j
            if (r5 != 0) goto L33
            goto L54
        L33:
            com.google.android.exoplayer.ColorInfo r6 = r0.a
            if (r6 == 0) goto L3e
            com.google.android.exoplayer.ColorInfo r5 = r5.a
            boolean r5 = r6.equals(r5)
            goto L46
        L3e:
            asf r6 = r0.b
            asf r5 = r5.b
            boolean r5 = r6.equals(r5)
        L46:
            if (r5 == 0) goto L54
            goto L4e
        L49:
            ahlp r5 = r7.j
            if (r5 == 0) goto L4e
            goto L54
        L4e:
            ahnr r1 = r7.k
            r1.d(r8, r4, r0, r3)
            goto Lb5
        L54:
            float[] r5 = defpackage.ahnx.b
            if (r4 == r2) goto L5e
            if (r4 == r1) goto L5b
            goto L60
        L5b:
            float[] r5 = defpackage.ahnx.c
            goto L60
        L5e:
            float[] r5 = defpackage.ahnx.a
        L60:
            int r1 = r7.g
            android.opengl.GLES20.glUniformMatrix3fv(r1, r2, r3, r5, r3)
            r7.i = r4
            r7.j = r0
            ahnr r1 = r7.k
            r1.d(r8, r4, r0, r2)
            goto Lb5
        L6f:
            int r0 = r7.e
            android.opengl.GLES20.glUniform1i(r0, r3)
            int r0 = r7.h
            r4 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glUniform1f(r0, r4)
            ahnr r0 = r7.k
            long r4 = r8.c()
            r0.i = r4
            int r4 = r0.e
            if (r4 == 0) goto L8b
            boolean r4 = r0.k
            if (r4 == 0) goto L99
        L8b:
            int r4 = r0.n
            if (r4 == r1) goto L95
            int r4 = r0.o
            int r5 = r0.p
            if (r4 == r5) goto L99
        L95:
            r4 = 0
            r0.e(r4)
        L99:
            int r4 = r0.d
            int r5 = r0.e
            float r5 = (float) r5
            android.opengl.GLES20.glUniform1f(r4, r5)
            r0.k = r3
            int r4 = r0.a
            r0.a(r3, r4)
            int r3 = r0.c
            r0.a(r1, r3)
            int r1 = r0.b
            r0.a(r2, r1)
            r0.c(r8)
        Lb5:
            java.lang.Boolean r8 = defpackage.ahkt.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnx.e(ahky):void");
    }

    public final void f(int i, int i2, int i3, int i4) {
        ahnr ahnrVar = this.k;
        if (ahnrVar.n != i || ahnrVar.o != i2 || ahnrVar.p != i4) {
            ahnrVar.k = true;
        }
        ahnrVar.n = i;
        ahnrVar.o = i2;
        ahnrVar.p = i4;
        ahnrVar.m = i3;
    }
}
