package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mov extends ajpc {
    private final Context a;
    private final ajjz b;
    private final aahd c;
    private final ajop d;
    private final ajuw e;
    private final ajut f;
    private final FrameLayout g;
    private mou h;
    private mou i;
    private final ajoy j;

    public mov(Context context, ajjz ajjzVar, aahd aahdVar, gma gmaVar, ajuw ajuwVar, ajut ajutVar, ajoy ajoyVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        context.getClass();
        this.a = context;
        ajjzVar.getClass();
        this.b = ajjzVar;
        aahdVar.getClass();
        this.c = aahdVar;
        this.d = gmaVar;
        ajuwVar.getClass();
        this.e = ajuwVar;
        this.f = ajutVar;
        this.j = ajoyVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        gmaVar.c(frameLayout);
        gmaVar.b(true);
    }

    private final mou f(int i) {
        return new mou(this.a, this.b, this.c, this.e, i, this.d, this.f, this.j, null, null, null, null);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.d).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        mou mouVar = this.i;
        if (mouVar != null) {
            mouVar.b(ajosVar);
        }
        mou mouVar2 = this.h;
        if (mouVar2 != null) {
            mouVar2.b(ajosVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r0 != 9) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151 A[EDGE_INSN: B:72:0x0151->B:73:0x0151 BREAK  A[LOOP:0: B:62:0x012d->B:71:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a7  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ void d(defpackage.ajok r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mov.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((arct) obj).m.I();
    }
}
