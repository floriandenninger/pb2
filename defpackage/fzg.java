package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzg {
    public final CharSequence a;
    public final View b;
    public final amsx c;
    public final ActionBarColor d;
    public final int e;

    public fzg() {
    }

    public fzg(CharSequence charSequence, View view, amsx amsxVar, ActionBarColor actionBarColor, int i) {
        this.a = charSequence;
        this.b = view;
        this.c = amsxVar;
        this.d = actionBarColor;
        this.e = i;
    }

    public static fzf a() {
        fzf fzfVar = new fzf();
        fzfVar.d(amvs.a);
        fzfVar.b(gfw.l());
        fzfVar.c(0);
        return fzfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fzg) {
            fzg fzgVar = (fzg) obj;
            CharSequence charSequence = this.a;
            if (charSequence != null ? charSequence.equals(fzgVar.a) : fzgVar.a == null) {
                View view = this.b;
                if (view != null ? view.equals(fzgVar.b) : fzgVar.b == null) {
                    if (this.c.equals(fzgVar.c) && this.d.equals(fzgVar.d) && this.e == fzgVar.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int i = this.e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 87 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("ActionBarModel{title=");
        sb.append(valueOf);
        sb.append(", customView=");
        sb.append(valueOf2);
        sb.append(", menuItems=");
        sb.append(valueOf3);
        sb.append(", iconTintColor=");
        sb.append(valueOf4);
        sb.append(", homeAction=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = ((charSequence == null ? 0 : charSequence.hashCode()) ^ 1000003) * 1000003;
        View view = this.b;
        return ((((((hashCode ^ (view != null ? view.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }
}
