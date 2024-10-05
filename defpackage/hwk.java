package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwk extends Handler {
    private static final long f = TimeUnit.SECONDS.toMillis(2);
    public final abbm a;
    public final afsy b;
    public final hwh c;
    public final AtomicBoolean d = new AtomicBoolean();
    public apxf e;
    private boolean g;
    private boolean h;
    private boolean i;
    private RecordingInfo j;
    private int k;

    public hwk(abbm abbmVar, afsy afsyVar, hwh hwhVar) {
        this.a = abbmVar;
        this.b = afsyVar;
        this.c = hwhVar;
    }

    public final void a(RecordingInfo recordingInfo, int i) {
        this.k = i;
        sendMessage(obtainMessage(4, recordingInfo));
    }

    public final void b(apxf apxfVar) {
        if (apxfVar != null) {
            this.e = apxfVar;
            this.g = true;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.g = false;
            this.h = false;
            this.d.set(false);
            this.c.aG(null, null, null);
            return;
        }
        if (i == 1) {
            b((apxf) message.obj);
            if (this.i) {
                sendEmptyMessage(5);
                return;
            }
            return;
        }
        if (i == 2) {
            this.h = true;
            if (this.i) {
                sendEmptyMessage(5);
                return;
            }
            return;
        }
        if (i == 3) {
            this.i = false;
            return;
        }
        if (i == 4) {
            this.i = true;
            this.j = (RecordingInfo) message.obj;
            sendEmptyMessage(5);
            return;
        }
        if (i == 5 && this.i) {
            if (this.g) {
                this.c.aU(this.j, this.e, this.k);
                return;
            }
            if (message.arg1 == 1 || this.h) {
                if (message.arg1 == 1) {
                    afsi.b(2, 9, "Reels: Opened edit screen due to timeout");
                }
                hwh hwhVar = this.c;
                RecordingInfo recordingInfo = this.j;
                aong aongVar = (aong) apxf.a.createBuilder();
                aongVar.e(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint, ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.a);
                hwhVar.aU(recordingInfo, (apxf) aongVar.build(), this.k);
                this.d.set(true);
                return;
            }
            this.c.aV();
            sendMessageDelayed(obtainMessage(5, 1, 0), f);
        }
    }
}
