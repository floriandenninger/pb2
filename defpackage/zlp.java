package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zlp implements aab {
    final /* synthetic */ zlq a;

    public zlp(zlq zlqVar) {
        this.a = zlqVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        zlq zlqVar = this.a;
        if (zlqVar.m) {
            return;
        }
        zlqVar.m = true;
        Object lM = zlqVar.lM();
        AudioSelectionActivity audioSelectionActivity = (AudioSelectionActivity) zlqVar;
        eed eedVar = (eed) lM;
        audioSelectionActivity.h = eedVar.a.cO();
        audioSelectionActivity.i = (aaue) eedVar.a.ka.get();
        audioSelectionActivity.j = (aahd) eedVar.I.get();
    }
}
