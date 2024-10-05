package defpackage;

import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class err extends ajjh {
    final /* synthetic */ eru a;
    private final int b;

    public err(eru eruVar, int i) {
        this.a = eruVar;
        this.b = i;
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void a(ImageView imageView) {
        this.a.p(this.b);
        eru.aH(imageView, this.b);
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void b(ImageView imageView) {
        this.a.p(this.b);
        imageView.setBackground(null);
    }
}
