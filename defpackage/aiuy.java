package defpackage;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitlesStyle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiuy {
    public final aipt a;
    public final aadw b;
    private final Context c;
    private final Set d;
    private CaptioningManager e;
    private aiux f;

    public aiuy(Context context, aipt aiptVar, aadw aadwVar) {
        aiptVar.getClass();
        this.a = aiptVar;
        context.getClass();
        this.c = context;
        this.d = new HashSet();
        this.b = aadwVar;
    }

    private final CaptioningManager g() {
        if (this.e == null) {
            this.e = (CaptioningManager) this.c.getSystemService("captioning");
        }
        return this.e;
    }

    public final float a() {
        return g().getFontScale();
    }

    public final SubtitlesStyle b() {
        return new SubtitlesStyle(g().getUserStyle(), this.b);
    }

    public final synchronized void c(float f) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((aiur) it.next()).m(f);
        }
    }

    public final synchronized void d(SubtitlesStyle subtitlesStyle) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((aiur) it.next()).n(subtitlesStyle);
        }
    }

    public final synchronized void e(aiur aiurVar) {
        if (this.d.isEmpty()) {
            this.f = new aiux(this);
            g().addCaptioningChangeListener(this.f);
        }
        this.d.add(aiurVar);
    }

    public final synchronized void f(aiur aiurVar) {
        this.d.remove(aiurVar);
        if (this.d.isEmpty()) {
            g().removeCaptioningChangeListener(this.f);
        }
    }
}
