package defpackage;

import android.opengl.GLES20;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahny extends ahnt implements ahns {
    public final int a;
    public final ahoc b;
    private final ahnx d;

    public ahny(ahod ahodVar, boolean z, boolean z2) {
        this(ahodVar, ahodVar.a(R.raw.gl_no_op_program_vert), ahodVar.a(R.raw.gl_no_op_program_frag), z, z2);
    }

    @Override // defpackage.ahns
    public final void a(boolean z, byte[] bArr, long j, long j2) {
        this.d.d(z, bArr, j, j2);
    }

    @Override // defpackage.ahns
    public final void b(int i, int i2, int i3, int i4) {
        this.d.f(i, i2, i3, i4);
    }

    public final void c() {
        GLES20.glEnableVertexAttribArray(this.a);
        Boolean bool = ahkt.a;
    }

    public final void d(ahky ahkyVar) {
        this.d.e(ahkyVar);
    }

    @Override // defpackage.ahnt
    public final void i() {
        this.d.c();
        super.i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ahny(defpackage.ahod r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            r5 = this;
            java.lang.String r0 = defpackage.ahnx.b(r6)
            int r1 = r7.length()
            if (r1 == 0) goto Lf
            java.lang.String r7 = r0.concat(r7)
            goto L14
        Lf:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0)
        L14:
            java.lang.String r0 = defpackage.ahnx.a(r6, r9)
            java.lang.String r6 = defpackage.ahoc.a(r6, r10)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r2 = r2.length()
            int r3 = r8.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + r2
            int r1 = r1 + r3
            r4.<init>(r1)
            r4.append(r0)
            r4.append(r6)
            r4.append(r8)
            java.lang.String r6 = r4.toString()
            r5.<init>(r7, r6)
            java.lang.String r6 = "aVertPos"
            int r6 = r5.e(r6)
            r5.a = r6
            ahnx r6 = new ahnx
            r6.<init>(r5, r9)
            r5.d = r6
            ahoc r6 = new ahoc
            r6.<init>(r5, r10)
            r5.b = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahny.<init>(ahod, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public ahny(ahod ahodVar, boolean z, boolean z2, byte[] bArr) {
        this(ahodVar, ahodVar.a(R.raw.gl_stereo_3d_program_vert), ahodVar.a(R.raw.gl_stereo_3d_program_frag), z, z2);
    }
}
