package defpackage;

import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zr implements Runnable {
    final /* synthetic */ zv a;

    public zr(zv zvVar) {
        this.a = zvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*er*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}
