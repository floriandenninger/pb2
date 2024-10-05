package defpackage;

import com.google.protos.youtube.api.innertube.AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wnu implements wnv {
    public final Set a;
    public final xln b;

    public wnu(xln xlnVar, Set set) {
        this.a = set;
        this.b = xlnVar;
    }

    @Override // defpackage.wnv
    public final void a(AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand) {
        int bS = amkq.bS(adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.b);
        if (bS == 0) {
            bS = 1;
        }
        boolean z = adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.d;
        this.b.d(apaa.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_RECEIVED, bS, null, xeo.a);
        ArrayList<xgh> arrayList = new ArrayList();
        Iterator it = adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.c.iterator();
        while (it.hasNext()) {
            apbj apbjVar = ((aoyn) it.next()).d;
            if (apbjVar == null) {
                apbjVar = apbj.a;
            }
            apbi apbiVar = apbjVar.f;
            if (apbiVar == null) {
                apbiVar = apbi.a;
            }
            String str = apbiVar.c;
            apae b = apae.b(apbjVar.c);
            if (b == null) {
                b = apae.SLOT_TYPE_UNSPECIFIED;
            }
            arrayList.add(xgh.i(str, b, apbjVar.e, xcp.b(new xcy[0])));
        }
        this.b.d(apaa.ADS_CLIENT_EVENT_TYPE_OPPORTUNITY_PROCESSED, bS, arrayList, xeo.a);
        if (arrayList.isEmpty()) {
            return;
        }
        for (xgh xghVar : arrayList) {
            this.b.b(apaa.ADS_CLIENT_EVENT_TYPE_SLOT_RECEIVED, xeo.a, xghVar, false);
            amxd listIterator = ((amwf) this.a).listIterator();
            while (listIterator.hasNext()) {
                ((wnr) listIterator.next()).e(xghVar, z);
            }
            z = false;
        }
    }
}
