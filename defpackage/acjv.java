package defpackage;

import android.app.Activity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjv implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private final SwitchCompat A;
    private final View B;
    private final TextView C;
    private final SwitchCompat D;
    private final View E;
    private final TextView F;
    private final SwitchCompat G;
    public final acra a;
    public final Spinner b;
    public final Spinner c;
    public acjy d;
    public acjy e;
    public acjy f;
    public acjy g;
    public acjy h;
    public acjy i;
    private final Activity j;
    private final ajut k;
    private final aahd l;
    private final acju m;
    private final ImageButton n;
    private final TextView o;
    private final View p;
    private final TextView q;
    private final SwitchCompat r;
    private final View s;
    private final TextView t;
    private final SwitchCompat u;
    private final View v;
    private final TextView w;
    private final SwitchCompat x;
    private final View y;
    private final TextView z;

    public acjv(Activity activity, View view, ater aterVar, ajut ajutVar, aahd aahdVar, acra acraVar, acju acjuVar) {
        Spinner spinner;
        SwitchCompat switchCompat;
        TextView textView;
        Spinner spinner2;
        TextView textView2;
        SwitchCompat switchCompat2;
        int i;
        View view2;
        TextView textView3;
        View view3;
        SwitchCompat switchCompat3;
        View view4;
        SwitchCompat switchCompat4;
        TextView textView4;
        View view5;
        int i2;
        View view6;
        int i3;
        aqyg aqygVar;
        activity.getClass();
        this.j = activity;
        view.getClass();
        ajutVar.getClass();
        this.k = ajutVar;
        aahdVar.getClass();
        this.l = aahdVar;
        acraVar.getClass();
        this.a = acraVar;
        this.m = acjuVar;
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.back_to_basic_settings_button);
        this.n = imageButton;
        TextView textView5 = (TextView) view.findViewById(R.id.back_to_basic_settings_text);
        this.o = textView5;
        View findViewById = view.findViewById(R.id.enable_chat_setting);
        this.p = findViewById;
        TextView textView6 = (TextView) view.findViewById(R.id.enable_chat_setting_text);
        this.q = textView6;
        SwitchCompat switchCompat5 = (SwitchCompat) view.findViewById(R.id.enable_chat_setting_toggle);
        this.r = switchCompat5;
        View findViewById2 = view.findViewById(R.id.paid_placement_setting);
        this.y = findViewById2;
        TextView textView7 = (TextView) view.findViewById(R.id.paid_placement_setting_text);
        this.z = textView7;
        SwitchCompat switchCompat6 = (SwitchCompat) view.findViewById(R.id.paid_placement_setting_toggle);
        this.A = switchCompat6;
        View findViewById3 = view.findViewById(R.id.show_paid_placement_overlay);
        this.B = findViewById3;
        TextView textView8 = (TextView) view.findViewById(R.id.show_paid_placement_overlay_text);
        this.C = textView8;
        SwitchCompat switchCompat7 = (SwitchCompat) view.findViewById(R.id.show_paid_placement_overlay_toggle);
        this.D = switchCompat7;
        View findViewById4 = view.findViewById(R.id.enable_sponsor_only_setting);
        this.E = findViewById4;
        TextView textView9 = (TextView) view.findViewById(R.id.enable_sponsor_only_setting_text);
        this.F = textView9;
        SwitchCompat switchCompat8 = (SwitchCompat) view.findViewById(R.id.enable_sponsor_only_setting_toggle);
        this.G = switchCompat8;
        View findViewById5 = view.findViewById(R.id.enable_default_usage_policy);
        this.v = findViewById5;
        TextView textView10 = (TextView) view.findViewById(R.id.enable_default_usage_policy_text);
        this.w = textView10;
        SwitchCompat switchCompat9 = (SwitchCompat) view.findViewById(R.id.enable_default_usage_policy_toggle);
        this.x = switchCompat9;
        Spinner spinner3 = (Spinner) view.findViewById(R.id.usage_policy_spinner);
        this.b = spinner3;
        View findViewById6 = view.findViewById(R.id.enable_content_id);
        this.s = findViewById6;
        TextView textView11 = (TextView) view.findViewById(R.id.enable_content_id_text);
        this.t = textView11;
        SwitchCompat switchCompat10 = (SwitchCompat) view.findViewById(R.id.enable_content_id_toggle);
        this.u = switchCompat10;
        Spinner spinner4 = (Spinner) view.findViewById(R.id.match_policy_spinner);
        this.c = spinner4;
        view.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        int i4 = aterVar.b & 128;
        if (i4 != 0) {
            if (i4 != 0) {
                aqygVar = aterVar.g;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView5.setText(ajcq.b(aqygVar));
        }
        if ((aterVar.b & 2) != 0) {
            ateo ateoVar = aterVar.c;
            asge asgeVar = (ateoVar == null ? ateo.a : ateoVar).c;
            i = 0;
            spinner = spinner4;
            spinner2 = spinner3;
            textView2 = textView11;
            switchCompat2 = switchCompat10;
            textView3 = textView8;
            view3 = findViewById4;
            switchCompat3 = switchCompat7;
            view4 = findViewById5;
            switchCompat4 = switchCompat8;
            textView4 = textView9;
            view2 = findViewById3;
            switchCompat = switchCompat6;
            textView = textView7;
            this.d = new acjy(activity, ajutVar, aahdVar, findViewById, textView6, switchCompat5, asgeVar == null ? asge.a : asgeVar);
            findViewById.setVisibility(0);
        } else {
            spinner = spinner4;
            switchCompat = switchCompat6;
            textView = textView7;
            spinner2 = spinner3;
            textView2 = textView11;
            switchCompat2 = switchCompat10;
            i = 0;
            view2 = findViewById3;
            textView3 = textView8;
            view3 = findViewById4;
            switchCompat3 = switchCompat7;
            view4 = findViewById5;
            switchCompat4 = switchCompat8;
            textView4 = textView9;
        }
        if ((aterVar.b & 256) != 0) {
            ateo ateoVar2 = aterVar.h;
            asge asgeVar2 = (ateoVar2 == null ? ateo.a : ateoVar2).c;
            this.i = new acjy(activity, ajutVar, aahdVar, view3, textView4, switchCompat4, asgeVar2 == null ? asge.a : asgeVar2);
            if (true != this.d.c()) {
                i3 = 4;
                view6 = view3;
            } else {
                view6 = view3;
                i3 = 0;
            }
            view6.setVisibility(i3);
            this.d.a(this);
        }
        ateo ateoVar3 = aterVar.d;
        if (((ateoVar3 == null ? ateo.a : ateoVar3).b & 1) != 0) {
            ateo ateoVar4 = aterVar.d;
            asge asgeVar3 = (ateoVar4 == null ? ateo.a : ateoVar4).c;
            this.e = new acjy(activity, ajutVar, aahdVar, findViewById2, textView, switchCompat, asgeVar3 == null ? asge.a : asgeVar3);
            findViewById2.setVisibility(i);
            ateo ateoVar5 = aterVar.f;
            if (((ateoVar5 == null ? ateo.a : ateoVar5).b & 1) != 0) {
                ateo ateoVar6 = aterVar.f;
                asge asgeVar4 = (ateoVar6 == null ? ateo.a : ateoVar6).c;
                this.f = new acjy(activity, ajutVar, aahdVar, view2, textView3, switchCompat3, asgeVar4 == null ? asge.a : asgeVar4);
                if (true != this.e.c()) {
                    view5 = view2;
                    i2 = 8;
                } else {
                    view5 = view2;
                    i2 = 0;
                }
                view5.setVisibility(i2);
                this.e.a(this);
            }
        }
        atet atetVar = aterVar.e;
        if (((atetVar == null ? atet.a : atetVar).b & 1) != 0) {
            atet atetVar2 = aterVar.e;
            ates atesVar = (atetVar2 == null ? atet.a : atetVar2).c;
            ates atesVar2 = atesVar == null ? ates.a : atesVar;
            ateo ateoVar7 = atesVar2.b;
            ateoVar7 = ateoVar7 == null ? ateo.a : ateoVar7;
            if ((ateoVar7.b & 1) != 0) {
                asge asgeVar5 = ateoVar7.c;
                this.g = new acjy(activity, ajutVar, aahdVar, view4, textView10, switchCompat9, asgeVar5 == null ? asge.a : asgeVar5);
                view4.setVisibility(i);
            }
            atep atepVar = atesVar2.c;
            atepVar = atepVar == null ? atep.a : atepVar;
            if ((atepVar.b & 1) != 0) {
                asgi asgiVar = atepVar.c;
                Spinner spinner5 = spinner2;
                c(spinner5, asgiVar == null ? asgi.a : asgiVar);
                spinner5.setVisibility(i);
            }
            ateo ateoVar8 = atesVar2.d;
            ateoVar8 = ateoVar8 == null ? ateo.a : ateoVar8;
            if ((ateoVar8.b & 1) != 0) {
                asge asgeVar6 = ateoVar8.c;
                this.h = new acjy(activity, ajutVar, aahdVar, findViewById6, textView2, switchCompat2, asgeVar6 == null ? asge.a : asgeVar6);
                findViewById6.setVisibility(i);
                atep atepVar2 = atesVar2.e;
                atepVar2 = atepVar2 == null ? atep.a : atepVar2;
                if ((atepVar2.b & 1) != 0) {
                    asgi asgiVar2 = atepVar2.c;
                    Spinner spinner6 = spinner;
                    c(spinner6, asgiVar2 == null ? asgi.a : asgiVar2);
                    spinner6.setVisibility(true != this.h.c() ? 8 : 0);
                    this.h.a(this);
                }
            }
        }
    }

    private final void c(Spinner spinner, asgi asgiVar) {
        if (spinner == null || asgiVar == null) {
            return;
        }
        acka ackaVar = new acka(this.j, this.k, asgiVar);
        spinner.setAdapter((SpinnerAdapter) ackaVar);
        aott aottVar = asgiVar.d;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) != 0) {
            aott aottVar2 = asgiVar.d;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar = aottVar2.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            spinner.setContentDescription(aotsVar.c);
        }
        for (int i = 0; i < ackaVar.getCount(); i++) {
            if (ackaVar.getItem(i).h) {
                spinner.setSelection(i, false);
                return;
            }
        }
    }

    public final void a() {
        View view = this.p;
        if (view != null) {
            view.setEnabled(false);
            this.p.setAlpha(0.45f);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setEnabled(false);
            this.E.setAlpha(0.45f);
        }
    }

    public final void b() {
        View view = this.p;
        if (view != null) {
            view.setEnabled(true);
            this.p.setAlpha(1.0f);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setEnabled(true);
            this.E.setAlpha(1.0f);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton == this.A) {
            this.B.setVisibility(true == z ? 0 : 8);
        } else if (compoundButton == this.u) {
            this.c.setVisibility(true == z ? 0 : 8);
        } else if (compoundButton == this.r) {
            this.E.setVisibility(true == z ? 0 : 8);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.n) {
            this.m.s();
        }
    }
}
