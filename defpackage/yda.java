package defpackage;

import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yda implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ ydb a;

    public yda(ydb ydbVar) {
        this.a = ydbVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        ydb ydbVar = this.a;
        ydbVar.k = i;
        ydbVar.b();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
