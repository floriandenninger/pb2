package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akkg extends LinearLayoutManager {
    final /* synthetic */ akkr a;

    public akkg(akkr akkrVar) {
        this.a = akkrVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.wd
    public final boolean ae() {
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.a.ai;
        return anchorableTopPeekingScrollView.n || anchorableTopPeekingScrollView.getScrollY() == anchorableTopPeekingScrollView.k;
    }
}
