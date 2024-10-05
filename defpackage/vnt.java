package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vnt extends vob {
    public tiw ae;
    public tiu af;

    @Override // defpackage.vob, defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        if (this.ag) {
            return;
        }
        axfq.o(this);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        tiw tiwVar = this.ae;
        amkq.O(this.X.b == aoe.INITIALIZED, "Must be called in onCreate");
        tgn tgnVar = tiwVar.a;
        tgd tgdVar = tiwVar.b;
        this.af = new tiu(tgnVar, this);
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        algs algsVar = new algs(qR());
        algsVar.r(R.string.op3_edit_shape_message);
        algsVar.s(R.string.op3_update_got_it);
        mi b = algsVar.b();
        final DialogInterface.OnShowListener onShowListener = new DialogInterface.OnShowListener() { // from class: vns
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View a;
                vnt vntVar = vnt.this;
                tiu tiuVar = vntVar.af;
                tgn tgnVar = tiuVar.a;
                final View F = sgf.F(tiuVar.b);
                tfy tfyVar = new tfy(awxk.u(89739), new amml() { // from class: tgl
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        View view = F;
                        tgb tgbVar = (tgb) obj;
                        tgb b2 = tgj.b(view);
                        if (b2 != null) {
                            if (b2.c()) {
                                if (b2.d()) {
                                    aoae.z(new IllegalStateException("CVE is already impressed and cannot be replaced."));
                                } else {
                                    aoae.z(new IllegalStateException("CVE is already attached and cannot be replaced."));
                                }
                            } else {
                                b2.b(tgbVar);
                            }
                            return b2;
                        }
                        tgj.q(view, tgbVar);
                        return tgbVar;
                    }
                }, tgnVar.b, null, null, null, null, null, null, null);
                tgb b2 = tgj.b(sgf.F(vntVar));
                b2.getClass();
                ce ceVar = vntVar.C;
                while (true) {
                    if (ceVar == null) {
                        a = tgj.a(vntVar.C());
                        break;
                    }
                    a = ceVar.O;
                    if (a != null) {
                        break;
                    } else {
                        ceVar = ceVar.C;
                    }
                }
                tgb b3 = tgj.b(a);
                amkq.O(b3 != null, "Parent fragment/activity must be instrumented");
                amkq.F(b2.a instanceof tgj, "Cannot reparent synthetic nodes.");
                amkq.F(true ^ b2.d(), "Node is already impressed.");
                b3.a.d(b2);
            }
        };
        b.setOnShowListener(new DialogInterface.OnShowListener() { // from class: tiv
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                bv bvVar = bv.this;
                DialogInterface.OnShowListener onShowListener2 = onShowListener;
                if (dialogInterface == null || bvVar.d == null) {
                    return;
                }
                onShowListener2.onShow(dialogInterface);
            }
        });
        return b;
    }
}
