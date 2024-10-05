package defpackage;

import android.os.Handler;
import androidx.media3.common.decoder.CryptoConfig;
import androidx.media3.decoder.opus.OpusDecoder;
import androidx.media3.decoder.opus.OpusLibrary;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aud extends awo {
    public aud() {
        super((Handler) null, (awb) null, new avr[0]);
    }

    @Override // defpackage.awo
    protected final int b(pms pmsVar) {
        boolean b = OpusLibrary.b(pmsVar.G);
        if (!OpusLibrary.a() || !"audio/opus".equalsIgnoreCase(pmsVar.n)) {
            return 0;
        }
        if (((awo) this).b.u(pts.A(2, pmsVar.A, pmsVar.B))) {
            return !b ? 2 : 4;
        }
        return 1;
    }

    @Override // defpackage.awo
    protected final /* bridge */ /* synthetic */ ast c(pms pmsVar, CryptoConfig cryptoConfig) {
        int i = pts.a;
        boolean z = ((awo) this).b.a(pts.A(4, pmsVar.A, pmsVar.B)) == 2;
        int i2 = pmsVar.o;
        if (i2 == -1) {
            i2 = 5760;
        }
        return new OpusDecoder(i2, pmsVar.p, cryptoConfig, z);
    }

    @Override // defpackage.poe, defpackage.pof
    public final String d() {
        return "LibopusAudioRenderer";
    }

    @Override // defpackage.awo
    protected final /* bridge */ /* synthetic */ pms e(ast astVar) {
        OpusDecoder opusDecoder = (OpusDecoder) astVar;
        return pts.A(true != opusDecoder.a ? 2 : 4, opusDecoder.b, 48000);
    }

    public aud(Handler handler, awb awbVar, awh awhVar) {
        super(handler, awbVar, awhVar);
    }

    public aud(Handler handler, awb awbVar, avr... avrVarArr) {
        super(handler, awbVar, avrVarArr);
    }
}
