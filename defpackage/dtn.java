package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtn extends dha {

    @dnt(a = 0)
    public float A;

    @dnt(a = 3)
    public boolean B;

    @dnt(a = 13)
    public CharSequence C;

    @dnt(a = 13)
    final ColorStateList D;

    @dnt(a = 3)
    public int E;

    @dnt(a = 3)
    final int F;

    @dnt(a = 3)
    public boolean G;

    @dnt(a = 13)
    final Typeface H;
    ClickableSpan[] I;

    /* renamed from: J, reason: collision with root package name */
    Layout f188J;
    ImageSpan[] K;
    Layout L;
    Integer M;
    Float N;
    Integer O;
    CharSequence P;
    Layout Q;
    Float R;

    @dnt(a = 13)
    int S;

    @dnt(a = 13)
    final int T;

    @dnt(a = 13)
    public sqf U;

    @dnt(a = 3)
    public boolean a;

    @dnt(a = 3)
    public int b;

    @dnt(a = 3)
    public boolean c;

    @dnt(a = 13)
    public CharSequence d;

    @dnt(a = 13)
    TextUtils.TruncateAt e;

    @dnt(a = 3)
    public boolean f;

    @dnt(a = 0)
    public float g;

    @dnt(a = 3)
    public int v;

    @dnt(a = 3)
    public int w;

    @dnt(a = 3)
    public int x;

    @dnt(a = 0)
    public float y;

    @dnt(a = 0)
    public float z;

    public dtn() {
        super("Text");
        this.b = 0;
        this.c = true;
        this.v = -16776961;
        this.w = Integer.MAX_VALUE;
        this.x = -7829368;
        this.B = true;
        this.D = dua.a;
        this.E = -1;
        this.F = dua.b;
        this.H = dua.c;
        this.T = dua.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final int D(int i, int i2) {
        return dua.a(i, i2, this.C, this.Q, this.I);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final int E() {
        return dua.b(this.a, this.I);
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 30;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return dua.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void Q(dhe dheVar, dhi dhiVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        baql baqlVar5 = new baql();
        dua.h(dheVar, dhiVar, this.C, this.e, this.B, this.w, this.A, this.y, this.z, this.x, this.D, this.v, this.E, this.g, this.T, this.F, this.H, this.S, this.b, this.d, this.f, this.G, this.f188J, this.L, this.O, this.M, baqlVar, baqlVar2, baqlVar3, baqlVar4, baqlVar5);
        this.P = (CharSequence) baqlVar.a;
        this.Q = (Layout) baqlVar2.a;
        this.R = (Float) baqlVar3.a;
        this.I = (ClickableSpan[]) baqlVar4.a;
        this.K = (ImageSpan[]) baqlVar5.a;
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        baql baqlVar4 = new baql();
        baql baqlVar5 = new baql();
        dua.i(dheVar, dhiVar, i, i2, dloVar, this.C, this.e, this.B, this.w, this.A, this.y, this.z, this.x, this.D, this.v, this.E, this.d, this.g, this.F, this.H, this.S, this.b, baqlVar, baqlVar2, baqlVar3, baqlVar4, baqlVar5);
        this.L = (Layout) baqlVar.a;
        this.f188J = (Layout) baqlVar2.a;
        this.O = (Integer) baqlVar3.a;
        this.M = (Integer) baqlVar4.a;
        this.N = (Float) baqlVar5.a;
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        dua.f(dheVar, (dtr) obj, this.D, this.c, this.U, this.P, this.Q, this.R, this.I, this.K);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void T(View view, ks ksVar) {
        dua.g(view, ksVar, this.C);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void U(ks ksVar, int i, int i2, int i3) {
        dua.c(ksVar, i, i2, i3, this.C, this.Q, this.I);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        dua.e((dtr) obj, this.C);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ae() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean af() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 2;
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
        dtn dtnVar = (dtn) dhaVar;
        if (this.k == dtnVar.k) {
            return true;
        }
        if (this.a != dtnVar.a) {
            return false;
        }
        int i = this.S;
        if (i == 0 ? dtnVar.S != 0 : i != dtnVar.S) {
            return false;
        }
        if (this.b != dtnVar.b || Float.compare(0.0f, 0.0f) != 0 || this.c != dtnVar.c) {
            return false;
        }
        CharSequence charSequence = this.d;
        if (charSequence == null ? dtnVar.d != null : !charSequence.equals(dtnVar.d)) {
            return false;
        }
        TextUtils.TruncateAt truncateAt = this.e;
        if (truncateAt == null ? dtnVar.e != null : !truncateAt.equals(dtnVar.e)) {
            return false;
        }
        if (this.f != dtnVar.f || Float.compare(this.g, dtnVar.g) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(Float.MAX_VALUE, Float.MAX_VALUE) != 0 || this.v != dtnVar.v || this.w != dtnVar.w || this.x != dtnVar.x || Float.compare(this.y, dtnVar.y) != 0 || Float.compare(this.z, dtnVar.z) != 0 || Float.compare(this.A, dtnVar.A) != 0 || this.B != dtnVar.B || Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        CharSequence charSequence2 = this.C;
        if (charSequence2 == null ? dtnVar.C != null : !charSequence2.equals(dtnVar.C)) {
            return false;
        }
        ColorStateList colorStateList = this.D;
        if (colorStateList == null ? dtnVar.D != null : !colorStateList.equals(dtnVar.D)) {
            return false;
        }
        sqf sqfVar = this.U;
        if (sqfVar == null ? dtnVar.U != null : !sqfVar.equals(dtnVar.U)) {
            return false;
        }
        if (this.E != dtnVar.E || this.F != dtnVar.F || this.G != dtnVar.G) {
            return false;
        }
        Typeface typeface = this.H;
        if (typeface == null ? dtnVar.H != null : !typeface.equals(dtnVar.H)) {
            return false;
        }
        int i2 = this.T;
        int i3 = dtnVar.T;
        return i2 == 0 ? i3 == 0 : i3 == 1;
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        dtn dtnVar = (dtn) super.j();
        dtnVar.I = null;
        dtnVar.f188J = null;
        dtnVar.K = null;
        dtnVar.L = null;
        dtnVar.M = null;
        dtnVar.N = null;
        dtnVar.O = null;
        dtnVar.P = null;
        dtnVar.Q = null;
        dtnVar.R = null;
        return dtnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final void p(dha dhaVar) {
        dtn dtnVar = (dtn) dhaVar;
        this.I = dtnVar.I;
        this.f188J = dtnVar.f188J;
        this.K = dtnVar.K;
        this.L = dtnVar.L;
        this.M = dtnVar.M;
        this.N = dtnVar.N;
        this.O = dtnVar.O;
        this.P = dtnVar.P;
        this.Q = dtnVar.Q;
        this.R = dtnVar.R;
    }
}
