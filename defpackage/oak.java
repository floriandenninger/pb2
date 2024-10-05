package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oak {
    public final adlt a;
    public final ImageView c;
    public final ProgressBar d;
    public int f;
    public oai g;
    public boolean h;
    public final nzu i;
    private boolean j;
    private boolean k;
    private int l = 1;
    public final xkl e = new oaj(this);
    public final Set b = new HashSet();

    public oak(ImageView imageView, ProgressBar progressBar, nzu nzuVar, adlt adltVar) {
        this.c = imageView;
        this.d = progressBar;
        this.i = nzuVar;
        this.a = adltVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahep ahepVar) {
        Set set = this.b;
        ahepVar.getClass();
        set.add(ahepVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.j = z;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.k = z;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        oai oaiVar = this.g;
        if (oaiVar == null) {
            return;
        }
        if (this.h) {
            oaiVar.a(this.l);
            return;
        }
        int i = 0;
        int i2 = 1;
        if (this.k) {
            oaiVar.a.setOnClickListener(new oah(oaiVar, i));
            oaiVar.a.setEnabled(true);
            oaiVar.b.setVisibility(8);
            if (oaiVar.e == null) {
                oaiVar.e = aii.a(oaiVar.a.getContext(), R.drawable.quantum_ic_stop_grey600_24);
            }
            oaiVar.b(oaiVar.e, R.string.playback_control_stop);
            return;
        }
        if (this.j) {
            oaiVar.a.setOnClickListener(new oah(oaiVar, i2));
            oaiVar.a.setEnabled(true);
            oaiVar.b.setVisibility(0);
            if (oaiVar.f == null) {
                oaiVar.f = aii.a(oaiVar.a.getContext(), R.drawable.floatybar_progress_circle_autonav);
            }
            Drawable drawable = oaiVar.f;
            if (drawable != null) {
                oaiVar.b.setProgressDrawable(drawable);
            }
            if (oaiVar.d == null) {
                oaiVar.d = aii.a(oaiVar.a.getContext(), R.drawable.floatybar_progress_selector);
            }
            oaiVar.b(oaiVar.d, R.string.autonav_a11y);
            return;
        }
        oaiVar.a(this.l);
    }

    public final void e(int i) {
        this.l = i;
        d();
    }
}
