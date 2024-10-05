package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anbd extends anbe implements Serializable {
    private static final long serialVersionUID = 0;
    public final int a;

    public anbd(int i) {
        this.a = i;
    }

    @Override // defpackage.anbe
    public final int a() {
        return this.a;
    }

    @Override // defpackage.anbe
    public final boolean b(anbe anbeVar) {
        return this.a == anbeVar.a();
    }

    @Override // defpackage.anbe
    public final byte[] c() {
        int i = this.a;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    @Override // defpackage.anbe
    public final void d() {
    }
}
