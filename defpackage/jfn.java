package defpackage;

import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jfn implements adlr {
    final /* synthetic */ jfp a;

    public jfn(jfp jfpVar) {
        this.a = jfpVar;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        this.a.b();
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a.n;
        if (mdxWatchDrawerLayout != null) {
            mdxWatchDrawerLayout.setVisibility(0);
        }
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        this.a.b();
        this.a.e(false);
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.a.n;
        if (mdxWatchDrawerLayout != null) {
            mdxWatchDrawerLayout.setVisibility(8);
        }
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
    }
}
