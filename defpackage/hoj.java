package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.DspSeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ui.MusicWaveformView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.player.ui.PlayerView;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hoj extends zys implements View.OnClickListener, hni {
    final SeekBar.OnSeekBarChangeListener A;
    public acsc B;
    public final orr C;
    public jqr D;
    private final hmg F;
    private final View G;
    private final TextView H;
    private final PlayerView I;

    /* renamed from: J, reason: collision with root package name */
    private ayqx f218J;
    private hoh K;
    private apxf L;
    private boolean M;
    private DspSeekBar N;
    private final hog O;
    public final Context a;
    public final Executor b;
    public final dd c;
    public final ajjv d;
    public final ajjz e;
    public final hmw f;
    public final hrv g;
    public final ImageView h;
    public final int i;
    public final Handler j;
    public final TextView k;
    public final SeekBar l;
    public final MusicWaveformView m;
    public final boolean n;
    public hnf o;
    public final boolean p;
    public final hnk q;
    public ImageView r;
    public View s;
    public long t;
    public long u;
    public long v;
    public final acra w;
    public String x;
    public hmi y;
    hnh z;

    public hoj(Context context, Executor executor, acra acraVar, hmw hmwVar, hmg hmgVar, ajjz ajjzVar, hrv hrvVar, dd ddVar, orr orrVar, byte[] bArr) {
        super(context, ddVar, acraVar, true, true);
        View inflate;
        ajju a = ajjv.a();
        a.b(R.drawable.ic_music_note);
        this.d = a.a();
        this.a = context;
        this.b = executor;
        this.F = hmgVar;
        this.e = ajjzVar;
        this.f = hmwVar;
        this.g = hrvVar;
        this.c = ddVar;
        boolean k = hrvVar.k();
        this.n = k;
        this.w = acraVar;
        this.C = orrVar;
        F(context.getResources().getString(R.string.music_scrubber_controller_close_button_text));
        if (k) {
            inflate = LayoutInflater.from(context).inflate(R.layout.music_scrubber_overlay_layout, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.music_scrubber_layout, (ViewGroup) null);
        }
        this.G = inflate;
        this.h = (ImageView) inflate.findViewById(R.id.shorts_music_album_art_view);
        if (k) {
            inflate.findViewById(R.id.shorts_change_sound_container).setOnClickListener(new View.OnClickListener() { // from class: hnx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hnk hnkVar;
                    hoj hojVar = hoj.this;
                    hojVar.C.a(hojVar.w, 127992);
                    if (hojVar.n && (hnkVar = hojVar.q) != null && hnkVar.av()) {
                        hojVar.q.dismiss();
                    }
                }
            });
        }
        this.i = (int) context.getResources().getDimension(R.dimen.camera_music_album_art_size);
        this.H = (TextView) inflate.findViewById(R.id.play_position_text);
        this.k = (TextView) inflate.findViewById(R.id.audio_duration_text);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.play_progress_bar_view_stub);
        autm autmVar = hrvVar.a.a().z;
        if ((autmVar == null ? autm.a : autmVar).t) {
            viewStub.setLayoutResource(R.layout.music_scrubber_dsp_seekbar);
        } else {
            viewStub.setLayoutResource(R.layout.music_scrubber_seekbar);
        }
        viewStub.inflate();
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.play_progress_bar);
        this.l = seekBar;
        if (seekBar instanceof DspSeekBar) {
            this.N = (DspSeekBar) seekBar;
            hnh hnhVar = new hnh();
            this.z = hnhVar;
            this.N.a = hnhVar;
            this.r = (ImageView) inflate.findViewById(R.id.waveform_boundary_image);
            this.A = new hod(this);
        } else {
            this.A = new hof(this);
        }
        seekBar.setOnSeekBarChangeListener(this.A);
        seekBar.setAccessibilityDelegate(new hoi(this));
        MusicWaveformView musicWaveformView = (MusicWaveformView) inflate.findViewById(R.id.waveform_view);
        this.m = musicWaveformView;
        musicWaveformView.h = this;
        this.j = new Handler(Looper.getMainLooper());
        if (!k && hrvVar.f()) {
            ((TextView) inflate.findViewById(R.id.drag_hint_text)).setText(R.string.sound_scrubber_drag_hint_text);
        }
        if (k) {
            if (hrvVar.f()) {
                ((YouTubeTextView) inflate.findViewById(R.id.shorts_change_music)).setText(R.string.change_sound_option);
            }
            hog hogVar = new hog(this);
            this.O = hogVar;
            boolean f = hrvVar.f();
            hnk hnkVar = new hnk();
            Bundle bundle = new Bundle();
            bundle.putBoolean("OverlayDialogFragment.enableMusicToSoundRename", f);
            hnkVar.af(bundle);
            this.q = hnkVar;
            hnkVar.af = inflate;
            if (hnkVar.ae) {
                hnkVar.aF();
            }
            hnkVar.ah = hogVar;
        } else {
            this.O = null;
            this.q = null;
        }
        this.p = ((Boolean) hrvVar.b.a.a.Y(axyz.g).B().aB()).booleanValue();
        this.I = (PlayerView) inflate.findViewById(R.id.scrubber_player_view);
    }

    private final long J(long j) {
        return L(j) ? Math.max(this.v - this.u, 0L) : j;
    }

    private final void K(long j) {
        yjk.f();
        TextView textView = this.H;
        if (textView != null) {
            textView.setText(vlu.g(this.a, j, false));
        }
    }

    private final boolean L(long j) {
        return j >= this.v - this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final asht v(long j) {
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = asil.a.createBuilder();
        aone createBuilder3 = asih.a.createBuilder();
        createBuilder3.copyOnWrite();
        asih asihVar = (asih) createBuilder3.instance;
        asihVar.b |= 1;
        asihVar.c = j;
        asih asihVar2 = (asih) createBuilder3.build();
        createBuilder2.copyOnWrite();
        asil asilVar = (asil) createBuilder2.instance;
        asihVar2.getClass();
        asilVar.e = asihVar2;
        asilVar.b |= 8;
        asil asilVar2 = (asil) createBuilder2.build();
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        asilVar2.getClass();
        ashtVar.B = asilVar2;
        ashtVar.c |= 262144;
        return (asht) createBuilder.build();
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.G;
    }

    @Override // defpackage.hni
    public final void b() {
        this.D.a(acsb.c(107599)).f();
        if (this.n) {
            hnk hnkVar = this.q;
            if (hnkVar != null) {
                hnkVar.n(true);
            }
        } else {
            B(true);
        }
        if (this.z != null) {
            MusicWaveformView musicWaveformView = this.m;
            long j = this.t;
            hok hokVar = musicWaveformView.a;
            if (amru.o(hokVar.c).contains(Integer.valueOf((int) (((float) j) / hokVar.e)))) {
                ammv a = this.z.a(this.t);
                if (a.h()) {
                    hfq a2 = this.D.a(acsb.c(131968));
                    a2.a = v(((Long) a.c()).longValue());
                    a2.b();
                    this.z.d = (Long) a.c();
                    this.t = ((Long) a.c()).longValue();
                }
            }
        }
        l(this.t);
        this.b.execute(new hoa(this, 3));
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return this.a.getResources().getString(true != this.g.f() ? R.string.music_scrubber_controller_title : R.string.sound_scrubber_controller_title);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void d() {
        m();
        super.d();
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void e() {
        super.e();
        p();
    }

    @Override // defpackage.hni
    public final boolean f(long j) {
        long J2 = J(j);
        K(J2);
        r(J2);
        this.t = J2;
        return L(j);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void j() {
        n();
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void k() {
        o();
    }

    public final void l(long j) {
        hnf hnfVar;
        if (!this.p || (hnfVar = this.o) == null) {
            if (this.M) {
                this.f.i(j);
                return;
            } else {
                this.F.c(j);
                return;
            }
        }
        hnfVar.a(this.t);
    }

    public final void m() {
        hnf hnfVar;
        if (this.n) {
            this.D.b(acsb.b(127991)).a();
        } else {
            this.D.b(acsb.b(107598)).a();
        }
        this.D.a(acsb.c(22156)).b();
        if (this.p && (hnfVar = this.o) != null) {
            hnfVar.b();
        } else {
            if (!this.M) {
                this.F.f(false);
                this.F.g(true);
            }
            if (!this.M) {
                this.f.i(this.t);
            }
        }
        hoh hohVar = this.K;
        if (hohVar != null) {
            hohVar.a();
        }
        this.D.a(acsb.c(107610)).b();
    }

    @Override // defpackage.hni
    public final void ma() {
        hnf hnfVar;
        if (this.n) {
            hnk hnkVar = this.q;
            if (hnkVar != null) {
                hnkVar.n(false);
            }
        } else {
            B(false);
        }
        this.j.removeCallbacksAndMessages(null);
        hnh hnhVar = this.z;
        if (hnhVar != null) {
            hnhVar.d = null;
        }
        if (!this.p || (hnfVar = this.o) == null) {
            return;
        }
        hnfVar.e();
    }

    public final void o() {
        hnf hnfVar;
        this.l.setProgress((int) this.t);
        if (this.p && (hnfVar = this.o) != null) {
            hnfVar.c();
        } else if (!this.M) {
            this.F.g(false);
            this.F.e(1.0f);
            this.F.f(true);
            this.F.i();
        }
        this.b.execute(new hoa(this, 3));
        hoh hohVar = this.K;
        if (hohVar != null) {
            hohVar.b();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.s) {
            acsc acscVar = this.B;
            if (acscVar != null) {
                this.D.a(acscVar).b();
            }
            if (this.n) {
                hnk hnkVar = this.q;
                if (hnkVar == null || hnkVar.av()) {
                    return;
                }
                this.q.qi(this.c, "OverlayDialogFragment");
                return;
            }
            if (I()) {
                return;
            }
            G();
        }
    }

    public final void p() {
        if (this.n) {
            hfr b = this.D.b(acsb.b(127991));
            b.a = this.L;
            b.b();
        } else {
            hfr b2 = this.D.b(acsb.b(107598));
            b2.a = this.L;
            b2.b();
        }
        this.D.a(acsb.c(22156)).a();
        if (this.z != null) {
            ShortsCreationSelectedTrack a = this.f.a();
            if (a == null || a.g() == null || autf.a.equals(a.g())) {
                this.b.execute(new hoa(this, 2));
            } else {
                this.b.execute(new hob(this, a, 0));
                if (a.d().h()) {
                    this.b.execute(new hob(this, a, 2));
                }
            }
        }
        hfq a2 = this.D.a(acsb.c(107600));
        a2.h(true);
        a2.a();
        hfq a3 = this.D.a(acsb.c(131968));
        a3.h(true);
        a3.a();
        hfq a4 = this.D.a(acsb.c(107599));
        a4.h(true);
        a4.a();
        hfq a5 = this.D.a(acsb.c(107610));
        a5.h(true);
        a5.a();
    }

    public final void q() {
        ayqx ayqxVar = this.f218J;
        if (ayqxVar != null && !ayqxVar.e()) {
            ayrz.c((AtomicReference) this.f218J);
        }
        this.y = null;
    }

    public final void r(long j) {
        yjk.f();
        SeekBar seekBar = this.l;
        if (seekBar != null) {
            seekBar.setProgress((int) j);
        }
    }

    public final void s(long j) {
        long J2 = J(j);
        t(J2);
        this.t = J2;
    }

    public final void t(long j) {
        K(j);
        this.m.e(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        hnf hnfVar;
        yjk.f();
        hmi hmiVar = this.y;
        if (hmiVar == null) {
            return;
        }
        long j = hmiVar.j();
        if (this.p && (hnfVar = this.o) != null) {
            hnfVar.d(this.u);
        } else {
            long j2 = this.t;
            if (j >= this.u + j2 && !this.M) {
                this.F.c(j2);
            }
        }
        MusicWaveformView musicWaveformView = this.m;
        musicWaveformView.e = Math.max(((float) j) / musicWaveformView.a.e, musicWaveformView.d);
        musicWaveformView.invalidate();
        this.j.postDelayed(new hoa(this, 3), 60L);
    }

    public final void w(View view, long j, long j2, hoh hohVar, jqr jqrVar, acsc acscVar, boolean z, hmi hmiVar, hnf hnfVar, apxf apxfVar) {
        PlayerView playerView;
        hnk hnkVar;
        this.u = j2;
        this.m.b(j, j2, this.G.findViewById(R.id.waveform_boundary_image));
        view.getClass();
        this.s = view;
        view.setOnClickListener(this);
        this.K = hohVar;
        this.B = acscVar;
        this.M = z;
        this.y = hmiVar;
        this.o = hnfVar;
        this.D = new jqr(this.w);
        if (this.n && (hnkVar = this.q) != null) {
            hnkVar.ag = hnfVar.g();
        }
        if (this.g.g() && (playerView = this.I) != null) {
            hnfVar.f(playerView);
        }
        boolean z2 = true;
        if (!z && !hmiVar.equals(this.F) && !hmiVar.equals(hnfVar)) {
            z2 = false;
        }
        amkq.E(z2);
        this.f218J = this.f.b().ax(new ayrs() { // from class: hnz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                final hoj hojVar = hoj.this;
                ammv ammvVar = (ammv) obj;
                if (ammvVar.h()) {
                    ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack) ammvVar.c();
                    String k = shortsCreationSelectedTrack.k();
                    if (!k.equals(hojVar.x)) {
                        hojVar.x = k;
                        hojVar.b.execute(new hoa(hojVar, 0));
                        hojVar.t = shortsCreationSelectedTrack.a();
                        avgg h = shortsCreationSelectedTrack.h();
                        int i = hojVar.i;
                        hojVar.e.i(hojVar.h, ahbw.C(h, i, i), hojVar.d);
                        if (hojVar.z != null) {
                            hojVar.b.execute(new hob(hojVar, shortsCreationSelectedTrack, 1));
                        }
                    }
                    if (hojVar.z != null && shortsCreationSelectedTrack.g() != null) {
                        hojVar.b.execute(new hob(hojVar, shortsCreationSelectedTrack, 3));
                    }
                    if (shortsCreationSelectedTrack.d().h()) {
                        final long longValue = ((Long) shortsCreationSelectedTrack.d().c()).longValue();
                        final ammv e = shortsCreationSelectedTrack.e();
                        if (longValue != hojVar.v) {
                            hojVar.v = longValue;
                            hojVar.b.execute(new Runnable() { // from class: hny
                                @Override // java.lang.Runnable
                                public final void run() {
                                    amru o;
                                    hoj hojVar2 = hoj.this;
                                    ammv ammvVar2 = e;
                                    long j3 = longValue;
                                    if (!ammvVar2.h() || !hojVar2.g.m()) {
                                        hojVar2.m.a(j3);
                                        hojVar2.D.a(acsb.c(115550)).e();
                                    } else {
                                        MusicWaveformView musicWaveformView = hojVar2.m;
                                        byte[] bArr = (byte[]) ammvVar2.c();
                                        hnh hnhVar = hojVar2.z;
                                        if (hnhVar == null) {
                                            o = amru.q();
                                        } else {
                                            o = amru.o(hnhVar.a);
                                        }
                                        musicWaveformView.c(j3, bArr, o);
                                        hojVar2.D.a(acsb.c(115549)).e();
                                    }
                                    hojVar2.k.setText(vlu.g(hojVar2.a, j3, false));
                                    hojVar2.t(hojVar2.t);
                                    hojVar2.s.setVisibility(0);
                                    if (j3 < hojVar2.u) {
                                        hojVar2.s.setEnabled(false);
                                    } else {
                                        hojVar2.s.setEnabled(true);
                                    }
                                    hojVar2.l.setMax((int) j3);
                                }
                            });
                            hojVar.D.a(hojVar.B).e();
                            return;
                        }
                        return;
                    }
                    return;
                }
                hojVar.v = 0L;
                hojVar.x = null;
                hojVar.b.execute(new hoa(hojVar, 1));
                hojVar.D.a(hojVar.B).d();
            }
        });
        this.L = jqr.c(jqrVar.a, apxfVar, acscVar.a);
    }

    public final void n() {
        hnf hnfVar;
        if (this.p && (hnfVar = this.o) != null) {
            hnfVar.e();
        } else if (!this.M) {
            this.F.b();
        }
        this.j.removeCallbacksAndMessages(null);
    }
}
