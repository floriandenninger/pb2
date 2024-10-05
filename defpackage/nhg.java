package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nhg implements ajom {
    public final Context a;
    public final Resources b;
    public final ajjz c;
    public final ajuw d;
    public final aahd e;
    fyl f;
    public auia g;
    private final nbp h;
    private final FrameLayout i;
    private nhf j;
    private nhf k;
    private nhf l;
    private final aadw m;
    private int n;

    public nhg(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, tdv tdvVar, aadw aadwVar, euv euvVar) {
        this.a = context;
        this.b = context.getResources();
        ajjzVar.getClass();
        this.c = ajjzVar;
        this.d = ajuwVar;
        aahdVar.getClass();
        this.e = aahdVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        this.m = aadwVar;
        this.h = new nbp(aahdVar, tdvVar, euvVar, frameLayout);
    }

    public static final void d(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.h.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x007d, code lost:
    
        if (r0 != r3) goto L26;
     */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhg.oB(ajok, java.lang.Object):void");
    }
}
