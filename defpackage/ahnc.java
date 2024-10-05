package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnc implements ahxi, ahhb {
    private final ViewGroup a;
    private final Context b;
    private ahmt c;

    public ahnc(ViewGroup viewGroup, Context context) {
        this.a = viewGroup;
        this.b = context;
    }

    @Override // defpackage.ahxi
    public final void a() {
        ahmt ahmtVar = this.c;
        if (ahmtVar != null) {
            ahmtVar.i.post(new ahmm(ahmtVar, 1));
            ahmtVar.o = false;
            ahmtVar.A();
        }
    }

    @Override // defpackage.ahxi
    public final void f() {
        ahmt ahmtVar = this.c;
        if (ahmtVar != null) {
            ahmtVar.y();
        }
    }

    @Override // defpackage.ahxi
    public final void g(float f) {
        ahmt ahmtVar = this.c;
        if (ahmtVar != null) {
            ahmtVar.i.post(new ahmn(ahmtVar, f));
        }
    }

    @Override // defpackage.ahxi
    public final void h(int i, int i2) {
        ahmt ahmtVar = this.c;
        if (ahmtVar != null) {
            ahmtVar.i.post(new ahmp(ahmtVar, i));
        }
    }

    @Override // defpackage.ahxi
    public final void i(SubtitlesStyle subtitlesStyle) {
        ahmt ahmtVar = this.c;
        if (ahmtVar != null) {
            ahmtVar.i.post(new ahmo(ahmtVar, subtitlesStyle));
        }
    }

    @Override // defpackage.ahxi
    public final void j(List list) {
        ahmt ahmtVar = this.c;
        if (ahmtVar != null) {
            ahmtVar.i.post(new ahml(ahmtVar, list));
            ahmtVar.o = true;
            ahmtVar.A();
        }
    }

    @Override // defpackage.ahhb
    public final void qF(ahkm ahkmVar, ahki ahkiVar) {
        ahmt ahmtVar = new ahmt(this.a, this.b, new Handler(Looper.getMainLooper()), ahkiVar.a().clone(), ahkmVar.h, ahkmVar.i, ahkmVar, ahkiVar);
        this.c = ahmtVar;
        ahkiVar.c(ahmtVar);
    }

    @Override // defpackage.ahhb
    public final void qG() {
        this.c = null;
    }
}
