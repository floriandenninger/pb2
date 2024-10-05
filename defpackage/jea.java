package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jea extends bof implements SeekBar.OnSeekBarChangeListener, adlr, ypd {
    public final bpv Y;
    public final addy Z;
    public final acra aa;
    public final adsw ab;
    public final Handler ac;
    public ConstraintLayout ad;
    public SeekBar ae;
    public ProgressBar af;
    public Runnable ag;
    public int ah;
    public final adti ai;
    private final acun aj;
    private final ypa ak;
    private final adlt al;
    private final adly am;
    private ImageView an;
    private ImageButton ao;
    private TextView ap;
    private ImageButton aq;
    private TextView ar;
    private View as;
    private TextView at;
    private TextView au;
    private final acsa av;
    private boolean aw;

    public jea(Context context, int i, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, acra acraVar, ypa ypaVar, azrw azrwVar5, azrw azrwVar6) {
        super(context, i);
        this.av = new acqx(acrb.CAST_DIALOG);
        this.ah = R.drawable.quantum_ic_music_note_black_24;
        bpw.b(getContext());
        this.Y = bpw.j();
        azrwVar.getClass();
        this.aj = (acun) azrwVar.get();
        azrwVar2.getClass();
        addy addyVar = (addy) azrwVar2.get();
        addyVar.getClass();
        this.Z = addyVar;
        azrwVar3.getClass();
        adlt adltVar = (adlt) azrwVar3.get();
        adltVar.getClass();
        this.al = adltVar;
        azrwVar4.getClass();
        adly adlyVar = (adly) azrwVar4.get();
        adlyVar.getClass();
        this.am = adlyVar;
        acraVar.getClass();
        this.aa = acraVar;
        ypaVar.getClass();
        this.ak = ypaVar;
        this.ab = (adsw) azrwVar5.get();
        this.ai = (adti) azrwVar6.get();
        this.ac = new Handler(Looper.getMainLooper());
    }

    private final void E(String str) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: jdw
            @Override // java.lang.Runnable
            public final void run() {
                jea.this.dismiss();
            }
        });
        boolean o = this.al.o();
        int i = this.al.h().a;
        String str2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "state not recognized" : "RECOVERY_COMPLETED" : "RECOVERY_ABORTED" : "RECOVERY_CANCELLED_BY_USER" : "RECOVERY_STARTED" : "IDLE";
        int f = this.al.f();
        int i2 = this.Y.h;
        StringBuilder sb = new StringBuilder(str.length() + 153 + str2.length());
        sb.append(str);
        sb.append("mdxSession isRecoveryInProgress: ");
        sb.append(o);
        sb.append(" | mdxSession recoveryState: ");
        sb.append(str2);
        sb.append(" | mdxSession connectionState: ");
        sb.append(f);
        sb.append(" | mdxRouteInfo connectionState: ");
        sb.append(i2);
        afsi.b(1, 21, sb.toString());
    }

    private final void F() {
        adlm g = this.al.g();
        if (!this.aj.K || g == null || !g.ag("cds") || !"DOES_NOT_MATCH_RECEIVER".equals(g.v()) || getContext().getResources().getConfiguration().orientation != 1) {
            this.aa.q(new acqx(acsb.c(132424)), null);
            this.as.setVisibility(8);
            this.at.setVisibility(8);
            this.au.setVisibility(8);
            return;
        }
        this.as.setVisibility(0);
        this.at.setVisibility(0);
        this.au.setVisibility(0);
        this.aa.n(new acqx(acsb.c(132424)));
        this.au.setOnClickListener(new jdv(this, 2));
    }

    private final void G() {
        adlm g = this.al.g();
        if (g == null) {
            E("The MDx session is null when trying to update smart remote visibility in the remote controller dialog. ");
            return;
        }
        int e = g.k().e();
        if (e != 2 || g.a() != 0) {
            int i = 4;
            int i2 = 3;
            if (e == 3 || e == 4 || (g.ag("dpa") && g.ag("mic"))) {
                this.ao.setVisibility(0);
                this.ap.setVisibility(0);
                this.aq.setVisibility(0);
                this.ar.setVisibility(0);
                this.aa.o(new acqx(acrb.VOICE_SEARCH_IN_CAST_DIALOG), this.av);
                this.ao.setOnClickListener(new jdv(this, i2));
                this.aa.o(new acqx(acrb.SMART_REMOTE_DPAD_IN_CAST_DIALOG), this.av);
                this.aq.setOnClickListener(new jdv(this, i));
                return;
            }
            return;
        }
        this.al.i(this);
    }

    @Override // defpackage.bof
    public final View A() {
        adlm g = this.al.g();
        if (g == null) {
            E("The MDx session is null when trying to open the remote controller dialog.");
            return null;
        }
        View inflate = getLayoutInflater().inflate(R.layout.next_gen_fiji_mdx_media_route_controller_dialog_fragment, (ViewGroup) null);
        this.ak.g(this);
        findViewById(R.id.buttonPanel).setVisibility(8);
        findViewById(R.id.mr_title_bar).setVisibility(8);
        findViewById(R.id.mr_default_control).setVisibility(8);
        this.aa.n(this.av);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.connected_device_name);
        if (g.k() != null && !g.k().c().isEmpty() && youTubeTextView != null) {
            youTubeTextView.setText(g.k().c());
        }
        this.ad = (ConstraintLayout) inflate.findViewById(R.id.mdx_controller_buttons_layout);
        this.ae = (SeekBar) inflate.findViewById(R.id.volume_bar);
        this.aa.o(new acqx(acrb.CAST_DIALOG_VOLUME_BAR), this.av);
        this.ae.setOnSeekBarChangeListener(this);
        this.an = (ImageView) inflate.findViewById(R.id.volume_icon);
        int b = g.b();
        C(b);
        this.ae.setProgress(b);
        this.ao = (ImageButton) inflate.findViewById(R.id.voice_search_button);
        this.ap = (TextView) inflate.findViewById(R.id.voice_search_text);
        this.aq = (ImageButton) inflate.findViewById(R.id.tv_remote_button);
        this.ar = (TextView) inflate.findViewById(R.id.tv_remote_text);
        this.as = inflate.findViewById(R.id.sign_in_divider);
        this.at = (TextView) inflate.findViewById(R.id.sign_in_desc);
        this.au = (TextView) inflate.findViewById(R.id.sign_in_button);
        this.af = (ProgressBar) inflate.findViewById(R.id.sign_in_loading_spinner);
        G();
        F();
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.close_button);
        this.aa.o(new acqx(acrb.CAST_DIALOG_CLOSE_BUTTON), this.av);
        youTubeTextView2.setOnClickListener(new jdv(this, 1));
        YouTubeTextView youTubeTextView3 = (YouTubeTextView) inflate.findViewById(R.id.stop_casting_button);
        this.aa.o(new acqx(acrb.MEDIA_ROUTE_DISCONNECT_BUTTON), this.av);
        youTubeTextView3.setOnClickListener(new jdv(this, 0));
        inflate.setBackgroundColor(wbs.Q(getContext(), R.attr.ytBrandBackgroundSolid));
        this.aw = true;
        return inflate;
    }

    public final void B(int i) {
        Context context = getContext();
        Intent y = adyu.y(context);
        y.setFlags(268435456);
        y.putExtra("com.google.android.libraries.youtube.mdx.smartremote.startingUiMode", i);
        y.putExtra("com.google.android.libraries.youtube.mdx.smartremote.dialogStyle", jeb.aI(context));
        dismiss();
        context.startActivity(y);
    }

    public final void C(int i) {
        int i2 = i == 0 ? R.drawable.quantum_ic_music_off_black_24 : R.drawable.quantum_ic_music_note_black_24;
        if (this.ah == i2) {
            return;
        }
        this.an.setImageResource(i2);
        this.ah = i2;
    }

    @Override // defpackage.ng, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.ag;
        if (runnable != null) {
            runnable.run();
            this.ag = null;
        }
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        G();
        F();
        this.al.k(this);
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{admg.class};
        }
        if (i == 0) {
            int a = ((admg) obj).a();
            C(a);
            SeekBar seekBar = this.ae;
            if (seekBar == null) {
                return null;
            }
            seekBar.setProgress(a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z && seekBar == this.ae) {
            C(i);
            this.am.b(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar == this.ae) {
            this.aa.I(2049, new acqx(acrb.CAST_DIALOG_VOLUME_BAR), null);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        if (this.aw) {
            F();
        }
    }
}
