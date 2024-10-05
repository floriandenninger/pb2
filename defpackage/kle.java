package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kle extends fks implements fgp, aise {
    public final aisf a;
    public final aiuy b;
    private final ahxi c;
    private final CaptioningManager d;
    private final Context e;
    private final fgq f;
    private boolean g;
    private SubtitlesStyle h;
    private SubtitleTrack i;
    private Runnable j;

    public kle(Context context, CaptioningManager captioningManager, aisf aisfVar, aiuy aiuyVar, ahxi ahxiVar, fln flnVar, fgq fgqVar) {
        super(flnVar);
        this.e = context;
        this.c = ahxiVar;
        this.b = aiuyVar;
        this.d = captioningManager;
        this.f = fgqVar;
        this.a = aisfVar;
        aisfVar.j.add(this);
    }

    @Override // defpackage.aise
    public final void a() {
        this.i = this.a.m;
        Runnable runnable = this.j;
        if (runnable != null) {
            runnable.run();
            this.j = null;
        }
    }

    @Override // defpackage.flm
    public final void kG() {
        this.f.j(this);
    }

    @Override // defpackage.flm
    public final void kH() {
        this.f.i(this);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        CaptioningManager captioningManager;
        if (!fhgVar.d() || fhgVar2.d()) {
            if (!fhgVar.d() && fhgVar2.d()) {
                this.j = null;
            }
        } else {
            Runnable runnable = new Runnable() { // from class: kld
                @Override // java.lang.Runnable
                public final void run() {
                    kle kleVar = kle.this;
                    if (((Boolean) ynm.g(kleVar.b.a.b(), 1L, TimeUnit.SECONDS, false)).booleanValue()) {
                        return;
                    }
                    kleVar.a.g(null, false);
                }
            };
            this.j = runnable;
            if (this.i != null) {
                runnable.run();
                this.j = null;
                this.i = null;
            }
        }
        if (!fhgVar2.d() || (captioningManager = this.d) == null || captioningManager.isEnabled()) {
            if (this.g) {
                this.c.i(this.b.b());
                this.c.g(this.b.a());
                this.c.h(0, 0);
                this.g = false;
                return;
            }
            return;
        }
        this.c.g(1.0f);
        ahxi ahxiVar = this.c;
        if (this.h == null) {
            Resources resources = this.e.getResources();
            Resources.Theme theme = this.e.getTheme();
            this.h = new SubtitlesStyle(fk.a(resources, R.color.inline_muted_subtitles_background, theme), fk.a(resources, R.color.inline_muted_subtitles_window, theme), fk.a(resources, R.color.inline_muted_subtitles_edge, theme), 5, fk.a(resources, R.color.inline_muted_subtitles_text, theme), 8);
        }
        ahxiVar.i(this.h);
        this.c.h(this.e.getResources().getDimensionPixelOffset(R.dimen.inline_muted_subtitles_padding), 0);
        this.g = true;
    }
}
