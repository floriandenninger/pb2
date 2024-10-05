package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bv extends ce implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler WM;
    private boolean WQ;
    private boolean WR;
    private boolean am;
    private boolean an;
    public Dialog d;
    private final Runnable WN = new bq(this);
    private final DialogInterface.OnCancelListener WO = new br(this);
    public final DialogInterface.OnDismissListener a = new bs(this);
    private int WP = 0;
    public int b = 0;
    private boolean ai = true;
    public boolean c = true;
    private int WJ = -1;
    private final aox WS = new bt(this);
    public boolean e = false;

    private final void os(boolean z, boolean z2) {
        if (this.an) {
            return;
        }
        this.an = true;
        this.WQ = false;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.WM.getLooper()) {
                    onDismiss(this.d);
                } else {
                    this.WM.post(this.WN);
                }
            }
        }
        this.am = true;
        if (this.WJ >= 0) {
            mO().ad(this.WJ, z);
            this.WJ = -1;
            return;
        }
        dn k = mO().k();
        k.m(this);
        if (z) {
            k.k();
        } else {
            k.a();
        }
    }

    public void dismiss() {
        os(false, false);
    }

    @Override // defpackage.ce
    public final cl kA() {
        return new bu(this, super.kA());
    }

    @Override // defpackage.ce
    public void ku(Context context) {
        super.ku(context);
        this.Z.g(this.WS);
        if (this.WQ) {
            return;
        }
        this.an = false;
    }

    public void kv() {
        os(true, false);
    }

    @Override // defpackage.ce
    public final void lN(Bundle bundle) {
        Bundle bundle2;
        super.lN(bundle);
        if (this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.ce
    public final void lO(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.lO(layoutInflater, viewGroup, bundle);
        if (this.O != null || this.d == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.d.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.ce
    public LayoutInflater lW(Bundle bundle) {
        LayoutInflater az = az();
        if (!this.c || this.WR) {
            if (dd.W(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("getting layout inflater for DialogFragment ");
                sb.append(this);
            }
            return az;
        }
        if (!this.e) {
            try {
                this.WR = true;
                Dialog oq = oq(bundle);
                this.d = oq;
                if (this.c) {
                    p(oq, this.WP);
                    Context qR = qR();
                    if (qR instanceof Activity) {
                        this.d.setOwnerActivity((Activity) qR);
                    }
                    this.d.setCancelable(this.ai);
                    this.d.setOnCancelListener(this.WO);
                    this.d.setOnDismissListener(this.a);
                    this.e = true;
                } else {
                    this.d = null;
                }
            } finally {
                this.WR = false;
            }
        }
        if (dd.W(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("get layout inflater for DialogFragment ");
            sb2.append(this);
            sb2.append(" from dialog context");
        }
        Dialog dialog = this.d;
        return dialog != null ? az.cloneInContext(dialog.getContext()) : az;
    }

    @Override // defpackage.ce
    public void lY() {
        super.lY();
        if (!this.WQ && !this.an) {
            this.an = true;
        }
        this.Z.k(this.WS);
    }

    @Override // defpackage.ce
    public void lZ() {
        super.lZ();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.am = true;
            dialog.setOnDismissListener(null);
            this.d.dismiss();
            if (!this.an) {
                onDismiss(this.d);
            }
            this.d = null;
            this.e = false;
        }
    }

    @Override // defpackage.ce
    public void mD() {
        super.mD();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.ce
    public void mQ(Bundle bundle) {
        Dialog dialog = this.d;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.WP;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ai) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.WJ;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.ce
    public void mR(Bundle bundle) {
        super.mR(bundle);
        this.WM = new Handler();
        this.c = this.E == 0;
        if (bundle != null) {
            this.WP = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.ai = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.WJ = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.ce
    public void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.am = false;
            dialog.show();
            View decorView = this.d.getWindow().getDecorView();
            ho.F(decorView, this);
            arr.b(decorView, this);
            js.i(decorView, this);
        }
    }

    public final void n(boolean z) {
        this.ai = z;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public final void o(int i, int i2) {
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
        }
        this.WP = i;
        if (i == 2) {
            this.b = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.b = i2;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.am) {
            return;
        }
        if (dd.W(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onDismiss called for DialogFragment ");
            sb.append(this);
        }
        os(true, true);
    }

    public Dialog oq(Bundle bundle) {
        if (dd.W(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
        }
        return new Dialog(qW(), this.b);
    }

    public void p(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void qh(dd ddVar, String str) {
        this.an = false;
        this.WQ = true;
        dn k = ddVar.k();
        k.r(this, str);
        k.a();
    }

    public final void qi(dd ddVar, String str) {
        this.an = false;
        this.WQ = true;
        dn k = ddVar.k();
        k.r(this, str);
        k.d();
    }

    public final void s(dn dnVar, String str) {
        this.an = false;
        this.WQ = true;
        dnVar.r(this, str);
        this.am = false;
        this.WJ = dnVar.a();
    }
}
