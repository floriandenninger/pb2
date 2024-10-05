package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hwp implements zob {
    public boolean a = false;
    private final TextView b;
    private final View c;
    private final hwo d;

    public hwp(TextView textView, View view, hwo hwoVar) {
        this.b = textView;
        this.c = view;
        this.d = hwoVar;
    }

    @Override // defpackage.zob
    public final void c() {
    }

    @Override // defpackage.zob
    public final void e(float f, float f2) {
    }

    @Override // defpackage.zob
    public final void mi() {
    }

    @Override // defpackage.zob
    public final void mj(int i) {
        if (this.a) {
            this.a = false;
            return;
        }
        if (this.d.bp()) {
            if (i == 3) {
                AnimatorSet O = fhe.O(this.b, -this.c.getWidth());
                if (O != null) {
                    this.d.bb(3, this.b, O);
                    return;
                }
                return;
            }
            if (i == 1) {
                AnimatorSet O2 = fhe.O(this.b, this.c.getWidth());
                if (O2 != null) {
                    this.d.bb(1, this.b, O2);
                }
            }
        }
    }

    @Override // defpackage.zob
    public final void mo(float f) {
    }
}
