package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hnw extends zys implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    public final SeekBar a;
    public final ayqx b;
    public final hnv c;
    public final ci d;
    public boolean e;
    private final View f;
    private final View g;
    private final int h;

    public hnw(final View view, hnv hnvVar, Context context, ci ciVar, acra acraVar, hmw hmwVar, Executor executor, hrv hrvVar) {
        super(context, ciVar.getSupportFragmentManager(), acraVar, true, true);
        this.c = hnvVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.music_balancer_layout, (ViewGroup) null);
        this.f = inflate;
        this.e = false;
        this.g = view;
        view.setOnClickListener(this);
        this.h = 106445;
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.music_balancer_bar);
        this.a = seekBar;
        this.d = ciVar;
        if (Build.VERSION.SDK_INT >= 29) {
            Rect rect = new Rect();
            seekBar.getHitRect(rect);
            seekBar.setSystemGestureExclusionRects(amru.r(rect));
        }
        seekBar.setOnSeekBarChangeListener(this);
        seekBar.setMax(100);
        this.b = hmwVar.b().ab(azre.b(executor)).ax(new ayrs() { // from class: hnt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                hnw hnwVar = hnw.this;
                View view2 = view;
                ammv ammvVar = (ammv) obj;
                if (ammvVar.h()) {
                    if (((ShortsCreationSelectedTrack) ammvVar.c()).l()) {
                        return;
                    }
                    view2.setVisibility(0);
                    if (hnwVar.e) {
                        return;
                    }
                    hnwVar.E.u(new acqx(acsb.c(106445)), null);
                    hnwVar.e = true;
                    return;
                }
                view2.setVisibility(8);
                hnwVar.E.q(new acqx(acsb.c(106445)), null);
            }
        });
        if (hrvVar.f()) {
            ((TextView) inflate.findViewById(R.id.music_balancer_music_label)).setText(R.string.music_balancer_sound_label);
        }
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.f;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return null;
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void d() {
        super.d();
        this.E.I(3, new acqx(acsb.c(106447)), null);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void e() {
        super.e();
        this.E.n(new acqx(acsb.c(106448)));
        this.E.n(new acqx(acsb.c(106447)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.g) {
            int i = this.h;
            if (i != 0) {
                this.E.I(3, new acqx(acsb.c(i)), null);
            }
            G();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar == this.a && z) {
            float f = 1.0f - (i / 100.0f);
            hht hhtVar = (hht) this.c;
            hiq hiqVar = hhtVar.p;
            if (hiqVar != null) {
                hhtVar.w = f;
                hiqVar.a(f);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (seekBar == this.a) {
            this.E.I(65, new acqx(acsb.c(106448)), null);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
