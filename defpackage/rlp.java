package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rlp extends rlw {
    final /* synthetic */ rpv a;

    public rlp(rpv rpvVar) {
        this.a = rpvVar;
    }

    @Override // defpackage.rlw
    public final void a(Status status, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        qar.o(status, mdpCarrierPlanIdResponse, this.a);
    }
}
