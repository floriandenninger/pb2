package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mdp extends lyy {
    private boolean c;
    private int d;
    private final axpg e;
    private fzq f;

    public mdp(axpg axpgVar, Activity activity, axpg axpgVar2, axzg axzgVar, ayqi ayqiVar, yqw yqwVar, byte[] bArr) {
        super(activity, axpgVar2);
        this.e = axpgVar;
        this.d = 1;
        yqwVar.g(new mdo(axzgVar, ayqiVar, ((ViewGroup) axpgVar.get()).findViewById(R.id.feed_filter_bar_separator), 0, null));
    }

    private final void k(int i) {
        alfd alfdVar;
        if (this.d == i) {
            return;
        }
        this.d = i;
        g();
        if (j() && (alfdVar = (alfd) ((ViewGroup) this.e.get()).getLayoutParams()) != null) {
            int i2 = 0;
            if (this.d != 5 && d().getChildCount() > 0) {
                i2 = ((alfd) d().getChildAt(0).getLayoutParams()).a;
            }
            if (i2 != alfdVar.a) {
                alfdVar.a = i2;
            }
        }
    }

    @Override // defpackage.lyy
    protected final int b() {
        return 1;
    }

    @Override // defpackage.lyy
    protected final ViewGroup c() {
        return (ViewGroup) this.e.get();
    }

    @Override // defpackage.lyy
    protected final void f() {
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.e.get()).getParent();
        if (viewGroup == d()) {
            viewGroup.removeView((View) this.e.get());
        }
    }

    @Override // defpackage.lyy
    public final void h(gad gadVar) {
        fzq fzqVar = gadVar.c;
        if (fzqVar == null) {
            k(1);
            this.f = null;
            return;
        }
        fzq fzqVar2 = this.f;
        if (fzqVar2 == null || fzqVar2.b != fzqVar.b) {
            this.c = false;
        }
        this.f = fzqVar;
        k(true != fzqVar.c ? 4 : 5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final void i() {
        super.i();
        if (this.c) {
            return;
        }
        this.c = true;
        fzo fzoVar = this.f.b;
        if (fzoVar != null) {
            fzoVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lyy
    public final boolean j() {
        return this.d != 1;
    }
}
