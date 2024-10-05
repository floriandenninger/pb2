package defpackage;

import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akby implements akbn, gbi {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final View.OnClickListener d;
    public final apmg e;
    public final CharSequence f;
    public final View.OnClickListener g;
    public final apmg h;
    public final avgg i;
    public final int j;
    public final Optional k;
    public final acsc l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final int p;
    private final akbl q;

    public akby() {
    }

    public akby(boolean z, boolean z2, boolean z3, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, apmg apmgVar, CharSequence charSequence4, View.OnClickListener onClickListener2, apmg apmgVar2, avgg avggVar, int i2, Optional optional, acsc acscVar, akbl akblVar) {
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = i;
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = onClickListener;
        this.e = apmgVar;
        this.f = charSequence4;
        this.g = onClickListener2;
        this.h = apmgVar2;
        this.i = avggVar;
        this.j = i2;
        this.k = optional;
        this.l = acscVar;
        this.q = akblVar;
    }

    public static akbx d() {
        akbx akbxVar = new akbx(null);
        akbxVar.j();
        akbxVar.i(true);
        akbxVar.a = false;
        akbxVar.g(false);
        return akbxVar.e(0);
    }

    @Override // defpackage.gbi
    public final int a() {
        return 2;
    }

    @Override // defpackage.gbi
    public final boolean b() {
        return this.m;
    }

    @Override // defpackage.gbi
    public final boolean c() {
        return this.n;
    }

    @Override // defpackage.akbn
    public final int e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        View.OnClickListener onClickListener;
        apmg apmgVar;
        CharSequence charSequence4;
        View.OnClickListener onClickListener2;
        apmg apmgVar2;
        avgg avggVar;
        acsc acscVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof akby) {
            akby akbyVar = (akby) obj;
            if (this.m == akbyVar.m && this.n == akbyVar.n && this.o == akbyVar.o && this.p == akbyVar.p && ((charSequence = this.a) != null ? charSequence.equals(akbyVar.a) : akbyVar.a == null) && ((charSequence2 = this.b) != null ? charSequence2.equals(akbyVar.b) : akbyVar.b == null) && ((charSequence3 = this.c) != null ? charSequence3.equals(akbyVar.c) : akbyVar.c == null) && ((onClickListener = this.d) != null ? onClickListener.equals(akbyVar.d) : akbyVar.d == null) && ((apmgVar = this.e) != null ? apmgVar.equals(akbyVar.e) : akbyVar.e == null) && ((charSequence4 = this.f) != null ? charSequence4.equals(akbyVar.f) : akbyVar.f == null) && ((onClickListener2 = this.g) != null ? onClickListener2.equals(akbyVar.g) : akbyVar.g == null) && ((apmgVar2 = this.h) != null ? apmgVar2.equals(akbyVar.h) : akbyVar.h == null) && ((avggVar = this.i) != null ? avggVar.equals(akbyVar.i) : akbyVar.i == null) && this.j == akbyVar.j && this.k.equals(akbyVar.k) && ((acscVar = this.l) != null ? acscVar.equals(akbyVar.l) : akbyVar.l == null)) {
                akbl akblVar = this.q;
                akbl akblVar2 = akbyVar.q;
                if (akblVar != null ? akblVar.equals(akblVar2) : akblVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.akbn
    public final akbl g() {
        return this.q;
    }

    @Override // defpackage.akbn
    public final boolean i() {
        return this.o;
    }

    public final String toString() {
        boolean z = this.m;
        boolean z2 = this.n;
        boolean z3 = this.o;
        int i = this.p;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        int i2 = this.j;
        String valueOf10 = String.valueOf(this.k);
        String valueOf11 = String.valueOf(this.l);
        String valueOf12 = String.valueOf(this.q);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        StringBuilder sb = new StringBuilder(length + 330 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf11).length() + String.valueOf(valueOf12).length());
        sb.append("MealbarBottomUiModel{rateLimited=");
        sb.append(z);
        sb.append(", shownOnFullscreen=");
        sb.append(z2);
        sb.append(", counterfactual=");
        sb.append(z3);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", titleText=");
        sb.append(valueOf);
        sb.append(", detailText=");
        sb.append(valueOf2);
        sb.append(", actionText=");
        sb.append(valueOf3);
        sb.append(", actionListener=");
        sb.append(valueOf4);
        sb.append(", actionButtonRenderer=");
        sb.append(valueOf5);
        sb.append(", dismissText=");
        sb.append(valueOf6);
        sb.append(", dismissListener=");
        sb.append(valueOf7);
        sb.append(", dismissButtonRenderer=");
        sb.append(valueOf8);
        sb.append(", thumbnail=");
        sb.append(valueOf9);
        sb.append(", icon=");
        sb.append(i2);
        sb.append(", iconColorAttribute=");
        sb.append(valueOf10);
        sb.append(", clientVeType=");
        sb.append(valueOf11);
        sb.append(", transientUiCallback=");
        sb.append(valueOf12);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = ((((((((true != this.m ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true == this.o ? 1231 : 1237)) * 1000003) ^ this.p) * 1000003;
        CharSequence charSequence = this.a;
        int hashCode = (i ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode ^ (charSequence2 == null ? 0 : charSequence2.hashCode())) * 1000003;
        CharSequence charSequence3 = this.c;
        int hashCode3 = (hashCode2 ^ (charSequence3 == null ? 0 : charSequence3.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.d;
        int hashCode4 = (hashCode3 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        apmg apmgVar = this.e;
        int hashCode5 = (hashCode4 ^ (apmgVar == null ? 0 : apmgVar.hashCode())) * 1000003;
        CharSequence charSequence4 = this.f;
        int hashCode6 = (hashCode5 ^ (charSequence4 == null ? 0 : charSequence4.hashCode())) * 1000003;
        View.OnClickListener onClickListener2 = this.g;
        int hashCode7 = (hashCode6 ^ (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 1000003;
        apmg apmgVar2 = this.h;
        int hashCode8 = (hashCode7 ^ (apmgVar2 == null ? 0 : apmgVar2.hashCode())) * 1000003;
        avgg avggVar = this.i;
        int hashCode9 = (((((hashCode8 ^ (avggVar == null ? 0 : avggVar.hashCode())) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003;
        acsc acscVar = this.l;
        int i2 = (hashCode9 ^ (acscVar == null ? 0 : acscVar.a)) * 1000003;
        akbl akblVar = this.q;
        return i2 ^ (akblVar != null ? akblVar.hashCode() : 0);
    }
}
