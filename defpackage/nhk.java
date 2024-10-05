package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhk implements ajjx {
    private final /* synthetic */ int a;

    public nhk(int i) {
        this.a = i;
    }

    @Override // defpackage.ajjx
    public final void b(ImageView imageView) {
    }

    @Override // defpackage.ajjx
    public final void c(ImageView imageView) {
    }

    @Override // defpackage.ajjx
    public final void a(ImageView imageView) {
        int i = this.a;
        if (i == 0) {
            afsi.b(1, 1, "AdItemDetailsSectionPresenter failed to load image:");
        } else if (i == 1) {
            afsi.b(1, 1, "AdClickableIconSectionPresenter failed to load image:");
        } else {
            imageView.setVisibility(8);
            afsi.b(1, 1, "AdsCompactEngagementPanelHeader failed to load icon:");
        }
    }
}
