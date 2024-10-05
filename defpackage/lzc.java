package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lzc implements View.OnClickListener {
    final /* synthetic */ apxf a;
    final /* synthetic */ lzd b;

    public lzc(lzd lzdVar, apxf apxfVar) {
        this.b = lzdVar;
        this.a = apxfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("parent_csn", this.b.b);
        hashMap.put("parent_ve_type", Integer.valueOf(this.b.c));
        this.b.a.c(this.a, hashMap);
    }
}
