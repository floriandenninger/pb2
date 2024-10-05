package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msc extends ajpc {
    msb a;
    private final Context b;
    private final gma c;
    private final aahd d;
    private final ajjz e;
    private final ajuw f;
    private final FrameLayout g;
    private final ajut h;
    private msb i;
    private msb j;

    public msc(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        this.b = context;
        this.c = gmaVar;
        this.e = ajjzVar;
        this.d = aahdVar;
        this.f = ajuwVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        this.h = ajutVar;
        gmaVar.c(frameLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        msb msbVar = this.a;
        if (msbVar != null) {
            msbVar.b(ajosVar);
        }
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aubz aubzVar = (aubz) obj;
        this.g.removeAllViews();
        if (this.b.getResources().getConfiguration().orientation == 2) {
            if (this.i == null) {
                this.i = f(R.layout.landscape_playlist_item);
            }
            this.a = this.i;
        } else {
            if (this.j == null) {
                this.j = f(R.layout.playlist_item);
            }
            this.a = this.j;
        }
        this.g.addView(this.a.c);
        this.a.oB(ajokVar, aubzVar);
        msb msbVar = this.a;
        View view = this.c.b;
        atdf atdfVar = aubzVar.l;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        msbVar.f(view, atdfVar, aubzVar, ajokVar.a);
        this.c.e(ajokVar);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aubz) obj).m.I();
    }

    final msb f(int i) {
        return new msb(this.b, this.e, i, this.c, this.d, this.f, this.h);
    }
}
