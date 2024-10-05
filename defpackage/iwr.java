package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iwr extends ivr {
    public zaw a;
    public aahd ae;
    public ajoy af;
    public axpg ag;
    public String ah;
    public aucj ai;
    public gad aj;
    public LoadingFrameLayout ak;
    public lwp al;
    public akht am;
    public ypa b;
    public afsy c;
    public ajjz d;
    public abav e;

    @Override // defpackage.gir, defpackage.ce
    public final void Z() {
        super.Z();
        if (this.c.t()) {
            return;
        }
        this.at.c(false);
    }

    @Override // defpackage.gir
    public final gad lv() {
        if (this.aj == null) {
            this.aj = q();
        }
        return this.aj;
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.b.m(this.al);
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.ah = this.m.getString("playlist_id");
    }

    @Override // defpackage.gir, defpackage.ce
    public final void mS() {
        super.mS();
        this.b.g(this.al);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.playlist_editor_collaboration_section_fragment, viewGroup, false);
        this.ak = loadingFrameLayout;
        loadingFrameLayout.f(new iwp(this));
        this.al = new lwp(this.ap, this.ae, this.af, this.ah, this.ak, this.am, this.d, mM(), null, null, null, null);
        r(this.ah);
        return this.ak;
    }

    public final gad q() {
        final CharSequence charSequence;
        aucj aucjVar = this.ai;
        if (aucjVar != null) {
            aqyg aqygVar = aucjVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            charSequence = ajcq.b(aqygVar);
        } else {
            charSequence = "";
        }
        gac a = this.as.a();
        a.m(new amml() { // from class: iwo
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                fzf fzfVar = (fzf) obj;
                fzfVar.a = charSequence;
                fzfVar.d(amvs.a);
                return fzfVar;
            }
        });
        return a.a();
    }

    public final void r(String str) {
        abas e = this.e.e();
        e.d(str);
        e.m(aaef.b);
        this.ak.c();
        this.e.h(e, new iwq(this));
    }
}
