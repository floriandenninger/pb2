package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class wek extends ce implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    boolean ae;
    Dialog d;
    boolean e;
    boolean a = true;
    boolean b = true;
    int c = -1;

    @Override // defpackage.ce
    public final void Q(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.Q(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("DialogFragment:");
        printWriter.print(str);
        printWriter.print("  cancelable=");
        printWriter.print(this.a);
        printWriter.print(" showsDialog=");
        printWriter.print(this.b);
        printWriter.print(" backStackId=");
        printWriter.println(this.c);
        printWriter.print(str);
        printWriter.print("  dialog=");
        printWriter.println(this.d);
        printWriter.print(str);
        printWriter.print("  viewDestroyed=");
        printWriter.print(this.e);
        printWriter.print(" dismissed=");
        printWriter.print(this.ae);
        printWriter.print(" shownByMe=");
        printWriter.println(false);
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        Bundle bundle2;
        super.S(bundle);
        if (this.b) {
            if (this.d == null) {
                Dialog q = q();
                this.d = q;
                q.requestWindowFeature(1);
            }
            View view = this.O;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.d.setContentView(view);
            }
            ci C = C();
            if (C != null) {
                this.d.setOwnerActivity(C);
            }
            this.d.setCancelable(this.a);
            this.d.setOnDismissListener(this);
            this.d.setOnCancelListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.d.onRestoreInstanceState(bundle2);
        }
    }

    @Override // defpackage.ce
    public void U(Activity activity) {
        super.U(activity);
        this.ae = false;
    }

    @Override // defpackage.ce
    public void ku(Context context) {
        super.ku(context);
        this.ae = false;
    }

    @Override // defpackage.ce
    public LayoutInflater lW(Bundle bundle) {
        if (!this.b) {
            return az();
        }
        Dialog q = q();
        this.d = q;
        q.requestWindowFeature(1);
        Dialog dialog = this.d;
        if (dialog != null) {
            return (LayoutInflater) dialog.getContext().getSystemService("layout_inflater");
        }
        return (LayoutInflater) C().getSystemService("layout_inflater");
    }

    @Override // defpackage.ce
    public final void lY() {
        super.lY();
        if (this.ae) {
            return;
        }
        this.ae = true;
    }

    @Override // defpackage.ce
    public void lZ() {
        super.lZ();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.e = true;
            dialog.dismiss();
            this.d = null;
        }
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.ce
    public void mQ(Bundle bundle) {
        Bundle onSaveInstanceState;
        Dialog dialog = this.d;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        if (!this.a) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i = this.c;
        if (i != -1) {
            bundle.putInt("android:backStackId", i);
        }
    }

    @Override // defpackage.ce
    public void mR(Bundle bundle) {
        super.mR(bundle);
        this.b = true;
        if (bundle != null) {
            this.a = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.c = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        Dialog dialog = this.d;
        if (dialog != null) {
            this.e = false;
            dialog.show();
        }
    }

    public final void o() {
        p(false);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.e) {
            return;
        }
        p(true);
    }

    final void p(boolean z) {
        if (this.ae) {
            return;
        }
        this.ae = true;
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.dismiss();
            this.d = null;
        }
        this.e = true;
        if (this.c >= 0) {
            mO().ad(this.c, false);
            this.c = -1;
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

    public final Dialog q() {
        return new Dialog(C(), 0);
    }
}
