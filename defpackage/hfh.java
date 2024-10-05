package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.SoundPool;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.CountdownNumeralView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.libraries.youtube.edit.camera.MultiSegmentCameraProgressIndicator;
import com.google.android.libraries.youtube.edit.ui.DurationMsSeekBar;
import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;
import com.google.android.youtube.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfh extends zys implements View.OnClickListener, zyr, zzi {
    public final ci a;
    public final hmg b;
    public final boolean c;
    public final hrv d;
    final View e;
    final View f;
    final CountdownNumeralView g;
    final SegmentedControl h;
    final Button i;
    int j;
    int k;
    SoundPool l;
    CountDownTimer m;
    DurationMsSeekBar n;
    public String o;
    public long p;
    public final jqr q;
    public final heg r;
    private final Context s;
    private final View t;
    private final View u;
    private final hoz v;
    private final Handler w;
    private boolean x;

    public hfh(Context context, ci ciVar, View view, View view2, jqr jqrVar, heg hegVar, hoz hozVar, hmg hmgVar, hmw hmwVar, hrv hrvVar, boolean z, byte[] bArr, byte[] bArr2) {
        super(context, ciVar.getSupportFragmentManager(), jqrVar.a, true, true);
        this.s = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.recording_timer_layout, (ViewGroup) null);
        this.t = inflate;
        this.h = (SegmentedControl) inflate.findViewById(R.id.countdown_duration_control);
        Resources resources = context.getResources();
        int i = 3;
        char c = 0;
        int i2 = 1;
        int[] iArr = {resources.getInteger(R.integer.shorts_timer_duration_short_sec), resources.getInteger(R.integer.shorts_timer_duration_medium_sec), resources.getInteger(R.integer.shorts_timer_duration_long_sec)};
        ArrayList arrayList = new ArrayList(3);
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            hff hffVar = new hff();
            Object[] objArr = new Object[i2];
            Integer valueOf = Integer.valueOf(i4);
            objArr[c] = valueOf;
            String string = resources.getString(R.string.duration_seconds_ultra_short, objArr);
            if (string != null) {
                hffVar.b = string;
                int i5 = i3;
                hffVar.a = Integer.valueOf((int) TimeUnit.SECONDS.toMillis(i4));
                String quantityString = resources.getQuantityString(R.plurals.shorts_a11y_timer_duration_seconds, i4, valueOf);
                if (quantityString != null) {
                    hffVar.c = quantityString;
                    Integer num = hffVar.a;
                    if (num != null && hffVar.b != null && hffVar.c != null) {
                        arrayList.add(new hfg(num.intValue(), hffVar.b, hffVar.c));
                        i3 = i5 + 1;
                        i = 3;
                        c = 0;
                        i2 = 1;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if (hffVar.a == null) {
                            sb.append(" countdownDurationMs");
                        }
                        if (hffVar.b == null) {
                            sb.append(" text");
                        }
                        if (hffVar.c == null) {
                            sb.append(" contentDescription");
                        }
                        String valueOf2 = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf2);
                        throw new IllegalStateException(sb2.toString());
                    }
                } else {
                    throw new NullPointerException("Null contentDescription");
                }
            } else {
                throw new NullPointerException("Null text");
            }
        }
        this.h.h = arrayList;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            hfg h = h(i6);
            SegmentedControlSegment segmentedControlSegment = (SegmentedControlSegment) LayoutInflater.from(context).inflate(R.layout.recording_timer_duration_segment, (ViewGroup) null);
            segmentedControlSegment.setText(h.b);
            segmentedControlSegment.setTextOn(h.b);
            segmentedControlSegment.setTextOff(h.b);
            segmentedControlSegment.setContentDescription(h.c);
            segmentedControlSegment.setChecked(i6 == 0);
            this.h.addView(segmentedControlSegment);
            i6++;
        }
        this.h.g = this;
        this.a = ciVar;
        hozVar.getClass();
        this.v = hozVar;
        DurationMsSeekBar durationMsSeekBar = (DurationMsSeekBar) this.t.findViewById(R.id.recording_duration_seek_bar);
        this.n = durationMsSeekBar;
        durationMsSeekBar.a = hozVar.b();
        this.n.setMax(hozVar.c);
        this.n.e = this;
        view.getClass();
        this.u = view;
        view.setOnClickListener(this);
        view2.getClass();
        this.e = view2;
        View findViewById = view2.findViewById(R.id.shorts_cancel_countdown_button);
        this.f = findViewById;
        findViewById.setOnClickListener(this);
        this.g = (CountdownNumeralView) view2.findViewById(R.id.shorts_countdown_numeral_view);
        Button button = (Button) this.t.findViewById(R.id.start_button);
        this.i = button;
        button.setOnClickListener(this);
        jqrVar.getClass();
        this.q = jqrVar;
        hegVar.getClass();
        this.r = hegVar;
        hmgVar.getClass();
        this.b = hmgVar;
        this.w = new Handler(Looper.getMainLooper());
        this.d = hrvVar;
        this.c = z;
        SoundPool soundPool = new SoundPool(5, 3, 0);
        this.l = soundPool;
        this.j = soundPool.load(context, R.raw.countdown_tick_increment, 0);
        this.k = this.l.load(context, R.raw.countdown_tick_final, 0);
        hmwVar.getClass();
        autm autmVar = hrvVar.a.a().z;
        if ((autmVar == null ? autm.a : autmVar).k) {
            hmwVar.b().ax(new ayrs() { // from class: hfb
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    final hfh hfhVar = hfh.this;
                    ammv ammvVar = (ammv) obj;
                    if (ammvVar.h()) {
                        final ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack) ammvVar.c();
                        hfhVar.a.runOnUiThread(new Runnable() { // from class: hfd
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v0, types: [hfd] */
                            /* JADX WARN: Type inference failed for: r1v6 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                hfh hfhVar2;
                                hfh hfhVar3;
                                ByteArrayInputStream byteArrayInputStream;
                                ByteArrayInputStream byteArrayInputStream2;
                                long j = this;
                                hfh hfhVar4 = hfh.this;
                                ShortsCreationSelectedTrack shortsCreationSelectedTrack2 = shortsCreationSelectedTrack;
                                if (!shortsCreationSelectedTrack2.k().equals(hfhVar4.o)) {
                                    hfhVar4.n.i(1);
                                    hfhVar4.n.j(shortsCreationSelectedTrack2.a());
                                    hfhVar4.o = shortsCreationSelectedTrack2.k();
                                    hfhVar4.p = 0L;
                                }
                                if (shortsCreationSelectedTrack2.d().h()) {
                                    long longValue = ((Long) shortsCreationSelectedTrack2.d().c()).longValue();
                                    if (hfhVar4.p != longValue) {
                                        hfhVar4.p = longValue;
                                        long min = Math.min(hfhVar4.d.a(), longValue);
                                        if (longValue <= hfhVar4.d.a()) {
                                            hfhVar4.n.i(0);
                                        } else {
                                            if (!hfhVar4.d.m() || !shortsCreationSelectedTrack2.e().h()) {
                                                hfhVar2 = hfhVar4;
                                                hfhVar2.n.h(min, longValue);
                                                hfhVar2.q.a(acsb.c(115552)).e();
                                            } else {
                                                DurationMsSeekBar durationMsSeekBar2 = hfhVar4.n;
                                                try {
                                                    try {
                                                        byteArrayInputStream = new ByteArrayInputStream((byte[]) shortsCreationSelectedTrack2.e().c());
                                                    } catch (IOException e) {
                                                        e = e;
                                                        hfhVar3 = hfhVar4;
                                                        j = min;
                                                        zga.d("Error reading the raw waveform bytes. ", e);
                                                        durationMsSeekBar2.h(j, longValue);
                                                        hfhVar2 = hfhVar3;
                                                        hfhVar2.q.a(acsb.c(115551)).e();
                                                        hfhVar2.n.j(shortsCreationSelectedTrack2.a());
                                                    }
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    zga.d("Error reading the raw waveform bytes. ", e);
                                                    durationMsSeekBar2.h(j, longValue);
                                                    hfhVar2 = hfhVar3;
                                                    hfhVar2.q.a(acsb.c(115551)).e();
                                                    hfhVar2.n.j(shortsCreationSelectedTrack2.a());
                                                }
                                                try {
                                                    amkv a = amkv.a(byteArrayInputStream);
                                                    byteArrayInputStream2 = byteArrayInputStream;
                                                    hfhVar3 = hfhVar4;
                                                    try {
                                                        durationMsSeekBar2.f.e(longValue, min, durationMsSeekBar2.g, a.a, a.b, amru.q());
                                                        durationMsSeekBar2.h = 0.0f;
                                                        byteArrayInputStream2.close();
                                                        hfhVar2 = hfhVar3;
                                                        hfhVar2.q.a(acsb.c(115551)).e();
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        try {
                                                            byteArrayInputStream2.close();
                                                        } catch (Throwable unused) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    byteArrayInputStream2 = byteArrayInputStream;
                                                }
                                            }
                                            hfhVar2.n.j(shortsCreationSelectedTrack2.a());
                                        }
                                    }
                                    hfhVar2 = hfhVar4;
                                    hfhVar2.n.j(shortsCreationSelectedTrack2.a());
                                }
                            }
                        });
                    } else {
                        hfhVar.o = null;
                        hfhVar.a.runOnUiThread(new hfc(hfhVar, 1));
                    }
                }
            });
        }
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.t;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return this.s.getString(R.string.camera_timer_button_label);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void d() {
        if (this.c) {
            hmg hmgVar = this.b;
            if (hmgVar.e) {
                hmgVar.c(hmgVar.a());
                this.b.f(false);
            }
        }
        this.q.a(acsb.c(99623)).d();
        this.q.a(acsb.c(99622)).d();
        this.q.a(acsb.c(98535)).d();
        this.h.d(0, false, true);
        heg hegVar = this.r;
        MultiSegmentCameraProgressIndicator multiSegmentCameraProgressIndicator = hegVar.a.aA;
        if (multiSegmentCameraProgressIndicator == null) {
            zga.b("Unexpected null recordingProgressIndicator in call to onRecordingTimerDialogDismissed");
        } else {
            multiSegmentCameraProgressIndicator.f(false);
            hegVar.a.aM.setVisibility(0);
            hel helVar = hegVar.a;
            if (helVar.aE.m == null) {
                helVar.aP();
                hegVar.a.aA.c();
            }
            hegVar.a.aQ.setVisibility(4);
        }
        super.d();
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void e() {
        super.e();
        hfq a = this.q.a(acsb.c(99623));
        a.h(true);
        a.a();
        hfq a2 = this.q.a(acsb.c(99622));
        a2.h(true);
        a2.a();
        hfq a3 = this.q.a(acsb.c(98535));
        a3.h(true);
        a3.a();
        this.n.c = this.v.a();
        this.n.a = this.v.b();
        DurationMsSeekBar durationMsSeekBar = this.n;
        int i = this.v.d;
        durationMsSeekBar.b = i;
        durationMsSeekBar.setProgress(i + durationMsSeekBar.c);
        durationMsSeekBar.postInvalidate();
        this.r.c(this.n.a());
    }

    @Override // defpackage.zzi
    public final void g() {
    }

    final hfg h(int i) {
        return (hfg) this.h.h.get(i);
    }

    public final void i(boolean z) {
        CountDownTimer countDownTimer = this.m;
        if (countDownTimer == null) {
            return;
        }
        countDownTimer.cancel();
        this.m = null;
        this.g.a();
        this.e.setVisibility(4);
        this.q.a(acsb.c(98570)).d();
        hel helVar = this.r.a;
        helVar.aV();
        helVar.az.setVisibility(0);
        if (z) {
            G();
        }
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void j() {
        if (this.c) {
            this.b.b();
        }
        this.w.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void k() {
        heg hegVar = this.r;
        hel helVar = hegVar.a;
        if (helVar.aA == null) {
            zga.b("Unexpected null recordingProgressIndicator in call to onRecordingTimerDialogShown");
        } else {
            helVar.aI();
            hegVar.a.aA.f(true);
            hegVar.a.aQ.setVisibility(0);
        }
        this.r.c(this.n.a());
        if (this.c) {
            this.b.i();
        }
        try {
            this.x = Settings.System.getFloat(this.s.getContentResolver(), "animator_duration_scale") != 0.0f;
        } catch (Settings.SettingNotFoundException unused) {
            this.x = true;
        }
        l();
    }

    public final void l() {
        long j = this.c ? this.b.j() - this.b.a() : 0L;
        if (j > this.n.a() && this.c) {
            hmg hmgVar = this.b;
            hmgVar.c(hmgVar.a());
        }
        if (this.x) {
            DurationMsSeekBar durationMsSeekBar = this.n;
            durationMsSeekBar.d = (int) Math.min(Math.max(0L, j), durationMsSeekBar.getMax());
            durationMsSeekBar.i = (((float) j) / durationMsSeekBar.f.e) + durationMsSeekBar.h;
            durationMsSeekBar.postInvalidate();
        }
        this.w.postDelayed(new hfc(this, 0), 60L);
    }

    @Override // defpackage.zzi
    public final void lQ(int i) {
        this.q.a(acsb.c(99623)).b();
    }

    @Override // defpackage.zys
    protected final acsc mb() {
        return acsb.c(99621);
    }

    @Override // defpackage.zys
    protected final boolean md() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.u) {
            if (this.c) {
                this.b.e(1.0f);
                this.b.f(true);
                hmg hmgVar = this.b;
                hmgVar.c(hmgVar.a());
            }
            this.q.a(acsb.c(96647)).b();
            if (I()) {
                return;
            }
            G();
            return;
        }
        if (view != this.i) {
            if (view == this.f) {
                this.q.a(acsb.c(98570)).b();
                if (zev.e(this.s)) {
                    Context context = this.s;
                    zev.c(context, this.f, context.getString(R.string.shorts_a11y_timer_canceled));
                }
                i(true);
                return;
            }
            return;
        }
        int i = h(this.h.d).a;
        long j = i;
        this.m = new hfe(this, j, TimeUnit.SECONDS.toMillis(1L), this.n.a(), i);
        CountdownNumeralView countdownNumeralView = this.g;
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(j);
        countdownNumeralView.a = seconds;
        countdownNumeralView.setCurrentText("");
        countdownNumeralView.setVisibility(0);
        countdownNumeralView.b = true;
        if (zev.e(countdownNumeralView.getContext())) {
            zev.c(countdownNumeralView.getContext(), countdownNumeralView, countdownNumeralView.getContext().getResources().getQuantityString(R.plurals.shorts_a11y_timer_started, seconds, Integer.valueOf(seconds)));
        }
        this.q.a(acsb.c(98535)).b();
        hel helVar = this.r.a;
        helVar.aJ();
        helVar.az.setVisibility(4);
        z();
        this.e.setVisibility(0);
        hfq a = this.q.a(acsb.c(98570));
        a.h(true);
        a.a();
        this.m.start();
    }
}
