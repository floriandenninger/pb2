package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abjh implements ajoq {
    final /* synthetic */ ajyw a;
    final /* synthetic */ acrt b;

    public abjh(ajyw ajywVar, acrt acrtVar) {
        this.a = ajywVar;
        this.b = acrtVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return this.a.a(this.b, (ViewGroup) whu.z(viewGroup, R.id.emoji_picker_stub, R.id.emoji_picker));
    }
}
