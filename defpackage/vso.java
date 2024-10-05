package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vso extends axa {
    private final vrw q;

    public vso(Context context, vrw vrwVar, awh awhVar) {
        super(context, bae.b, null, null, awhVar);
        vrwVar.getClass();
        this.q = vrwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axa, defpackage.bac
    public final boolean D(long j, long j2, azy azyVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, pms pmsVar) {
        vrw vrwVar = this.q;
        if (vrwVar.a.get() < vrwVar.b) {
            return super.D(j, j2, azyVar, byteBuffer, i, i2, i3, j3, z, z2, pmsVar);
        }
        return false;
    }

    @Override // defpackage.axa, defpackage.ple, defpackage.poe
    public final psx i() {
        return null;
    }
}
