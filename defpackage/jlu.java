package defpackage;

import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jlu extends yzz {
    final /* synthetic */ jlv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlu(jlv jlvVar, ImageView imageView) {
        super(imageView, new zad(imageView.getContext()), null);
        this.a = jlvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yzz
    public final void c() {
        super.c();
        View view = this.a.g;
        view.getClass();
        view.setBackground(null);
    }
}
