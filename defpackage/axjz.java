package defpackage;

import android.os.Build;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoderFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axjz {
    public amnv a = amkq.y(null);
    public boolean b = true;
    public final amup c = ampf.u();
    public amrz d = amvo.b;
    public acnc e;

    public axjz() {
        boolean contains = InternalMediaCodecVideoEncoderFactory.a.contains(Build.MODEL);
        int i = 15;
        if (Build.VERSION.SDK_INT <= 23) {
            if (Build.VERSION.SDK_INT == 23) {
                i = 20;
            } else if (Build.VERSION.SDK_INT != 21 && Build.VERSION.SDK_INT != 22) {
                i = 0;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.H265X, "OMX.Exynos.", axin.FRAMERATE));
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.H265X, "OMX.qcom.", axin.NONE));
        aone createBuilder = axiq.a.createBuilder();
        axio axioVar = axio.VP8;
        createBuilder.copyOnWrite();
        axiq axiqVar = (axiq) createBuilder.instance;
        axiqVar.c = axioVar.g;
        axiqVar.b = 1 | axiqVar.b;
        createBuilder.copyOnWrite();
        axiq axiqVar2 = (axiq) createBuilder.instance;
        axiqVar2.b |= 2;
        axiqVar2.d = "OMX.qcom.";
        axin axinVar = axin.NONE;
        createBuilder.copyOnWrite();
        axiq axiqVar3 = (axiq) createBuilder.instance;
        axiqVar3.e = axinVar.d;
        axiqVar3.b |= 16;
        createBuilder.copyOnWrite();
        axiq axiqVar4 = (axiq) createBuilder.instance;
        axiqVar4.b |= 64;
        axiqVar4.g = i;
        int a = InternalMediaCodecVideoEncoderFactory.a(axio.VP8);
        createBuilder.copyOnWrite();
        axiq axiqVar5 = (axiq) createBuilder.instance;
        axiqVar5.b |= 32;
        axiqVar5.f = a;
        createBuilder.copyOnWrite();
        axiq.a((axiq) createBuilder.instance);
        arrayList.add((axiq) createBuilder.build());
        if (!contains) {
            arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.H264, "OMX.qcom.", axin.NONE));
            arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.H264, "OMX.Exynos.", axin.FRAMERATE));
        }
        if (Build.VERSION.SDK_INT >= 23) {
            arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.VP8, "OMX.Exynos.", axin.DYNAMIC));
        }
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.VP9, "OMX.Exynos.", axin.FRAMERATE));
        }
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.VP8, "c2.exynos.", axin.NONE));
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.VP9, "c2.exynos.", axin.NONE));
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.H264, "c2.exynos.", axin.NONE));
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axio.H265X, "c2.exynos.", axin.NONE));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a((axiq) it.next());
        }
    }

    public final void a(axiq axiqVar) {
        amkq.E(1 == (axiqVar.b & 1));
        amkq.E((axiqVar.b & 2) != 0);
        amkq.E((axiqVar.b & 32) != 0);
        amkq.E((axiqVar.b & 64) != 0);
        amkq.E((axiqVar.b & 128) != 0);
        amup amupVar = this.c;
        axio b = axio.b(axiqVar.c);
        if (b == null) {
            b = axio.UNKNOWN;
        }
        amupVar.p(b, axiqVar);
    }
}
