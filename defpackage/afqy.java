package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqy extends yvo {
    final /* synthetic */ ykl a;
    final /* synthetic */ Uri b;
    final /* synthetic */ afqz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqy(afqz afqzVar, String str, cnk cnkVar, ykl yklVar, Uri uri) {
        super(1, str, cnkVar);
        this.c = afqzVar;
        this.a = yklVar;
        this.b = uri;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        try {
            return cnm.b(this.c.a.b(cnhVar), ach.k(cnhVar));
        } catch (IOException | zjg e) {
            return cnm.a(new cnq(e));
        }
    }

    @Override // defpackage.yvo
    public final void ql(Object obj) {
        this.a.b(this.b, obj);
    }
}
