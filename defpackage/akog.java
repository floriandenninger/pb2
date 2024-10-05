package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class akog implements akoi {
    private final ci a;

    /* JADX INFO: Access modifiers changed from: protected */
    public akog(ci ciVar) {
        this.a = ciVar;
    }

    private final void a() {
        View currentFocus = this.a.getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) this.a.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @Override // defpackage.akoi
    public void b() {
        a();
        this.a.getSupportFragmentManager().K();
    }

    @Override // defpackage.akoi
    public void c(aufc aufcVar) {
        a();
        this.a.getSupportFragmentManager().K();
    }

    @Override // defpackage.akoi
    public void f(awos awosVar, syg sygVar) {
        ahbx.E(this.a.getSupportFragmentManager(), akof.a(awosVar, sygVar));
    }

    @Override // defpackage.akoi
    public void g(awos awosVar, syg sygVar, aufc aufcVar) {
        dd supportFragmentManager = this.a.getSupportFragmentManager();
        akof a = akof.a(awosVar, sygVar);
        aufc aufcVar2 = aufc.PRESENTATION_STYLE_UNKNOWN;
        if (aufcVar.ordinal() == 2) {
            dn k = supportFragmentManager.k();
            k.w(R.anim.slide_in_bottom, R.anim.elements_fade_out, R.anim.elements_fade_in, R.anim.slide_out_bottom);
            k.y(R.id.element_fragment, a);
            k.s(null);
            k.a();
            return;
        }
        ahbx.E(supportFragmentManager, a);
    }
}
