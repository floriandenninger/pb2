package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mox extends ajpc {
    private final Context a;
    private final ajjz b;
    private final aahd c;
    private final ajuw d;
    private final ajoi e;
    private final ajut f;
    private final ajop g;
    private final FrameLayout h;
    private mow i;
    private mow j;

    public mox(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        context.getClass();
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        aahdVar.getClass();
        this.c = aahdVar;
        this.g = gmaVar;
        ajuwVar.getClass();
        this.d = ajuwVar;
        this.f = ajutVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        gmaVar.c(frameLayout);
        this.e = new ajoi(aahdVar, gmaVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.g).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ void d(defpackage.ajok r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mox.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arcx) obj).l.I();
    }

    final mow f(int i) {
        return new mow(this.a, this.b, this.c, this.d, i, this.g, this.f);
    }
}
