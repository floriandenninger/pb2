package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.youtube.R;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahwu implements Observer, afia, ahwk, ahwv {
    private final zfe A;
    private final afkn B;
    private final amnv C;
    private final zaw D;
    private final aioc E;
    private int F;
    private long G;
    private ahwq H;
    private final ayqw I;

    /* renamed from: J, reason: collision with root package name */
    private final zez f54J;
    public final ahwl a;
    public final amnv b;
    public final amnv c;
    public final amnv d;
    public String e;
    public String f;
    public int g;
    public int h;
    public FormatStreamModel i;
    public FormatStreamModel j;
    public aapb k;
    public askp[] l;
    public askp[] m;
    public final ahwt n;
    public final ahwr o;
    public boolean p;
    public long q;
    public final HashMap r;
    public float s;
    public boolean t;
    public final ahwq u;
    private final Context v;
    private final ammv w;
    private final afhz x;
    private final afqj y;
    private final ysy z;

    public ahwu(ahwl ahwlVar, Context context, ammv ammvVar, afhz afhzVar, afqj afqjVar, ysy ysyVar, zfe zfeVar, afkn afknVar, amnv amnvVar, amnv amnvVar2, amnv amnvVar3, amnv amnvVar4, aioc aiocVar) {
        zak zakVar = new zak(context, ysyVar, null, null, null);
        ahwlVar.getClass();
        this.a = ahwlVar;
        ((ahww) ahwlVar).E = this;
        context.getClass();
        this.v = context;
        afhzVar.getClass();
        this.x = afhzVar;
        afqjVar.getClass();
        this.y = afqjVar;
        ysyVar.getClass();
        this.z = ysyVar;
        zfeVar.getClass();
        this.A = zfeVar;
        afknVar.getClass();
        this.B = afknVar;
        amnvVar.getClass();
        this.b = amnvVar;
        amnvVar2.getClass();
        this.c = amnvVar2;
        amnvVar3.getClass();
        this.d = amnvVar3;
        amnvVar4.getClass();
        this.C = amnvVar4;
        this.D = zakVar;
        this.w = ammvVar;
        this.E = aiocVar;
        this.n = new ahwt(this);
        this.o = new ahwr(this);
        this.u = new ahwq(this, 1);
        this.I = new ayqw();
        this.r = new HashMap();
        this.f54J = new zez(context);
    }

    private final float k() {
        FormatStreamModel formatStreamModel = this.j;
        return (formatStreamModel == null || !formatStreamModel.x()) ? this.s : this.j.b();
    }

    private static void l(JSONObject jSONObject, askp[] askpVarArr) {
        if (askpVarArr == null) {
            return;
        }
        for (askp askpVar : askpVarArr) {
            String str = askpVar.e;
            if (str.startsWith("innertube.build.") || str.equals("e") || str.equals("logged_in")) {
                jSONObject.put(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
            }
        }
    }

    @Override // defpackage.afia
    public final synchronized void a(afio afioVar) {
        this.F += afioVar.b;
        this.G += afioVar.c;
        this.t = afioVar.d;
    }

    @Override // defpackage.afia
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.afia
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.ahwk
    public final void d() {
        g();
    }

    public final synchronized float e() {
        float f;
        int i = this.F;
        f = i == 0 ? 0.0f : ((float) (this.G * 8)) / (i / 1000.0f);
        this.G = 0L;
        this.F = 0;
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ahwl, android.view.View$OnClickListener] */
    @Override // defpackage.ahwv
    public final void f() {
        if (!this.p) {
            if (this.H == null) {
                this.H = new ahwq(this, 0);
            }
            this.p = true;
            ?? r0 = this.a;
            ahww ahwwVar = (ahww) r0;
            if (ahwwVar.e == null) {
                LayoutInflater.from(ahwwVar.getContext()).inflate(R.layout.default_nerd_stats_overlay, (ViewGroup) r0);
                ahwwVar.e = ahwwVar.findViewById(R.id.nerd_stats_layout);
                ahwwVar.f = ahwwVar.findViewById(R.id.dismiss_button);
                ahwwVar.f.setOnClickListener(r0);
                ahwwVar.f.setVisibility(0);
                ahwwVar.g = ahwwVar.findViewById(R.id.copy_debug_info_button);
                ahwwVar.g.setOnClickListener(r0);
                ahwwVar.g.setVisibility(0);
                ahwwVar.h = (TextView) ahwwVar.findViewById(R.id.device_info);
                ahwwVar.i = (TextView) ahwwVar.findViewById(R.id.video_id);
                ahwwVar.j = (TextView) ahwwVar.findViewById(R.id.cpn);
                ahwwVar.l = (TextView) ahwwVar.findViewById(R.id.player_type);
                ahwwVar.m = (TextView) ahwwVar.findViewById(R.id.playback_type);
                ahwwVar.n = (TextView) ahwwVar.findViewById(R.id.video_format);
                ahwwVar.q = (TextView) ahwwVar.findViewById(R.id.audio_format);
                ahwwVar.r = (TextView) ahwwVar.findViewById(R.id.volume);
                ahwwVar.s = (TextView) ahwwVar.findViewById(R.id.bandwidth_estimate);
                ahwwVar.u = (ImageView) ahwwVar.findViewById(R.id.bandwidth_sparkline);
                ahwwVar.v = (TextView) ahwwVar.findViewById(R.id.readahead);
                ahwwVar.x = (ImageView) ahwwVar.findViewById(R.id.readahead_sparkline);
                ahwwVar.y = (TextView) ahwwVar.findViewById(R.id.viewport);
                ahwwVar.z = (TextView) ahwwVar.findViewById(R.id.dropped_frames);
                ahwwVar.A = (TextView) ahwwVar.findViewById(R.id.battery_current_title);
                ahwwVar.B = (TextView) ahwwVar.findViewById(R.id.battery_current);
                ahwwVar.k = (TextView) ahwwVar.findViewById(R.id.mystery_text);
                ahwwVar.C = ahwwVar.findViewById(R.id.latency_title);
                ahwwVar.D = (TextView) ahwwVar.findViewById(R.id.latency);
                ahwwVar.o = ahwwVar.findViewById(R.id.video_gl_rendering_mode_title);
                ahwwVar.p = (TextView) ahwwVar.findViewById(R.id.video_gl_rendering_mode);
                ahwwVar.G = (TextView) ahwwVar.findViewById(R.id.content_protection);
                ahwwVar.F = ahwwVar.findViewById(R.id.content_protection_title);
                ahwwVar.C.measure(0, 0);
                int K = yjk.K(ahwwVar.getResources().getDisplayMetrics(), 100);
                int measuredHeight = ahwwVar.C.getMeasuredHeight() - 1;
                ahwwVar.t = new zbc(K, measuredHeight, ahww.a, ahww.b);
                ahwwVar.w = new zbc(K, measuredHeight, ahww.c, ahww.d);
                ahwwVar.A.setVisibility(8);
                ahwwVar.B.setVisibility(8);
            }
            ahwwVar.e.setVisibility(0);
            ahwl ahwlVar = this.a;
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            String str3 = Build.VERSION.RELEASE;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            ((ahww) ahwlVar).h.setText(sb.toString());
            this.a.b(this.i);
            this.a.a(this.j);
            j();
            this.a.d((afkm) this.B.get());
            i();
            h();
            this.I.g(this.H.kI(this.E));
            if (this.w.h()) {
                this.I.d(((ywr) this.w.c()).d().G().E(ayqr.a()).o(afly.m).X(new ayrs() { // from class: ahwm
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        ahwu ahwuVar = ahwu.this;
                        if (((awwk) obj).d) {
                            return;
                        }
                        ahwuVar.g();
                    }
                }));
            }
            this.x.d(this);
            this.B.addObserver(this);
            return;
        }
        g();
    }

    public final void g() {
        if (this.p) {
            this.p = false;
            View view = ((ahww) this.a).e;
            if (view != null) {
                view.setVisibility(8);
            }
            this.I.c();
            this.x.e(this);
            this.B.deleteObserver(this);
        }
    }

    public final void h() {
        Object obj = this.C.get();
        ahwl ahwlVar = this.a;
        ((ahww) ahwlVar).k.setText(((aeou) this.C.get()).d);
        ahwl ahwlVar2 = this.a;
        aeou aeouVar = (aeou) obj;
        String str = aeouVar.a;
        ahww ahwwVar = (ahww) ahwlVar2;
        if (ahwwVar.G != null && ahwwVar.F != null) {
            if (str == null || str.isEmpty()) {
                ahwwVar.G.setVisibility(8);
                ahwwVar.F.setVisibility(8);
            } else {
                ahwwVar.G.setVisibility(0);
                ahwwVar.F.setVisibility(0);
                ahwwVar.G.setText(str);
            }
        }
        ((ahww) this.a).l.setText(ahww.e(aeouVar.b));
        ((ahww) this.a).m.setText(ahww.e(aeouVar.c));
    }

    public final void i() {
        ahwl ahwlVar = this.a;
        ((ahww) ahwlVar).j.setText(this.f);
        ahwl ahwlVar2 = this.a;
        ((ahww) ahwlVar2).i.setText(this.e);
        ahwl ahwlVar3 = this.a;
        aapb aapbVar = this.k;
        ahww ahwwVar = (ahww) ahwlVar3;
        if (ahwwVar.p == null) {
            return;
        }
        if (aapbVar == null || aapbVar == aapb.NOOP || aapbVar == aapb.RECTANGULAR_2D) {
            ahwwVar.o.setVisibility(8);
            ahwwVar.p.setVisibility(8);
        } else {
            ahwwVar.o.setVisibility(0);
            ahwwVar.p.setVisibility(0);
            ahwwVar.p.setText(aapbVar.toString().toLowerCase(Locale.US));
        }
    }

    public final void j() {
        float k = k();
        ahwl ahwlVar = this.a;
        int a = this.f54J.a();
        float l = aedn.l(k);
        ahww ahwwVar = (ahww) ahwlVar;
        if (ahwwVar.r != null) {
            int round = Math.round(l * a);
            double d = k;
            Double.isNaN(d);
            long round2 = Math.round(d * 10.0d);
            StringBuilder sb = new StringBuilder(71);
            sb.append(a);
            sb.append("%/");
            sb.append(round);
            sb.append("%(content loudness ");
            double d2 = round2;
            Double.isNaN(d2);
            sb.append(d2 / 10.0d);
            sb.append(" dB)");
            ahwwVar.r.setText(sb.toString());
        }
    }

    @Override // defpackage.ahwk
    public final void rO() {
        String str;
        String str2;
        zaw zawVar = this.D;
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.y.b().entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            String str3 = Build.VERSION.RELEASE;
            String str4 = Build.ID;
            String str5 = Build.VERSION.INCREMENTAL;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 2 + String.valueOf(str4).length() + String.valueOf(str5).length());
            sb.append(str3);
            sb.append(".");
            sb.append(str4);
            sb.append(".");
            sb.append(str5);
            jSONObject.put("cosver", sb.toString());
            jSONObject.put("videoid", this.e);
            jSONObject.put("cpn", this.f);
            jSONObject.put("fmt", ahbj.c(this.i));
            jSONObject.put("afmt", ahbj.c(this.j));
            jSONObject.put("bh", this.q);
            jSONObject.put("conn", this.z.a());
            jSONObject.put("volume", this.f54J.a());
            jSONObject.put("loudness", String.format(Locale.US, "%.3f", Float.valueOf(k())));
            jSONObject.put("bat", String.format(Locale.US, "%.3f:%d", Float.valueOf(this.A.a()), Integer.valueOf(this.A.b() ? 1 : 0)));
            int intValue = ((Integer) this.c.get()).intValue() - this.h;
            int intValue2 = ((Integer) this.b.get()).intValue() - this.g;
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append(intValue);
            sb2.append("/");
            sb2.append(intValue2);
            jSONObject.put("df", sb2.toString());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            jSONObject.put("time", simpleDateFormat.format(new Date()));
            jSONObject.put("glmode", this.k);
            jSONObject.put("drm", ((aeou) this.C.get()).a);
            jSONObject.put("mtext", ((aeou) this.C.get()).d);
            if (this.r.containsKey(this.f)) {
                ArrayList arrayList = (ArrayList) this.r.get(this.f);
                if (arrayList == null) {
                    str2 = "";
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        afih afihVar = (afih) arrayList.get(i);
                        sb3.append(afihVar.i());
                        sb3.append(":");
                        sb3.append(afihVar.a());
                        sb3.append(":");
                        sb3.append(afihVar.k());
                        sb3.append(",");
                    }
                    str2 = sb3.toString();
                }
            } else {
                str2 = "No errors";
            }
            jSONObject.put("error", str2);
            l(jSONObject, this.l);
            l(jSONObject, this.m);
            str = jSONObject.toString();
        } catch (JSONException unused) {
            str = null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) this.v.getSystemService("clipboard");
        int i2 = R.string.nerd_stats_copy_debug_info_error;
        if (str != null && clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("YouTube Player Debug Info", str));
            i2 = R.string.nerd_stats_copy_debug_info_success;
        }
        zawVar.c(i2);
    }

    @Override // defpackage.afia
    public final /* synthetic */ void rP(long j) {
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        afkn afknVar = this.B;
        if (observable == afknVar && this.p) {
            this.a.d((afkm) afknVar.get());
        }
    }
}
