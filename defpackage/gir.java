package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gir extends ce implements acqz, gka {
    public ml ap;
    public gad aq;
    public axpg ar;
    public gad as;
    public giv at;
    public gje au;
    public aadw av;

    @Override // defpackage.ce
    public void U(Activity activity) {
        super.U(activity);
        this.ap = (ml) activity;
    }

    @Override // defpackage.ce
    public void Z() {
        super.Z();
        if (evr.bA()) {
            return;
        }
        this.au.t(this);
    }

    public int aK() {
        return Integer.MAX_VALUE;
    }

    public gad aL() {
        return this.as;
    }

    public gad aM(gad gadVar) {
        return gadVar;
    }

    public final apxf aN() {
        return PaneDescriptor.b(this).e();
    }

    public aypy aO() {
        return aypy.W(Optional.empty());
    }

    public aypy aP() {
        return aypy.R(gip.a);
    }

    public aypy aQ() {
        return aypy.W(true);
    }

    public Optional aR(PaneDescriptor paneDescriptor) {
        return Optional.empty();
    }

    public CharSequence aS() {
        return null;
    }

    public Object aT() {
        return null;
    }

    public String aU() {
        return null;
    }

    @Override // defpackage.gka
    public void aV(int i) {
    }

    public void aW() {
    }

    public void aX() {
    }

    public void aY(Object obj) {
    }

    public void aZ(boolean z) {
    }

    public final boolean ba() {
        Bundle bundle = this.m;
        return bd() && bundle != null && bundle.getBoolean("needs_nested_header", false);
    }

    public boolean bb() {
        return false;
    }

    public final boolean bc() {
        return this.C != null;
    }

    public final boolean bd() {
        gir girVar = (gir) this.C;
        return girVar != null && girVar.bb();
    }

    public boolean be() {
        return false;
    }

    public boolean bf() {
        return false;
    }

    @Override // defpackage.ce
    public void lZ() {
        super.lZ();
        mM().t();
    }

    public gad lv() {
        if (this.aq == null && aL() != null) {
            if (aS() == null) {
                this.aq = aL();
            } else {
                gac a = aL().a();
                a.m(new amml() { // from class: gio
                    @Override // defpackage.amml
                    public final Object apply(Object obj) {
                        fzf fzfVar = (fzf) obj;
                        fzfVar.a = gir.this.aS();
                        return fzfVar;
                    }
                });
                this.aq = a.a();
            }
        }
        gad gadVar = this.aq;
        gadVar.getClass();
        return gadVar;
    }

    @Override // defpackage.acqz
    public final acra mM() {
        axpg axpgVar = this.ar;
        return axpgVar == null ? acra.l : (acra) axpgVar.get();
    }

    @Override // defpackage.ce
    public void mR(Bundle bundle) {
        super.mR(bundle);
        gir girVar = (gir) this.C;
        if (girVar != null) {
            girVar.aR(PaneDescriptor.b(this)).ifPresent(new Consumer() { // from class: giq
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    gir.this.aY(obj);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.ce
    public void mS() {
        super.mS();
        if (evr.bA()) {
            this.au.t(this);
        }
    }

    public void mT() {
    }
}
