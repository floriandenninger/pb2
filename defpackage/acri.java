package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acri extends ce {
    private String a;

    protected apxf kx() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return aahg.b(bundle.getByteArray("navigation_endpoint"));
        }
        return null;
    }

    protected asht ky() {
        return null;
    }

    protected acra mM() {
        throw null;
    }

    @Override // defpackage.ce
    public View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        acra mM = mM();
        if (mM == null || p() == null) {
            zga.b("InteractionLogger or pageVeType is null in InteractionLoggingFragment!");
        } else {
            apxf kx = kx();
            if (kx == null) {
                kx = null;
            } else if (!TextUtils.isEmpty(this.a)) {
                aone createBuilder = atmc.a.createBuilder();
                if (kx.pY(atmb.b)) {
                    createBuilder = ((atmc) kx.pX(atmb.b)).toBuilder();
                }
                String str = this.a;
                createBuilder.copyOnWrite();
                atmc atmcVar = (atmc) createBuilder.instance;
                str.getClass();
                atmcVar.b |= 32;
                atmcVar.f = str;
                aong aongVar = (aong) kx.toBuilder();
                aongVar.e(atmb.b, (atmc) createBuilder.build());
                kx = (apxf) aongVar.build();
            }
            mM.d(p(), kx, ky());
            if (mM.c() != null) {
                this.a = mM().c().a;
            }
        }
        return super.mg(layoutInflater, viewGroup, bundle);
    }

    protected abstract acsc p();
}
