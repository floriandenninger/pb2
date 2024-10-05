package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ksz extends aivc implements ahxi, aida {
    public final ahxn a;
    public final Context b;
    public final aypy c;
    public final aicz d;
    public final azrw e;
    public FrameLayout f;

    public ksz(Context context, kut kutVar, aaea aaeaVar, aicz aiczVar, azrw azrwVar) {
        super(context);
        this.b = context;
        this.a = new ahxn(context);
        this.d = aiczVar;
        this.e = azrwVar;
        this.c = aypy.m(aaeaVar.a, kutVar.u().U(), knl.b);
    }

    @Override // defpackage.ahxi
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
        setVisibility(i2 == 2 ? 8 : 0);
    }

    @Override // defpackage.ahxi
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.ahxi
    public final void g(float f) {
        this.a.g(f);
    }

    @Override // defpackage.ahxi
    public final void h(int i, int i2) {
        this.a.h(i, 0);
    }

    @Override // defpackage.ahxi
    public final void i(SubtitlesStyle subtitlesStyle) {
        this.a.i(subtitlesStyle);
    }

    @Override // defpackage.ahxi
    public final void j(List list) {
        this.a.j(list);
    }

    @Override // defpackage.aivc, defpackage.aivf
    public final View ld() {
        return this;
    }

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
    }
}
