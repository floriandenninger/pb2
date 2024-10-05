package defpackage;

import com.google.mediapipe.framework.TextureFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zra implements aogg {
    public final /* synthetic */ zpw a;

    @Override // defpackage.aogg
    public final void a(final TextureFrame textureFrame) {
        final zpk zpkVar = this.a.c;
        if (textureFrame.getTimestamp() <= zpkVar.f) {
            textureFrame.getTimestamp();
            textureFrame.release();
        } else {
            zpkVar.f = textureFrame.getTimestamp();
            zpkVar.a.b.post(new Runnable() { // from class: zpj
                /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
                
                    if (r5 >= r9) goto L12;
                 */
                /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r17 = this;
                        r1 = r17
                        zpk r2 = defpackage.zpk.this
                        com.google.mediapipe.framework.TextureFrame r3 = r2
                        zpw r0 = r2.a
                        zpe r0 = r0.u
                        zpw r4 = r2.a
                        boolean r4 = r4.d
                        if (r4 == 0) goto Ld8
                        if (r0 != 0) goto L14
                        goto Ld8
                    L14:
                        int r4 = r3.getTextureName()
                        arz r4 = defpackage.arz.a(r4)
                        long r5 = r3.getTimestamp()
                        long r7 = r2.c
                        int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                        if (r9 < 0) goto L30
                        long r9 = r2.b
                        int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                        if (r11 < 0) goto L3e
                        int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                        if (r7 < 0) goto L3e
                    L30:
                        zpw r5 = r2.a
                        int r6 = r5.v
                        int r5 = r5.w
                        r2.a(r4, r0, r6, r5)
                        zpw r0 = r2.a
                        r0.f()
                    L3e:
                        zfi r0 = r2.d
                        if (r0 == 0) goto Ld1
                        long r5 = r2.e
                        r7 = -1
                        int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                        if (r0 == 0) goto Lcc
                        long r5 = r3.getTimestamp()
                        long r9 = r2.e
                        int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                        if (r0 < 0) goto Lcc
                        r3.getWidth()
                        r3.getHeight()
                        zpe r5 = defpackage.zpe.k(r4)
                        int r0 = r3.getWidth()
                        int r6 = r3.getHeight()
                        int r9 = r0 * r6
                        int r9 = r9 * 4
                        java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocateDirect(r9)
                        java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
                        r15.order(r9)
                        r14 = 0
                        r5.e()     // Catch: java.lang.RuntimeException -> Lb3
                        r9 = 0
                        r10 = 0
                        r13 = 6408(0x1908, float:8.98E-42)
                        r16 = 5121(0x1401, float:7.176E-42)
                        r11 = r0
                        r12 = r6
                        r7 = r14
                        r14 = r16
                        r8 = r15
                        android.opengl.GLES20.glReadPixels(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.RuntimeException -> Lb1
                        java.lang.String r9 = "glReadPixels"
                        defpackage.art.d(r9)     // Catch: java.lang.RuntimeException -> Lb1
                        android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
                        android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r0, r6, r9)
                        r10.copyPixelsFromBuffer(r8)
                        android.graphics.Matrix r15 = new android.graphics.Matrix
                        r15.<init>()
                        r0 = 1065353216(0x3f800000, float:1.0)
                        r6 = -1082130432(0xffffffffbf800000, float:-1.0)
                        r15.postScale(r0, r6)
                        r11 = 0
                        r12 = 0
                        int r13 = r10.getWidth()
                        int r14 = r10.getHeight()
                        r16 = 1
                        android.graphics.Bitmap r14 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)
                        goto Lbb
                    Lb1:
                        r0 = move-exception
                        goto Lb5
                    Lb3:
                        r0 = move-exception
                        r7 = r14
                    Lb5:
                        java.lang.String r6 = "copyRenderTargetToBitmap: readPixelData failed: "
                        defpackage.zga.d(r6, r0)
                        r14 = r7
                    Lbb:
                        r5.g()
                        if (r14 == 0) goto Ld1
                        zfi r0 = r2.d
                        r0.a(r14)
                        r2.d = r7
                        r5 = -1
                        r2.e = r5
                        goto Ld1
                    Lcc:
                        zpw r0 = r2.a
                        r0.k()
                    Ld1:
                        defpackage.zpw.j(r4)
                        r3.release()
                        return
                    Ld8:
                        r3.release()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zpj.run():void");
                }
            });
        }
    }
}
