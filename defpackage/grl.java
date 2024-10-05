package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class grl extends yfp {
    private final amnv a;
    private final amnv b;

    public grl(Context context, ygc ygcVar, aahd aahdVar, acra acraVar, final jgp jgpVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(context, ygcVar, aahdVar, acraVar);
        final int i = 1;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        final byte[] bArr7 = null;
        final byte[] bArr8 = null;
        this.a = amkq.x(new amnv(this, jgpVar, i, bArr5, bArr6, bArr7, bArr8) { // from class: grk
            public final /* synthetic */ grl a;
            public final /* synthetic */ jgp b;
            private final /* synthetic */ int c;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                return this.c != 0 ? this.b.f(new grj(0)) : this.b.f(new grj(1));
            }
        });
        final int i2 = 0;
        this.b = amkq.x(new amnv(this, jgpVar, i2, bArr5, bArr6, bArr7, bArr8) { // from class: grk
            public final /* synthetic */ grl a;
            public final /* synthetic */ jgp b;
            private final /* synthetic */ int c;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                return this.c != 0 ? this.b.f(new grj(0)) : this.b.f(new grj(1));
            }
        });
    }

    @Override // defpackage.yfp, defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        avmu avmuVar = ((UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint) apxfVar.pX(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)).b;
        if (avmuVar == null) {
            avmuVar = avmu.a;
        }
        int i = avmuVar.b;
        if (i == 127046814) {
            ((exb) this.a.get()).kE(apxfVar, map);
        } else if (i != 127387931) {
            super.kE(apxfVar, map);
        } else {
            ((exb) this.b.get()).kE(apxfVar, map);
        }
    }
}
