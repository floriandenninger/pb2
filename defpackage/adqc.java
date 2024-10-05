package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.libraries.youtube.mdx.smartremote.DpadView;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqc implements adlr, adqj {
    public static final /* synthetic */ int E = 0;
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    private final aadw F;
    public final ce a;
    public final adlt b;
    public adlm c;
    public final Handler d;
    public final adfa e;
    public final bph f;
    public final SharedPreferences g;
    public final acra h;
    public final azrw i;
    public adqk j;
    public boolean k;
    public Context l;
    public View m;
    public View n;
    public ProgressBar o;
    public TextView p;
    public TextView q;
    public MediaRouteButton r;
    public DpadView s;
    public TextView t;
    public TextView u;
    public MicrophoneView v;
    public View w;
    public View x;
    public final boolean y;
    public String[] z;

    static {
        zga.a("MDX.SmartRemoteController");
    }

    public adqc(ce ceVar, adlt adltVar, Handler handler, adfa adfaVar, bph bphVar, acra acraVar, SharedPreferences sharedPreferences, acun acunVar, aadw aadwVar, azrw azrwVar) {
        this.a = ceVar;
        this.b = adltVar;
        this.c = adltVar.g();
        this.d = handler;
        this.e = adfaVar;
        this.f = bphVar;
        this.g = sharedPreferences;
        this.h = acraVar;
        this.y = acunVar.p;
        this.F = aadwVar;
        this.i = azrwVar;
    }

    public final int a() {
        return this.y ? 8 : 0;
    }

    public final void b(acsc... acscVarArr) {
        for (acsc acscVar : acscVarArr) {
            this.h.u(new acqx(acscVar), null);
        }
    }

    @Override // defpackage.adqj
    public final void c(String str) {
        adlm adlmVar = this.c;
        if (adlmVar != null) {
            adlmVar.R(2, str, null);
        }
        this.B = true;
        this.t.setText(str);
        this.k = false;
        if (str.isEmpty()) {
            g();
            this.d.postDelayed(new adpx(this), 3500L);
            this.C = true;
        }
        n(5, true, str.isEmpty());
    }

    @Override // defpackage.adqj
    public final void d() {
        Toast.makeText(this.l, R.string.mdx_smart_remote_speech_recognition_not_available, 0).show();
    }

    public final void e(int i, String str) {
        anhy b;
        int i2 = 0;
        if (i == 0) {
            n(2, false, false);
            this.p.setText(this.l.getString(R.string.mdx_connecting_to_screen, str));
        } else {
            if (i != 1) {
                return;
            }
            n(this.D, false, false);
            ce ceVar = this.a;
            if (m()) {
                b = ynm.b(this.a, ((vgz) this.i.get()).a(), adpv.a);
            } else {
                b = ynm.b(this.a, anaf.O(Boolean.valueOf(this.g.getBoolean("MDx.SmartRemote.isPrivacyDialogShown", false))), adpv.e);
            }
            ynm.n(ceVar, b, adpt.b, new adqa(this, i2));
            this.q.setText(Html.fromHtml(this.l.getString(R.string.mdx_connected_to_screen, str)));
        }
    }

    public final void f() {
        mh mhVar = new mh(this.l, this.A);
        mhVar.n(R.string.mdx_smart_remote_privacy_dialog_title);
        mhVar.f(R.string.mdx_smart_remote_privacy_dialog_message);
        mhVar.h(R.string.mdx_smart_remote_privacy_dialog_close_button, null);
        mhVar.c(true);
        mhVar.q();
    }

    public final void g() {
        View view = this.m;
        if (view == null) {
            return;
        }
        allo.m(view, R.string.mdx_smart_remote_voice_input_error_message, 0).h();
        this.h.n(new acqx(acsb.c(63270)));
    }

    public final void h() {
        if (this.k) {
            this.j.g();
            n(5, false, false);
            adlm adlmVar = this.c;
            if (adlmVar != null) {
                adlmVar.R(3, null, null);
            }
            this.k = false;
            return;
        }
        if (aih.c(this.l, "android.permission.RECORD_AUDIO") != 0) {
            aih.i((MdxSmartRemoteActivity) this.a.C(), new String[]{"android.permission.RECORD_AUDIO"}, 1234);
            return;
        }
        adqk adqkVar = this.j;
        if (adqkVar.c == null) {
            adqkVar.b.d();
        } else {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            adqkVar.c.startListening(intent);
        }
        n(3, false, false);
        adlm adlmVar2 = this.c;
        if (adlmVar2 != null) {
            adlmVar2.R(0, null, null);
        }
        this.k = true;
    }

    public final boolean i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.l.getResources().getConfiguration().getLocales().get(0).getLanguage().equals(Locale.ENGLISH.getLanguage());
        }
        return this.l.getResources().getConfiguration().locale.getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        this.c = adlmVar;
        e(1, adlmVar.k().c());
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        this.c = null;
        this.a.C().finish();
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        this.c = adlmVar;
        e(0, adlmVar.k().c());
    }

    public final boolean m() {
        atfq atfqVar = this.F.b().o;
        if (atfqVar == null) {
            atfqVar = atfq.a;
        }
        auie auieVar = atfqVar.g;
        if (auieVar == null) {
            auieVar = auie.a;
        }
        return auieVar.b;
    }

    public final void n(final int i, boolean z, final boolean z2) {
        this.d.postDelayed(new Runnable() { // from class: adpy
            @Override // java.lang.Runnable
            public final void run() {
                adqc adqcVar = adqc.this;
                int i2 = i;
                boolean z3 = z2;
                int i3 = i2 - 1;
                adpo adpoVar = adpo.UP;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 == 0) {
                    adqcVar.o.setVisibility(8);
                    adqcVar.p.setVisibility(8);
                    adqcVar.q.setVisibility(adqcVar.a());
                    adqcVar.r.setVisibility(adqcVar.a());
                    adqcVar.s.setVisibility(8);
                    adqcVar.t.setVisibility(8);
                    adqcVar.u.setVisibility(8);
                    adqcVar.v.setVisibility(8);
                    adqcVar.w.setVisibility(8);
                    adqcVar.x.setVisibility(8);
                    return;
                }
                if (i3 == 1) {
                    adqcVar.o.setVisibility(0);
                    adqcVar.p.setVisibility(0);
                    adqcVar.q.setVisibility(8);
                    adqcVar.r.setVisibility(8);
                    adqcVar.s.setVisibility(8);
                    adqcVar.t.setVisibility(8);
                    adqcVar.u.setVisibility(8);
                    adqcVar.v.setVisibility(8);
                    adqcVar.w.setVisibility(8);
                    adqcVar.x.setVisibility(8);
                    return;
                }
                if (i3 == 2) {
                    adqcVar.o.setVisibility(8);
                    adqcVar.p.setVisibility(8);
                    adqcVar.q.setVisibility(adqcVar.a());
                    adqcVar.r.setVisibility(adqcVar.a());
                    adqcVar.s.setVisibility(8);
                    adqcVar.t.setVisibility(8);
                    adqcVar.u.setVisibility(true != adqcVar.i() ? 8 : 0);
                    TextView textView = adqcVar.u;
                    String[] strArr = adqcVar.z;
                    Random random = new Random();
                    int length = adqcVar.z.length;
                    textView.setText(Html.fromHtml(strArr[random.nextInt(14)]));
                    adqcVar.v.setVisibility(0);
                    MicrophoneView microphoneView = adqcVar.v;
                    microphoneView.c = 2;
                    microphoneView.a();
                    adqcVar.w.setVisibility(8);
                    adqcVar.x.setVisibility(8);
                    adqcVar.b(acsb.c(61407));
                    return;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        return;
                    }
                    adqcVar.o.setVisibility(8);
                    adqcVar.p.setVisibility(8);
                    adqcVar.q.setVisibility(adqcVar.a());
                    adqcVar.r.setVisibility(adqcVar.a());
                    adqcVar.s.setVisibility(0);
                    adqcVar.t.setVisibility(8);
                    adqcVar.u.setVisibility(8);
                    adqcVar.v.setVisibility(0);
                    adqcVar.v.b();
                    adqcVar.w.setVisibility(0);
                    adqcVar.x.setVisibility(true != z3 ? 0 : 8);
                    adqcVar.b(acsb.c(61406), acsb.c(61409), acsb.c(61410), acsb.c(61404), acsb.c(61405), acsb.c(61401), acsb.c(61407));
                    return;
                }
                adqcVar.o.setVisibility(8);
                adqcVar.p.setVisibility(8);
                adqcVar.q.setVisibility(adqcVar.a());
                adqcVar.r.setVisibility(adqcVar.a());
                adqcVar.s.setVisibility(8);
                adqcVar.t.setVisibility(8);
                adqcVar.u.setVisibility(true != adqcVar.i() ? 8 : 0);
                TextView textView2 = adqcVar.u;
                String[] strArr2 = adqcVar.z;
                Random random2 = new Random();
                int length2 = adqcVar.z.length;
                textView2.setText(Html.fromHtml(strArr2[random2.nextInt(14)]));
                adqcVar.v.setVisibility(0);
                adqcVar.v.b();
                adqcVar.w.setVisibility(8);
                adqcVar.x.setVisibility(true != z3 ? 0 : 8);
                adqcVar.b(acsb.c(61407));
            }
        }, true != z ? 0L : 1000L);
    }
}
