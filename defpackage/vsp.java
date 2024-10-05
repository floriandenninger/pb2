package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsp extends bgt {
    private final vsq b;
    private final vrx c;

    public vsp(Context context, vsq vsqVar, vrx vrxVar) {
        super(context, bae.b, 0L, null, null, 0);
        this.b = vsqVar;
        vrxVar.getClass();
        this.c = vrxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bgt, defpackage.bac
    public final boolean D(long j, long j2, azy azyVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, pms pmsVar) {
        if (this.c.a.get()) {
            return false;
        }
        return super.D(j, j2, azyVar, byteBuffer, i, i2, i3, j3, z, z2, pmsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bgt, defpackage.bac
    public final void J(long j) {
        vsq vsqVar = this.b;
        int i = this.r;
        long j2 = vsqVar.a.get(i, -9223372036854775807L);
        if (j2 == -9223372036854775807L || j > j2) {
            vsqVar.a.put(i, j);
            if (j2 == -9223372036854775807L || j2 == vsqVar.b) {
                vsqVar.b = pts.q(vsqVar.a);
            }
        }
        super.J(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bgt
    public final boolean X(long j, long j2, boolean z) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bgt
    public final boolean Y(long j, long j2, boolean z) {
        return false;
    }

    @Override // defpackage.bgt
    protected final boolean Z(long j, long j2) {
        return true;
    }

    @Override // defpackage.ple, defpackage.poe
    public final psx i() {
        return this.b;
    }
}
