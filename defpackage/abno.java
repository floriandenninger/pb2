package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abno extends ic {
    final /* synthetic */ apxf b;
    final /* synthetic */ Map c;
    final /* synthetic */ abns d;

    public abno(abns abnsVar, apxf apxfVar, Map map) {
        this.d = abnsVar;
        this.b = apxfVar;
        this.c = map;
    }

    @Override // defpackage.ic
    public final boolean j(View view, int i, Bundle bundle) {
        if (i == 16) {
            this.d.c.c(this.b, this.c);
            return true;
        }
        return super.j(view, i, bundle);
    }
}
