package defpackage;

import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gqf extends gtr {
    private final aahd h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gqf(android.content.Context r9, defpackage.ypa r10, defpackage.aaxr r11, defpackage.zaw r12, defpackage.aahd r13, java.util.concurrent.Executor r14) {
        /*
            r8 = this;
            r11.getClass()
            gsh r5 = new gsh
            r0 = 1
            r5.<init>(r11, r0)
            r11.getClass()
            gsg r6 = new gsg
            r6.<init>(r11, r0)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.h = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqf.<init>(android.content.Context, ypa, aaxr, zaw, aahd, java.util.concurrent.Executor):void");
    }

    @Override // defpackage.gtr
    protected final int b() {
        return R.string.watch_history_clear;
    }

    @Override // defpackage.gtr
    protected final int c() {
        return R.string.watch_history_clear_confirmation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gtr
    public final int d() {
        return R.string.watch_history_clear_done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gtr
    public final aasz e(apxf apxfVar, Object obj) {
        return new exg(apxfVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gtr
    public final void f(apxf apxfVar) {
        this.h.d(((ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint) apxfVar.pX(ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.clearWatchHistoryEndpoint)).b, null);
    }
}
