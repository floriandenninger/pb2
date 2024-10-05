package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ker {
    public final azrw a;
    public kem b;
    private final Activity c;

    public ker(Activity activity, azrw azrwVar) {
        this.c = activity;
        this.a = azrwVar;
    }

    public final void a() {
        final aabq aabqVar = (aabq) this.a.get();
        aabqVar.getClass();
        kem kemVar = new kem("", new kel() { // from class: kep
            @Override // defpackage.kel
            public final void a() {
                aabq.this.g();
            }
        });
        this.b = kemVar;
        kemVar.g(false);
        this.b.e = aii.a(this.c, R.drawable.quantum_ic_info_outline_grey600_24);
    }
}
