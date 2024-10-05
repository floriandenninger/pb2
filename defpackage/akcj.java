package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcj implements akbn {
    public final boolean a;
    public final int b;
    public final View c;
    public final CharSequence d;
    public final CharSequence e;
    public final apmg f;
    public final apmg g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final ammv m;
    public final ammv n;
    public final akbl o;
    public final View.OnClickListener p;
    public final akcs q;
    private final boolean r;

    public akcj() {
    }

    public akcj(boolean z, int i, boolean z2, View view, CharSequence charSequence, CharSequence charSequence2, apmg apmgVar, apmg apmgVar2, int i2, int i3, int i4, int i5, float f, ammv ammvVar, ammv ammvVar2, akbl akblVar, View.OnClickListener onClickListener, akcs akcsVar) {
        this.a = z;
        this.b = i;
        this.r = z2;
        this.c = view;
        this.d = charSequence;
        this.e = charSequence2;
        this.f = apmgVar;
        this.g = apmgVar2;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = f;
        this.m = ammvVar;
        this.n = ammvVar2;
        this.o = akblVar;
        this.p = onClickListener;
        this.q = akcsVar;
    }

    public static akci a() {
        akci akciVar = new akci(null);
        akciVar.g(0);
        akciVar.j(1);
        akciVar.k(0);
        akciVar.h(1.0f);
        akciVar.f(false);
        akciVar.i(2);
        akciVar.c(2);
        akciVar.l();
        return akciVar;
    }

    @Override // defpackage.akbn
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        View view;
        CharSequence charSequence;
        CharSequence charSequence2;
        apmg apmgVar;
        apmg apmgVar2;
        akbl akblVar;
        View.OnClickListener onClickListener;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akcj) {
            akcj akcjVar = (akcj) obj;
            if (this.a == akcjVar.a && this.b == akcjVar.b && this.r == akcjVar.r && ((view = this.c) != null ? view.equals(akcjVar.c) : akcjVar.c == null) && ((charSequence = this.d) != null ? charSequence.equals(akcjVar.d) : akcjVar.d == null) && ((charSequence2 = this.e) != null ? charSequence2.equals(akcjVar.e) : akcjVar.e == null) && ((apmgVar = this.f) != null ? apmgVar.equals(akcjVar.f) : akcjVar.f == null) && ((apmgVar2 = this.g) != null ? apmgVar2.equals(akcjVar.g) : akcjVar.g == null) && this.h == akcjVar.h && this.i == akcjVar.i && this.j == akcjVar.j && this.k == akcjVar.k && Float.floatToIntBits(this.l) == Float.floatToIntBits(akcjVar.l) && this.m.equals(akcjVar.m) && this.n.equals(akcjVar.n) && ((akblVar = this.o) != null ? akblVar.equals(akcjVar.o) : akcjVar.o == null) && ((onClickListener = this.p) != null ? onClickListener.equals(akcjVar.p) : akcjVar.p == null)) {
                akcs akcsVar = this.q;
                akcs akcsVar2 = akcjVar.q;
                if (akcsVar != null ? akcsVar.equals(akcsVar2) : akcsVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.akbn
    public final akbl g() {
        return this.o;
    }

    @Override // defpackage.akbn
    public final boolean i() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        boolean z2 = this.r;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.j;
        int i5 = this.k;
        float f = this.l;
        String valueOf6 = String.valueOf(this.m);
        String valueOf7 = String.valueOf(this.n);
        String valueOf8 = String.valueOf(this.o);
        String valueOf9 = String.valueOf(this.p);
        String valueOf10 = String.valueOf(this.q);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = "null".length();
        int length5 = "null".length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = "null".length();
        int length8 = "null".length();
        int length9 = String.valueOf(valueOf5).length();
        int length10 = String.valueOf(valueOf6).length();
        int length11 = String.valueOf(valueOf7).length();
        int length12 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 491 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("YouTubeTooltipModel{counterfactual=");
        sb.append(z);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", rateLimited=");
        sb.append(z2);
        sb.append(", targetView=");
        sb.append(valueOf);
        sb.append(", titleText=");
        sb.append(valueOf2);
        sb.append(", detailText=");
        sb.append(valueOf3);
        sb.append(", actionText=");
        sb.append("null");
        sb.append(", actionListener=");
        sb.append("null");
        sb.append(", actionButtonRenderer=");
        sb.append(valueOf4);
        sb.append(", dismissText=");
        sb.append("null");
        sb.append(", dismissListener=");
        sb.append("null");
        sb.append(", dismissButtonRenderer=");
        sb.append(valueOf5);
        sb.append(", tapDismissalType=");
        sb.append(i2);
        sb.append(", targetEffectType=");
        sb.append(i3);
        sb.append(", placement=");
        sb.append(i4);
        sb.append(", alignment=");
        sb.append(i5);
        sb.append(", maxWidthPercentage=");
        sb.append(f);
        sb.append(", backgroundColor=");
        sb.append(valueOf6);
        sb.append(", acceptFeedbackOnTargetTapEnabled=");
        sb.append(valueOf7);
        sb.append(", transientUiCallback=");
        sb.append(valueOf8);
        sb.append(", onClickListener=");
        sb.append(valueOf9);
        sb.append(", onTooltipDismissListener=");
        sb.append(valueOf10);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true == this.r ? 1231 : 1237)) * 1000003;
        View view = this.c;
        int hashCode = (i ^ (view == null ? 0 : view.hashCode())) * 1000003;
        CharSequence charSequence = this.d;
        int hashCode2 = (hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.e;
        int hashCode3 = (hashCode2 ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 583896283;
        apmg apmgVar = this.f;
        int hashCode4 = (hashCode3 ^ (apmgVar == null ? 0 : apmgVar.hashCode())) * 583896283;
        apmg apmgVar2 = this.g;
        int hashCode5 = (((((((((((((((hashCode4 ^ (apmgVar2 == null ? 0 : apmgVar2.hashCode())) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ Float.floatToIntBits(this.l)) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003;
        akbl akblVar = this.o;
        int hashCode6 = (hashCode5 ^ (akblVar == null ? 0 : akblVar.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.p;
        int hashCode7 = (hashCode6 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        akcs akcsVar = this.q;
        return hashCode7 ^ (akcsVar != null ? akcsVar.hashCode() : 0);
    }
}
