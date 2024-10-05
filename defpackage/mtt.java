package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtt extends ajpc {
    public final aahd a;
    private final ajut b;
    private final gma c;
    private final ajjz d;
    private final Context e;
    private final FrameLayout f;
    private ajpc g;
    private ajpc h;
    private ajpc i;

    public mtt(Context context, ajut ajutVar, aahd aahdVar, gma gmaVar, ajjz ajjzVar) {
        this.e = context;
        this.b = ajutVar;
        this.a = aahdVar;
        this.c = gmaVar;
        this.d = ajjzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        gmaVar.c(frameLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        ajpc ajpcVar = this.g;
        if (ajpcVar != null) {
            ajpcVar.b(ajosVar);
        }
        this.f.setOnClickListener(null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer = (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj;
        this.f.removeAllViews();
        if ((reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.b & 8) != 0) {
            if (this.h == null) {
                this.h = new mts(this.e, this.d, this.b);
            }
            this.g = this.h;
        } else {
            if (this.i == null) {
                this.i = new mtm(this.e, this.d, this.b);
            }
            this.g = this.i;
        }
        yny.B(this.f, -2, -2);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: mtk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mtt mttVar = mtt.this;
                ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer2 = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
                aahd aahdVar = mttVar.a;
                apxf apxfVar = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer2.c;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
        });
        this.f.addView(this.g.a());
        this.g.oB(ajokVar, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) obj).h.I();
    }
}
