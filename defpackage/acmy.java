package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;
import org.webrtc.AudioTrack;
import org.webrtc.PeerConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acmy implements Runnable {
    final /* synthetic */ acnd a;
    private final /* synthetic */ int b;

    public acmy(acnd acndVar, int i) {
        this.b = i;
        this.a = acndVar;
    }

    public /* synthetic */ acmy(acnd acndVar, int i, byte[] bArr) {
        this.b = i;
        this.a = acndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        acnk acnkVar;
        AudioTrack audioTrack;
        if (this.b == 0) {
            acnd acndVar = this.a;
            PeerConnection peerConnection = acndVar.y;
            if (peerConnection != null && (acnkVar = acndVar.p) != null && (audioTrack = acndVar.v) != null && acndVar.w != null) {
                peerConnection.a(acnkVar, audioTrack);
                acnd acndVar2 = this.a;
                acndVar2.y.a(acndVar2.p, acndVar2.w);
                acnk acnkVar2 = this.a.p;
                long j = acnkVar2.e;
                if (j > 0 && acnkVar2.d - j > TimeUnit.MILLISECONDS.toNanos(5000L)) {
                    zga.c("PeerConnectionClient", "Bitrate stalled, report connection error");
                    acog acogVar = this.a.A;
                    if (acogVar != null) {
                        acogVar.a();
                    }
                }
            }
            acnd acndVar3 = this.a;
            Handler handler = acndVar3.j;
            if (handler != null) {
                handler.postDelayed(acndVar3.b, acnd.a);
                return;
            }
            return;
        }
        acnd acndVar4 = this.a;
        acndVar4.j.removeCallbacks(acndVar4.b);
    }
}
