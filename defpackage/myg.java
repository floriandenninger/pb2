package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class myg {
    protected final Context a;
    protected final View b;
    protected final TextView c;
    protected final TextView d;
    protected final Spinner e;
    protected final aahd f;
    protected final acra g;
    protected final aqzc h;
    protected final boolean i;
    protected int j = 0;
    protected int k = 0;
    protected boolean l = false;

    public myg(Context context, aahd aahdVar, acra acraVar, ViewGroup viewGroup, aqzc aqzcVar, aaea aaeaVar) {
        this.f = aahdVar;
        this.g = acraVar;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_dropdown_input, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.label);
        this.d = (TextView) inflate.findViewById(R.id.helper_text);
        this.e = (Spinner) inflate.findViewById(R.id.spinner);
        this.h = aqzcVar;
        this.i = wbs.m(aaeaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final mzb j(boolean z, apxf apxfVar, ashb ashbVar) {
        return z ? mzb.a(false, apxfVar, ashbVar) : mzb.a(true, null, null);
    }

    public final View a() {
        return this.b;
    }

    public final asgz b(asgz asgzVar) {
        return asgzVar;
    }

    public final ashq c(ashq ashqVar) {
        return ashqVar;
    }

    public final boolean h() {
        return this.j != this.k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(boolean z, boolean z2, aqyg aqygVar) {
        if (z) {
            if (this.i) {
                this.e.setBackground(aii.a(this.a, R.drawable.ad_spinner_textfield_error_background_material));
                this.c.setTextColor(wbs.Q(this.a, R.attr.ytErrorIndicator));
            }
            if (z2) {
                if (this.i) {
                    this.d.setTextColor(wbs.Q(this.a, R.attr.ytErrorIndicator));
                }
                whu.G(this.d, ajcq.b(aqygVar));
            }
            this.b.setBackgroundColor(wbs.Q(this.a, true != this.i ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
            return;
        }
        if (this.i) {
            this.c.setTextColor(wbs.Q(this.a, R.attr.adText2));
            this.d.setTextColor(wbs.Q(this.a, R.attr.adText2));
            this.e.setBackground(aii.a(this.a, R.drawable.ad_spinner_textfield_background_material));
        }
        whu.G(this.d, "");
        this.b.setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oG(aomf aomfVar) {
        this.g.u(new acqx(aomfVar), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oH(int i) {
        this.j = i;
        if (this.l) {
            return;
        }
        aahd aahdVar = this.f;
        apxf apxfVar = this.h.h;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.c(apxfVar, null);
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oI(aqyg aqygVar) {
        whu.G(this.c, ajcq.b(aqygVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void oJ(final aomf aomfVar) {
        this.e.setOnTouchListener(new View.OnTouchListener() { // from class: myf
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                myg mygVar = myg.this;
                aomf aomfVar2 = aomfVar;
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                mygVar.g.I(3, new acqx(aomfVar2), null);
                return false;
            }
        });
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
