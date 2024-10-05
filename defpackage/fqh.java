package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fqh extends FrameLayout implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    public final SeekBar a;
    public axpg b;
    public awnw c;
    public syd d;

    public fqh(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.default_seek_bar, this);
        SeekBar seekBar = (SeekBar) findViewById(R.id.slider_seek_bar);
        this.a = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!z || this.c == null) {
            return;
        }
        axpg axpgVar = this.b;
        if (axpgVar == null || axpgVar.get() == null) {
            this.d.b(31, "OnChangeCommand provided but no usable command resolver found.");
            return;
        }
        sws a = swu.a();
        a.a = this;
        aong aongVar = (aong) awpu.a.createBuilder();
        aonk aonkVar = awua.b;
        aone createBuilder = awua.a.createBuilder();
        createBuilder.copyOnWrite();
        awua awuaVar = (awua) createBuilder.instance;
        awuaVar.c = 1;
        awuaVar.d = Integer.valueOf(i);
        aongVar.e(aonkVar, (awua) createBuilder.build());
        a.e = (awpu) aongVar.build();
        ((sww) this.b.get()).b(this.c, a.a()).T();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }
}
