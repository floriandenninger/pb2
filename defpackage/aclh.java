package defpackage;

import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.livecreation.ui.view.DeveloperPanel;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclh implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ DeveloperPanel b;
    private final /* synthetic */ int c;

    public aclh(DeveloperPanel developerPanel, TextView textView, int i) {
        this.c = i;
        this.b = developerPanel;
        this.a = textView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.c == 0) {
            TextView textView = this.a;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[1];
            amkq.E(i >= 0);
            int i2 = (i * 50) + 50;
            if (i2 > 2500) {
                i2 = 2500;
            }
            objArr[0] = Integer.valueOf(i2);
            textView.setText(String.format(locale, "%04d Kbps", objArr));
            return;
        }
        TextView textView2 = this.a;
        Locale locale2 = Locale.getDefault();
        Object[] objArr2 = new Object[1];
        amkq.E(i >= 0);
        if (i > 1) {
            i = 1;
        }
        objArr2[0] = Integer.valueOf(i);
        textView2.setText(String.format(locale2, "%02d", objArr2));
    }
}
