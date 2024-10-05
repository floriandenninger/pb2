package defpackage;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xza extends xze {
    public static final bamc ae = bamb.a("MMMM dd, yyyy");
    public static final bamc af = bamb.a("hh:mm a");
    private static final bamc ap = bamb.a("Z");
    private YouTubeButton aA;
    public aahv ag;
    public shf ah;
    public Dialog ai;
    public bajg aj;
    public List ak;
    public avhh al;
    public String am;
    public TextView an;
    public TextView ao;
    private aqio aq;
    private avhj ar;
    private String as;
    private Toolbar at;
    private TextView au;
    private View av;
    private TextView aw;
    private View ax;
    private TextView ay;
    private Spinner az;

    public final void aF() {
        if (this.aj.a <= this.ah.c()) {
            this.aA.setEnabled(false);
        } else {
            this.aA.setEnabled(true);
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        aooy aooyVar;
        bajg bajgVar;
        String str;
        super.mR(bundle);
        try {
            aooyVar = amkq.ck(this.m, "renderer", aqio.a, aomw.b());
        } catch (RuntimeException unused) {
            zga.b("Failed to merge proto for renderer");
            aooyVar = null;
        }
        aqio aqioVar = (aqio) aooyVar;
        this.aq = aqioVar;
        amkq.N((aqioVar.b & 128) != 0);
        String str2 = this.aq.i;
        this.am = str2;
        this.al = avhi.d(str2);
        avhj avhjVar = (avhj) this.ag.c().f(this.am).X();
        this.ar = avhjVar;
        if (avhjVar == null) {
            bajgVar = new bajg(this.ah.c());
        } else {
            bajgVar = new bajg(TimeUnit.SECONDS.toMillis(this.ar.getTimestamp().c), bajn.j(bajn.k().a(this.ah.c())));
        }
        this.aj = bajgVar;
        this.as = qR().getResources().getString(R.string.local_timezone_label);
        ArrayList arrayList = new ArrayList();
        this.ak = arrayList;
        String string = qR().getResources().getString(R.string.utc_offset_format);
        String string2 = qR().getResources().getString(R.string.city_timezone_format);
        bajn k = bajn.k();
        bajg bajgVar2 = new bajg(this.ah.c());
        String format = String.format(string, ap.a(bajgVar2));
        aone createBuilder = aqip.a.createBuilder();
        createBuilder.copyOnWrite();
        aqip aqipVar = (aqip) createBuilder.instance;
        aqipVar.b |= 1;
        aqipVar.c = "Etc/Unknown";
        String str3 = this.as;
        createBuilder.copyOnWrite();
        aqip aqipVar2 = (aqip) createBuilder.instance;
        str3.getClass();
        aqipVar2.b |= 2;
        aqipVar2.d = str3;
        createBuilder.copyOnWrite();
        aqip aqipVar3 = (aqip) createBuilder.instance;
        format.getClass();
        aqipVar3.b |= 4;
        aqipVar3.e = format;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(k.a(bajgVar2.a));
        createBuilder.copyOnWrite();
        aqip aqipVar4 = (aqip) createBuilder.instance;
        aqipVar4.b |= 8;
        aqipVar4.f = seconds;
        if (this.aq.d.size() > 0 && (((aqip) this.aq.d.get(0)).b & 16) != 0) {
            Object[] objArr = new Object[1];
            int a = bajgVar2.k().a(bajgVar2.a);
            if (a != 0) {
                int hours = (int) TimeUnit.MILLISECONDS.toHours(Math.abs(a));
                int minutes = (int) (TimeUnit.MILLISECONDS.toMinutes(Math.abs(a)) - TimeUnit.HOURS.toMinutes(hours));
                if (a < 0) {
                    str = String.format(Locale.getDefault(), "-%d", Integer.valueOf(hours));
                } else {
                    str = String.format(Locale.getDefault(), "+%d", Integer.valueOf(hours));
                }
                if (minutes > 0) {
                    str = String.format(Locale.getDefault(), "%s:%d", str, Integer.valueOf(minutes));
                }
            } else {
                str = "";
            }
            objArr[0] = String.format(string, str);
            String format2 = String.format(string2, objArr);
            createBuilder.copyOnWrite();
            aqip aqipVar5 = (aqip) createBuilder.instance;
            format2.getClass();
            aqipVar5.b |= 16;
            aqipVar5.g = format2;
        }
        arrayList.add((aqip) createBuilder.build());
        this.ak.addAll(this.aq.d);
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.getWindow().setLayout(-1, -1);
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        Dialog dialog = this.d;
        this.ai = dialog;
        dialog.getClass();
        final int i = 1;
        dialog.getWindow().requestFeature(1);
        final int i2 = 0;
        View inflate = layoutInflater.inflate(R.layout.date_time_picker_fragment, viewGroup, false);
        this.at = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.au = (TextView) inflate.findViewById(R.id.date_picker_header);
        this.av = inflate.findViewById(R.id.date_picker_container);
        this.an = (TextView) inflate.findViewById(R.id.date_picker_text);
        this.aw = (TextView) inflate.findViewById(R.id.time_picker_header);
        this.ax = inflate.findViewById(R.id.time_picker_container);
        this.ao = (TextView) inflate.findViewById(R.id.time_picker_text);
        this.ay = (TextView) inflate.findViewById(R.id.timezone_picker_header);
        this.az = (Spinner) inflate.findViewById(R.id.timezone_spinner);
        this.aA = (YouTubeButton) inflate.findViewById(R.id.confirm_button);
        this.at.l(R.menu.date_time_picker_action_menu);
        Toolbar toolbar = this.at;
        aqyg aqygVar = this.aq.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        toolbar.x(ajcq.b(aqygVar));
        this.at.o(R.string.accessibility_close_dialog);
        final int i3 = 3;
        this.at.r(new View.OnClickListener(this) { // from class: xyw
            public final /* synthetic */ xza a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                final int i5 = 1;
                if (i4 == 0) {
                    final xza xzaVar = this.a;
                    aypy.v(new xzs(xzaVar.aj, xzaVar.qR(), 1)).g(new ayrv() { // from class: xyy
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            if (i5 == 0) {
                                final xza xzaVar2 = xzaVar;
                                final bajg bajgVar = (bajg) obj;
                                final int i6 = 0;
                                return ayph.t(new ayrm() { // from class: xyx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        if (i6 == 0) {
                                            xza xzaVar3 = xzaVar2;
                                            bajg bajgVar2 = bajgVar;
                                            xzaVar3.ao.setText(xza.af.a(bajgVar2));
                                            xzaVar3.aj = bajgVar2;
                                            xzaVar3.aF();
                                            return;
                                        }
                                        xza xzaVar4 = xzaVar2;
                                        bajg bajgVar3 = bajgVar;
                                        xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                        xzaVar4.aj = bajgVar3;
                                        xzaVar4.aF();
                                    }
                                });
                            }
                            final xza xzaVar3 = xzaVar;
                            final bajg bajgVar2 = (bajg) obj;
                            final int i7 = 1;
                            return ayph.t(new ayrm() { // from class: xyx
                                @Override // defpackage.ayrm
                                public final void a() {
                                    if (i7 == 0) {
                                        xza xzaVar32 = xzaVar3;
                                        bajg bajgVar22 = bajgVar2;
                                        xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                        xzaVar32.aj = bajgVar22;
                                        xzaVar32.aF();
                                        return;
                                    }
                                    xza xzaVar4 = xzaVar3;
                                    bajg bajgVar3 = bajgVar2;
                                    xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                    xzaVar4.aj = bajgVar3;
                                    xzaVar4.aF();
                                }
                            });
                        }
                    }).Q();
                    return;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        this.a.ai.cancel();
                        return;
                    }
                    final xza xzaVar2 = this.a;
                    final int i6 = 0;
                    aypy.v(new xzs(xzaVar2.qR(), xzaVar2.aj, 0)).g(new ayrv() { // from class: xyy
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            if (i6 == 0) {
                                final xza xzaVar22 = xzaVar2;
                                final bajg bajgVar = (bajg) obj;
                                final int i62 = 0;
                                return ayph.t(new ayrm() { // from class: xyx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        if (i62 == 0) {
                                            xza xzaVar32 = xzaVar22;
                                            bajg bajgVar22 = bajgVar;
                                            xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                            xzaVar32.aj = bajgVar22;
                                            xzaVar32.aF();
                                            return;
                                        }
                                        xza xzaVar4 = xzaVar22;
                                        bajg bajgVar3 = bajgVar;
                                        xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                        xzaVar4.aj = bajgVar3;
                                        xzaVar4.aF();
                                    }
                                });
                            }
                            final xza xzaVar3 = xzaVar2;
                            final bajg bajgVar2 = (bajg) obj;
                            final int i7 = 1;
                            return ayph.t(new ayrm() { // from class: xyx
                                @Override // defpackage.ayrm
                                public final void a() {
                                    if (i7 == 0) {
                                        xza xzaVar32 = xzaVar3;
                                        bajg bajgVar22 = bajgVar2;
                                        xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                        xzaVar32.aj = bajgVar22;
                                        xzaVar32.aF();
                                        return;
                                    }
                                    xza xzaVar4 = xzaVar3;
                                    bajg bajgVar3 = bajgVar2;
                                    xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                    xzaVar4.aj = bajgVar3;
                                    xzaVar4.aF();
                                }
                            });
                        }
                    }).Q();
                    return;
                }
                xza xzaVar3 = this.a;
                aahu c = xzaVar3.ag.c();
                aone createBuilder = avhm.a.createBuilder();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(xzaVar3.aj.a);
                createBuilder.copyOnWrite();
                avhm avhmVar = (avhm) createBuilder.instance;
                avhmVar.b = 1 | avhmVar.b;
                avhmVar.c = seconds;
                avhm avhmVar2 = (avhm) createBuilder.build();
                avhh avhhVar = xzaVar3.al;
                avhhVar.b(avhmVar2);
                avhj c2 = avhhVar.c();
                aaio c3 = ((aaih) c).c();
                c3.d(c2);
                c3.b().Q();
                xzaVar3.ai.cancel();
            }
        });
        zau zauVar = new zau(qR());
        Toolbar toolbar2 = this.at;
        toolbar2.q(zauVar.b(toolbar2.e(), wbs.W(qR(), R.attr.ytTextPrimary).orElse(0)));
        MenuItem findItem = this.at.g().findItem(R.id.remove_button);
        if ((this.aq.b & 4) == 0 || this.ar == null) {
            findItem.setVisible(false);
        } else {
            this.at.q = new yq() { // from class: xyv
                @Override // defpackage.yq
                public final boolean a(MenuItem menuItem) {
                    xza xzaVar = xza.this;
                    if (((qt) menuItem).a != R.id.remove_button) {
                        return false;
                    }
                    aaio c = ((aaih) xzaVar.ag.c()).c();
                    c.g(xzaVar.am);
                    c.b().Q();
                    xzaVar.ai.cancel();
                    return true;
                }
            };
            MenuItem findItem2 = this.at.g().findItem(R.id.remove_button);
            aulq aulqVar = this.aq.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            aqyg aqygVar2 = ((apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer)).i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            findItem2.setTitle(ajcq.b(aqygVar2));
            findItem.setVisible(true);
        }
        TextView textView = this.au;
        aqyg aqygVar3 = this.aq.f;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar3));
        View view = this.av;
        whu.E(view, view.getBackground());
        this.av.setOnClickListener(new View.OnClickListener(this) { // from class: xyw
            public final /* synthetic */ xza a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i4 = i2;
                final int i5 = 1;
                if (i4 == 0) {
                    final xza xzaVar = this.a;
                    aypy.v(new xzs(xzaVar.aj, xzaVar.qR(), 1)).g(new ayrv() { // from class: xyy
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            if (i5 == 0) {
                                final xza xzaVar22 = xzaVar;
                                final bajg bajgVar = (bajg) obj;
                                final int i62 = 0;
                                return ayph.t(new ayrm() { // from class: xyx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        if (i62 == 0) {
                                            xza xzaVar32 = xzaVar22;
                                            bajg bajgVar22 = bajgVar;
                                            xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                            xzaVar32.aj = bajgVar22;
                                            xzaVar32.aF();
                                            return;
                                        }
                                        xza xzaVar4 = xzaVar22;
                                        bajg bajgVar3 = bajgVar;
                                        xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                        xzaVar4.aj = bajgVar3;
                                        xzaVar4.aF();
                                    }
                                });
                            }
                            final xza xzaVar3 = xzaVar;
                            final bajg bajgVar2 = (bajg) obj;
                            final int i7 = 1;
                            return ayph.t(new ayrm() { // from class: xyx
                                @Override // defpackage.ayrm
                                public final void a() {
                                    if (i7 == 0) {
                                        xza xzaVar32 = xzaVar3;
                                        bajg bajgVar22 = bajgVar2;
                                        xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                        xzaVar32.aj = bajgVar22;
                                        xzaVar32.aF();
                                        return;
                                    }
                                    xza xzaVar4 = xzaVar3;
                                    bajg bajgVar3 = bajgVar2;
                                    xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                    xzaVar4.aj = bajgVar3;
                                    xzaVar4.aF();
                                }
                            });
                        }
                    }).Q();
                    return;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        this.a.ai.cancel();
                        return;
                    }
                    final xza xzaVar2 = this.a;
                    final int i6 = 0;
                    aypy.v(new xzs(xzaVar2.qR(), xzaVar2.aj, 0)).g(new ayrv() { // from class: xyy
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            if (i6 == 0) {
                                final xza xzaVar22 = xzaVar2;
                                final bajg bajgVar = (bajg) obj;
                                final int i62 = 0;
                                return ayph.t(new ayrm() { // from class: xyx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        if (i62 == 0) {
                                            xza xzaVar32 = xzaVar22;
                                            bajg bajgVar22 = bajgVar;
                                            xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                            xzaVar32.aj = bajgVar22;
                                            xzaVar32.aF();
                                            return;
                                        }
                                        xza xzaVar4 = xzaVar22;
                                        bajg bajgVar3 = bajgVar;
                                        xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                        xzaVar4.aj = bajgVar3;
                                        xzaVar4.aF();
                                    }
                                });
                            }
                            final xza xzaVar3 = xzaVar2;
                            final bajg bajgVar2 = (bajg) obj;
                            final int i7 = 1;
                            return ayph.t(new ayrm() { // from class: xyx
                                @Override // defpackage.ayrm
                                public final void a() {
                                    if (i7 == 0) {
                                        xza xzaVar32 = xzaVar3;
                                        bajg bajgVar22 = bajgVar2;
                                        xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                        xzaVar32.aj = bajgVar22;
                                        xzaVar32.aF();
                                        return;
                                    }
                                    xza xzaVar4 = xzaVar3;
                                    bajg bajgVar3 = bajgVar2;
                                    xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                    xzaVar4.aj = bajgVar3;
                                    xzaVar4.aF();
                                }
                            });
                        }
                    }).Q();
                    return;
                }
                xza xzaVar3 = this.a;
                aahu c = xzaVar3.ag.c();
                aone createBuilder = avhm.a.createBuilder();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(xzaVar3.aj.a);
                createBuilder.copyOnWrite();
                avhm avhmVar = (avhm) createBuilder.instance;
                avhmVar.b = 1 | avhmVar.b;
                avhmVar.c = seconds;
                avhm avhmVar2 = (avhm) createBuilder.build();
                avhh avhhVar = xzaVar3.al;
                avhhVar.b(avhmVar2);
                avhj c2 = avhhVar.c();
                aaio c3 = ((aaih) c).c();
                c3.d(c2);
                c3.b().Q();
                xzaVar3.ai.cancel();
            }
        });
        this.an.setText(ae.a(this.aj));
        TextView textView2 = this.aw;
        aqyg aqygVar4 = this.aq.g;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar4));
        View view2 = this.ax;
        whu.E(view2, view2.getBackground());
        final int i4 = 2;
        this.ax.setOnClickListener(new View.OnClickListener(this) { // from class: xyw
            public final /* synthetic */ xza a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                int i42 = i4;
                final int i5 = 1;
                if (i42 == 0) {
                    final xza xzaVar = this.a;
                    aypy.v(new xzs(xzaVar.aj, xzaVar.qR(), 1)).g(new ayrv() { // from class: xyy
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            if (i5 == 0) {
                                final xza xzaVar22 = xzaVar;
                                final bajg bajgVar = (bajg) obj;
                                final int i62 = 0;
                                return ayph.t(new ayrm() { // from class: xyx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        if (i62 == 0) {
                                            xza xzaVar32 = xzaVar22;
                                            bajg bajgVar22 = bajgVar;
                                            xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                            xzaVar32.aj = bajgVar22;
                                            xzaVar32.aF();
                                            return;
                                        }
                                        xza xzaVar4 = xzaVar22;
                                        bajg bajgVar3 = bajgVar;
                                        xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                        xzaVar4.aj = bajgVar3;
                                        xzaVar4.aF();
                                    }
                                });
                            }
                            final xza xzaVar3 = xzaVar;
                            final bajg bajgVar2 = (bajg) obj;
                            final int i7 = 1;
                            return ayph.t(new ayrm() { // from class: xyx
                                @Override // defpackage.ayrm
                                public final void a() {
                                    if (i7 == 0) {
                                        xza xzaVar32 = xzaVar3;
                                        bajg bajgVar22 = bajgVar2;
                                        xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                        xzaVar32.aj = bajgVar22;
                                        xzaVar32.aF();
                                        return;
                                    }
                                    xza xzaVar4 = xzaVar3;
                                    bajg bajgVar3 = bajgVar2;
                                    xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                    xzaVar4.aj = bajgVar3;
                                    xzaVar4.aF();
                                }
                            });
                        }
                    }).Q();
                    return;
                }
                if (i42 != 1) {
                    if (i42 != 2) {
                        this.a.ai.cancel();
                        return;
                    }
                    final xza xzaVar2 = this.a;
                    final int i6 = 0;
                    aypy.v(new xzs(xzaVar2.qR(), xzaVar2.aj, 0)).g(new ayrv() { // from class: xyy
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            if (i6 == 0) {
                                final xza xzaVar22 = xzaVar2;
                                final bajg bajgVar = (bajg) obj;
                                final int i62 = 0;
                                return ayph.t(new ayrm() { // from class: xyx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        if (i62 == 0) {
                                            xza xzaVar32 = xzaVar22;
                                            bajg bajgVar22 = bajgVar;
                                            xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                            xzaVar32.aj = bajgVar22;
                                            xzaVar32.aF();
                                            return;
                                        }
                                        xza xzaVar4 = xzaVar22;
                                        bajg bajgVar3 = bajgVar;
                                        xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                        xzaVar4.aj = bajgVar3;
                                        xzaVar4.aF();
                                    }
                                });
                            }
                            final xza xzaVar3 = xzaVar2;
                            final bajg bajgVar2 = (bajg) obj;
                            final int i7 = 1;
                            return ayph.t(new ayrm() { // from class: xyx
                                @Override // defpackage.ayrm
                                public final void a() {
                                    if (i7 == 0) {
                                        xza xzaVar32 = xzaVar3;
                                        bajg bajgVar22 = bajgVar2;
                                        xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                        xzaVar32.aj = bajgVar22;
                                        xzaVar32.aF();
                                        return;
                                    }
                                    xza xzaVar4 = xzaVar3;
                                    bajg bajgVar3 = bajgVar2;
                                    xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                    xzaVar4.aj = bajgVar3;
                                    xzaVar4.aF();
                                }
                            });
                        }
                    }).Q();
                    return;
                }
                xza xzaVar3 = this.a;
                aahu c = xzaVar3.ag.c();
                aone createBuilder = avhm.a.createBuilder();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(xzaVar3.aj.a);
                createBuilder.copyOnWrite();
                avhm avhmVar = (avhm) createBuilder.instance;
                avhmVar.b = 1 | avhmVar.b;
                avhmVar.c = seconds;
                avhm avhmVar2 = (avhm) createBuilder.build();
                avhh avhhVar = xzaVar3.al;
                avhhVar.b(avhmVar2);
                avhj c2 = avhhVar.c();
                aaio c3 = ((aaih) c).c();
                c3.d(c2);
                c3.b().Q();
                xzaVar3.ai.cancel();
            }
        });
        this.ao.setText(af.a(this.aj));
        TextView textView3 = this.ay;
        aqyg aqygVar5 = this.aq.h;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        textView3.setText(ajcq.b(aqygVar5));
        Spinner spinner = this.az;
        whu.E(spinner, spinner.getBackground());
        ArrayList arrayList = new ArrayList();
        for (aqip aqipVar : this.ak) {
            if ((aqipVar.b & 16) != 0) {
                arrayList.add(aqipVar.g);
            } else {
                arrayList.add(qR().getString(R.string.timezone_format, aqipVar.e, aqipVar.d));
            }
        }
        this.az.setAdapter((SpinnerAdapter) new ArrayAdapter(qR(), R.layout.timezone_spinner_item, arrayList));
        this.az.setOnItemSelectedListener(new xyz(this));
        YouTubeButton youTubeButton = this.aA;
        whu.E(youTubeButton, youTubeButton.getBackground());
        this.aA.setOnClickListener(new View.OnClickListener(this) { // from class: xyw
            public final /* synthetic */ xza a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                int i42 = i;
                final int i5 = 1;
                if (i42 == 0) {
                    final xza xzaVar = this.a;
                    aypy.v(new xzs(xzaVar.aj, xzaVar.qR(), 1)).g(new ayrv() { // from class: xyy
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            if (i5 == 0) {
                                final xza xzaVar22 = xzaVar;
                                final bajg bajgVar = (bajg) obj;
                                final int i62 = 0;
                                return ayph.t(new ayrm() { // from class: xyx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        if (i62 == 0) {
                                            xza xzaVar32 = xzaVar22;
                                            bajg bajgVar22 = bajgVar;
                                            xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                            xzaVar32.aj = bajgVar22;
                                            xzaVar32.aF();
                                            return;
                                        }
                                        xza xzaVar4 = xzaVar22;
                                        bajg bajgVar3 = bajgVar;
                                        xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                        xzaVar4.aj = bajgVar3;
                                        xzaVar4.aF();
                                    }
                                });
                            }
                            final xza xzaVar3 = xzaVar;
                            final bajg bajgVar2 = (bajg) obj;
                            final int i7 = 1;
                            return ayph.t(new ayrm() { // from class: xyx
                                @Override // defpackage.ayrm
                                public final void a() {
                                    if (i7 == 0) {
                                        xza xzaVar32 = xzaVar3;
                                        bajg bajgVar22 = bajgVar2;
                                        xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                        xzaVar32.aj = bajgVar22;
                                        xzaVar32.aF();
                                        return;
                                    }
                                    xza xzaVar4 = xzaVar3;
                                    bajg bajgVar3 = bajgVar2;
                                    xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                    xzaVar4.aj = bajgVar3;
                                    xzaVar4.aF();
                                }
                            });
                        }
                    }).Q();
                    return;
                }
                if (i42 != 1) {
                    if (i42 != 2) {
                        this.a.ai.cancel();
                        return;
                    }
                    final xza xzaVar2 = this.a;
                    final int i6 = 0;
                    aypy.v(new xzs(xzaVar2.qR(), xzaVar2.aj, 0)).g(new ayrv() { // from class: xyy
                        @Override // defpackage.ayrv
                        public final Object a(Object obj) {
                            if (i6 == 0) {
                                final xza xzaVar22 = xzaVar2;
                                final bajg bajgVar = (bajg) obj;
                                final int i62 = 0;
                                return ayph.t(new ayrm() { // from class: xyx
                                    @Override // defpackage.ayrm
                                    public final void a() {
                                        if (i62 == 0) {
                                            xza xzaVar32 = xzaVar22;
                                            bajg bajgVar22 = bajgVar;
                                            xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                            xzaVar32.aj = bajgVar22;
                                            xzaVar32.aF();
                                            return;
                                        }
                                        xza xzaVar4 = xzaVar22;
                                        bajg bajgVar3 = bajgVar;
                                        xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                        xzaVar4.aj = bajgVar3;
                                        xzaVar4.aF();
                                    }
                                });
                            }
                            final xza xzaVar3 = xzaVar2;
                            final bajg bajgVar2 = (bajg) obj;
                            final int i7 = 1;
                            return ayph.t(new ayrm() { // from class: xyx
                                @Override // defpackage.ayrm
                                public final void a() {
                                    if (i7 == 0) {
                                        xza xzaVar32 = xzaVar3;
                                        bajg bajgVar22 = bajgVar2;
                                        xzaVar32.ao.setText(xza.af.a(bajgVar22));
                                        xzaVar32.aj = bajgVar22;
                                        xzaVar32.aF();
                                        return;
                                    }
                                    xza xzaVar4 = xzaVar3;
                                    bajg bajgVar3 = bajgVar2;
                                    xzaVar4.an.setText(xza.ae.a(bajgVar3));
                                    xzaVar4.aj = bajgVar3;
                                    xzaVar4.aF();
                                }
                            });
                        }
                    }).Q();
                    return;
                }
                xza xzaVar3 = this.a;
                aahu c = xzaVar3.ag.c();
                aone createBuilder = avhm.a.createBuilder();
                long seconds = TimeUnit.MILLISECONDS.toSeconds(xzaVar3.aj.a);
                createBuilder.copyOnWrite();
                avhm avhmVar = (avhm) createBuilder.instance;
                avhmVar.b = 1 | avhmVar.b;
                avhmVar.c = seconds;
                avhm avhmVar2 = (avhm) createBuilder.build();
                avhh avhhVar = xzaVar3.al;
                avhhVar.b(avhmVar2);
                avhj c2 = avhhVar.c();
                aaio c3 = ((aaih) c).c();
                c3.d(c2);
                c3.b().Q();
                xzaVar3.ai.cancel();
            }
        });
        aF();
        return inflate;
    }
}
