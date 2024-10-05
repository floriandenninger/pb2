package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fqd implements View.OnClickListener {
    final /* synthetic */ aioc a;
    final /* synthetic */ awnw b;
    final /* synthetic */ axpg c;
    final /* synthetic */ ImageView d;
    final /* synthetic */ awnw e;
    final /* synthetic */ dhe f;

    public fqd(aioc aiocVar, awnw awnwVar, axpg axpgVar, ImageView imageView, awnw awnwVar2, dhe dheVar) {
        this.a = aiocVar;
        this.b = awnwVar;
        this.c = axpgVar;
        this.d = imageView;
        this.e = awnwVar2;
        this.f = dheVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        swu a = swu.a().a();
        if (this.a.E().d() && this.b != null) {
            ((sww) this.c.get()).b(this.b, a).T();
            this.d.setImageResource(R.drawable.player_play);
        } else if (this.e != null) {
            ((sww) this.c.get()).b(this.e, a).T();
            this.d.setImageResource(R.drawable.player_pause);
        }
        this.d.setColorFilter(wbs.Q(this.f.b, R.attr.ytTextPrimary));
    }
}
