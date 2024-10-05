package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tmn {
    public Uri a;
    public String b;
    public tmm c;
    public Integer d;
    public amru e;
    public ammv f;

    public tmn() {
    }

    public tmn(byte[] bArr) {
        this.f = amlr.a;
    }

    public final void a(tmm tmmVar) {
        if (tmmVar == null) {
            throw new NullPointerException("Null downloadConstraints");
        }
        this.c = tmmVar;
    }

    public final void b(amru amruVar) {
        if (amruVar == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        this.e = amruVar;
    }

    public final void c(int i) {
        this.d = Integer.valueOf(i);
    }
}
