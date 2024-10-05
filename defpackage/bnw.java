package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnw extends Animation {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;

    public bnw(int i, int i2, View view) {
        this.a = i;
        this.b = i2;
        this.c = view;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        bof.n(this.c, this.a - ((int) ((r4 - this.b) * f)));
    }
}
