package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lnq extends bsk implements gka {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void aM(final bsk bskVar, final int i) {
        new yqw(bskVar.X).c().ax(new ayrs() { // from class: lnp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                bsk bskVar2 = bsk.this;
                int i2 = i;
                if (((Boolean) obj).booleanValue()) {
                    bskVar2.b.setPadding(i2, 0, i2, 0);
                    bskVar2.b.setScrollBarStyle(50331648);
                    bskVar2.s(new InsetDrawable((Drawable) new ColorDrawable(wbs.Q(bskVar2.qR(), R.attr.ytSeparator)), i2, 0, i2, 0));
                }
            }
        });
    }

    @Override // defpackage.gka
    public final void aV(int i) {
        aM(this, i);
    }
}
