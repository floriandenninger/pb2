package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azm implements azx {
    private final amnv b;
    private final amnv c;
    private final boolean d;
    private final boolean e;

    public azm(int i, boolean z, boolean z2) {
        azl azlVar = new azl(i, 1);
        azl azlVar2 = new azl(i, 0);
        this.b = azlVar;
        this.c = azlVar2;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.azx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final azn b(azw azwVar) {
        MediaCodec mediaCodec;
        azn aznVar;
        String str = azwVar.a.a;
        azn aznVar2 = null;
        try {
            if (str.length() != 0) {
                "createCodec:".concat(str);
            }
            int i = pts.a;
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                aznVar = new azn(mediaCodec, (HandlerThread) this.b.get(), (HandlerThread) this.c.get(), this.d, this.e);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodec = null;
        }
        try {
            MediaFormat mediaFormat = azwVar.b;
            Surface surface = azwVar.d;
            MediaCrypto mediaCrypto = azwVar.e;
            azs azsVar = aznVar.b;
            MediaCodec mediaCodec2 = aznVar.a;
            pse.g(azsVar.c == null);
            azsVar.b.start();
            Handler handler = new Handler(azsVar.b.getLooper());
            mediaCodec2.setCallback(azsVar, handler);
            azsVar.c = handler;
            aznVar.a.configure(mediaFormat, surface, mediaCrypto, 0);
            azq azqVar = aznVar.c;
            if (!azqVar.g) {
                azqVar.d.start();
                azqVar.e = new azo(azqVar, azqVar.d.getLooper());
                azqVar.g = true;
            }
            aznVar.a.start();
            aznVar.d = 1;
            return aznVar;
        } catch (Exception e3) {
            e = e3;
            aznVar2 = aznVar;
            if (aznVar2 != null) {
                aznVar2.h();
            } else if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
