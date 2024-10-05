package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class edv implements aypb {
    final /* synthetic */ edw a;

    public edv(edw edwVar) {
        this.a = edwVar;
    }

    @Override // defpackage.aypb
    public final void a() {
        ((amxh) ((amxh) edw.a.b()).i("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector$1", "onCompleted", 64, "GrpcConnector.java")).q("onCompleted()");
    }

    @Override // defpackage.aypb
    public final void b(Throwable th) {
        ((amxh) ((amxh) ((amxh) edw.a.g()).h(th)).i("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector$1", "onError", ':', "GrpcConnector.java")).q("onError()");
        aclt acltVar = this.a.b.e;
        int i = gxd.b;
    }

    @Override // defpackage.aypb
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        sgh sghVar = (sgh) obj;
        ((amxh) ((amxh) edw.a.b()).i("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector$1", "onNext", 49, "GrpcConnector.java")).s("onNext(%s)", sghVar);
        if ((sghVar.b & 1) != 0) {
            if (sghVar.c == null) {
                int i = sgl.a;
            }
            Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", this.a.b.e));
        }
    }
}
