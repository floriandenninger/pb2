package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tay implements sxw {
    public static final AtomicBoolean b = new AtomicBoolean(true);
    public final swp c;
    public final tbt d;
    public final Executor e;
    public String f;
    public final ajfv g;
    public final ahbn h;

    public tay(ahbn ahbnVar, tbt tbtVar, Executor executor, ajfv ajfvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.h = ahbnVar;
        this.d = tbtVar;
        this.g = ajfvVar;
        this.c = new tbc(tbtVar, executor, ajfvVar);
        this.e = executor;
    }

    @Override // defpackage.sxw
    public final int a() {
        return this.d.a();
    }

    @Override // defpackage.sxw
    public final swo b() {
        if (TextUtils.isEmpty(this.f)) {
            d();
        }
        return new tax(this);
    }

    @Override // defpackage.sxw
    public final szf c(final int i) {
        if (TextUtils.isEmpty(this.f)) {
            d();
        }
        return new szf() { // from class: taw
            @Override // defpackage.szf
            public final szh a() {
                tay tayVar = tay.this;
                int i2 = i;
                String str = tayVar.f;
                tbt tbtVar = tayVar.d;
                Executor executor = tayVar.e;
                ajfv ajfvVar = tayVar.g;
                tbl tblVar = tbl.b;
                return new tbi(str, i2, tbtVar, executor, ajfvVar);
            }
        };
    }

    @Override // defpackage.sxw
    public final void d() {
        String b2 = this.d.b();
        this.f = b2;
        this.d.d(b2);
    }
}
