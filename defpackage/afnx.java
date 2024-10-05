package defpackage;

import com.google.protos.youtube.api.innertube.UserMentionSuggestionRendererOuterClass;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afnx implements afwx {
    final /* synthetic */ afny a;

    public afnx(afny afnyVar) {
        this.a = afnyVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        ased asedVar = (ased) obj;
        afny afnyVar = this.a;
        if (asedVar.d.equals(afnyVar.f)) {
            ((acqq) afnyVar.c).D(new acqx(asedVar.e));
            int size = afnyVar.e.size();
            afnyVar.e.clear();
            Iterator it = asedVar.c.iterator();
            while (it.hasNext()) {
                afnyVar.e.add(((aulq) it.next()).pX(UserMentionSuggestionRendererOuterClass.userMentionSuggestionRenderer));
            }
            boolean z = asedVar.c.size() == 0;
            afnyVar.b.d(z);
            if (size == 0 && !z) {
                afnyVar.i(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_BOX_OPENED);
            }
            afnyVar.i(avut.USER_MENTION_AUTO_COMPLETE_BOX_EVENT_TYPE_CONTENT_UPDATED);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
