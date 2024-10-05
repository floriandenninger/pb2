package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class mvp extends mkq {
    public mvp(aahd aahdVar, ajut ajutVar, Context context, ViewGroup viewGroup) {
        super(aahdVar, ajutVar, context, viewGroup, R.layout.slim_metadata_button, null);
    }

    @Override // defpackage.mkq
    protected final /* bridge */ /* synthetic */ apmp e(Object obj) {
        apmh apmhVar = ((auvr) obj).g;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmp apmpVar = apmhVar.d;
        return apmpVar == null ? apmp.a : apmpVar;
    }

    @Override // defpackage.mkq
    public final boolean i() {
        if (!((auvr) this.g).pY(auvj.b) || !((Boolean) ((auvr) this.g).pX(auvj.b)).booleanValue()) {
            m(this.f.e);
        }
        return ((Boolean) ((auvr) this.g).pX(auvj.c)).booleanValue();
    }

    public void k(auvr auvrVar) {
        super.h(auvrVar);
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z) {
        aong aongVar = (aong) ((auvr) this.g).toBuilder();
        aongVar.e(auvj.b, true);
        aongVar.e(auvj.c, Boolean.valueOf(z));
        this.g = aongVar.build();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        apxf apxfVar;
        if (i()) {
            apmp apmpVar = this.f;
            if ((apmpVar.b & 16384) != 0) {
                apxfVar = apmpVar.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.a.c(apxfVar, hashMap);
            }
        } else {
            apmp apmpVar2 = this.f;
            if ((apmpVar2.b & 512) != 0) {
                apxfVar = apmpVar2.k;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                this.a.c(apxfVar, hashMap2);
            }
        }
        apmp apmpVar3 = this.f;
        if ((apmpVar3.b & 1024) != 0) {
            apxf apxfVar2 = apmpVar3.l;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
            this.a.c(apxfVar2, hashMap3);
        }
        if (this.f.u) {
            return;
        }
        m(!i());
        g();
    }

    public mvp(aahd aahdVar, ajut ajutVar, Context context, ViewGroup viewGroup, int i, mvo mvoVar) {
        super(aahdVar, ajutVar, context, viewGroup, i, mvoVar);
    }
}
