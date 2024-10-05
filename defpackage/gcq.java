package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gcq extends akcb implements gbi {
    public final CharSequence a;
    public final CharSequence b;
    public final View.OnClickListener c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final int g;
    private final akbl h;

    public gcq() {
    }

    public gcq(boolean z, boolean z2, boolean z3, int i, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener, akbl akblVar) {
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i;
        this.a = charSequence;
        this.b = charSequence2;
        this.c = onClickListener;
        this.h = akblVar;
    }

    public static gcm d() {
        gcm gcmVar = new gcm();
        gcmVar.d(-1);
        gcmVar.j(false);
        gcmVar.f(false);
        gcmVar.a = false;
        return gcmVar;
    }

    public static gcm f(CharSequence charSequence) {
        gcm d = d();
        d.k(charSequence);
        return d;
    }

    @Override // defpackage.gbi
    public final int a() {
        return 1;
    }

    @Override // defpackage.gbi
    public final boolean b() {
        return this.d;
    }

    @Override // defpackage.gbi
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.akbn
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        CharSequence charSequence;
        View.OnClickListener onClickListener;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gcq) {
            gcq gcqVar = (gcq) obj;
            if (this.d == gcqVar.d && this.e == gcqVar.e && this.f == gcqVar.f && this.g == gcqVar.g && this.a.equals(gcqVar.a) && ((charSequence = this.b) != null ? charSequence.equals(gcqVar.b) : gcqVar.b == null) && ((onClickListener = this.c) != null ? onClickListener.equals(gcqVar.c) : gcqVar.c == null)) {
                akbl akblVar = this.h;
                akbl akblVar2 = gcqVar.h;
                if (akblVar != null ? akblVar.equals(akblVar2) : akblVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.akcb, defpackage.akbn
    public final akbl g() {
        return this.h;
    }

    @Override // defpackage.akcb
    public final View.OnClickListener h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((((((((((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true == this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.a.hashCode()) * 1000003;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003;
        View.OnClickListener onClickListener = this.c;
        int hashCode3 = (hashCode2 ^ (onClickListener == null ? 0 : onClickListener.hashCode())) * 1000003;
        akbl akblVar = this.h;
        return hashCode3 ^ (akblVar != null ? akblVar.hashCode() : 0);
    }

    @Override // defpackage.akbn
    public final boolean i() {
        return this.f;
    }

    @Override // defpackage.akcb
    public final CharSequence j() {
        return this.b;
    }

    @Override // defpackage.akcb
    public final CharSequence k() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        int i = this.g;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.h);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 168 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SnackbarBottomUiModel{rateLimited=");
        sb.append(z);
        sb.append(", shownOnFullscreen=");
        sb.append(z2);
        sb.append(", counterfactual=");
        sb.append(z3);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", text=");
        sb.append(valueOf);
        sb.append(", actionText=");
        sb.append(valueOf2);
        sb.append(", actionListener=");
        sb.append(valueOf3);
        sb.append(", transientUiCallback=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
