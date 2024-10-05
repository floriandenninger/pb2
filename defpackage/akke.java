package defpackage;

import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akke {
    public final /* synthetic */ akkr a;

    public /* synthetic */ akke(akkr akkrVar) {
        this.a = akkrVar;
    }

    public final void a() {
        akkr akkrVar = this.a;
        int height = akkrVar.ak.getHeight();
        for (int i = 0; i < akkrVar.al.getChildCount(); i++) {
            height += akkrVar.al.getChildAt(i).getHeight();
        }
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = akkrVar.ai;
        if (anchorableTopPeekingScrollView.n) {
            anchorableTopPeekingScrollView.p = height;
            int i2 = anchorableTopPeekingScrollView.k;
            int min = Math.min((height + (i2 + i2)) - anchorableTopPeekingScrollView.o, i2);
            anchorableTopPeekingScrollView.b(min, min);
            anchorableTopPeekingScrollView.c(min);
        }
    }
}
