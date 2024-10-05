package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class vwl extends RelativeLayout implements SeekBar.OnSeekBarChangeListener, vsz, oxj {
    public final Runnable a;
    public long b;
    public oxk c;
    boolean d;
    public final List e;
    private TextView f;
    private TextView g;
    private SeekBar h;
    private int i;
    private int j;
    private vsy k;
    private final Set l;
    private final List m;

    public vwl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new vwi(this, 1);
        this.i = -1;
        this.j = -1;
        this.l = new HashSet();
        this.d = false;
        this.m = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
    }

    private final long v() {
        vsy vsyVar = this.k;
        if (vsyVar != null) {
            return vsyVar.m();
        }
        return 0L;
    }

    private final long w() {
        vsy vsyVar = this.k;
        if (vsyVar != null) {
            return vsyVar.n();
        }
        return 0L;
    }

    private final void x(long j) {
        oxk oxkVar = this.c;
        if (oxkVar == null) {
            return;
        }
        double d = j;
        Double.isNaN(d);
        oxkVar.j((long) Math.ceil(d / 1000.0d));
    }

    public void a(vsy vsyVar, Set set) {
        this.l.addAll(set);
        if (this.c != null) {
            this.d = u();
            this.c.l(false);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b(vsyVar, ((Integer) it.next()).intValue());
        }
    }

    @Override // defpackage.vsz
    public final void b(vsy vsyVar, int i) {
        if (this.c == null) {
            return;
        }
        if (i == 0) {
            x(vsyVar.n());
        } else if (i == 1 && !this.l.contains(0)) {
            x(vsyVar.l());
        }
        r();
    }

    public void c(vsy vsyVar, Set set) {
        this.l.removeAll(set);
        oxk oxkVar = this.c;
        if (oxkVar == null) {
            return;
        }
        long c = oxkVar.c() * 1000;
        if (set.contains(0)) {
            c = vsyVar.n();
        } else if (set.contains(1)) {
            c = Math.max(vsyVar.l() - (true != this.d ? 0L : 1000000L), vsyVar.n());
        }
        if (set.size() == 1 && set.contains(2)) {
            return;
        }
        x(c);
        this.c.l(this.d);
    }

    public final long d() {
        vsy vsyVar = this.k;
        if (vsyVar != null) {
            return vsyVar.k();
        }
        oxk oxkVar = this.c;
        if (oxkVar != null) {
            return ((vwm) oxkVar).a.d();
        }
        return 0L;
    }

    public final void e(vxb vxbVar) {
        this.m.add(vxbVar);
    }

    public final void f(boolean z) {
        vsy vsyVar = this.k;
        if (vsyVar != null) {
            vsyVar.a.h = z;
        }
        r();
        s();
    }

    public final void g() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((vxb) it.next()).aH(u());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(TextView textView, TextView textView2, SeekBar seekBar) {
        vcp.d(this.h == null);
        textView.getClass();
        this.f = textView;
        textView2.getClass();
        this.g = textView2;
        seekBar.getClass();
        this.h = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
    }

    public final void i() {
        x(w());
    }

    public final void j(vxb vxbVar) {
        this.m.remove(vxbVar);
    }

    public final void n(oxk oxkVar) {
        oxk oxkVar2 = this.c;
        if (oxkVar2 != null) {
            oxkVar2.i(this);
        }
        this.c = oxkVar;
        if (oxkVar != null) {
            oxkVar.e(this);
        }
        q();
        g();
    }

    public final void o(vsy vsyVar) {
        vsy vsyVar2 = this.k;
        if (vsyVar2 != null) {
            vsyVar2.u(this);
        }
        this.k = vsyVar;
        if (vsyVar != null) {
            vsyVar.q(this);
        }
        r();
        s();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            x(w() + (i * 1000));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (this.c != null) {
            this.d = u();
            this.c.l(false);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        oxk oxkVar = this.c;
        if (oxkVar != null) {
            oxkVar.l(this.d);
        }
    }

    public void p() {
        if (this.c == null) {
            return;
        }
        boolean u = u();
        if (!u && t()) {
            i();
        }
        this.c.l(!u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void q();

    public final void r() {
        if (this.c == null) {
            return;
        }
        long d = d() - v();
        if (this.l.isEmpty()) {
            this.h.setMax((int) d);
        }
        int i = (int) (d / 1000);
        if (i != this.j) {
            this.j = i;
            this.g.setText(vlu.g(getContext(), this.j * 1000, false));
            this.g.setContentDescription(vlu.h(getContext(), R.string.edited_video_duration_content_description, this.j * 1000));
        }
    }

    @Override // defpackage.oxj
    public final void rB() {
    }

    @Override // defpackage.oxj
    public final void rC(oxh oxhVar) {
    }

    @Override // defpackage.oxj
    public final void rD(boolean z, int i) {
        post(new vwi(this, 0));
    }

    public final void s() {
        oxk oxkVar = this.c;
        if (oxkVar == null) {
            return;
        }
        long c = oxkVar.c() - v();
        if (this.l.isEmpty()) {
            this.h.setProgress((int) c);
        } else {
            c = 0;
        }
        int i = (int) (c / 1000);
        if (i != this.i) {
            this.i = i;
            this.f.setText(vlu.g(getContext(), this.i * 1000, false));
            this.f.setContentDescription(vlu.h(getContext(), R.string.current_playback_time_content_description, this.i * 1000));
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((vxa) it.next()).aI(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean t() {
        oxk oxkVar = this.c;
        return oxkVar != null && oxkVar.c() >= d();
    }

    public final boolean u() {
        oxk oxkVar = this.c;
        return oxkVar != null && oxkVar.o();
    }
}
