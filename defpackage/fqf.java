package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fqf extends dha {

    @dnt(a = 13)
    String a;

    @dnt(a = 13)
    axpg b;

    @dnt(a = 13)
    Integer c;

    @dnt(a = 13)
    Boolean d;

    @dnt(a = 13)
    syd e;

    @dnt(a = 13)
    Integer f;

    @dnt(a = 13)
    awnw g;

    public fqf() {
        super("Slider");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new fqh(context);
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        int size;
        if (View.MeasureSpec.getMode(i) != 0) {
            size = View.MeasureSpec.getSize(i);
            dloVar.a = size;
        } else {
            size = (int) ((dheVar.b().getDisplayMetrics().density * 40.0f) + 0.5f);
            dloVar.a = size;
        }
        double d = size;
        Double.isNaN(d);
        dloVar.b = (int) (d * 0.1d);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        fqh fqhVar = (fqh) obj;
        Integer num = this.f;
        Integer num2 = this.c;
        Boolean bool = this.d;
        awnw awnwVar = this.g;
        String str = this.a;
        axpg axpgVar = this.b;
        syd sydVar = this.e;
        fqhVar.a.setMax(num.intValue());
        fqhVar.a.setProgress(num2.intValue());
        fqhVar.b = axpgVar;
        fqhVar.c = awnwVar;
        fqhVar.a.setEnabled(bool.booleanValue());
        fqhVar.d = sydVar;
        if (str != null && !str.isEmpty()) {
            fqhVar.a.setContentDescription(str);
        }
        fqhVar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        fqf fqfVar = (fqf) dhaVar;
        fqf fqfVar2 = (fqf) dhaVar2;
        dim dimVar = new dim(fqfVar.f, fqfVar2 == null ? null : fqfVar2.f);
        dim dimVar2 = new dim(fqfVar.c, fqfVar2 == null ? null : fqfVar2.c);
        dim dimVar3 = new dim(fqfVar.d, fqfVar2 != null ? fqfVar2.d : null);
        return (((Integer) dimVar.a).equals(dimVar.b) ^ true) || (((Integer) dimVar2.a).equals(dimVar2.b) ^ true) || (((Boolean) dimVar3.a).equals(dimVar3.b) ^ true);
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        fqf fqfVar = (fqf) dhaVar;
        if (this.k == fqfVar.k) {
            return true;
        }
        String str = this.a;
        if (str == null ? fqfVar.a != null : !str.equals(fqfVar.a)) {
            return false;
        }
        axpg axpgVar = this.b;
        if (axpgVar == null ? fqfVar.b != null : !axpgVar.equals(fqfVar.b)) {
            return false;
        }
        Integer num = this.c;
        if (num == null ? fqfVar.c != null : !num.equals(fqfVar.c)) {
            return false;
        }
        Boolean bool = this.d;
        if (bool == null ? fqfVar.d != null : !bool.equals(fqfVar.d)) {
            return false;
        }
        syd sydVar = this.e;
        if (sydVar == null ? fqfVar.e != null : !sydVar.equals(fqfVar.e)) {
            return false;
        }
        Integer num2 = this.f;
        if (num2 == null ? fqfVar.f != null : !num2.equals(fqfVar.f)) {
            return false;
        }
        awnw awnwVar = this.g;
        return awnwVar == null ? fqfVar.g == null : awnwVar.equals(fqfVar.g);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }
}
