package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hgc implements Runnable {
    public final /* synthetic */ View a;
    private final /* synthetic */ int b;

    public /* synthetic */ hgc(View view, int i) {
        this.b = i;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.setVisibility(4);
                return;
            case 1:
                this.a.setVisibility(0);
                return;
            case 2:
                this.a.setVisibility(8);
                return;
            case 3:
                this.a.setEnabled(true);
                return;
            case 4:
                this.a.setVisibility(0);
                return;
            case 5:
                this.a.requestFocus();
                return;
            case 6:
                View view = this.a;
                String str = spi.a;
                view.requestFocus();
                InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(view, 1);
                    return;
                }
                return;
            default:
                this.a.callOnClick();
                return;
        }
    }
}
