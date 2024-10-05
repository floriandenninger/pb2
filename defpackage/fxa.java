package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fxa implements ydl {
    final /* synthetic */ fxb a;

    public fxa(fxb fxbVar) {
        this.a = fxbVar;
    }

    @Override // defpackage.ydl
    public final void a() {
        this.a.e("transactionStarted");
    }

    @Override // defpackage.ydl
    public final void b() {
        this.a.e("transactionCanceled");
    }

    @Override // defpackage.ydl
    public final void c(CharSequence charSequence) {
        this.a.e("transactionError");
    }

    @Override // defpackage.ydl
    public final void e(asfw asfwVar) {
        this.a.e("transactionCompleted");
        fxb fxbVar = this.a;
        fwz fwzVar = fxbVar.d;
        if (fwzVar != null) {
            fxbVar.e.add(fwzVar.b);
        }
        fxbVar.d = null;
        this.a.d();
    }

    @Override // defpackage.ydl
    public final void f() {
        this.a.e("transactionError");
    }

    @Override // defpackage.ydl
    public final void d(abeh abehVar) {
        ScreenId screenId;
        fwz fwzVar = this.a.d;
        if (fwzVar == null || (screenId = fwzVar.a) == null) {
            zga.c("RemoteTransactionController", "onTransactionReady: no valid screenID");
            return;
        }
        String str = screenId.c;
        if (str.length() != 0) {
            "setting the screenID back to CompleteTxnRequest to: ".concat(str);
        }
        abehVar.x = this.a.d.a.c;
    }
}
