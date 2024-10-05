package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfs extends ic {
    final /* synthetic */ MdxWatchDrawerLayout b;

    public jfs(MdxWatchDrawerLayout mdxWatchDrawerLayout) {
        this.b = mdxWatchDrawerLayout;
    }

    @Override // defpackage.ic
    public final void d(View view, ks ksVar) {
        super.d(view, ksVar);
        ksVar.i(new kr(kr.b.a(), this.b.getContext().getString(R.string.mdx_minibar_accessibility_queue_open_action)));
    }
}
