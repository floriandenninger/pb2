package defpackage;

import android.R;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zad extends yzw {
    protected final Context a;
    private Animation b;

    public zad(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // defpackage.yzw, defpackage.zab
    public final Animation b() {
        if (this.b == null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.a, R.anim.fade_in);
            this.b = loadAnimation;
            loadAnimation.setDuration(this.a.getResources().getInteger(R.integer.config_shortAnimTime));
        }
        return this.b;
    }

    @Override // defpackage.yzw, defpackage.zab
    public final boolean c() {
        return true;
    }
}
