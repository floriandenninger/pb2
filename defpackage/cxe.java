package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxe implements cqq {
    private final ctm a;
    private final cqq b;

    public cxe(ctm ctmVar, cqq cqqVar) {
        this.a = ctmVar;
        this.b = cqqVar;
    }

    @Override // defpackage.cpx
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, cqn cqnVar) {
        return this.b.a(new cxg(((BitmapDrawable) ((ctd) obj).c()).getBitmap(), this.a), file, cqnVar);
    }

    @Override // defpackage.cqq
    public final int b() {
        return 2;
    }
}
