package defpackage;

import android.util.Log;
import android.util.Size;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.aimatter.drishti.DrishtiCache;
import com.google.research.xeno.effect.InputFrameSource;
import com.google.research.xeno.effect.ProcessorBase;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class awys extends ProcessorBase implements aogg, zqs {
    public static final String a = "awys";
    public static final Size b = new Size(-1, -1);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public awys(long r2) {
        /*
            r1 = this;
            awyd r0 = defpackage.awye.a()
            r0.b(r2)
            com.google.research.aimatter.drishti.DrishtiCache r2 = new com.google.research.aimatter.drishti.DrishtiCache
            r2.<init>()
            r0.a = r2
            awye r2 = r0.a()
            r1.<init>(r2)
            com.google.research.xeno.effect.InputFrameSource r2 = com.google.research.xeno.effect.InputFrameSource.FRONT_CAMERA_MIRRORED
            android.util.Size r3 = defpackage.awys.b
            r1.b(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awys.<init>(long):void");
    }

    @Override // defpackage.aogg
    public final void a(TextureFrame textureFrame) {
        long timestamp = textureFrame.getTimestamp();
        Packet a2 = this.g.a(textureFrame);
        nativeSendVideoProcessorFramePacket(this.d, a2.getNativeHandle(), timestamp, new ProcessorBase.Callback() { // from class: awyr
            @Override // com.google.research.xeno.effect.ProcessorBase.Callback
            public final void onCompletion(boolean z, String str) {
                String str2 = awys.a;
                if (z) {
                    return;
                }
                String str3 = awys.a;
                String valueOf = String.valueOf(str);
                Log.e(str3, valueOf.length() != 0 ? "Error sending video processor frame packet.\n".concat(valueOf) : new String("Error sending video processor frame packet.\n"));
            }
        });
        a2.release();
    }

    public final void b(InputFrameSource inputFrameSource, Size size) {
        nativeStartVideoProcessing(this.d, inputFrameSource.e, size.getWidth(), size.getHeight(), null);
    }

    @Override // defpackage.zqs
    public final void f() {
        DrishtiCache drishtiCache = this.c.b;
        nativeStopVideoProcessing(this.d, null);
        d();
        if (drishtiCache.b.compareAndSet(true, false)) {
            drishtiCache.nativeReleaseCache(drishtiCache.a);
        }
    }

    public awys(awye awyeVar) {
        super(awyeVar);
        DrishtiCache drishtiCache = awyeVar.b;
        long j = 0;
        if (drishtiCache != null && drishtiCache.b.get()) {
            j = drishtiCache.a;
        }
        this.d = nativeNewVideoProcessor(this.f.a(), j, awyeVar.a, new awyu(this));
        this.e = new AtomicBoolean(true);
    }
}
