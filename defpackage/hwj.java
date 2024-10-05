package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwj extends AsyncTask {
    public final hwh a;
    public final Handler b;
    public final AtomicBoolean c;
    private final abbm d;
    private final ztn e;
    private final afsy f;
    private final aone g;

    public hwj(hwh hwhVar, Handler handler, abbm abbmVar, ztn ztnVar, afsy afsyVar, AtomicBoolean atomicBoolean, apxf apxfVar) {
        aone createBuilder = arsa.a.createBuilder();
        this.g = createBuilder;
        this.a = hwhVar;
        this.b = handler;
        this.d = abbmVar;
        this.e = ztnVar;
        this.f = afsyVar;
        this.c = atomicBoolean;
        if (apxfVar == null || !apxfVar.pY(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint) || (((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) apxfVar.pX(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).b & 16) == 0) {
            return;
        }
        String str = ((LightweightCameraEndpointOuterClass$LightweightCameraEndpoint) apxfVar.pX(LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint)).f;
        createBuilder.copyOnWrite();
        arsa arsaVar = (arsa) createBuilder.instance;
        str.getClass();
        arsaVar.b |= 4;
        arsaVar.e = str;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        avwv b = ((htp) this.e).a.b();
        if (b != null) {
            aone aoneVar = this.g;
            aoneVar.copyOnWrite();
            arsa arsaVar = (arsa) aoneVar.instance;
            arsa arsaVar2 = arsa.a;
            arsaVar.d = b;
            arsaVar.b |= 2;
        } else {
            aone aoneVar2 = this.g;
            aoneVar2.copyOnWrite();
            arsa arsaVar3 = (arsa) aoneVar2.instance;
            arsa arsaVar4 = arsa.a;
            arsaVar3.d = null;
            arsaVar3.b &= -3;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        try {
            abbm abbmVar = this.d;
            aone aoneVar = this.g;
            abbl abblVar = new abbl(abbmVar.f, this.f.c(), aoneVar, null, null, null);
            abblVar.k();
            abblVar.i = aaec.b(abbmVar.g);
            abbmVar.c.e(abblVar, new hwi(this));
        } catch (aasx e) {
            zga.d("Failed to get camera info", e);
        }
    }
}
