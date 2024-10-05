package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class xkr {
    private final Drawable a;
    private final float b;
    protected final View c;
    public aowk d;
    public boolean e;

    public xkr(View view, Drawable drawable, float f) {
        view.getClass();
        this.c = view;
        this.a = drawable;
        this.b = f;
        this.d = null;
    }

    public void a() {
        aowj aowjVar;
        aowk aowkVar = this.d;
        aowl aowlVar = null;
        if (aowkVar == null || (aowkVar.b & 1) == 0) {
            aowjVar = null;
        } else {
            aowjVar = aowkVar.c;
            if (aowjVar == null) {
                aowjVar = aowj.a;
            }
        }
        Drawable background = this.c.getBackground();
        if (aowjVar == null) {
            this.c.setBackground(this.a);
        } else if (background == null || !(background instanceof ColorDrawable) || aowjVar.b != ((ColorDrawable) background).getColor()) {
            this.c.setBackground(new ColorDrawable(aowjVar.b));
        }
        aowk aowkVar2 = this.d;
        if (aowkVar2 != null && (aowkVar2.b & 2) != 0 && (aowlVar = aowkVar2.d) == null) {
            aowlVar = aowl.a;
        }
        float f = aowlVar == null ? this.b : aowlVar.b;
        if (f != this.c.getAlpha()) {
            this.c.setAlpha(f);
        }
        aowk aowkVar3 = this.d;
        boolean z = (aowkVar3 != null && aowkVar3.e) || this.e;
        if ((this.c.getVisibility() == 8) != z) {
            this.c.setVisibility(true == z ? 8 : 0);
        }
    }
}
