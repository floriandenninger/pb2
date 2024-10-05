package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jcx extends jdm {
    public jcx(adlt adltVar, aihs aihsVar, zaw zawVar, Context context, aild aildVar) {
        super(adltVar, aihsVar, zawVar, context, aildVar);
    }

    @Override // defpackage.jdm
    protected final String b(apxf apxfVar) {
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint) apxfVar.pX(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        if (apxfVar.pY(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint)) {
            return insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.c;
        }
        throw new aahm("InsertInRemoteQueueEndpoint not present in the given Command.");
    }

    @Override // defpackage.jdm
    protected final String c(apxf apxfVar) {
        InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint = (InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint) apxfVar.pX(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint);
        if (apxfVar.pY(InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint)) {
            return insertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.b;
        }
        throw new aahm("InsertInRemoteQueueEndpoint not present in the given Command.");
    }

    @Override // defpackage.jdm
    protected final void d(String str) {
        adlm f = f();
        if (f == null || f.a() != 1) {
            return;
        }
        f.F(str);
        whu.K(this.b, R.string.videos_added_to_tv_queue, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jdm
    public final void e(String str) {
        adlm f = f();
        if (f == null || f.a() != 1) {
            return;
        }
        f.G(str);
        whu.K(this.b, R.string.video_added_to_tv_queue, 0);
    }
}
