package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.youtube.app.common.dialog.ProgressBarDialogFragmentController;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ffc extends fez {
    public int ae;
    public int af;
    public ProgressBarDialogFragmentController ag;
    private double ah;
    private double ai;

    public final void aH() {
        if (ar()) {
            ci C = C();
            Dialog dialog = this.d;
            Window window = dialog != null ? dialog.getWindow() : null;
            if (C == null || dialog == null || window == null) {
                return;
            }
            WindowManager windowManager = (WindowManager) C.getSystemService("window");
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            window.setGravity(8388691);
            WindowManager.LayoutParams attributes = window.getAttributes();
            double d = point.y;
            double d2 = this.ah;
            Double.isNaN(d);
            attributes.y = ((int) (d * d2)) - (this.af / 2);
            double d3 = point.x;
            double d4 = this.ai;
            Double.isNaN(d3);
            attributes.x = ((int) (d3 * d4)) - (this.ae / 2);
            window.setAttributes(attributes);
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        Bundle bundle2 = this.m;
        bundle2.getClass();
        this.ah = bundle2.getDouble("progressbar_height", 0.5d);
        this.ai = bundle2.getDouble("progressbar_width", 0.5d);
        o(1, 0);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.loader_dialog, viewGroup, false);
        inflate.post(new ffa(this, inflate));
        return inflate;
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aH();
    }

    @Override // defpackage.bv, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        ProgressBarDialogFragmentController progressBarDialogFragmentController = this.ag;
        if (progressBarDialogFragmentController != null) {
            progressBarDialogFragmentController.m();
        }
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.setCanceledOnTouchOutside(false);
        Window window = oq.getWindow();
        if (window == null) {
            return oq;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        oq.setOnKeyListener(new ffb(this));
        return oq;
    }
}
