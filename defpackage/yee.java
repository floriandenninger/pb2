package defpackage;

import com.google.protos.youtube.api.innertube.YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yee implements aaha {
    public final aahd a;
    public final aoae b;
    private final ycq c;

    public yee(ycq ycqVar, aoae aoaeVar, aahd aahdVar, byte[] bArr, byte[] bArr2) {
        this.c = ycqVar;
        this.b = aoaeVar;
        this.a = aahdVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint = (YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint) apxfVar.pX(YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.ypcFixInstrumentEndpoint);
        final ycq ycqVar = this.c;
        final byte[] I = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.f.I();
        final byte[] I2 = ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.g.I();
        ycqVar.c.add(new yed(this, ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint));
        final int i = 0;
        final int i2 = 1;
        ynm.n(ycqVar.a, ((abep) ycqVar.b.get()).c(), new zfi() { // from class: yco
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i == 0) {
                    ycqVar.a(aaeb.PRODUCTION, I, I2);
                    return;
                }
                ycqVar.a((aaeb) obj, I, I2);
            }
        }, new zfi() { // from class: yco
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i2 == 0) {
                    ycqVar.a(aaeb.PRODUCTION, I, I2);
                    return;
                }
                ycqVar.a((aaeb) obj, I, I2);
            }
        });
    }
}
