package defpackage;

import android.content.Intent;
import com.google.protos.youtube.api.innertube.YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycp implements ykj {
    final /* synthetic */ ycq a;
    private final byte[] b;

    public ycp(ycq ycqVar, byte[] bArr) {
        this.a = ycqVar;
        this.b = bArr;
    }

    @Override // defpackage.ykj
    public final void kD(int i, int i2, Intent intent) {
        apxf apxfVar;
        apxf apxfVar2;
        if (i == 1900) {
            if (i2 == -1) {
                for (yed yedVar : this.a.c) {
                    yedVar.b.b.m();
                    aahd aahdVar = yedVar.b.a;
                    YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint = yedVar.a;
                    if (ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.b == 3) {
                        apxfVar2 = (apxf) ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.c;
                    } else {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar.c(apxfVar2, null);
                    this.a.b(this.b, 3);
                }
                this.a.c.clear();
                return;
            }
            if (i2 == 0) {
                Iterator it = this.a.c.iterator();
                while (it.hasNext()) {
                    ((yed) it.next()).b.b.m();
                    this.a.b(this.b, 4);
                }
                this.a.c.clear();
                return;
            }
            if (i2 == 1) {
                for (yed yedVar2 : this.a.c) {
                    aahd aahdVar2 = yedVar2.b.a;
                    YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2 = yedVar2.a;
                    if (ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2.d == 5) {
                        apxfVar = (apxf) ypcFixInstrumentEndpoint$YPCFixInstrumentEndpoint2.e;
                    } else {
                        apxfVar = apxf.a;
                    }
                    aahdVar2.c(apxfVar, null);
                    this.a.b(this.b, 5);
                }
                this.a.c.clear();
            }
        }
    }
}
