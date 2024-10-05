package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nil implements ykl {
    final /* synthetic */ nin a;

    public nil(nin ninVar) {
        this.a = ninVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final ga a = gl.a(this.a.b.getResources(), (Bitmap) obj2);
        a.c();
        this.a.b.runOnUiThread(new Runnable() { // from class: nik
            @Override // java.lang.Runnable
            public final void run() {
                nil nilVar = nil.this;
                nilVar.a.a.setImageDrawable(a);
            }
        });
    }
}
