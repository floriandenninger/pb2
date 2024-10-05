package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajei extends WindowInsetsAnimation.Callback {
    final /* synthetic */ int a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ ViewGroup.MarginLayoutParams d;
    final /* synthetic */ ajek e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajei(ajek ajekVar, int i, View view, View view2, ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(0);
        this.e = ajekVar;
        this.a = i;
        this.b = view;
        this.c = view2;
        this.d = marginLayoutParams;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        ajek ajekVar = this.e;
        if (ajekVar.ag) {
            ajekVar.ag = false;
            WindowInsets rootWindowInsets = this.c.getRootWindowInsets();
            int i = this.a;
            if (rootWindowInsets != null) {
                i += ajek.aL(rootWindowInsets);
            }
            if (this.d.bottomMargin != i) {
                yny.z(this.b, yny.k(i), ViewGroup.MarginLayoutParams.class);
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0) {
            ajek ajekVar = this.e;
            ajekVar.ag = true;
            Dialog dialog = ajekVar.an;
            if (dialog != null) {
                ((algj) dialog).a().G(3);
            }
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        if (!this.e.ag) {
            return windowInsets;
        }
        yny.z(this.b, yny.k(this.a + ajek.aL(windowInsets)), ViewGroup.MarginLayoutParams.class);
        return windowInsets;
    }
}
