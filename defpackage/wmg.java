package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wmg extends wli implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener, TextWatcher, wks {
    public static final /* synthetic */ int al = 0;
    public Button a;
    public String ae;
    public arzs af = arzs.CODE_DELIVERY_METHOD_UNKNOWN;
    public String ag;
    public wmf ah;
    public aahd ai;
    public zim aj;
    public ansv ak;
    private TextView am;
    private TextView an;
    private ImageButton ao;
    private Spinner ap;
    private TextView aq;
    private View ar;
    private LinearLayout as;
    private ArrayList at;
    private List au;
    private Map av;
    private Map aw;
    public ContentLoadingProgressBar b;
    public EditText c;
    public atut d;
    public String e;

    private final View aF(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        String str;
        String str2;
        String str3;
        arzs arzsVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        aqyg aqygVar5;
        aqyg aqygVar6;
        ViewGroup viewGroup2;
        Spanned spanned;
        LayoutInflater layoutInflater2 = layoutInflater;
        if (bundle != null) {
            str2 = bundle.getString("SAVED_COUNTRY_CODE");
            str3 = bundle.getString("SAVED_PHONE_NUMBER");
            arzsVar = arzs.b(bundle.getInt("SAVED_CODE_DELIVERY_METHOD"));
            if (arzsVar == null) {
                arzsVar = arzs.CODE_DELIVERY_METHOD_UNKNOWN;
            }
            str = bundle.getString("SAVED_ERROR_MESSAGE");
        } else {
            str = null;
            str2 = null;
            str3 = null;
            arzsVar = null;
        }
        boolean z = false;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflater2.inflate(R.layout.verification_phone_entry_fragment, viewGroup, false);
        this.b = (ContentLoadingProgressBar) viewGroup3.findViewById(R.id.progress_bar);
        this.am = (TextView) viewGroup3.findViewById(R.id.title);
        this.ao = (ImageButton) viewGroup3.findViewById(R.id.back_arrow_button);
        this.ap = (Spinner) viewGroup3.findViewById(R.id.countries);
        this.a = (Button) viewGroup3.findViewById(R.id.send_code_button);
        this.c = (EditText) viewGroup3.findViewById(R.id.phone_number_field);
        this.aq = (TextView) viewGroup3.findViewById(R.id.phone_number_label);
        this.ar = viewGroup3.findViewById(R.id.phone_number_underline);
        this.an = (TextView) viewGroup3.findViewById(R.id.error_message);
        this.as = (LinearLayout) viewGroup3.findViewById(R.id.code_delivery_radio_group);
        atut atutVar = this.d;
        if ((atutVar.b & 1) != 0) {
            aqygVar = atutVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        atus atusVar = this.d.g;
        if (atusVar == null) {
            atusVar = atus.a;
        }
        apmg apmgVar = atusVar.b;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 256) != 0) {
            atus atusVar2 = this.d.g;
            if (atusVar2 == null) {
                atusVar2 = atus.a;
            }
            apmg apmgVar2 = atusVar2.b;
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
        Spanned b2 = ajcq.b(aqygVar2);
        atut atutVar2 = this.d;
        if ((atutVar2.b & 32) != 0) {
            aqygVar3 = atutVar2.h;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        Spanned b3 = ajcq.b(aqygVar3);
        atuv atuvVar = this.d.e;
        if (atuvVar == null) {
            atuvVar = atuv.a;
        }
        asgj asgjVar = atuvVar.b;
        if (asgjVar == null) {
            asgjVar = asgj.a;
        }
        aqyg aqygVar7 = asgjVar.c;
        if (aqygVar7 == null) {
            aqygVar7 = aqyg.a;
        }
        Spanned b4 = ajcq.b(aqygVar7);
        this.at = new ArrayList();
        atuu atuuVar = this.d.f;
        if (atuuVar == null) {
            atuuVar = atuu.a;
        }
        asgi asgiVar = atuuVar.b;
        if (asgiVar == null) {
            asgiVar = asgi.a;
        }
        int size = asgiVar.c.size();
        this.as.setWeightSum(size);
        int i = 0;
        while (i < size) {
            atuu atuuVar2 = this.d.f;
            if (atuuVar2 == null) {
                atuuVar2 = atuu.a;
            }
            asgi asgiVar2 = atuuVar2.b;
            if (asgiVar2 == null) {
                asgiVar2 = asgi.a;
            }
            asgh asghVar = (asgh) asgiVar2.c.get(i);
            int i2 = size;
            ViewGroup viewGroup4 = (ViewGroup) layoutInflater2.inflate(R.layout.verification_phone_entry_radio_button, this.as, z);
            RadioButton radioButton = (RadioButton) viewGroup4.findViewById(R.id.radio_button);
            if ((asghVar.b & 1) != 0) {
                aqygVar6 = asghVar.e;
                if (aqygVar6 == null) {
                    aqygVar6 = aqyg.a;
                }
            } else {
                aqygVar6 = null;
            }
            radioButton.setText(ajcq.b(aqygVar6));
            ansv ansvVar = this.ak;
            if (ansvVar.a) {
                ansvVar.b(radioButton);
                viewGroup2 = viewGroup3;
                spanned = b3;
                radioButton.setPaddingRelative((int) qR().getResources().getDimension(R.dimen.av_radio_button_text_spacing), radioButton.getPaddingTop(), radioButton.getPaddingEnd(), radioButton.getPaddingBottom());
            } else {
                viewGroup2 = viewGroup3;
                spanned = b3;
            }
            this.at.add(i, new hx(radioButton, asghVar));
            this.as.addView(viewGroup4, i);
            i++;
            size = i2;
            layoutInflater2 = layoutInflater;
            viewGroup3 = viewGroup2;
            b3 = spanned;
            z = false;
        }
        ViewGroup viewGroup5 = viewGroup3;
        Spanned spanned2 = b3;
        if (arzsVar != null) {
            for (int i3 = 0; i3 < this.at.size(); i3++) {
                asgh asghVar2 = (asgh) ((hx) this.at.get(i3)).b;
                boolean z2 = (asghVar2.c == 3 ? ((Integer) asghVar2.d).intValue() : 0) == arzsVar.d;
                ((RadioButton) ((hx) this.at.get(i3)).a).setChecked(z2);
                if (z2) {
                    this.af = arzsVar;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.at.size(); i4++) {
                boolean z3 = ((asgh) ((hx) this.at.get(i4)).b).h;
                ((RadioButton) ((hx) this.at.get(i4)).a).setChecked(z3);
                if (z3) {
                    asgh asghVar3 = (asgh) ((hx) this.at.get(i4)).b;
                    this.af = arzs.b(asghVar3.c == 3 ? ((Integer) asghVar3.d).intValue() : 0);
                }
            }
        }
        if (str3 != null) {
            this.e = str3;
            this.c.setText(str3);
        }
        this.am.setText(b);
        this.a.setText(b2.toString().toUpperCase(Locale.getDefault()));
        this.aq.setText(b4);
        this.ao.setOnClickListener(new wme(this, 1, null));
        this.a.setOnClickListener(new wme(this, 0));
        this.au = new ArrayList();
        this.av = new HashMap();
        this.aw = new HashMap();
        ArrayAdapter arrayAdapter = new ArrayAdapter(C(), R.layout.country_spinner_item);
        atuu atuuVar3 = this.d.d;
        if (atuuVar3 == null) {
            atuuVar3 = atuu.a;
        }
        asgi asgiVar3 = atuuVar3.b;
        if (asgiVar3 == null) {
            asgiVar3 = asgi.a;
        }
        Spanned spanned3 = null;
        for (asgh asghVar4 : asgiVar3.c) {
            if ((asghVar4.b & 1) != 0) {
                aqygVar4 = asghVar4.e;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            Spanned b5 = ajcq.b(aqygVar4);
            if ((asghVar4.b & 2) != 0) {
                aqygVar5 = asghVar4.f;
                if (aqygVar5 == null) {
                    aqygVar5 = aqyg.a;
                }
            } else {
                aqygVar5 = null;
            }
            Spanned b6 = ajcq.b(aqygVar5);
            String str4 = asghVar4.c == 2 ? (String) asghVar4.d : "";
            if (TextUtils.equals(str2, str4)) {
                this.ae = str4;
            } else {
                if (TextUtils.isEmpty(str2) && asghVar4.h) {
                    this.ae = str4;
                }
                this.au.add(b5);
                this.av.put(b5, b6);
                this.aw.put(b5, str4);
            }
            spanned3 = b5;
            this.au.add(b5);
            this.av.put(b5, b6);
            this.aw.put(b5, str4);
        }
        List list = this.au;
        Collections.sort(list, unt.d);
        arrayAdapter.addAll(list);
        arrayAdapter.setDropDownViewResource(R.layout.country_spinner_dropdown_item);
        this.ap.setAdapter((SpinnerAdapter) arrayAdapter);
        this.ap.setSelection(this.au.indexOf(spanned3));
        this.c.setHint((CharSequence) this.av.get(spanned3));
        aG();
        if (str != null) {
            s(str);
        } else if (!TextUtils.isEmpty(spanned2)) {
            s(spanned2.toString());
        }
        this.c.post(new Runnable() { // from class: wmd
            @Override // java.lang.Runnable
            public final void run() {
                wmg wmgVar = wmg.this;
                wmgVar.c.requestFocus();
                wmgVar.r();
            }
        });
        return viewGroup5;
    }

    private final void aG() {
        Button button = this.a;
        boolean z = false;
        if (!TextUtils.isEmpty(this.ae) && !TextUtils.isEmpty(this.e) && this.af.d > 0) {
            z = true;
        }
        button.setEnabled(z);
        p();
    }

    private final void aH() {
        EditText editText = this.c;
        if (editText != null) {
            editText.removeTextChangedListener(this);
        }
        Spinner spinner = this.ap;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(null);
        }
        if (this.at != null) {
            for (int i = 0; i < this.at.size(); i++) {
                ((RadioButton) ((hx) this.at.get(i)).a).setOnCheckedChangeListener(null);
            }
        }
    }

    private final void aI() {
        EditText editText = this.c;
        if (editText != null) {
            editText.addTextChangedListener(this);
        }
        Spinner spinner = this.ap;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        if (this.at != null) {
            for (int i = 0; i < this.at.size(); i++) {
                ((RadioButton) ((hx) this.at.get(i)).a).setOnCheckedChangeListener(this);
            }
        }
    }

    @Override // defpackage.ce
    public final void W(boolean z) {
        if (z) {
            return;
        }
        this.c.requestFocus();
        r();
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        aH();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        aI();
    }

    @Override // defpackage.wks
    public final void a() {
        this.a.setEnabled(true);
        this.b.a();
        q();
        wmf wmfVar = this.ah;
        if (wmfVar != null) {
            wmfVar.aN();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // defpackage.wks
    public final void b(atut atutVar) {
        this.a.setEnabled(true);
        this.b.a();
        q();
        wmf wmfVar = this.ah;
        if (wmfVar != null) {
            wmfVar.aO(atutVar);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // defpackage.wks
    public final void c(atuo atuoVar, long j, String str) {
        this.a.setEnabled(true);
        this.b.a();
        q();
        wmf wmfVar = this.ah;
        if (wmfVar != null) {
            wmfVar.aP(atuoVar, j, str);
        }
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putInt("SAVED_CODE_DELIVERY_METHOD", this.af.d);
        bundle.putString("SAVED_COUNTRY_CODE", this.ae);
        bundle.putString("SAVED_PHONE_NUMBER", this.e);
        bundle.putString("SAVED_ERROR_MESSAGE", this.an.getText().toString());
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        byte[] byteArray = this.m.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.d = (atut) aonm.parseFrom(atut.a, byteArray, aomw.b());
            } catch (aoob e) {
                String valueOf = String.valueOf(atut.class.getName());
                throw new RuntimeException(valueOf.length() != 0 ? "Failed to parse a known parcelable proto ".concat(valueOf) : new String("Failed to parse a known parcelable proto "), e);
            }
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(layoutInflater.getContext(), this.aj.a);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        atut atutVar = this.d;
        if (atutVar != null && (atutVar.b & 1) != 0) {
            atus atusVar = atutVar.g;
            if (atusVar == null) {
                atusVar = atus.a;
            }
            apmg apmgVar = atusVar.b;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 256) != 0) {
                atus atusVar2 = atutVar.g;
                if (atusVar2 == null) {
                    atusVar2 = atus.a;
                }
                apmg apmgVar2 = atusVar2.b;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                if ((apmgVar2.b & 8192) != 0) {
                    atuv atuvVar = atutVar.e;
                    if (atuvVar == null) {
                        atuvVar = atuv.a;
                    }
                    asgj asgjVar = atuvVar.b;
                    if (asgjVar == null) {
                        asgjVar = asgj.a;
                    }
                    if ((asgjVar.b & 2) != 0) {
                        atuu atuuVar = atutVar.f;
                        if (atuuVar == null) {
                            atuuVar = atuu.a;
                        }
                        asgi asgiVar = atuuVar.b;
                        if (asgiVar == null) {
                            asgiVar = asgi.a;
                        }
                        if (asgiVar.c.size() > 0) {
                            atuu atuuVar2 = atutVar.d;
                            if (atuuVar2 == null) {
                                atuuVar2 = atuu.a;
                            }
                            asgi asgiVar2 = atuuVar2.b;
                            if (asgiVar2 == null) {
                                asgiVar2 = asgi.a;
                            }
                            if (asgiVar2.c.size() > 0) {
                                frameLayout.addView(aF(frameLayout, bundle, cloneInContext));
                                return frameLayout;
                            }
                        }
                    }
                }
            }
        }
        zga.l("PhoneVerificationContactNumberInputScreenRenderer invalid.");
        wmf wmfVar = this.ah;
        if (wmfVar != null) {
            wmfVar.aN();
        }
        return frameLayout;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            for (int i = 0; i < this.at.size(); i++) {
                if (((hx) this.at.get(i)).a == compoundButton) {
                    asgh asghVar = (asgh) ((hx) this.at.get(i)).b;
                    this.af = arzs.b(asghVar.c == 3 ? ((Integer) asghVar.d).intValue() : 0);
                } else {
                    ((RadioButton) ((hx) this.at.get(i)).a).setChecked(false);
                }
            }
            aG();
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context qR = qR();
        View view = this.O;
        if (qR == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        aH();
        Bundle bundle = new Bundle();
        LayoutInflater from = LayoutInflater.from(new ContextThemeWrapper(qR, this.aj.a));
        mQ(bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        View aF = aF(viewGroup, bundle, from);
        viewGroup.removeAllViews();
        viewGroup.addView(aF);
        aI();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str = (String) this.aw.get(this.au.get(i));
        if (TextUtils.equals(str, this.ae)) {
            return;
        }
        this.c.setHint((CharSequence) this.av.get(this.au.get(i)));
        this.ae = str;
        aG();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        p();
        this.e = this.c.getText().toString();
        aG();
    }

    public final void p() {
        ci C = C();
        if (C != null) {
            this.as.setVisibility(0);
            this.an.setVisibility(8);
            this.an.setText("");
            this.ar.setBackgroundColor(wbs.Q(C, R.attr.ytCallToAction));
        }
    }

    public final void q() {
        ci C = C();
        if (C != null) {
            ((InputMethodManager) C.getSystemService("input_method")).hideSoftInputFromWindow(this.c.getWindowToken(), 0);
        }
    }

    public final void r() {
        Context qR = qR();
        if (qR != null) {
            ((InputMethodManager) qR.getSystemService("input_method")).showSoftInput(this.c, 0);
        }
    }

    public final void s(String str) {
        ci C = C();
        if (C == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.as.setVisibility(8);
        this.an.setVisibility(0);
        this.an.setText(str);
        this.ar.setBackgroundColor(aih.d(C, R.color.av_error_text));
    }
}
