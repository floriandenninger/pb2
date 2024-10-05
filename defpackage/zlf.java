package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.youtube.R;
import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zlf extends Observable implements oxj {
    public final acra a;
    public oxk b;
    private final Context c;
    private final boolean d;
    private Track e;

    public zlf(Context context, acra acraVar, boolean z) {
        oxk r = opn.r(1, 5000, 5000);
        this.c = context;
        this.a = acraVar;
        this.d = z;
        this.b = r;
        r.e(this);
        if (acraVar != null) {
            acraVar.n(new acqx(acsb.c(10715)));
            acraVar.n(new acqx(acsb.c(10714)));
            acraVar.n(new acqx(acsb.c(10713)));
        }
    }

    public final void a(boolean z) {
        acra acraVar;
        if (!c(null) || !z || (acraVar = this.a) == null || ((acqq) acraVar).g == null) {
            return;
        }
        acraVar.I(3, new acqx(acsb.c(10715)), null);
    }

    public final boolean b(Track track) {
        Track track2 = this.e;
        track.getClass();
        return amkq.b(track2, track) && ((oxm) this.b).e != 5;
    }

    public final boolean c(Track track) {
        oyr oxoVar;
        if (amkq.b(this.e, track)) {
            return false;
        }
        this.e = track;
        this.b.n();
        Track track2 = this.e;
        if (track2 != null) {
            if (this.d) {
                oxoVar = new pcg(this.e.d, new pfv(this.c, pgz.l(this.c, "AudioMPEG")), new pft(65536), 1310720, new pbz[0]);
            } else {
                oxoVar = new oxo(this.c, track2.d);
            }
            this.b.g(new oxt(oxoVar, oxv.a));
            this.b.j(0L);
            this.b.l(true);
        }
        setChanged();
        notifyObservers(this);
        return true;
    }

    @Override // defpackage.oxj
    public final void rB() {
    }

    @Override // defpackage.oxj
    public final void rC(oxh oxhVar) {
        Toast.makeText(this.c, R.string.upload_edit_audio_swap_preview_error, 0).show();
        acra acraVar = this.a;
        if (acraVar != null && ((acqq) acraVar).g != null) {
            acraVar.u(new acqx(acsb.c(10713)), null);
        }
        c(null);
    }

    @Override // defpackage.oxj
    public final void rD(boolean z, int i) {
        if (i == 5) {
            c(null);
        }
    }
}
