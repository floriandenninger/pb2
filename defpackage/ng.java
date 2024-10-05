package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ng extends Dialog implements mm {
    private mn WX;
    private final io WY;

    public ng(Context context, int i) {
        super(context, a(context, i));
        this.WY = new nf(this);
        mn c = c();
        ((ne) c).y = a(context, i);
        c.z();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().j(view, layoutParams);
    }

    public final mn c() {
        if (this.WX == null) {
            this.WX = mn.f(this, this);
        }
        return this.WX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        c().m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return ip.a(this.WY, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e() {
        c().y(1);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return c().i(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().k();
        super.onCreate(bundle);
        c().z();
    }

    @Override // android.app.Dialog
    protected final void onStop() {
        super.onStop();
        c().p();
    }

    @Override // defpackage.mm
    public final void onSupportActionModeFinished(pp ppVar) {
    }

    @Override // defpackage.mm
    public final void onSupportActionModeStarted(pp ppVar) {
    }

    @Override // defpackage.mm
    public final pp onWindowStartingSupportActionMode(po poVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c().r(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        c().x(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        c().s(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c().t(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().x(charSequence);
    }
}
