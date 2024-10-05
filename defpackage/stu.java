package defpackage;

import com.google.android.libraries.elements.interfaces.JSFutureHandler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stu extends JSFutureHandler {
    public ayue a;

    public stu(ayue ayueVar) {
        this.a = ayueVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFutureHandler
    public final void onError(String str) {
        ayue ayueVar = this.a;
        if (ayueVar == null) {
            return;
        }
        ayueVar.c(new syf(str));
    }

    @Override // com.google.android.libraries.elements.interfaces.JSFutureHandler
    public final void onSuccess() {
        ayue ayueVar = this.a;
        if (ayueVar == null) {
            return;
        }
        ayueVar.a();
    }
}
