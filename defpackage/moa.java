package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class moa implements View.OnClickListener {
    final /* synthetic */ aahd a;
    final /* synthetic */ axpg b;
    final /* synthetic */ Context c;
    final /* synthetic */ mod d;

    public moa(mod modVar, aahd aahdVar, axpg axpgVar, Context context) {
        this.d = modVar;
        this.a = aahdVar;
        this.b = axpgVar;
        this.c = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final apxf apxfVar;
        mod modVar = this.d;
        if (modVar.a == null || (apxfVar = modVar.c) == null) {
            return;
        }
        final Map map = modVar.b;
        final moc mocVar = modVar.d;
        Handler handler = new Handler();
        final aahd aahdVar = this.a;
        final axpg axpgVar = this.b;
        final Context context = this.c;
        handler.postDelayed(new Runnable() { // from class: mnz
            @Override // java.lang.Runnable
            public final void run() {
                aahd aahdVar2 = aahd.this;
                apxf apxfVar2 = apxfVar;
                Map map2 = map;
                axpg axpgVar2 = axpgVar;
                Context context2 = context;
                moc mocVar2 = mocVar;
                aahdVar2.c(apxfVar2, map2);
                akbz akbzVar = (akbz) axpgVar2.get();
                akca m = ((akbz) axpgVar2.get()).m();
                m.k(context2.getString(R.string.dismissed_video_snackbar_message));
                m.j(false);
                akbzVar.o(m.b());
                if (mocVar2 != null) {
                    mocVar2.f();
                }
            }
        }, 500L);
        mod modVar2 = this.d;
        if (modVar2.e == null || modVar2.f == null || modVar2.d() == null) {
            return;
        }
        mod modVar3 = this.d;
        modVar3.e.I(3, new acqx(modVar3.d()), null);
    }
}
