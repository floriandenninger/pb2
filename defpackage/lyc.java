package defpackage;

import android.app.AlertDialog;
import android.widget.RadioGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lyc implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ AlertDialog a;
    private final /* synthetic */ int b;

    public lyc(AlertDialog alertDialog, int i) {
        this.b = i;
        this.a = alertDialog;
    }

    public /* synthetic */ lyc(AlertDialog alertDialog, int i, byte[] bArr) {
        this.b = i;
        this.a = alertDialog;
    }

    public /* synthetic */ lyc(AlertDialog alertDialog, int i, char[] cArr) {
        this.b = i;
        this.a = alertDialog;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            this.a.getButton(-1).setEnabled(true);
        } else {
            if (i2 == 1) {
                this.a.getButton(-1).setEnabled(i != -1);
                return;
            }
            AlertDialog alertDialog = this.a;
            int i3 = yea.e;
            alertDialog.getButton(-1).setEnabled(true);
        }
    }
}
