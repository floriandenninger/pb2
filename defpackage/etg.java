package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etg extends ajpc {
    private final ftw a;
    private final View b;

    public etg(Context context, fvf fvfVar, byte[] bArr, byte[] bArr2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.toggle_button, (ViewGroup) null);
        this.b = inflate;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.channel_list_toggle_button_padding);
        inflate.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.a = fvfVar.c(inflate);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a.b(null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        this.a.b((apmp) obj);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apmp) obj).v.I();
    }
}
