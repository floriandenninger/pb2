package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyk implements cqp {
    private final cxx a;
    private final /* synthetic */ int b;

    public cyk(cxx cxxVar, int i) {
        this.b = i;
        this.a = cxxVar;
    }

    @Override // defpackage.cqp
    public final /* synthetic */ boolean b(Object obj, cqn cqnVar) {
        if (this.b != 0) {
            return true;
        }
        return true;
    }

    @Override // defpackage.cqp
    public final /* synthetic */ ctd a(Object obj, int i, int i2, cqn cqnVar) {
        if (this.b == 0) {
            cxx cxxVar = this.a;
            return cxxVar.a(new cyg((ParcelFileDescriptor) obj, cxxVar.g, cxxVar.f), i, i2, cqnVar, cxx.e);
        }
        cxx cxxVar2 = this.a;
        return cxxVar2.a(new cye((ByteBuffer) obj, cxxVar2.g, cxxVar2.f), i, i2, cqnVar, cxx.e);
    }
}
