package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.gallery.MediaGridRecyclerView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hli extends hld {
    public Executor a;
    View ae;
    MediaGridRecyclerView af;
    public hrv ag;
    public acra ah;
    public hrq ai;
    private String aj = null;
    private boolean ak;
    private int al;
    private boolean am;
    private int an;
    private boolean ao;
    private jqr ap;
    public Context b;
    zwo c;
    public hlh d;
    View e;

    public static hli aG(boolean z, int i, boolean z2, int i2, apxf apxfVar) {
        hli hliVar = new hli();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_DIRECTORY_PATH", null);
        bundle.putBoolean("ARG_BOTTOM_SHEET_MODE", z);
        bundle.putInt("ARG_TITLE_RESOURCE", i);
        bundle.putInt("ARG_FILE_TYPE", i2);
        bundle.putBoolean("ARG_HIDE_HEADER", z2);
        if (apxfVar != null) {
            bundle.putByteArray("navigation_endpoint", apxfVar.toByteArray());
        }
        hliVar.af(bundle);
        return hliVar;
    }

    public static hli aH(boolean z, apxf apxfVar) {
        return aG(z, R.string.shorts_gallery_upload, z, 0, apxfVar);
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        zwo.y(this.af);
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.c.getClass();
        zoj zojVar = new zoj(C());
        List q = amru.q();
        if (aF()) {
            q = zojVar.c(this.an);
        }
        if (TextUtils.isEmpty(this.aj)) {
            this.c.z(q);
        } else {
            this.c.z((List) zojVar.d(this.an).get(this.aj));
        }
        this.e.setVisibility(8);
        this.ae.setVisibility(8);
        if (!aF()) {
            this.ae.setVisibility(0);
            hfq a = this.ap.a(acsb.c(99787));
            a.h(true);
            a.a();
            return;
        }
        if (q == null || q.isEmpty()) {
            this.e.setVisibility(0);
        }
    }

    final boolean aF() {
        return zxo.e(C(), 0);
    }

    @Override // defpackage.acri
    protected final asht ky() {
        asht ashtVar = asht.a;
        if (!this.ao) {
            return ashtVar;
        }
        if (this.ai.e != null) {
            aone createBuilder = asht.a.createBuilder();
            aone createBuilder2 = asil.a.createBuilder();
            aone createBuilder3 = asij.a.createBuilder();
            String str = this.ai.e;
            str.getClass();
            createBuilder3.copyOnWrite();
            asij asijVar = (asij) createBuilder3.instance;
            asijVar.b = 1 | asijVar.b;
            asijVar.c = str;
            asij asijVar2 = (asij) createBuilder3.build();
            createBuilder2.copyOnWrite();
            asil asilVar = (asil) createBuilder2.instance;
            asijVar2.getClass();
            asilVar.g = asijVar2;
            asilVar.b |= 32;
            asil asilVar2 = (asil) createBuilder2.build();
            createBuilder.copyOnWrite();
            asht ashtVar2 = (asht) createBuilder.instance;
            asilVar2.getClass();
            ashtVar2.B = asilVar2;
            ashtVar2.c |= 262144;
            return (asht) createBuilder.build();
        }
        afsi.b(1, 12, "[ShortsCreation][Android][Gallery]Frontend id not available for logging");
        return ashtVar;
    }

    @Override // defpackage.acri
    public final acra mM() {
        return this.ah;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        bundle.putParcelable("layout_manager_state", this.af.n.P());
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        this.aj = bundle2.getString("ARG_DIRECTORY_PATH");
        this.ak = bundle2.getBoolean("ARG_BOTTOM_SHEET_MODE");
        this.al = bundle2.getInt("ARG_TITLE_RESOURCE");
        this.am = bundle2.getBoolean("ARG_HIDE_HEADER");
        this.an = bundle2.getInt("ARG_FILE_TYPE");
        this.ap = new jqr(this.ah);
        this.ao = this.ag.h();
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        final int i = 0;
        View inflate = layoutInflater.cloneInContext(this.b).inflate(R.layout.shorts_gallery_fragment, viewGroup, false);
        ci C = C();
        if (this.am) {
            inflate.findViewById(R.id.gallery_header).setVisibility(8);
        }
        ((TextView) inflate.findViewById(R.id.bottom_sheet_title)).setText(this.b.getResources().getString(this.al));
        this.e = inflate.findViewById(R.id.zero_state_container);
        this.ae = inflate.findViewById(R.id.permissions_required_container);
        this.af = (MediaGridRecyclerView) inflate.findViewById(R.id.media_grid_recycler_view);
        final int i2 = 1;
        inflate.findViewById(R.id.allow_access_button).setOnClickListener(new View.OnClickListener(this) { // from class: hle
            public final /* synthetic */ hli a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i2 != 0) {
                    hlh hlhVar = this.a.d;
                    if (hlhVar != null) {
                        hlhVar.lV();
                        return;
                    }
                    return;
                }
                hlh hlhVar2 = this.a.d;
                if (hlhVar2 != null) {
                    hlhVar2.lU();
                }
            }
        });
        inflate.findViewById(R.id.close_button).setOnClickListener(new View.OnClickListener(this) { // from class: hle
            public final /* synthetic */ hli a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i != 0) {
                    hlh hlhVar = this.a.d;
                    if (hlhVar != null) {
                        hlhVar.lV();
                        return;
                    }
                    return;
                }
                hlh hlhVar2 = this.a.d;
                if (hlhVar2 != null) {
                    hlhVar2.lU();
                }
            }
        });
        this.af.setFocusableInTouchMode(false);
        Parcelable parcelable = bundle != null ? bundle.getParcelable("layout_manager_state") : null;
        zwo zwoVar = new zwo(C, this.a, 0);
        this.c = zwoVar;
        zwoVar.e = this.ak;
        zwoVar.u(new hlf(this));
        this.af.ac(this.c);
        if (parcelable != null) {
            this.af.n.Y(parcelable);
        }
        this.af.aB(new hlj(this.b));
        this.c.d = new hlg(this);
        hfq a = this.ap.a(acsb.c(96638));
        a.h(true);
        a.a();
        this.ap.a(acsb.c(22156)).a();
        zwo zwoVar2 = this.c;
        if (zwoVar2 != null && !zwoVar2.B()) {
            q();
        }
        hrq hrqVar = this.ai;
        String str = hrqVar.e;
        if (str != null && hrqVar.f) {
            hrqVar.d.y(str, avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_GALLERY);
        }
        return inflate;
    }

    @Override // defpackage.acri
    protected final acsc p() {
        if (this.ak) {
            return null;
        }
        return acsb.b(96660);
    }

    public final void q() {
        hfq a = this.ap.a(acsb.c(97092));
        a.h(true);
        a.a();
    }
}
