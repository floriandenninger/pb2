package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.permissions.PermissionDescriptor;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akao extends akaa implements View.OnClickListener {
    public akaq a;
    private PermissionDescriptor[] ae;
    private acsc af;
    private acsc ag;
    private acsc ah;
    private acsc ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private Button an;
    private TextView ao;
    private boolean ap;
    private asht aq;
    private int ar;
    public acsg b;
    public akai c;
    public Context d;
    private PermissionDescriptor[] e;

    private final View aI(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        Context context = this.d;
        if (context != null) {
            layoutInflater = layoutInflater.cloneInContext(context);
        }
        if (C().getResources().getConfiguration().orientation == 2) {
            if (C().getResources().getConfiguration().screenHeightDp >= 500) {
                inflate = layoutInflater.inflate(R.layout.permission_request_fragment_h500dp_land, viewGroup, false);
            } else {
                inflate = layoutInflater.inflate(R.layout.permission_request_fragment_land, viewGroup, false);
            }
        } else {
            inflate = layoutInflater.inflate(R.layout.permission_request_fragment, viewGroup, false);
        }
        ((Toolbar) inflate.findViewById(R.id.toolbar)).r(new View.OnClickListener() { // from class: akan
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akao.this.q();
            }
        });
        Button button = (Button) inflate.findViewById(R.id.permission_request_button);
        this.an = button;
        button.setOnClickListener(this);
        int i = this.al;
        if (i != 0) {
            this.an.setText(i);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.permission_description);
        this.ao = textView;
        textView.setText(this.aj);
        if (this.ar != 0) {
            ((TextView) inflate.findViewById(R.id.permission_title)).setText(this.ar);
        }
        if (this.c.j(C(), this.e)) {
            aK();
        } else {
            this.b.n(new acqx(this.ag));
            this.b.w(new acqx(this.ag), this.aq);
        }
        return inflate;
    }

    private final void aJ() {
        PermissionDescriptor permissionDescriptor;
        ci C = C();
        int i = 0;
        int i2 = 0;
        while (true) {
            PermissionDescriptor[] permissionDescriptorArr = this.e;
            if (i2 >= permissionDescriptorArr.length) {
                permissionDescriptor = null;
                break;
            } else {
                if (!akai.h(C, permissionDescriptorArr[i2].a)) {
                    permissionDescriptor = this.e[i2];
                    break;
                }
                i2++;
            }
        }
        if (permissionDescriptor == null) {
            while (true) {
                PermissionDescriptor[] permissionDescriptorArr2 = this.ae;
                if (i >= permissionDescriptorArr2.length) {
                    break;
                }
                if (!akai.h(C, permissionDescriptorArr2[i].a)) {
                    permissionDescriptor = this.ae[i];
                    break;
                }
                i++;
            }
        }
        if (permissionDescriptor == null) {
            akaq akaqVar = this.a;
            if (akaqVar != null) {
                akaqVar.aK();
                return;
            }
            return;
        }
        acsc acscVar = permissionDescriptor.b;
        if (acscVar != null) {
            this.b.n(new acqx(acscVar));
            this.b.w(new acqx(permissionDescriptor.b), this.aq);
        }
        acsc acscVar2 = permissionDescriptor.c;
        if (acscVar2 != null) {
            this.b.n(new acqx(acscVar2));
            this.b.w(new acqx(permissionDescriptor.c), this.aq);
        }
        String[] l = akai.l(permissionDescriptor.a);
        this.c.d(l);
        ac(l, permissionDescriptor.a);
    }

    private final void aK() {
        this.b.n(new acqx(this.ai));
        this.b.w(new acqx(this.ai), this.aq);
        this.ao.setText(this.ak);
        int i = this.am;
        if (i != 0) {
            this.an.setText(i);
        } else {
            this.an.setText(R.string.permission_open_settings_button);
        }
        this.ap = true;
    }

    @Override // defpackage.ce
    public final void Y(int i, String[] strArr, int[] iArr) {
        PermissionDescriptor permissionDescriptor;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            PermissionDescriptor[] permissionDescriptorArr = this.e;
            if (i3 >= permissionDescriptorArr.length) {
                int i4 = 0;
                while (true) {
                    PermissionDescriptor[] permissionDescriptorArr2 = this.ae;
                    if (i4 >= permissionDescriptorArr2.length) {
                        permissionDescriptor = null;
                        break;
                    }
                    permissionDescriptor = permissionDescriptorArr2[i4];
                    if (i == permissionDescriptor.a) {
                        break;
                    } else {
                        i4++;
                    }
                }
            } else {
                permissionDescriptor = permissionDescriptorArr[i3];
                if (i == permissionDescriptor.a) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        permissionDescriptor.getClass();
        if (akai.e(iArr)) {
            acsc acscVar = permissionDescriptor.b;
            if (acscVar != null) {
                this.b.I(3, new acqx(acscVar), this.aq);
            }
            aJ();
            return;
        }
        while (true) {
            PermissionDescriptor[] permissionDescriptorArr3 = this.e;
            if (i2 >= permissionDescriptorArr3.length) {
                acsc acscVar2 = permissionDescriptor.c;
                if (acscVar2 != null) {
                    this.b.I(3, new acqx(acscVar2), this.aq);
                }
                akaq akaqVar = this.a;
                if (akaqVar != null) {
                    akaqVar.aK();
                    return;
                }
                return;
            }
            if (i == permissionDescriptorArr3[i2].a) {
                acsc acscVar3 = permissionDescriptor.c;
                if (acscVar3 != null) {
                    this.b.I(3, new acqx(acscVar3), this.aq);
                }
                if (this.ap || !this.c.j(C(), this.e)) {
                    return;
                }
                aK();
                return;
            }
            i2++;
        }
    }

    @Override // defpackage.ce
    public final void Z() {
        akaq akaqVar;
        super.Z();
        if (!this.ap || akai.f(C(), this.e) || (akaqVar = this.a) == null) {
            return;
        }
        akaqVar.aK();
    }

    @Override // defpackage.akar
    public final void aF(asht ashtVar) {
        this.aq = ashtVar;
    }

    @Override // defpackage.akar
    public final void aG(akaq akaqVar) {
        this.a = akaqVar;
    }

    @Override // defpackage.akar
    public final void aH(Context context) {
        this.d = context;
    }

    @Override // defpackage.acri
    protected final apxf kx() {
        return null;
    }

    @Override // defpackage.acri
    protected final asht ky() {
        return this.aq;
    }

    @Override // defpackage.acri
    protected final acra mM() {
        return this.b;
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        Parcelable[] parcelableArray = bundle2.getParcelableArray("REQUIRED_PERMISSIONS");
        this.e = new PermissionDescriptor[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            this.e[i] = (PermissionDescriptor) parcelableArray[i];
        }
        Parcelable[] parcelableArray2 = bundle2.getParcelableArray("OPTIONAL_PERMISSIONS");
        this.ae = new PermissionDescriptor[parcelableArray2.length];
        for (int i2 = 0; i2 < parcelableArray2.length; i2++) {
            this.ae[i2] = (PermissionDescriptor) parcelableArray2[i2];
        }
        this.af = acsb.b(bundle2.getInt("PAGE_VE_TYPE"));
        this.ag = acsb.c(bundle2.getInt("ALLOW_ACCESS_BUTTON_VE_TYPE"));
        this.ah = acsb.c(bundle2.getInt("CANCEL_BUTTON_VE_TYPE"));
        this.ai = acsb.c(bundle2.getInt("OPEN_APP_SETTING_BUTTON_VE_TYPE"));
        this.aj = bundle2.getInt("ALLOW_ACCESS_DESCRIPTION_RES_ID");
        this.ak = bundle2.getInt("OPEN_SETTING_DESCRIPTION_RES_ID");
        this.ar = bundle2.getInt("TITLE_RES_ID_KEY");
        this.al = bundle2.getInt("ALLOW_ACCESS_BUTTON_RES_ID_KEY");
        this.am = bundle2.getInt("OPEN_SETTING_BUTTON_RES_ID_KEY");
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        this.b.n(new acqx(this.ah));
        this.b.w(new acqx(this.ah), this.aq);
        return aI(viewGroup, layoutInflater);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.ap) {
            acsc acscVar = this.ai;
            if (acscVar != null) {
                this.b.I(3, new acqx(acscVar), this.aq);
            }
            akai.c(C());
            return;
        }
        acsc acscVar2 = this.ag;
        if (acscVar2 != null) {
            this.b.I(3, new acqx(acscVar2), this.aq);
        }
        aJ();
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ci C = C();
        View view = this.O;
        if (C == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        View aI = aI(viewGroup, (LayoutInflater) C.getSystemService("layout_inflater"));
        viewGroup.removeAllViews();
        viewGroup.addView(aI);
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return this.af;
    }

    @Override // defpackage.akar
    public final void q() {
        acsc acscVar = this.ah;
        if (acscVar != null) {
            this.b.I(3, new acqx(acscVar), this.aq);
        }
        akaq akaqVar = this.a;
        if (akaqVar != null) {
            akaqVar.aJ();
        }
    }
}
