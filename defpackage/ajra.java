package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajra extends ng {
    public final asmt a;
    public ImageButton b;
    public TextInputLayout c;
    public EditText d;
    public Spinner e;
    public Spinner f;
    public EditText g;
    public final ajrb h;
    private final ammv i;

    public ajra(Context context, zim zimVar, asmt asmtVar, ammv ammvVar, ajrb ajrbVar) {
        super(context, zimVar.a);
        this.a = asmtVar;
        this.i = ammvVar;
        this.h = ajrbVar;
        setContentView(R.layout.legal_report_form);
    }

    public final void a() {
        ajrb ajrbVar = this.h;
        ajrbVar.d.b(ajrbVar.a, this, this.d.getText().toString(), (aqpg) this.e.getSelectedItem(), (aqpg) this.f.getSelectedItem(), false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ng, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        super.onCreate(bundle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Drawable a = aii.a(getContext(), R.drawable.quantum_ic_close_white_24);
        zau.e(a, wbs.Q(getContext(), R.attr.ytBrandIconInactive), PorterDuff.Mode.SRC_IN);
        toolbar.q(a);
        final int i = 1;
        toolbar.r(new View.OnClickListener(this) { // from class: ajqw
            public final /* synthetic */ ajra a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    ajra ajraVar = this.a;
                    whu.C(ajraVar.getCurrentFocus());
                    ajrb ajrbVar = ajraVar.h;
                    String obj = ajraVar.d.getText().toString();
                    aqpg aqpgVar = (aqpg) ajraVar.e.getSelectedItem();
                    aqpg aqpgVar2 = (aqpg) ajraVar.f.getSelectedItem();
                    String obj2 = ajraVar.g.getText().toString();
                    ajrc ajrcVar = ajrbVar.d;
                    asmt asmtVar = ajrbVar.a;
                    ammv ammvVar = ajrbVar.b;
                    Object obj3 = ajrbVar.c;
                    ajrcVar.b = true;
                    if (ajrcVar.b(asmtVar, ajraVar, obj, aqpgVar, aqpgVar2, true)) {
                        amrw h = amrz.h();
                        h.g("com.google.android.libraries.youtube.innertube.services.flags.user_comments", obj);
                        if (obj3 != null) {
                            h.g("com.google.android.libraries.youtube.innertube.endpoint.tag", obj3);
                        }
                        if (aqpgVar != null && aqpgVar2 != null) {
                            aone createBuilder = arqi.a.createBuilder();
                            int intValue = aqpgVar.c == 6 ? ((Integer) aqpgVar.d).intValue() : 0;
                            createBuilder.copyOnWrite();
                            arqi arqiVar = (arqi) createBuilder.instance;
                            arqiVar.b |= 1;
                            arqiVar.c = intValue;
                            int intValue2 = aqpgVar2.c == 6 ? ((Integer) aqpgVar2.d).intValue() : 0;
                            createBuilder.copyOnWrite();
                            arqi arqiVar2 = (arqi) createBuilder.instance;
                            arqiVar2.b |= 2;
                            arqiVar2.d = intValue2;
                            createBuilder.copyOnWrite();
                            arqi arqiVar3 = (arqi) createBuilder.instance;
                            obj2.getClass();
                            arqiVar3.b |= 4;
                            arqiVar3.e = obj2;
                            h.g("com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", (arqi) createBuilder.build());
                        }
                        if (ammvVar.h()) {
                            aone createBuilder2 = arqm.a.createBuilder();
                            int i2 = ((ajrd) ammvVar.c()).a;
                            createBuilder2.copyOnWrite();
                            arqm arqmVar = (arqm) createBuilder2.instance;
                            arqmVar.b |= 1;
                            arqmVar.c = i2;
                            int i3 = ((ajrd) ammvVar.c()).b;
                            createBuilder2.copyOnWrite();
                            arqm arqmVar2 = (arqm) createBuilder2.instance;
                            arqmVar2.b |= 2;
                            arqmVar2.d = i3;
                            h.g("com.google.android.libraries.youtube.innertube.services.flags.video_report_details", (arqm) createBuilder2.build());
                        }
                        aahd aahdVar = ajrcVar.a;
                        apmh apmhVar = asmtVar.n;
                        if (apmhVar == null) {
                            apmhVar = apmh.a;
                        }
                        apmg apmgVar = apmhVar.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                        apxf apxfVar = apmgVar.n;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, h.c());
                        ajraVar.dismiss();
                        return;
                    }
                    return;
                }
                this.a.dismiss();
            }
        });
        asmt asmtVar = this.a;
        aqyg aqygVar5 = null;
        if ((asmtVar.b & 1) != 0) {
            aqygVar = asmtVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        toolbar.x(ajcq.b(aqygVar));
        toolbar.o(R.string.cancel);
        ImageButton imageButton = (ImageButton) findViewById(R.id.send_report);
        this.b = imageButton;
        final int i2 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: ajqw
            public final /* synthetic */ ajra a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    ajra ajraVar = this.a;
                    whu.C(ajraVar.getCurrentFocus());
                    ajrb ajrbVar = ajraVar.h;
                    String obj = ajraVar.d.getText().toString();
                    aqpg aqpgVar = (aqpg) ajraVar.e.getSelectedItem();
                    aqpg aqpgVar2 = (aqpg) ajraVar.f.getSelectedItem();
                    String obj2 = ajraVar.g.getText().toString();
                    ajrc ajrcVar = ajrbVar.d;
                    asmt asmtVar2 = ajrbVar.a;
                    ammv ammvVar = ajrbVar.b;
                    Object obj3 = ajrbVar.c;
                    ajrcVar.b = true;
                    if (ajrcVar.b(asmtVar2, ajraVar, obj, aqpgVar, aqpgVar2, true)) {
                        amrw h = amrz.h();
                        h.g("com.google.android.libraries.youtube.innertube.services.flags.user_comments", obj);
                        if (obj3 != null) {
                            h.g("com.google.android.libraries.youtube.innertube.endpoint.tag", obj3);
                        }
                        if (aqpgVar != null && aqpgVar2 != null) {
                            aone createBuilder = arqi.a.createBuilder();
                            int intValue = aqpgVar.c == 6 ? ((Integer) aqpgVar.d).intValue() : 0;
                            createBuilder.copyOnWrite();
                            arqi arqiVar = (arqi) createBuilder.instance;
                            arqiVar.b |= 1;
                            arqiVar.c = intValue;
                            int intValue2 = aqpgVar2.c == 6 ? ((Integer) aqpgVar2.d).intValue() : 0;
                            createBuilder.copyOnWrite();
                            arqi arqiVar2 = (arqi) createBuilder.instance;
                            arqiVar2.b |= 2;
                            arqiVar2.d = intValue2;
                            createBuilder.copyOnWrite();
                            arqi arqiVar3 = (arqi) createBuilder.instance;
                            obj2.getClass();
                            arqiVar3.b |= 4;
                            arqiVar3.e = obj2;
                            h.g("com.google.android.libraries.youtube.innertube.services.flags.legal_report_details", (arqi) createBuilder.build());
                        }
                        if (ammvVar.h()) {
                            aone createBuilder2 = arqm.a.createBuilder();
                            int i22 = ((ajrd) ammvVar.c()).a;
                            createBuilder2.copyOnWrite();
                            arqm arqmVar = (arqm) createBuilder2.instance;
                            arqmVar.b |= 1;
                            arqmVar.c = i22;
                            int i3 = ((ajrd) ammvVar.c()).b;
                            createBuilder2.copyOnWrite();
                            arqm arqmVar2 = (arqm) createBuilder2.instance;
                            arqmVar2.b |= 2;
                            arqmVar2.d = i3;
                            h.g("com.google.android.libraries.youtube.innertube.services.flags.video_report_details", (arqm) createBuilder2.build());
                        }
                        aahd aahdVar = ajrcVar.a;
                        apmh apmhVar = asmtVar2.n;
                        if (apmhVar == null) {
                            apmhVar = apmh.a;
                        }
                        apmg apmgVar = apmhVar.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                        apxf apxfVar = apmgVar.n;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, h.c());
                        ajraVar.dismiss();
                        return;
                    }
                    return;
                }
                this.a.dismiss();
            }
        });
        ImageButton imageButton2 = this.b;
        apmh apmhVar = this.a.n;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        apmg apmgVar = apmhVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 256) != 0) {
            apmh apmhVar2 = this.a.n;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmg apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            aqygVar2 = apmgVar2.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        imageButton2.setContentDescription(ajcq.b(aqygVar2));
        if (this.i.h()) {
            TextView textView = (TextView) findViewById(R.id.timestamp_label);
            asmt asmtVar2 = this.a;
            if ((asmtVar2.b & 2) != 0) {
                aqygVar4 = asmtVar2.d;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            whu.G(textView, ajcq.b(aqygVar4));
            ((TextView) findViewById(R.id.timestamp)).setText(((ajrd) this.i.c()).toString());
            findViewById(R.id.timestamp_container).setVisibility(0);
        }
        YouTubeTextView youTubeTextView = (YouTubeTextView) findViewById(R.id.description_hint);
        asmt asmtVar3 = this.a;
        if ((asmtVar3.b & 32) != 0) {
            aqygVar3 = asmtVar3.g;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        youTubeTextView.setText(ajcq.b(aqygVar3));
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.description_container);
        this.c = textInputLayout;
        textInputLayout.C(false);
        EditText editText = (EditText) findViewById(R.id.description);
        this.d = editText;
        asmt asmtVar4 = this.a;
        if ((asmtVar4.b & 32) != 0 && (aqygVar5 = asmtVar4.g) == null) {
            aqygVar5 = aqyg.a;
        }
        editText.setContentDescription(ajcq.b(aqygVar5));
        this.d.addTextChangedListener(new ajqz(this));
        if (this.a.f > 0) {
            this.c.k(true);
            this.c.l(this.a.f);
            this.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.a.f)});
        }
        ajqx ajqxVar = new ajqx(this);
        this.e = (Spinner) findViewById(R.id.issue_type);
        if ((this.a.b & 256) != 0) {
            Spinner spinner = this.e;
            Context context = getContext();
            aulq aulqVar = this.a.j;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            spinner.setAdapter((SpinnerAdapter) new ajqv(context, (aqph) ahbj.n(aulqVar, DropdownRendererOuterClass.dropdownRenderer)));
            this.e.setOnTouchListener(ajqxVar);
            Spinner spinner2 = this.e;
            aulq aulqVar2 = this.a.j;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            spinner2.setOnItemSelectedListener(new ajqy(this, spinner2, ((aqph) ahbj.n(aulqVar2, DropdownRendererOuterClass.dropdownRenderer)).d));
            this.e.setVisibility(0);
        }
        this.f = (Spinner) findViewById(R.id.affiliation);
        if ((this.a.b & 512) != 0) {
            Spinner spinner3 = this.f;
            Context context2 = getContext();
            aulq aulqVar3 = this.a.k;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            spinner3.setAdapter((SpinnerAdapter) new ajqv(context2, (aqph) ahbj.n(aulqVar3, DropdownRendererOuterClass.dropdownRenderer)));
            this.f.setOnTouchListener(ajqxVar);
            Spinner spinner4 = this.f;
            aulq aulqVar4 = this.a.k;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            spinner4.setOnItemSelectedListener(new ajqy(this, spinner4, ((aqph) ahbj.n(aulqVar4, DropdownRendererOuterClass.dropdownRenderer)).d));
            this.f.setVisibility(0);
        }
        this.g = (EditText) findViewById(R.id.name);
        asmt asmtVar5 = this.a;
        if ((asmtVar5.b & 2048) != 0) {
            EditText editText2 = this.g;
            aqyg aqygVar6 = asmtVar5.l;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            editText2.setContentDescription(ajcq.b(aqygVar6));
            TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(R.id.name_container);
            textInputLayout2.C(true);
            textInputLayout2.o = true;
            aqyg aqygVar7 = this.a.l;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
            textInputLayout2.B(ajcq.b(aqygVar7));
            textInputLayout2.setVisibility(0);
        }
        TextView textView2 = (TextView) findViewById(R.id.name_subtext);
        aqyg aqygVar8 = this.a.m;
        if (aqygVar8 == null) {
            aqygVar8 = aqyg.a;
        }
        whu.G(textView2, ajcq.b(aqygVar8));
        TextView textView3 = (TextView) findViewById(R.id.required);
        aqyg aqygVar9 = this.a.i;
        if (aqygVar9 == null) {
            aqygVar9 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar9));
        TextView textView4 = (TextView) findViewById(R.id.footer);
        aqyg aqygVar10 = this.a.h;
        if (aqygVar10 == null) {
            aqygVar10 = aqyg.a;
        }
        whu.G(textView4, ajcq.b(aqygVar10));
    }
}
