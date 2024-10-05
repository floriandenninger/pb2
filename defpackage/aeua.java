package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeua extends afdu {
    public final aetw a;
    public final amnv b;
    private final Handler f;

    public aeua(adxr adxrVar, afhs afhsVar, Handler handler, aetw aetwVar, amnv amnvVar) {
        super(adxrVar, afhsVar);
        this.a = aetwVar;
        this.f = handler;
        this.b = amnvVar;
    }

    public final void a(aesa aesaVar, VideoStreamingData videoStreamingData, boolean z, boolean z2, long j) {
        super.c(aesaVar, videoStreamingData);
        if (this.e.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING)) {
            aesaVar.j("pdl", "onPreparing");
        }
        afdt afdtVar = this.a.c;
        if (afdtVar.b) {
            aesaVar.f("hwh10p", true != afdtVar.c ? "gpu" : "hw");
        }
        if (this.e.N()) {
            String bL = adyu.bL(z);
            String bL2 = adyu.bL(z2);
            StringBuilder sb = new StringBuilder(bL.length() + 8 + bL2.length());
            sb.append("sfo.");
            sb.append(bL);
            sb.append(";po.");
            sb.append(bL2);
            aesaVar.f("esfo", sb.toString());
        }
        aesaVar.f("soc", this.e.au());
        if (videoStreamingData.C() || videoStreamingData.w) {
            aesaVar.f("cat", "manifestless");
        }
        if (j > 0) {
            aesaVar.j("st", Long.toString(j));
        }
    }

    public final void b(final Throwable th) {
        this.f.post(new Runnable() { // from class: aetz
            @Override // java.lang.Runnable
            public final void run() {
                aeua aeuaVar = aeua.this;
                aeuaVar.d.e(new afih("player.exception", ((Long) aeuaVar.b.get()).longValue(), th));
            }
        });
    }
}
