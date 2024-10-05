package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import com.google.android.libraries.youtube.mdx.manualpairing.TvCodeEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbq extends adaz {
    public adbp a;

    @Override // defpackage.ce
    public final void lN(Bundle bundle) {
        super.lN(bundle);
        adbp adbpVar = this.a;
        if (!zev.e(adbpVar.a)) {
            adbpVar.g.requestFocus();
        }
        InputMethodManager inputMethodManager = (InputMethodManager) adbpVar.a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(adbpVar.g, 1);
        }
        if (bundle != null) {
            adbpVar.g.setText(bundle.getString("extraTvCode"));
        }
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        this.a.e.G();
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putString("extraTvCode", String.valueOf(this.a.g.getText()));
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        this.a.e.F();
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final adbp adbpVar = this.a;
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.mdx_updated_use_tv_code_fragment, viewGroup, false);
        Context context = inflate.getContext();
        TypedValue typedValue = new TypedValue();
        final int i2 = 1;
        boolean z = context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
        if (((inflate.getResources().getConfiguration().uiMode & 48) == 16) ^ z) {
            ((ml) adbpVar.a).getDelegate().u(true != z ? 2 : 1);
        }
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(MdxPairingEndpointOuterClass.mdxPairingEndpoint, atcc.a);
        adbpVar.b.d(acsb.b(27854), (apxf) aongVar.build(), null);
        adbpVar.f = (TextInputLayout) inflate.findViewById(R.id.tv_code_layout);
        int integer = context.getResources().getInteger(R.integer.mdx_use_tv_code_max_length);
        adbpVar.h = context.getResources().getInteger(R.integer.mdx_use_tv_code_full_code_length);
        adbpVar.g = (TvCodeEditText) inflate.findViewById(R.id.tv_code);
        adbo adboVar = new adbo(adbpVar, adbpVar.g, integer, adbpVar.h);
        adbpVar.g.addTextChangedListener(adboVar);
        adbpVar.g.setOnKeyListener(adboVar);
        adbpVar.g.setOnTouchListener(adboVar);
        adbpVar.g.requestFocus();
        adbpVar.i = (Button) inflate.findViewById(R.id.connect);
        adbpVar.i.getBackground().setColorFilter(wbs.Q(adbpVar.a, R.attr.ytIconDisabled), PorterDuff.Mode.MULTIPLY);
        adbpVar.i.setTextColor(wbs.Q(adbpVar.a, R.attr.ytTextDisabled));
        adbpVar.i.setEnabled(false);
        adbpVar.i.setOnClickListener(new View.OnClickListener() { // from class: adbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 == 0) {
                    adbp adbpVar2 = adbpVar;
                    adbpVar2.b.I(3, new acqx(acsb.c(27856)), null);
                    adbpVar2.c();
                } else {
                    final adbp adbpVar3 = adbpVar;
                    adbpVar3.b.I(3, new acqx(acsb.c(27855)), null);
                    if (adbpVar3.c.a(false, new adct() { // from class: adbl
                        @Override // defpackage.adct
                        public final void a() {
                            adbp.this.b();
                        }
                    }, "")) {
                        return;
                    }
                    adbpVar3.b();
                }
            }
        });
        adbpVar.b.n(new acqx(acsb.c(27855)));
        inflate.findViewById(R.id.learn_more).setOnClickListener(new View.OnClickListener() { // from class: adbk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i == 0) {
                    adbp adbpVar2 = adbpVar;
                    adbpVar2.b.I(3, new acqx(acsb.c(27856)), null);
                    adbpVar2.c();
                } else {
                    final adbp adbpVar3 = adbpVar;
                    adbpVar3.b.I(3, new acqx(acsb.c(27855)), null);
                    if (adbpVar3.c.a(false, new adct() { // from class: adbl
                        @Override // defpackage.adct
                        public final void a() {
                            adbp.this.b();
                        }
                    }, "")) {
                        return;
                    }
                    adbpVar3.b();
                }
            }
        });
        adbpVar.b.n(new acqx(acsb.c(27856)));
        return inflate;
    }
}
