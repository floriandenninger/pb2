package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class jfg implements adue {
    protected final Context b;
    protected final azrw c;
    protected final jgj d;
    protected final oix e;
    protected final azrw f;
    protected final ajuw g;
    protected final jgp h;
    protected final boolean i;
    protected final aioc j;
    protected ViewGroup k;
    protected TextView l;
    protected ImageView m;
    protected boolean n;
    protected LoadingFrameLayout o;
    protected View p;
    protected jgo q;
    protected jfe r;
    protected adub s;
    protected final ayqw t = new ayqw();
    protected final ajoy u;

    /* JADX INFO: Access modifiers changed from: protected */
    public jfg(Context context, azrw azrwVar, jgj jgjVar, oix oixVar, azrw azrwVar2, ajuw ajuwVar, jgp jgpVar, ajoy ajoyVar, acun acunVar, aioc aiocVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = context;
        this.c = azrwVar;
        this.d = jgjVar;
        this.e = oixVar;
        this.f = azrwVar2;
        this.g = ajuwVar;
        this.h = jgpVar;
        this.i = acunVar.i;
        this.u = ajoyVar;
        this.j = aiocVar;
    }

    public void b(ViewGroup viewGroup) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.e.a();
        this.l.setText(R.string.mdx_remote_queue_status_no_videos);
        this.g.h();
        this.p.setVisibility(0);
        this.k.setVisibility(8);
        this.o.setVisibility(8);
        this.m.setVisibility(8);
    }
}
