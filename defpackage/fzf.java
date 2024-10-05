package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzf {
    public CharSequence a;
    public View b;
    private amsx c;
    private ActionBarColor d;
    private Integer e;

    public fzf() {
    }

    public fzf(fzg fzgVar) {
        this.a = fzgVar.a;
        this.b = fzgVar.b;
        this.c = fzgVar.c;
        this.d = fzgVar.d;
        this.e = Integer.valueOf(fzgVar.e);
    }

    public final fzg a() {
        ActionBarColor actionBarColor;
        Integer num;
        amsx amsxVar = this.c;
        if (amsxVar == null || (actionBarColor = this.d) == null || (num = this.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" menuItems");
            }
            if (this.d == null) {
                sb.append(" iconTintColor");
            }
            if (this.e == null) {
                sb.append(" homeAction");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new fzg(this.a, this.b, amsxVar, actionBarColor, num.intValue());
    }

    public final void b(ActionBarColor actionBarColor) {
        if (actionBarColor == null) {
            throw new NullPointerException("Null iconTintColor");
        }
        this.d = actionBarColor;
    }

    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void d(amsx amsxVar) {
        if (amsxVar == null) {
            throw new NullPointerException("Null menuItems");
        }
        this.c = amsxVar;
    }

    public final void e(amml ammlVar) {
        amsv i = amsx.i();
        amsx amsxVar = this.c;
        if (amsxVar == null) {
            throw new IllegalStateException("Property \"menuItems\" has not been set");
        }
        i.j(amsxVar);
        d(((amsv) ammlVar.apply(i)).g());
    }
}
