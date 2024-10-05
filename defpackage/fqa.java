package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fqa extends dha {

    @dnt(a = 13)
    axpg a;

    @dnt(a = 13)
    awnw b;

    @dnt(a = 13)
    awnw c;

    @dnt(a = 13)
    aioc d;

    private fqa() {
        super("PlaybackButton");
    }

    public static fpz a(dhe dheVar) {
        fpz fpzVar = new fpz();
        fpz.c(fpzVar, dheVar, new fqa());
        return fpzVar;
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
    public final void P(final dhe dheVar, Object obj) {
        final ImageView imageView = (ImageView) obj;
        aioc aiocVar = this.d;
        awnw awnwVar = this.c;
        awnw awnwVar2 = this.b;
        axpg axpgVar = this.a;
        aiocVar.G().i.Y(new ayrs() { // from class: fqc
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                ImageView imageView2 = imageView;
                dhe dheVar2 = dheVar;
                int a = ((ahej) obj2).a();
                boolean z = false;
                if (a == 2) {
                    imageView2.setImageResource(R.drawable.player_pause);
                } else if (a == 3) {
                    imageView2.setImageResource(R.drawable.player_play);
                } else if (a == 4 || a == 7) {
                    imageView2.setImageResource(R.drawable.player_replay);
                } else {
                    z = true;
                }
                imageView2.setColorFilter(wbs.Q(dheVar2.b, z ? R.attr.ytTextSecondary : R.attr.ytTextPrimary));
                imageView2.setClickable(!z);
            }
        }, eoo.l);
        imageView.setOnClickListener(new fqd(aiocVar, awnwVar2, axpgVar, imageView, awnwVar, dheVar));
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
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
        fqa fqaVar = (fqa) dhaVar;
        if (this.k == fqaVar.k) {
            return true;
        }
        axpg axpgVar = this.a;
        if (axpgVar == null ? fqaVar.a != null : !axpgVar.equals(fqaVar.a)) {
            return false;
        }
        awnw awnwVar = this.b;
        if (awnwVar == null ? fqaVar.b != null : !awnwVar.equals(fqaVar.b)) {
            return false;
        }
        awnw awnwVar2 = this.c;
        if (awnwVar2 == null ? fqaVar.c != null : !awnwVar2.equals(fqaVar.c)) {
            return false;
        }
        aioc aiocVar = this.d;
        return aiocVar == null ? fqaVar.d == null : aiocVar.equals(fqaVar.d);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }
}
