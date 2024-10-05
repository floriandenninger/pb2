package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class epm implements ajom {
    public final Switch a;
    public final eow b;
    public boolean c;
    public lpg d;
    public lpk e;
    public AlertDialog f;
    public AlertDialog g;
    private final Activity h;
    private final ajop i;
    private final TextView j;
    private final TextView k;
    private final ayqw l;
    private final int m;
    private final eqa n;
    private aupu o;
    private boolean p;
    private boolean q = false;
    private final aadw r;
    private final ansv s;

    public epm(Activity activity, eow eowVar, aaea aaeaVar, eqa eqaVar, aadw aadwVar, gma gmaVar, ansv ansvVar, ayqi ayqiVar, ViewGroup viewGroup, byte[] bArr) {
        long seconds;
        this.b = eowVar;
        this.i = gmaVar;
        this.h = activity;
        final int i = 0;
        this.r = aadwVar;
        this.n = eqaVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        arfd a = aaeaVar.a();
        aswb aswbVar = a.e;
        if (((aswbVar == null ? aswb.a : aswbVar).e & 128) != 0) {
            aswb aswbVar2 = a.e;
            seconds = (aswbVar2 == null ? aswb.a : aswbVar2).ae;
        } else {
            seconds = TimeUnit.MINUTES.toSeconds(15L);
        }
        int minutes = (int) timeUnit.toMinutes(seconds);
        final int i2 = 1;
        this.m = Math.max(1, minutes);
        f(eowVar.b());
        this.s = ansvVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.summary);
        this.a = (Switch) inflate.findViewById(R.id.switch_button);
        gmaVar.c(inflate);
        gmaVar.d(new View.OnClickListener() { // from class: epg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                epm.this.g();
            }
        });
        aypy ae = aypy.v(new ayqa() { // from class: epj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ayqa
            public final void a(final aypz aypzVar) {
                final epm epmVar = epm.this;
                epmVar.a.setOnClickListener(new View.OnClickListener() { // from class: eph
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        aypzVar.d(Boolean.valueOf(epm.this.a.isChecked()));
                    }
                });
                ayrz.f((AtomicReference) aypzVar, aynu.e(new ayrm() { // from class: epk
                    @Override // defpackage.ayrm
                    public final void a() {
                        epm.this.a.setOnClickListener(null);
                    }
                }));
            }
        }).ae();
        final int i3 = 2;
        final int i4 = 3;
        this.l = new ayqw(eowVar.g().ab(ayqiVar).ax(new ayrs(this) { // from class: epl
            public final /* synthetic */ epm a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i5 = i2;
                if (i5 != 0) {
                    if (i5 == 1) {
                        this.a.f((eok) obj);
                        return;
                    }
                    if (i5 == 2) {
                        this.a.g();
                        return;
                    } else {
                        epm epmVar = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        (booleanValue ? epmVar.d() : ayph.f()).c(epmVar.b.d(booleanValue));
                        return;
                    }
                }
                epm epmVar2 = this.a;
                boolean z = ((epz) obj) != epz.NOT_SUPPORTED;
                if (z != epmVar2.c) {
                    if (epmVar2.d != null && epmVar2.f.isShowing()) {
                        epmVar2.f.hide();
                    }
                    if (epmVar2.e != null) {
                        AlertDialog alertDialog = epmVar2.g;
                        amkq.u(alertDialog);
                        if (alertDialog.isShowing()) {
                            AlertDialog alertDialog2 = epmVar2.g;
                            amkq.u(alertDialog2);
                            alertDialog2.hide();
                        }
                    }
                }
                epmVar2.c = z;
            }
        }), eqaVar.a().ab(ayqiVar).ax(new ayrs(this) { // from class: epl
            public final /* synthetic */ epm a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i5 = i;
                if (i5 != 0) {
                    if (i5 == 1) {
                        this.a.f((eok) obj);
                        return;
                    }
                    if (i5 == 2) {
                        this.a.g();
                        return;
                    } else {
                        epm epmVar = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        (booleanValue ? epmVar.d() : ayph.f()).c(epmVar.b.d(booleanValue));
                        return;
                    }
                }
                epm epmVar2 = this.a;
                boolean z = ((epz) obj) != epz.NOT_SUPPORTED;
                if (z != epmVar2.c) {
                    if (epmVar2.d != null && epmVar2.f.isShowing()) {
                        epmVar2.f.hide();
                    }
                    if (epmVar2.e != null) {
                        AlertDialog alertDialog = epmVar2.g;
                        amkq.u(alertDialog);
                        if (alertDialog.isShowing()) {
                            AlertDialog alertDialog2 = epmVar2.g;
                            amkq.u(alertDialog2);
                            alertDialog2.hide();
                        }
                    }
                }
                epmVar2.c = z;
            }
        }), ae.ab(ayqiVar).L(eng.e).ax(new ayrs(this) { // from class: epl
            public final /* synthetic */ epm a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i5 = i3;
                if (i5 != 0) {
                    if (i5 == 1) {
                        this.a.f((eok) obj);
                        return;
                    }
                    if (i5 == 2) {
                        this.a.g();
                        return;
                    } else {
                        epm epmVar = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        (booleanValue ? epmVar.d() : ayph.f()).c(epmVar.b.d(booleanValue));
                        return;
                    }
                }
                epm epmVar2 = this.a;
                boolean z = ((epz) obj) != epz.NOT_SUPPORTED;
                if (z != epmVar2.c) {
                    if (epmVar2.d != null && epmVar2.f.isShowing()) {
                        epmVar2.f.hide();
                    }
                    if (epmVar2.e != null) {
                        AlertDialog alertDialog = epmVar2.g;
                        amkq.u(alertDialog);
                        if (alertDialog.isShowing()) {
                            AlertDialog alertDialog2 = epmVar2.g;
                            amkq.u(alertDialog2);
                            alertDialog2.hide();
                        }
                    }
                }
                epmVar2.c = z;
            }
        }), ae.ab(ayqiVar).ax(new ayrs(this) { // from class: epl
            public final /* synthetic */ epm a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i5 = i4;
                if (i5 != 0) {
                    if (i5 == 1) {
                        this.a.f((eok) obj);
                        return;
                    }
                    if (i5 == 2) {
                        this.a.g();
                        return;
                    } else {
                        epm epmVar = this.a;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        (booleanValue ? epmVar.d() : ayph.f()).c(epmVar.b.d(booleanValue));
                        return;
                    }
                }
                epm epmVar2 = this.a;
                boolean z = ((epz) obj) != epz.NOT_SUPPORTED;
                if (z != epmVar2.c) {
                    if (epmVar2.d != null && epmVar2.f.isShowing()) {
                        epmVar2.f.hide();
                    }
                    if (epmVar2.e != null) {
                        AlertDialog alertDialog = epmVar2.g;
                        amkq.u(alertDialog);
                        if (alertDialog.isShowing()) {
                            AlertDialog alertDialog2 = epmVar2.g;
                            amkq.u(alertDialog2);
                            alertDialog2.hide();
                        }
                    }
                }
                epmVar2.c = z;
            }
        }));
    }

    private final void h(boolean z, boolean z2) {
        aqyg aqygVar;
        if (z2) {
            aqygVar = ajcq.g(this.h.getString(R.string.bedtime_reminder_setting_summary_system_schedule));
        } else {
            aqygVar = this.o.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        }
        if (!z && (aqygVar = this.o.j) == null) {
            aqygVar = aqyg.a;
        }
        whu.G(this.k, ajcq.b(aqygVar));
    }

    private final void i(boolean z) {
        Switch r0 = this.a;
        if (r0 != null) {
            r0.setChecked(z);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.i).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.l.c();
    }

    public final ayph d() {
        eok eokVar = eok.a;
        return this.b.e(eokVar.h, eokVar.g);
    }

    public final void e(boolean z, int i, int i2, boolean z2) {
        this.p = z;
        if (z) {
            if (this.n.a().aB() == epz.NO_ACCESS) {
                aloh.f(this.h);
            }
            this.b.n(z2);
        } else {
            if (((epz) this.n.a().aB()).f) {
                aloh.g(this.h);
            }
            eow eowVar = this.b;
            int i3 = this.m;
            ynm.m(eowVar.c(new afyd(i * i3, i2 * i3, z2, 1)), new egw(6));
        }
        d().Q();
    }

    public final void f(eok eokVar) {
        Activity activity = this.h;
        int i = eokVar.d;
        int i2 = eokVar.e;
        int i3 = this.m;
        boolean z = eokVar.f;
        aone createBuilder = aupu.a.createBuilder();
        aong aongVar = (aong) aulq.a.createBuilder();
        aonk aonkVar = SettingRenderer.settingDialogRenderer;
        aone createBuilder2 = auqa.a.createBuilder();
        aqyg h = ajcq.h(activity.getString(R.string.bedtime_reminder_setting_dialog_title));
        createBuilder2.copyOnWrite();
        auqa auqaVar = (auqa) createBuilder2.instance;
        h.getClass();
        auqaVar.c = h;
        auqaVar.b |= 1;
        aong aongVar2 = (aong) aulq.a.createBuilder();
        aongVar2.e(SettingRenderer.settingSingleOptionMenuRenderer, esv.c(i, i3, activity.getString(R.string.bedtime_reminder_start_time)));
        createBuilder2.aO(aongVar2);
        aong aongVar3 = (aong) aulq.a.createBuilder();
        aongVar3.e(SettingRenderer.settingSingleOptionMenuRenderer, esv.c(i2, i3, activity.getString(R.string.bedtime_reminder_end_time)));
        createBuilder2.aO(aongVar3);
        aong aongVar4 = (aong) aulq.a.createBuilder();
        aonk aonkVar2 = SettingRenderer.a;
        aone createBuilder3 = aupu.a.createBuilder();
        createBuilder3.copyOnWrite();
        aupu aupuVar = (aupu) createBuilder3.instance;
        aupuVar.b |= 64;
        aupuVar.f = z;
        aqyg g = ajcq.g(activity.getString(R.string.bedtime_reminder_wait_until));
        createBuilder3.copyOnWrite();
        aupu aupuVar2 = (aupu) createBuilder3.instance;
        g.getClass();
        aupuVar2.d = g;
        aupuVar2.b |= 16;
        aongVar4.e(aonkVar2, (aupu) createBuilder3.build());
        createBuilder2.aO(aongVar4);
        aongVar.e(aonkVar, (auqa) createBuilder2.build());
        aulq aulqVar = (aulq) aongVar.build();
        createBuilder.copyOnWrite();
        aupu aupuVar3 = (aupu) createBuilder.instance;
        aulqVar.getClass();
        aupuVar3.n = aulqVar;
        aupuVar3.b |= 32768;
        aqyg g2 = ajcq.g(activity.getString(R.string.bedtime_reminder_setting_title));
        createBuilder.copyOnWrite();
        aupu aupuVar4 = (aupu) createBuilder.instance;
        g2.getClass();
        aupuVar4.d = g2;
        aupuVar4.b |= 16;
        aqyg g3 = ajcq.g(activity.getString(R.string.bedtime_reminder_setting_summary));
        createBuilder.copyOnWrite();
        aupu aupuVar5 = (aupu) createBuilder.instance;
        g3.getClass();
        aupuVar5.j = g3;
        aupuVar5.b |= 2048;
        aqyg g4 = ajcq.g(activity.getString(R.string.bedtime_reminder_setting_summary_enabled, esv.d(activity, i), esv.d(activity, i2)));
        createBuilder.copyOnWrite();
        aupu aupuVar6 = (aupu) createBuilder.instance;
        g4.getClass();
        aupuVar6.e = g4;
        aupuVar6.b |= 32;
        createBuilder.copyOnWrite();
        aupu aupuVar7 = (aupu) createBuilder.instance;
        aupuVar7.c = 345;
        aupuVar7.b |= 1;
        this.o = (aupu) createBuilder.build();
        this.p = eokVar.j;
        aulq aulqVar2 = this.o.n;
        if (aulqVar2 == null) {
            aulqVar2 = aulq.a;
        }
        if (aulqVar2.pY(SettingRenderer.settingDialogRenderer) && this.q) {
            aulq aulqVar3 = this.o.n;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            auqa auqaVar2 = (auqa) aulqVar3.pX(SettingRenderer.settingDialogRenderer);
            if (!this.c && this.d != null && this.f.isShowing()) {
                lpg lpgVar = this.d;
                lpgVar.a(auqaVar2);
                TimeRangeView timeRangeView = lpgVar.b;
                timeRangeView.getClass();
                timeRangeView.d(auqaVar2);
            } else if (this.c && this.e != null) {
                AlertDialog alertDialog = this.g;
                amkq.u(alertDialog);
                if (alertDialog.isShowing()) {
                    lpk lpkVar = this.e;
                    auqaVar2.getClass();
                    lpkVar.a(auqaVar2);
                    TimeRangeView timeRangeView2 = lpkVar.a;
                    timeRangeView2.getClass();
                    timeRangeView2.d(auqaVar2);
                }
            }
            h(eokVar.c, eokVar.j);
            i(eokVar.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.app.AlertDialog] */
    /* JADX WARN: Type inference failed for: r10v10 */
    public final void g() {
        AlertDialog alertDialog;
        if (this.d == null || !this.f.isShowing()) {
            if (this.e != null) {
                AlertDialog alertDialog2 = this.g;
                amkq.u(alertDialog2);
                if (alertDialog2.isShowing()) {
                    return;
                }
            }
            aulq aulqVar = this.o.n;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            auqa auqaVar = (auqa) aulqVar.pX(SettingRenderer.settingDialogRenderer);
            boolean z = this.c;
            boolean z2 = this.p;
            final ?? r10 = 0;
            AlertDialog alertDialog3 = null;
            final int i = 0;
            if (!evr.aA(this.r) || !z) {
                final lpg lpgVar = new lpg(this.h);
                this.d = lpgVar;
                final epi epiVar = new epi(this);
                View inflate = LayoutInflater.from(lpgVar.a).inflate(R.layout.setting_boolean_bedtime_reminder_dialog, (ViewGroup) null, false);
                lpgVar.c = (TextView) inflate.findViewById(R.id.dialog_title);
                lpgVar.b = (TimeRangeView) inflate.findViewById(R.id.time_range);
                lpgVar.d = (CheckBox) inflate.findViewById(R.id.checkbox);
                TextView textView = lpgVar.c;
                textView.getClass();
                aqyg aqygVar = auqaVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar));
                lpgVar.a(auqaVar);
                TimeRangeView timeRangeView = lpgVar.b;
                timeRangeView.getClass();
                if (timeRangeView.c(auqaVar, 24)) {
                    AlertDialog.Builder view = new AlertDialog.Builder(lpgVar.a).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setView(inflate);
                    view.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener(epiVar, r10) { // from class: lpf
                        public final /* synthetic */ epi b;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            lpg lpgVar2 = lpg.this;
                            epi epiVar2 = this.b;
                            TimeRangeView timeRangeView2 = lpgVar2.b;
                            timeRangeView2.getClass();
                            lpgVar2.d.getClass();
                            epiVar2.a.e(false, timeRangeView2.a(), lpgVar2.b.b(), lpgVar2.d.isChecked());
                        }
                    });
                    r10 = view.create();
                }
                this.f = r10;
                alertDialog = r10;
            } else {
                final lpk lpkVar = new lpk(this.h, this.s, null);
                this.e = lpkVar;
                final epi epiVar2 = new epi(this);
                View inflate2 = LayoutInflater.from(lpkVar.b).inflate(R.layout.setting_boolean_bedtime_reminder_system_dialog, (ViewGroup) null, false);
                lpkVar.c = (TextView) inflate2.findViewById(R.id.dialog_title);
                lpkVar.d = (RadioButton) inflate2.findViewById(R.id.use_system_schedule);
                lpkVar.e = (RadioButton) inflate2.findViewById(R.id.use_custom_schedule);
                lpkVar.f = inflate2.findViewById(R.id.manage_phone_settings);
                lpkVar.f.setOnClickListener(new lpj(lpkVar));
                lpkVar.a = (TimeRangeView) inflate2.findViewById(R.id.time_range);
                lpkVar.g = (CheckBox) inflate2.findViewById(R.id.checkbox);
                whu.I(lpkVar.f, false);
                whu.I(lpkVar.a, false);
                RadioButton radioButton = lpkVar.d;
                radioButton.getClass();
                final int i2 = 1;
                radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lpi
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                        if (i2 != 0) {
                            whu.I(lpkVar.f, z3);
                        } else {
                            whu.I(lpkVar.a, z3);
                        }
                    }
                });
                lpkVar.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lpi
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                        if (i != 0) {
                            whu.I(lpkVar.f, z3);
                        } else {
                            whu.I(lpkVar.a, z3);
                        }
                    }
                });
                (z2 ? lpkVar.d : lpkVar.e).setChecked(true);
                ansv ansvVar = lpkVar.h;
                if (ansvVar.a) {
                    ansvVar.b(lpkVar.d);
                    lpkVar.h.b(lpkVar.e);
                    int dimension = (int) lpkVar.b.getResources().getDimension(R.dimen.setting_bedtime_radio_button_start_spacing);
                    lpkVar.d.setPaddingRelative(dimension, 0, 0, 0);
                    lpkVar.e.setPaddingRelative(dimension, 0, 0, 0);
                }
                TextView textView2 = lpkVar.c;
                textView2.getClass();
                aqyg aqygVar2 = auqaVar.c;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                textView2.setText(ajcq.b(aqygVar2));
                lpkVar.a(auqaVar);
                TimeRangeView timeRangeView2 = lpkVar.a;
                timeRangeView2.getClass();
                if (timeRangeView2.c(auqaVar, 24)) {
                    AlertDialog.Builder view2 = new AlertDialog.Builder(lpkVar.b).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setView(inflate2);
                    view2.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: lph
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            lpk lpkVar2 = lpk.this;
                            epi epiVar3 = epiVar2;
                            RadioButton radioButton2 = lpkVar2.d;
                            radioButton2.getClass();
                            lpkVar2.a.getClass();
                            lpkVar2.g.getClass();
                            epiVar3.a.e(radioButton2.isChecked(), lpkVar2.a.a(), lpkVar2.a.b(), lpkVar2.g.isChecked());
                        }
                    });
                    alertDialog3 = view2.create();
                }
                this.g = alertDialog3;
                alertDialog = alertDialog3;
            }
            if (alertDialog != null) {
                alertDialog.show();
            }
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aulq aulqVar = this.o.n;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(SettingRenderer.settingDialogRenderer)) {
            this.q = true;
            TextView textView = this.j;
            aqyg aqygVar = this.o.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar));
            h(this.b.j(), this.b.b().j);
            i(this.b.j());
            this.i.e(ajokVar);
        }
    }
}
