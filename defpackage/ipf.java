package defpackage;

import com.google.protos.youtube.api.innertube.UserMentionSuggestionRendererOuterClass;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ipf implements afwx {
    final /* synthetic */ iph a;

    public ipf(iph iphVar) {
        this.a = iphVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        ased asedVar = (ased) obj;
        iph iphVar = this.a;
        if (asedVar.d.equals(iphVar.h)) {
            iphVar.e.D(new acqx(asedVar.e));
            int size = iphVar.g.size();
            iphVar.g.clear();
            Iterator it = asedVar.c.iterator();
            while (it.hasNext()) {
                iphVar.g.add(((aulq) it.next()).pX(UserMentionSuggestionRendererOuterClass.userMentionSuggestionRenderer));
            }
            boolean z = asedVar.c.size() == 0;
            iphVar.c.e(z);
            if (size == 0 && !z) {
                iphVar.c(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_BOX_OPENED);
            }
            iphVar.c(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_CONTENT_UPDATED);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
