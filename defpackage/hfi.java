package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hfi extends zys implements hlh {
    public heg a;
    private final Context b;
    private final View c;
    private final jqr d;

    public hfi(Context context, dd ddVar, jqr jqrVar, byte[] bArr) {
        super(context, ddVar, jqrVar.a, Optional.empty(), true, true, true);
        this.b = context;
        this.d = jqrVar;
        this.c = LayoutInflater.from(context).inflate(R.layout.shorts_segment_import_layout, (ViewGroup) null);
    }

    @Override // defpackage.zys
    protected final View a() {
        return this.c;
    }

    @Override // defpackage.zys
    protected final CharSequence c() {
        return this.b.getString(R.string.shorts_segment_import_bottom_sheet_title);
    }

    @Override // defpackage.zys, defpackage.zyz
    public final void e() {
        super.e();
        hli hliVar = (hli) y().f("nestedGalleryFragment");
        if (hliVar == null) {
            hliVar = hli.aH(true, null);
        }
        hliVar.d = this;
        dn k = y().k();
        k.u(R.id.nested_gallery_fragment, hliVar, "nestedGalleryFragment");
        k.a();
        this.d.b(acsb.b(121258)).b();
        hfq a = this.d.a(acsb.c(97092));
        a.h(true);
        a.a();
    }

    @Override // defpackage.hlh
    public final void g(DeviceLocalFile deviceLocalFile) {
        hei heiVar;
        z();
        heg hegVar = this.a;
        if (hegVar == null || (heiVar = hegVar.a.e) == null) {
            return;
        }
        ((hmc) heiVar).aJ(deviceLocalFile, 5);
    }

    @Override // defpackage.hlh
    public final void lU() {
    }

    @Override // defpackage.hlh
    public final void lV() {
        hei heiVar;
        heg hegVar = this.a;
        if (hegVar == null || (heiVar = hegVar.a.e) == null) {
            return;
        }
        heiVar.lV();
    }
}
