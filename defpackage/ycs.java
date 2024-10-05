package defpackage;

import android.R;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ycs extends DialogFragment {
    public static final String a = "ycs";
    public DialogInterface.OnKeyListener b;

    public final void a() {
        if (isAdded()) {
            dismissAllowingStateLoss();
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
        DialogInterface.OnKeyListener onKeyListener = this.b;
        if (onKeyListener != null) {
            onCreateDialog.setOnKeyListener(onKeyListener);
        }
        return onCreateDialog;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(com.google.android.youtube.R.layout.loading_dialog, viewGroup, false);
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        if (isAdded()) {
            return;
        }
        super.show(fragmentManager, str);
    }
}
