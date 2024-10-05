package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bta implements View.OnKeyListener {
    final /* synthetic */ SeekBarPreference a;

    public bta(SeekBarPreference seekBarPreference) {
        this.a = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.a;
        if ((!seekBarPreference.e && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}
