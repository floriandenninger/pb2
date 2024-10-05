package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mur extends mkp {
    public final aahv b;
    public auvo c;
    public auvo d;
    public ayqx e;
    public acra f;
    public ajok g;

    public mur(ajut ajutVar, akbu akbuVar, Context context, akpq akpqVar, aahv aahvVar, ViewGroup viewGroup, byte[] bArr) {
        super(ajutVar, akbuVar, context, akpqVar, viewGroup, R.layout.slim_metadata_button, R.attr.ytTextPrimary, null);
        this.b = aahvVar;
    }

    @Override // defpackage.mkp, defpackage.muz
    public final void b() {
        super.b();
        this.c = null;
        this.d = null;
        this.g = null;
        this.f = null;
        Object obj = this.e;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.e = null;
        }
    }

    public final void d(boolean z) {
        auvo auvoVar;
        if (!z || (auvoVar = this.c) == null) {
            auvoVar = this.d;
        }
        if (auvoVar == null) {
            zga.b("SlimMetadataAccountLinkButtonController does not have a button to show.");
        } else {
            super.c(auvoVar, this.f, this.g);
        }
    }
}
