package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgm extends achd implements zwg, acgh, yq {
    public acgl a;
    private MenuItem ae;
    public acra b;
    public zwh c;
    public File d;
    private acgi e;

    private final void aI() {
        acgi acgiVar = this.e;
        acgiVar.getClass();
        acgiVar.a = this;
        aJ(acgiVar);
        this.ae.setEnabled(true);
        this.ae.setVisible(true);
    }

    private final void aJ(ce ceVar) {
        ceVar.getClass();
        dn k = mN().k();
        k.y(R.id.edit_thumbnail_fragment_container, ceVar);
        k.a();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        acfm.a(C());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: IOException -> 0x010d, TryCatch #0 {IOException -> 0x010d, blocks: (B:8:0x000f, B:11:0x001a, B:13:0x0035, B:16:0x0042, B:18:0x0046, B:21:0x0055, B:23:0x005d, B:27:0x006a, B:28:0x0082, B:30:0x00b0, B:31:0x00d1, B:33:0x00d5, B:34:0x00f4, B:36:0x00d9, B:38:0x00e7, B:39:0x00b4, B:41:0x00c2, B:43:0x006e), top: B:7:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5 A[Catch: IOException -> 0x010d, TryCatch #0 {IOException -> 0x010d, blocks: (B:8:0x000f, B:11:0x001a, B:13:0x0035, B:16:0x0042, B:18:0x0046, B:21:0x0055, B:23:0x005d, B:27:0x006a, B:28:0x0082, B:30:0x00b0, B:31:0x00d1, B:33:0x00d5, B:34:0x00f4, B:36:0x00d9, B:38:0x00e7, B:39:0x00b4, B:41:0x00c2, B:43:0x006e), top: B:7:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[Catch: IOException -> 0x010d, TryCatch #0 {IOException -> 0x010d, blocks: (B:8:0x000f, B:11:0x001a, B:13:0x0035, B:16:0x0042, B:18:0x0046, B:21:0x0055, B:23:0x005d, B:27:0x006a, B:28:0x0082, B:30:0x00b0, B:31:0x00d1, B:33:0x00d5, B:34:0x00f4, B:36:0x00d9, B:38:0x00e7, B:39:0x00b4, B:41:0x00c2, B:43:0x006e), top: B:7:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: IOException -> 0x010d, TryCatch #0 {IOException -> 0x010d, blocks: (B:8:0x000f, B:11:0x001a, B:13:0x0035, B:16:0x0042, B:18:0x0046, B:21:0x0055, B:23:0x005d, B:27:0x006a, B:28:0x0082, B:30:0x00b0, B:31:0x00d1, B:33:0x00d5, B:34:0x00f4, B:36:0x00d9, B:38:0x00e7, B:39:0x00b4, B:41:0x00c2, B:43:0x006e), top: B:7:0x000f }] */
    @Override // defpackage.yq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MenuItem r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acgm.a(android.view.MenuItem):boolean");
    }

    public final void aF() {
        if (this.c == null) {
            this.c = zwh.o(1);
        }
        this.c.ae = this;
        q();
        aJ(this.c);
        this.ae.setEnabled(false);
        this.ae.setVisible(false);
    }

    @Override // defpackage.zwg
    public final void aL(DeviceLocalFile deviceLocalFile) {
        Uri f = deviceLocalFile.f();
        acgi acgiVar = new acgi();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_INPUT_IMAGE", f);
        acgiVar.af(bundle);
        this.e = acgiVar;
        aI();
    }

    @Override // defpackage.acri
    protected final apxf kx() {
        return null;
    }

    @Override // defpackage.acri
    protected final acra mM() {
        return this.b;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putSerializable("STATE_PREEXISTING_THUMBNAIL_FILE", this.d);
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lc_edit_thumbnail_fragment, viewGroup, false);
        super.mg(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            this.d = (File) bundle.getSerializable("STATE_PREEXISTING_THUMBNAIL_FILE");
        }
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.lc_crop_toolbar);
        toolbar.l(R.menu.lc_crop_toolbar_menu);
        toolbar.q = this;
        toolbar.r(new View.OnClickListener() { // from class: acgk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acgm.this.n();
            }
        });
        this.ae = toolbar.g().findItem(R.id.lc_crop_save_button);
        if (mN().l().isEmpty()) {
            aF();
        } else {
            ce ceVar = (ce) amkq.bk(mN().l());
            if (ceVar instanceof zwh) {
                this.c = (zwh) ceVar;
                aF();
            } else if (ceVar instanceof acgi) {
                this.e = (acgi) ceVar;
                aI();
            }
        }
        return inflate;
    }

    public final void n() {
        acgi acgiVar = this.e;
        if (acgiVar == null || !acgiVar.av()) {
            acgl acglVar = this.a;
            if (acglVar != null) {
                acglVar.z();
                return;
            }
            return;
        }
        aF();
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return acsb.b(28236);
    }

    public final void q() {
        this.c.getClass();
        File file = this.d;
        DeviceLocalFile deviceLocalFile = null;
        if (file != null && file.exists()) {
            zoi i = DeviceLocalFile.i();
            i.d(2);
            i.b(O(R.string.lc_crop_image_preexisting_thumbnail_cd));
            i.a = this.d.getParent();
            i.h(Uri.fromFile(this.d));
            i.g(this.d.length());
            i.c(0L);
            i.f(Long.MAX_VALUE);
            deviceLocalFile = i.a();
        }
        zwh zwhVar = this.c;
        zwhVar.ai = deviceLocalFile;
        if (zwhVar.e != null) {
            zwhVar.p();
        }
    }
}
