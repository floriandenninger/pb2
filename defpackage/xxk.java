package defpackage;

import android.view.View;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xxk implements View.OnClickListener {
    final /* synthetic */ apxf a;
    final /* synthetic */ xxp b;
    private final /* synthetic */ int c;

    public xxk(xxp xxpVar, apxf apxfVar, int i) {
        this.c = i;
        this.b = xxpVar;
        this.a = apxfVar;
    }

    public /* synthetic */ xxk(xxp xxpVar, apxf apxfVar, int i, byte[] bArr) {
        this.c = i;
        this.b = xxpVar;
        this.a = apxfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c != 0) {
            xxp xxpVar = this.b;
            apxf apxfVar = this.a;
            xxpVar.aM = true;
            xxpVar.af.a(apxfVar);
            return;
        }
        xxo xxoVar = new xxo(this.b);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", xxoVar);
        this.b.aM = true;
        this.b.af.c(this.a, hashMap);
    }
}
