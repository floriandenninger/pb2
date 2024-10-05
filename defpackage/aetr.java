package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aetr extends aevf {
    private final float[] b;
    private final axfg c;

    public aetr(axfg axfgVar, aetw aetwVar) {
        super(aetwVar);
        this.c = axfgVar;
        this.b = new float[4];
    }

    private final void j() {
        this.c.a(this.b);
        float[] fArr = this.b;
        super.i(fArr[3], fArr[0], fArr[1], fArr[2]);
    }

    @Override // defpackage.aevf, defpackage.avr
    public final ByteBuffer b() {
        j();
        return super.b();
    }

    @Override // defpackage.aevf, defpackage.avr
    public final void e(ByteBuffer byteBuffer) {
        j();
        super.e(byteBuffer);
    }
}
