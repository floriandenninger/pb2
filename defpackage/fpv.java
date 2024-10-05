package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpv extends dha {

    @dnt(a = 13)
    azrw a;

    @dnt(a = 13)
    fpy b;

    public fpv() {
        super("InlinePlayerTracker");
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return new ImageView(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void P(dhe dheVar, Object obj) {
        ImageView imageView = (ImageView) obj;
        azrw azrwVar = this.a;
        fpy fpyVar = this.b;
        String.valueOf(String.valueOf(imageView)).length();
        if (fpyVar == null) {
            afsi.b(2, 2, "InlinePlayerViewPositionBroadcaster cannot be null during onBind.");
        } else {
            fpyVar.b(new fpw(imageView, azrwVar));
        }
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void ar(Object obj) {
        ImageView imageView = (ImageView) obj;
        fpy fpyVar = this.b;
        String.valueOf(String.valueOf(imageView)).length();
        if (fpyVar == null) {
            return;
        }
        fpyVar.b(null);
        imageView.setImageDrawable(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void au(amsj amsjVar) {
        if (amsjVar == null) {
            return;
        }
        this.b = (fpy) amsjVar.v(fpy.class);
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        fpv fpvVar = (fpv) dhaVar;
        if (this.k == fpvVar.k) {
            return true;
        }
        azrw azrwVar = this.a;
        if (azrwVar == null ? fpvVar.a != null : !azrwVar.equals(fpvVar.a)) {
            return false;
        }
        fpy fpyVar = this.b;
        return fpyVar == null ? fpvVar.b == null : fpyVar.equals(fpvVar.b);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }
}
