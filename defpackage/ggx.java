package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import org.chromium.net.PrivateKeyType;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggx extends ggw {
    public ggx(View view, boolean z) {
        super(view, z);
    }

    @Override // defpackage.ggw
    public final void b(boolean z) {
        this.d.setEnabled(z);
        for (Drawable drawable : ((TextView) this.d).getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setAlpha(true != z ? 51 : PrivateKeyType.INVALID);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ggw
    public final void e(asno asnoVar, aong aongVar) {
        CharSequence b;
        CharSequence ds;
        CharSequence ds2;
        super.e(asnoVar, aongVar);
        if (aongVar == null) {
            return;
        }
        asni asniVar = (asni) aongVar.build();
        asno asnoVar2 = asno.LIKE;
        int ordinal = asnoVar.ordinal();
        aqyg aqygVar = null;
        if (ordinal == 0) {
            TextView textView = (TextView) this.d;
            if (this.c) {
                b = adyu.dr(asniVar);
            } else {
                asno b2 = asno.b(asniVar.d);
                if (b2 == null) {
                    b2 = asno.LIKE;
                }
                if (b2 != asno.LIKE) {
                    if ((asniVar.b & 16) != 0 && (aqygVar = asniVar.g) == null) {
                        aqygVar = aqyg.a;
                    }
                    b = ajcq.b(aqygVar);
                } else {
                    if ((asniVar.b & 8) != 0 && (aqygVar = asniVar.f) == null) {
                        aqygVar = aqyg.a;
                    }
                    b = ajcq.b(aqygVar);
                }
            }
            textView.setText(b);
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            TextView textView2 = (TextView) this.d;
            if (this.c) {
                ds2 = adyu.dr(asniVar);
            } else {
                ds2 = adyu.ds(asniVar);
            }
            textView2.setText(ds2);
            return;
        }
        TextView textView3 = (TextView) this.d;
        if (this.c) {
            asno b3 = asno.b(asniVar.d);
            if (b3 == null) {
                b3 = asno.LIKE;
            }
            if (b3 == asno.DISLIKE) {
                if ((asniVar.b & 256) != 0 && (aqygVar = asniVar.j) == null) {
                    aqygVar = aqyg.a;
                }
                ds = ajcq.b(aqygVar);
            } else {
                if ((asniVar.b & 512) != 0 && (aqygVar = asniVar.k) == null) {
                    aqygVar = aqyg.a;
                }
                ds = ajcq.b(aqygVar);
            }
        } else {
            ds = adyu.ds(asniVar);
        }
        textView3.setText(ds);
    }
}
