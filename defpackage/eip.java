package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eip extends ajpc {
    public apxf a;
    private final View b;

    public eip(Context context, aahd aahdVar) {
        View inflate = View.inflate(context, R.layout.sign_in_promo, null);
        this.b = inflate;
        inflate.setOnClickListener(new eio(this, aahdVar));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar = ((auup) obj).b;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        this.a = apxfVar;
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auup) obj).c.I();
    }
}
