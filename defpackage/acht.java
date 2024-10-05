package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatRecyclerView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acht extends achf {
    public abht a;
    public ajgq ae;
    public sxw af;
    public azrw ag;
    public abiy ah;
    public ajvb ai;
    public achq aj;
    public Activity ak;
    public LiveChatRecyclerView al;
    public View am;
    public apxf an;
    public asrc ao;
    public boolean ap;
    public boolean aq;
    public sqq ar;
    public axze as;
    private achr at;
    public abhh b;
    public acra c;
    public ajoy d;
    public abjr e;

    @Override // defpackage.achf, defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        this.ak = activity;
        ajsm.b(activity.getApplicationContext());
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.a.r();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        if (this.a.D()) {
            this.a.u();
        } else {
            o();
        }
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.a.C();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lc_live_chat_fragment, viewGroup, false);
        this.al = (LiveChatRecyclerView) inflate.findViewById(R.id.conversation_list);
        this.am = inflate.findViewById(R.id.more_comments_icon);
        this.e.c = true;
        this.at = new achr(this, this.ai);
        this.al.setOnTouchListener(new achp(this, new ScaleGestureDetector(C(), new achs(this))));
        return inflate;
    }

    public final void o() {
        this.a.w(this.at);
        asrc asrcVar = this.ao;
        if (asrcVar != null) {
            int i = asrcVar.b;
            if ((i & 1) != 0) {
                abht abhtVar = this.a;
                aulm aulmVar = asrcVar.c;
                if (aulmVar == null) {
                    aulmVar = aulm.a;
                }
                abhtVar.z(ahbj.o(aulmVar));
            } else if ((i & 2) != 0) {
                abht abhtVar2 = this.a;
                avgs avgsVar = asrcVar.d;
                if (avgsVar == null) {
                    avgsVar = avgs.a;
                }
                abhtVar2.z(ahbj.o(avgsVar));
            } else if ((i & 4) != 0) {
                abht abhtVar3 = this.a;
                asjj asjjVar = asrcVar.e;
                if (asjjVar == null) {
                    asjjVar = asjj.a;
                }
                abhtVar3.z(ahbj.o(asjjVar));
            } else if ((i & 8) != 0) {
                abht abhtVar4 = this.a;
                asrd asrdVar = asrcVar.f;
                if (asrdVar == null) {
                    asrdVar = asrd.a;
                }
                abhtVar4.z(ahbj.o(asrdVar));
            } else if ((i & 16) != 0) {
                abht abhtVar5 = this.a;
                auah auahVar = asrcVar.g;
                if (auahVar == null) {
                    auahVar = auah.a;
                }
                abhtVar5.z(ahbj.o(auahVar));
            }
        } else {
            apxf apxfVar = this.an;
            if (apxfVar != null) {
                this.a.A(apxfVar);
            }
        }
        this.b.a = this.a;
    }
}
