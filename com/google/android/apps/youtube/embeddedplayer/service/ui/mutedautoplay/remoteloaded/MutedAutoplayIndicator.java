package com.google.android.apps.youtube.embeddedplayer.service.ui.mutedautoplay.remoteloaded;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.youtube.R;
import defpackage.bxd;
import defpackage.bxg;
import defpackage.bxj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MutedAutoplayIndicator extends ImageView {
    private boolean a;
    private bxj b;

    public MutedAutoplayIndicator(Context context) {
        super(context);
    }

    public final synchronized void a() {
        bxj bxjVar;
        if (getVisibility() == 0 && (bxjVar = this.b) != null) {
            bxjVar.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final synchronized void setVisibility(int i) {
        if (this.a && getVisibility() == i) {
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            setAlpha(0.0f);
            if (!this.a) {
                bxj a = bxj.a(getContext(), R.drawable._audio_indicator_24dp_animation);
                this.b = a;
                setImageDrawable(a);
                bxj bxjVar = this.b;
                if (bxjVar != null) {
                    f fVar = new f(this);
                    Drawable drawable = bxjVar.e;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        if (fVar.a == null) {
                            fVar.a = new bxd(fVar);
                        }
                        animatedVectorDrawable.registerAnimationCallback(fVar.a);
                    } else {
                        if (bxjVar.c == null) {
                            bxjVar.c = new ArrayList();
                        }
                        if (!bxjVar.c.contains(fVar)) {
                            bxjVar.c.add(fVar);
                            if (bxjVar.b == null) {
                                bxjVar.b = new bxg(bxjVar);
                            }
                            bxjVar.a.c.addListener(bxjVar.b);
                        }
                    }
                    this.a = true;
                }
            }
            bxj bxjVar2 = this.b;
            if (bxjVar2 != null) {
                bxjVar2.start();
            }
            animate().alpha(0.8f).start();
            return;
        }
        animate().cancel();
        setAlpha(0.0f);
        bxj bxjVar3 = this.b;
        if (bxjVar3 != null) {
            bxjVar3.stop();
        }
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MutedAutoplayIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
