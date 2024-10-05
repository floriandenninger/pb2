package defpackage;

import android.os.Handler;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BroadcastParticipantJoinScreenRendererOuterClass;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acil implements abxt {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ aciq c;

    public acil(aciq aciqVar, String str, int i) {
        this.c = aciqVar;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.abxt
    public final void a(arqo arqoVar) {
        aciq aciqVar = this.c;
        aulq aulqVar = arqoVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        aciqVar.al = (aplq) aulqVar.pX(BroadcastParticipantJoinScreenRendererOuterClass.broadcastParticipantJoinScreenRenderer);
        aciq aciqVar2 = this.c;
        aciqVar2.aF(aciqVar2.O);
    }

    @Override // defpackage.abxt
    public final void b(int i, aqdt aqdtVar) {
        if (i != 4) {
            Handler handler = this.c.a;
            final String str = this.a;
            final int i2 = this.b;
            handler.postDelayed(new Runnable() { // from class: acik
                @Override // java.lang.Runnable
                public final void run() {
                    acil.this.c.p(str, i2 - 1);
                }
            }, 400L);
            return;
        }
        if (aqdtVar != null) {
            this.c.s(aqdtVar);
        } else {
            Toast.makeText(this.c.C(), R.string.lc_join_stream_failed, 1).show();
        }
        this.c.e.T();
    }
}
