package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpf implements ykl {
    final /* synthetic */ afph a;

    public afpf(afph afphVar) {
        this.a = afphVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.a.b.post(new Runnable() { // from class: afpd
            @Override // java.lang.Runnable
            public final void run() {
                afpf afpfVar = afpf.this;
                afph afphVar = afpfVar.a;
                afphVar.b.setImageDrawable(new ColorDrawable(wbs.W(afphVar.a, R.attr.ytIcon1).orElse(0)));
                afpfVar.a.b.invalidate();
            }
        });
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj2;
        this.a.b.post(new Runnable() { // from class: afpe
            @Override // java.lang.Runnable
            public final void run() {
                afpf afpfVar = afpf.this;
                afpfVar.a.b.setImageBitmap(bitmap);
                afpfVar.a.b.invalidate();
            }
        });
    }
}
