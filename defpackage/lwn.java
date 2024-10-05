package defpackage;

import android.app.AlertDialog;
import android.widget.CompoundButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lwn implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ lwp a;

    public lwn(lwp lwpVar) {
        this.a = lwpVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        lwp lwpVar = this.a;
        boolean z2 = lwpVar.p;
        if (z2) {
            if (!z) {
                if (lwpVar.o == null) {
                    lwpVar.o = new AlertDialog.Builder(lwpVar.a).setMessage(R.string.collab_playlist_turn_off_confirm_message).setPositiveButton(R.string.ok, new lwo(lwpVar, 0)).setNegativeButton(R.string.cancel, new lwo(lwpVar, 1)).create();
                }
                lwpVar.o.show();
                return;
            }
            z = true;
        }
        if (z2 || !z) {
            return;
        }
        lwpVar.c(true);
    }
}
