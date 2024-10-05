package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xog implements ajoq {
    final /* synthetic */ ajyw a;
    final /* synthetic */ xoh b;

    public xog(xoh xohVar, ajyw ajywVar) {
        this.b = xohVar;
        this.a = ajywVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return this.a.a(this.b.a(), (ViewGroup) whu.z(viewGroup, R.id.emoji_picker_stub, R.id.emoji_picker));
    }
}
