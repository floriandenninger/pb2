package defpackage;

import android.view.KeyEvent;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class htq implements htv {
    public final /* synthetic */ htu a;

    public htq(htu htuVar) {
        this.a = htuVar;
    }

    @Override // defpackage.htv
    public final boolean a(int i, KeyEvent keyEvent) {
        ce e = this.a.mN().e(R.id.reel_container);
        if (!e.av() || !(e instanceof htl)) {
            return false;
        }
        htl htlVar = (htl) e;
        if (htlVar.aT()) {
            return false;
        }
        hvz hvzVar = htlVar.an;
        if (hvzVar != null) {
            return hvzVar.f(i, keyEvent);
        }
        if (i != 24 && i != 25) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // defpackage.htv
    public final boolean b(int i) {
        ce e = this.a.mN().e(R.id.reel_container);
        if (e.av() && (e instanceof htl)) {
            htl htlVar = (htl) e;
            if (!htlVar.aT()) {
                hvz hvzVar = htlVar.an;
                if (hvzVar != null) {
                    return hvzVar.g(i);
                }
                if (i == 24 || i == 25) {
                    htlVar.aR();
                    htlVar.ao = true;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.htv
    public final boolean c(int i) {
        ce e = this.a.mN().e(R.id.reel_container);
        if (e.av() && (e instanceof htl)) {
            htl htlVar = (htl) e;
            if (!htlVar.aT()) {
                hvz hvzVar = htlVar.an;
                if (hvzVar != null) {
                    return hvzVar.h(i);
                }
                if (i == 24 || i == 25) {
                    if (htlVar.ao) {
                        htlVar.ao = false;
                    } else if (!htlVar.am.I()) {
                        htlVar.aR();
                        return true;
                    }
                    htlVar.aK();
                    return true;
                }
            }
        }
        return false;
    }
}
