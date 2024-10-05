package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gad {
    public final fzg a;
    public final fzn b;
    public final fzq c;
    public final fzv d;
    public final fzx e;
    public final boolean f;
    public final boolean g;
    public final Object h;
    public final boolean i;
    public final ActionBarColor j;
    public final ActionBarColor k;
    public final int l;
    public final ActionBarColor m;
    public final int n;
    public final ActionBarColor o;
    public final ActionBarColor p;
    public final boolean q;

    public gad() {
    }

    public gad(fzg fzgVar, fzn fznVar, fzq fzqVar, fzv fzvVar, fzx fzxVar, boolean z, boolean z2, Object obj, boolean z3, ActionBarColor actionBarColor, ActionBarColor actionBarColor2, int i, ActionBarColor actionBarColor3, int i2, ActionBarColor actionBarColor4, ActionBarColor actionBarColor5, boolean z4) {
        this.a = fzgVar;
        this.b = fznVar;
        this.c = fzqVar;
        this.d = fzvVar;
        this.e = fzxVar;
        this.f = z;
        this.g = z2;
        this.h = obj;
        this.i = z3;
        this.j = actionBarColor;
        this.k = actionBarColor2;
        this.l = i;
        this.m = actionBarColor3;
        this.n = i2;
        this.o = actionBarColor4;
        this.p = actionBarColor5;
        this.q = z4;
    }

    public final gac a() {
        return new gac(this);
    }

    public final boolean equals(Object obj) {
        fzn fznVar;
        fzq fzqVar;
        fzv fzvVar;
        fzx fzxVar;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gad) {
            gad gadVar = (gad) obj;
            if (this.a.equals(gadVar.a) && ((fznVar = this.b) != null ? fznVar.equals(gadVar.b) : gadVar.b == null) && ((fzqVar = this.c) != null ? fzqVar.equals(gadVar.c) : gadVar.c == null) && ((fzvVar = this.d) != null ? fzvVar.equals(gadVar.d) : gadVar.d == null) && ((fzxVar = this.e) != null ? fzxVar.equals(gadVar.e) : gadVar.e == null) && this.f == gadVar.f && this.g == gadVar.g && ((obj2 = this.h) != null ? obj2.equals(gadVar.h) : gadVar.h == null) && this.i == gadVar.i && this.j.equals(gadVar.j) && this.k.equals(gadVar.k) && this.l == gadVar.l && this.m.equals(gadVar.m) && this.n == gadVar.n && this.o.equals(gadVar.o) && this.p.equals(gadVar.p) && this.q == gadVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        fzn fznVar = this.b;
        int hashCode2 = (hashCode ^ (fznVar == null ? 0 : fznVar.hashCode())) * 1000003;
        fzq fzqVar = this.c;
        int hashCode3 = (hashCode2 ^ (fzqVar == null ? 0 : fzqVar.hashCode())) * 1000003;
        fzv fzvVar = this.d;
        int hashCode4 = (hashCode3 ^ (fzvVar == null ? 0 : fzvVar.hashCode())) * 1000003;
        fzx fzxVar = this.e;
        int hashCode5 = (((((hashCode4 ^ (fzxVar == null ? 0 : fzxVar.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        Object obj = this.h;
        return ((((((((((((((((((hashCode5 ^ (obj != null ? obj.hashCode() : 0)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ (true == this.q ? 1231 : 1237);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        boolean z = this.f;
        boolean z2 = this.g;
        String valueOf6 = String.valueOf(this.h);
        boolean z3 = this.i;
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.k);
        int i = this.l;
        String valueOf9 = String.valueOf(this.m);
        int i2 = this.n;
        String valueOf10 = String.valueOf(this.o);
        String valueOf11 = String.valueOf(this.p);
        boolean z4 = this.q;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        StringBuilder sb = new StringBuilder(length + 459 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length());
        sb.append("TopBarModel{actionBarModel=");
        sb.append(valueOf);
        sb.append(", feedFilterBarModel=");
        sb.append(valueOf2);
        sb.append(", mySubsFilterBarModel=");
        sb.append(valueOf3);
        sb.append(", searchResultsChipBarModel=");
        sb.append(valueOf4);
        sb.append(", tabHeaderElementBarModel=");
        sb.append(valueOf5);
        sb.append(", enableTranslucentActionBar=");
        sb.append(z);
        sb.append(", hideTitleOnTranslucentActionBar=");
        sb.append(z2);
        sb.append(", headerRenderer=");
        sb.append(valueOf6);
        sb.append(", isHeaderRendererCollapsible=");
        sb.append(z3);
        sb.append(", backgroundColor=");
        sb.append(valueOf7);
        sb.append(", statusBarColor=");
        sb.append(valueOf8);
        sb.append(", primaryTextStyleResId=");
        sb.append(i);
        sb.append(", primaryTextColor=");
        sb.append(valueOf9);
        sb.append(", secondaryTextStyleResId=");
        sb.append(i2);
        sb.append(", secondaryTextColor=");
        sb.append(valueOf10);
        sb.append(", indicatorColor=");
        sb.append(valueOf11);
        sb.append(", translucentWhenAccessibilityEnabled=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
