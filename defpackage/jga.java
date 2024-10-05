package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jga extends jek {
    public jfp a;
    int b;

    @Override // defpackage.ce
    public final void lZ() {
        super.lZ();
        jfp jfpVar = this.a;
        if (jfpVar.p) {
            jfpVar.d.b(null);
            jfpVar.b.k(jfpVar.q);
            ViewGroup viewGroup = jfpVar.o;
            if (viewGroup != null) {
                viewGroup.removeOnLayoutChangeListener(jfpVar.r);
            }
            MdxWatchDrawerLayout mdxWatchDrawerLayout = jfpVar.n;
            if (mdxWatchDrawerLayout != null) {
                mdxWatchDrawerLayout.a.remove(jfpVar.s);
                jfpVar.n.b = null;
            }
            jfpVar.h.b(jfpVar);
            jfpVar.a.m(jfpVar.c);
            jfg jfgVar = jfpVar.c;
            if (jfgVar.n) {
                final jfe jfeVar = jfgVar.r;
                if (jfeVar != null) {
                    jfeVar.a.k(jfeVar);
                    jfeVar.b.ifPresent(new Consumer() { // from class: jfc
                        @Override // j$.util.function.Consumer
                        public final void accept(Object obj) {
                            ((adlm) obj).O(jfe.this);
                        }

                        @Override // j$.util.function.Consumer
                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer.CC.$default$andThen(this, consumer);
                        }
                    });
                }
                ((adul) jfgVar.c.get()).c(jfgVar);
                jfgVar.t.c();
                jgj jgjVar = jfgVar.d;
                boolean a = jgjVar.a();
                jgjVar.a = null;
                if (jgjVar.a() != a) {
                    jgjVar.c();
                }
                jfgVar.l = null;
                jfgVar.m = null;
                jfgVar.p = null;
                jfgVar.o = null;
                jfgVar.q = null;
                jfgVar.r = null;
                jfgVar.n = false;
            }
            jfpVar.a.m(jfpVar);
            jex jexVar = jfpVar.m;
            if (jexVar.f) {
                ((adul) jexVar.b.get()).c(jexVar);
                jexVar.d = null;
                jexVar.e = null;
                jexVar.f = false;
            }
            jfpVar.g(0.0f);
            jfpVar.p = false;
            jfpVar.j.c(Optional.empty());
        }
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mdx_next_gen_fiji_watch, viewGroup, false);
        final jfp jfpVar = this.a;
        jfpVar.l = this.b;
        if (!jfpVar.p) {
            inflate.getClass();
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.mdx_next_gen_fiji_minibar);
            viewGroup2.getClass();
            jfpVar.o = viewGroup2;
            jfpVar.m.c(viewGroup2);
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.mdx_next_gen_fiji_remote_queue);
            viewGroup3.getClass();
            MdxWatchDrawerLayout mdxWatchDrawerLayout = (MdxWatchDrawerLayout) inflate.findViewById(R.id.mdx_next_gen_fiji_drawer_layout);
            mdxWatchDrawerLayout.getClass();
            jfpVar.n = mdxWatchDrawerLayout;
            jfpVar.c.b(viewGroup3);
            jfpVar.a.g(jfpVar);
            jfpVar.a.g(jfpVar.c);
            jfpVar.b();
            ojb ojbVar = jfpVar.g.a;
            if (ojbVar != null) {
                nzc nzcVar = ((DefaultWatchPanelViewController) ojbVar).i;
                jfpVar.c(nzcVar instanceof nzl ? ((nzl) nzcVar).c() : -1);
            }
            jfpVar.b.i(jfpVar.q);
            viewGroup2.addOnLayoutChangeListener(jfpVar.r);
            mdxWatchDrawerLayout.a.add(jfpVar.s);
            mdxWatchDrawerLayout.b = jfpVar.e;
            mdxWatchDrawerLayout.j = jfpVar.l;
            ((nzc) jfpVar.i.get()).j(jfpVar);
            jfpVar.h.a(jfpVar);
            jfpVar.f.m(new gjd() { // from class: jfl
                @Override // defpackage.gjd
                public final void aJ(gjf gjfVar) {
                    MdxWatchDrawerLayout mdxWatchDrawerLayout2;
                    jfp jfpVar2 = jfp.this;
                    if (!jfpVar2.p || (mdxWatchDrawerLayout2 = jfpVar2.n) == null) {
                        return;
                    }
                    mdxWatchDrawerLayout2.c();
                }
            });
            jfpVar.d.b(jfpVar);
            jfpVar.p = true;
            jfpVar.j.c(Optional.of(mdxWatchDrawerLayout));
        }
        return inflate;
    }

    public final void o(int i) {
        this.b = i;
        jfp jfpVar = this.a;
        if (jfpVar != null) {
            jfpVar.l = i;
            MdxWatchDrawerLayout mdxWatchDrawerLayout = jfpVar.n;
            if (mdxWatchDrawerLayout != null) {
                mdxWatchDrawerLayout.j = i;
                if (mdxWatchDrawerLayout.getMeasuredHeight() == 0) {
                    return;
                }
                if (mdxWatchDrawerLayout.k) {
                    mdxWatchDrawerLayout.l = true;
                } else {
                    mdxWatchDrawerLayout.k();
                    mdxWatchDrawerLayout.requestLayout();
                }
            }
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jfg jfgVar = this.a.c;
    }
}
