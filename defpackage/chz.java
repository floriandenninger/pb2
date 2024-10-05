package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class chz extends chk {
    public chz(clu cluVar) {
        this(cluVar, null);
    }

    @Override // defpackage.chk
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.chk
    public final Object e() {
        return this.d.a();
    }

    @Override // defpackage.chk
    public final Object f(clt cltVar, float f) {
        return e();
    }

    @Override // defpackage.chk
    public final void h() {
        if (this.d != null) {
            super.h();
        }
    }

    @Override // defpackage.chk
    public final void i(float f) {
        this.c = f;
    }

    public chz(clu cluVar, byte[] bArr) {
        super(Collections.emptyList());
        this.d = cluVar;
    }
}
