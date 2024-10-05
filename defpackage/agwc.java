package defpackage;

import com.google.android.libraries.youtube.offline.transfer.service.OfflineTransferService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agwc implements Runnable {
    public final /* synthetic */ OfflineTransferService a;
    public final /* synthetic */ agnz b;
    private final /* synthetic */ int c;

    public /* synthetic */ agwc(OfflineTransferService offlineTransferService, agnz agnzVar, int i) {
        this.c = i;
        this.a = offlineTransferService;
        this.b = agnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            OfflineTransferService offlineTransferService = this.a;
            agnz agnzVar = this.b;
            if (agtw.ae(agnzVar.f)) {
                if (agnzVar.b == avjo.TRANSFER_STATE_COMPLETE) {
                    ((agon) offlineTransferService.j.get()).A(agnzVar);
                    return;
                }
                if (agnzVar.b == avjo.TRANSFER_STATE_FAILED) {
                    ((agon) offlineTransferService.j.get()).B(agnzVar);
                    return;
                } else {
                    if (agnzVar.b == avjo.TRANSFER_STATE_TRANSFER_IN_QUEUE && agtw.ai(agnzVar)) {
                        offlineTransferService.r(agnzVar, false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        OfflineTransferService offlineTransferService2 = this.a;
        ((agon) offlineTransferService2.j.get()).z(this.b);
    }
}
