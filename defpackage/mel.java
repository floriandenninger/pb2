package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class mel implements wmz {
    protected final Context a;
    protected final aahd b;
    public final acra c;
    public xbw d;
    public final aabq e;
    protected auta f;
    protected boolean g;
    public boolean h;
    private final met i;
    private final ajjz j;
    private final ajuw k;
    private View l;
    private final ArrayList m = new ArrayList(5);
    private mek n;
    private mek o;

    /* JADX INFO: Access modifiers changed from: protected */
    public mel(ajjz ajjzVar, ajuw ajuwVar, aahd aahdVar, acra acraVar, Context context, aabq aabqVar, met metVar) {
        this.j = ajjzVar;
        this.k = ajuwVar;
        this.b = aahdVar;
        this.c = acraVar;
        this.a = context;
        this.e = aabqVar;
        this.i = metVar;
    }

    private final void b() {
        View view;
        if (!this.g || this.f == null || (view = this.l) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // defpackage.wmz
    public final void a() {
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x018c, code lost:
    
        if (r9 <= 2) goto L70;
     */
    @Override // defpackage.wmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r14, defpackage.ajok r15) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mel.d(android.view.View, ajok):void");
    }

    @Override // defpackage.wmz
    public final void e(View view) {
        Object obj;
        if (view != null) {
            whu.z(view, R.id.shopping_companion_card_stub, R.id.shopping_companion_card).setVisibility(8);
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.setVisibility(8);
            ((ViewGroup) this.l.findViewById(R.id.product_container)).removeAllViews();
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mej mejVar = (mej) arrayList.get(i);
                mejVar.b.setVisibility(8);
                mejVar.d.setVisibility(8);
                mejVar.c.setVisibility(8);
            }
            auta autaVar = this.f;
            if (autaVar != null && (autaVar.b & 8192) != 0) {
                met metVar = this.i;
                aulq aulqVar = autaVar.n;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                    aulq aulqVar2 = this.f.n;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    obj = aulqVar2.pX(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                } else {
                    obj = null;
                }
                metVar.b(obj);
            }
        }
        xbw xbwVar = this.d;
        if (xbwVar != null) {
            xbwVar.c();
        }
        this.l = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.wmz
    public final void f() {
        this.g = true;
        b();
    }
}
