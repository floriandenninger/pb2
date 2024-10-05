package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afmh extends dha {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f46J = 0;

    @dnt(a = 13)
    szl A;

    @dnt(a = 13)
    ayqi B;
    Boolean C;
    SpannableString D;
    SpannableStringBuilder E;
    Float F;

    @dnt(a = 13)
    akpq G;

    @dnt(a = 13)
    afnp H;

    @dnt(a = 13)
    ajyw I;

    @dnt(a = 14)
    private afmg K;

    @dnt(a = 13)
    ajsd a;

    @dnt(a = 13)
    sww b;

    @dnt(a = 13)
    sxc c;

    @dnt(a = 13)
    aahv d;

    @dnt(a = 13)
    afsy e;

    @dnt(a = 13)
    ajut f;

    @dnt(a = 13)
    acra g;

    @dnt(a = 13)
    syd v;

    @dnt(a = 13)
    awnw w;

    @dnt(a = 13)
    awnw x;

    @dnt(a = 13)
    awnw y;

    @dnt(a = 13)
    awue z;

    public afmh() {
        super("SuggestEditableText");
        this.K = new afmg();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void a(dhe dheVar) {
        if (dheVar.f == null) {
            return;
        }
        dheVar.g(new dlp(1, new Object[0]), "updateState:SuggestEditableText.forceComponentRemount");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void av(dhe dheVar, int i, int i2) {
        if (dheVar.f == null) {
            return;
        }
        dheVar.g(new dlp(0, Integer.valueOf(i), Integer.valueOf(i2)), "updateState:SuggestEditableText.remeasureForUpdatedText");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return afmx.c(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        baql baqlVar5 = new baql();
        baql baqlVar6 = new baql();
        afmx.h(baqlVar, baqlVar2, baqlVar3, baqlVar4, baqlVar5, baqlVar6);
        afmg afmgVar = this.K;
        afmgVar.b = (AtomicBoolean) baqlVar.a;
        afmgVar.f = (AtomicInteger) baqlVar2.a;
        afmgVar.e = (AtomicInteger) baqlVar3.a;
        afmgVar.a = (AtomicInteger) baqlVar4.a;
        afmgVar.d = (AtomicBoolean) baqlVar5.a;
        afmgVar.c = (AtomicBoolean) baqlVar6.a;
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        afmg afmgVar = this.K;
        afmx.e(i, i2, dloVar, afmgVar.f, afmgVar.e);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        SpannableStringBuilder spannableStringBuilder = this.E;
        SpannableString spannableString = this.D;
        Float f = this.F;
        awue awueVar = this.z;
        awnw awnwVar = this.x;
        awnw awnwVar2 = this.y;
        awnw awnwVar3 = this.w;
        sww swwVar = this.b;
        ajyw ajywVar = this.I;
        afnp afnpVar = this.H;
        akpq akpqVar = this.G;
        aahv aahvVar = this.d;
        afsy afsyVar = this.e;
        ajut ajutVar = this.f;
        ajsd ajsdVar = this.a;
        ayqi ayqiVar = this.B;
        acra acraVar = this.g;
        boolean booleanValue = this.C.booleanValue();
        afmg afmgVar = this.K;
        afmx.j(dheVar, (afmr) obj, spannableStringBuilder, spannableString, f, awueVar, awnwVar, awnwVar2, awnwVar3, swwVar, ajywVar, afnpVar, akpqVar, aahvVar, afsyVar, ajutVar, ajsdVar, ayqiVar, acraVar, booleanValue, afmgVar.b, this.c, this.v, this.A, afmgVar.d, afmgVar.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void V(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        awue awueVar = this.z;
        szl szlVar = this.A;
        syd sydVar = this.v;
        sww swwVar = this.b;
        sxc sxcVar = this.c;
        afmg afmgVar = this.K;
        afmx.i(dheVar, awueVar, szlVar, sydVar, swwVar, sxcVar, afmgVar.d, afmgVar.c, baqlVar, baqlVar2, baqlVar3, baqlVar4);
        this.C = (Boolean) baqlVar.a;
        this.E = (SpannableStringBuilder) baqlVar2.a;
        this.D = (SpannableString) baqlVar3.a;
        this.F = (Float) baqlVar4.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        afmg afmgVar = (afmg) dlqVar;
        afmg afmgVar2 = (afmg) dlqVar2;
        afmgVar2.a = afmgVar.a;
        afmgVar2.b = afmgVar.b;
        afmgVar2.c = afmgVar.c;
        afmgVar2.d = afmgVar.d;
        afmgVar2.e = afmgVar.e;
        afmgVar2.f = afmgVar.f;
    }

    @Override // defpackage.dhk
    public final boolean Y() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        afmh afmhVar = (afmh) dhaVar;
        afmh afmhVar2 = (afmh) dhaVar2;
        return afmx.d(new dim(afmhVar.K.b, afmhVar2 == null ? null : afmhVar2.K.b), new dim(afmhVar.K.f, afmhVar2 == null ? null : afmhVar2.K.f), new dim(afmhVar.K.a, afmhVar2 != null ? afmhVar2.K.a : null));
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
        afmh afmhVar = (afmh) dhaVar;
        if (this.k == afmhVar.k) {
            return true;
        }
        ajsd ajsdVar = this.a;
        if (ajsdVar == null ? afmhVar.a != null : !ajsdVar.equals(afmhVar.a)) {
            return false;
        }
        sww swwVar = this.b;
        if (swwVar == null ? afmhVar.b != null : !swwVar.equals(afmhVar.b)) {
            return false;
        }
        sxc sxcVar = this.c;
        if (sxcVar == null ? afmhVar.c != null : !sxcVar.equals(afmhVar.c)) {
            return false;
        }
        aahv aahvVar = this.d;
        if (aahvVar == null ? afmhVar.d != null : !aahvVar.equals(afmhVar.d)) {
            return false;
        }
        afsy afsyVar = this.e;
        if (afsyVar == null ? afmhVar.e != null : !afsyVar.equals(afmhVar.e)) {
            return false;
        }
        ajut ajutVar = this.f;
        if (ajutVar == null ? afmhVar.f != null : !ajutVar.equals(afmhVar.f)) {
            return false;
        }
        acra acraVar = this.g;
        if (acraVar == null ? afmhVar.g != null : !acraVar.equals(afmhVar.g)) {
            return false;
        }
        syd sydVar = this.v;
        if (sydVar == null ? afmhVar.v != null : !sydVar.equals(afmhVar.v)) {
            return false;
        }
        awnw awnwVar = this.w;
        if (awnwVar == null ? afmhVar.w != null : !awnwVar.equals(afmhVar.w)) {
            return false;
        }
        awnw awnwVar2 = this.x;
        if (awnwVar2 == null ? afmhVar.x != null : !awnwVar2.equals(afmhVar.x)) {
            return false;
        }
        awnw awnwVar3 = this.y;
        if (awnwVar3 == null ? afmhVar.y != null : !awnwVar3.equals(afmhVar.y)) {
            return false;
        }
        ajyw ajywVar = this.I;
        if (ajywVar == null ? afmhVar.I != null : !ajywVar.equals(afmhVar.I)) {
            return false;
        }
        afnp afnpVar = this.H;
        if (afnpVar == null ? afmhVar.H != null : !afnpVar.equals(afmhVar.H)) {
            return false;
        }
        awue awueVar = this.z;
        if (awueVar == null ? afmhVar.z != null : !awueVar.equals(afmhVar.z)) {
            return false;
        }
        akpq akpqVar = this.G;
        if (akpqVar == null ? afmhVar.G != null : !akpqVar.equals(afmhVar.G)) {
            return false;
        }
        szl szlVar = this.A;
        if (szlVar == null ? afmhVar.A != null : !szlVar.equals(afmhVar.A)) {
            return false;
        }
        ayqi ayqiVar = this.B;
        if (ayqiVar == null ? afmhVar.B != null : !ayqiVar.equals(afmhVar.B)) {
            return false;
        }
        AtomicInteger atomicInteger = this.K.a;
        if (atomicInteger == null ? afmhVar.K.a != null : !atomicInteger.equals(afmhVar.K.a)) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.K.b;
        if (atomicBoolean == null ? afmhVar.K.b != null : !atomicBoolean.equals(afmhVar.K.b)) {
            return false;
        }
        AtomicBoolean atomicBoolean2 = this.K.c;
        if (atomicBoolean2 == null ? afmhVar.K.c != null : !atomicBoolean2.equals(afmhVar.K.c)) {
            return false;
        }
        AtomicBoolean atomicBoolean3 = this.K.d;
        if (atomicBoolean3 == null ? afmhVar.K.d != null : !atomicBoolean3.equals(afmhVar.K.d)) {
            return false;
        }
        AtomicInteger atomicInteger2 = this.K.e;
        if (atomicInteger2 == null ? afmhVar.K.e != null : !atomicInteger2.equals(afmhVar.K.e)) {
            return false;
        }
        AtomicInteger atomicInteger3 = this.K.f;
        AtomicInteger atomicInteger4 = afmhVar.K.f;
        return atomicInteger3 == null ? atomicInteger4 == null : atomicInteger3.equals(atomicInteger4);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        afmh afmhVar = (afmh) super.j();
        afmhVar.C = null;
        afmhVar.D = null;
        afmhVar.E = null;
        afmhVar.F = null;
        afmhVar.K = new afmg();
        return afmhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        afmh afmhVar = (afmh) dhaVar;
        this.C = afmhVar.C;
        this.D = afmhVar.D;
        this.E = afmhVar.E;
        this.F = afmhVar.F;
    }
}
