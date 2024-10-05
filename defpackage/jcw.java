package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jcw extends jdm {
    private final nne e;
    private final obr f;
    private final boolean g;

    public jcw(adlt adltVar, aihs aihsVar, zaw zawVar, Context context, aild aildVar, nne nneVar, obr obrVar, aadw aadwVar) {
        super(adltVar, aihsVar, zawVar, context, aildVar);
        this.e = nneVar;
        this.f = obrVar;
        atax ataxVar = aadwVar.b().n;
        this.g = (ataxVar == null ? atax.a : ataxVar).k;
    }

    @Override // defpackage.jdm
    protected final String b(apxf apxfVar) {
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint) apxfVar.pX(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        if (apxfVar.pY(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint)) {
            return addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.c;
        }
        throw new aahm("AddToRemoteQueueEndpoint not present in the given Command.");
    }

    @Override // defpackage.jdm
    protected final String c(apxf apxfVar) {
        AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint = (AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint) apxfVar.pX(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint);
        if (apxfVar.pY(AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint)) {
            return addToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.b;
        }
        throw new aahm("AddToRemoteQueueEndpoint not present in the given Command.");
    }

    @Override // defpackage.jdm
    protected final void d(String str) {
        adlm f = f();
        if (f == null || f.a() != 1) {
            return;
        }
        f.z(str);
        if (this.g && this.f.c()) {
            this.e.r(1, 2);
        }
        whu.K(this.b, R.string.videos_added_to_tv_queue, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jdm
    public final void e(String str) {
        adlm f = f();
        if (f == null || f.a() != 1) {
            return;
        }
        f.B(str);
        if (this.g && this.f.c()) {
            this.e.r(1, 2);
        }
        whu.K(this.b, R.string.video_added_to_tv_queue, 0);
    }
}
