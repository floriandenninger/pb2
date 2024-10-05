package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lsn extends ContentObserver implements lsb {
    public final ayqw b;
    public lsm c;
    public CaptioningManager d;
    private int e;
    private final aipt f;
    private final ArrayList g;
    private AudioManager h;
    private boolean i;

    public lsn(Context context, aadw aadwVar, fxj fxjVar, aipt aiptVar) {
        super(new Handler());
        this.g = new ArrayList();
        this.f = aiptVar;
        this.b = new ayqw();
        asvu asvuVar = aadwVar.b().e;
        boolean z = (asvuVar == null ? asvu.a : asvuVar).u;
        asvu asvuVar2 = aadwVar.b().e;
        boolean z2 = (asvuVar2 == null ? asvu.a : asvuVar2).t;
        asvu asvuVar3 = aadwVar.b().e;
        boolean z3 = (asvuVar3 == null ? asvu.a : asvuVar3).s;
        boolean z4 = z && z2 && z3;
        if (z) {
            this.e = 0;
            this.h = (AudioManager) context.getSystemService("audio");
            this.i = i();
            ContentResolver contentResolver = context.getContentResolver();
            contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, this);
            fxjVar.g(new lsk(this, contentResolver));
        }
        if (z2) {
            this.e = 1;
            this.c = new lsm(this);
            CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
            this.d = captioningManager;
            captioningManager.addCaptioningChangeListener(this.c);
            this.i = h();
            fxjVar.g(new lsl(this, z4, 1));
        }
        if (z3) {
            this.e = 2;
            c();
            this.i = g();
            fxjVar.g(new lsl(this, z4, 0));
        }
        if (z4) {
            this.e = 3;
            this.i = h() || g() || i();
        }
    }

    public static final void e(frh frhVar, apju apjuVar, boolean z) {
        if (frhVar == null) {
            return;
        }
        frhVar.a = z;
        View view = frhVar.f;
        if (apjuVar == null) {
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View c = frhVar.c();
        c.setVisibility(0);
        if (frhVar.a) {
            c.animate().alpha(1.0f).setDuration(350L).setInterpolator(frhVar.b).start();
        }
        TextView textView = (TextView) c;
        aqyg aqygVar = apjuVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
        aqyg aqygVar2 = apjuVar.b;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        c.setContentDescription(ajcq.i(aqygVar2));
    }

    public static final void f(frh frhVar) {
        View view;
        if (frhVar == null || (view = frhVar.f) == null) {
            return;
        }
        view.setVisibility(8);
    }

    private final boolean g() {
        return ((Boolean) ynm.f(this.f.b(), false)).booleanValue();
    }

    private final boolean h() {
        CaptioningManager captioningManager = this.d;
        return captioningManager != null && captioningManager.isEnabled();
    }

    private final boolean i() {
        AudioManager audioManager = this.h;
        return audioManager != null && audioManager.getStreamVolume(3) == 0;
    }

    @Override // defpackage.lsb
    public final void a(lsa lsaVar) {
        this.g.add(new WeakReference(lsaVar));
    }

    @Override // defpackage.lsb
    public final void b(frh frhVar, apju apjuVar) {
        int i = this.e;
        boolean z = true;
        if (i == 0) {
            z = i();
        } else if (i == 1) {
            z = h();
        } else if (i == 2) {
            z = g();
        } else if (!h() && !g() && !i()) {
            z = false;
        }
        if (!z) {
            f(frhVar);
        } else {
            e(frhVar, apjuVar, false);
        }
    }

    public final void c() {
        aypn A;
        ayqw ayqwVar = this.b;
        aipt aiptVar = this.f;
        if (aiptVar.d.r().booleanValue()) {
            A = aiptVar.a.y().n();
        } else {
            A = aiptVar.c.d().A(afly.r);
        }
        ayqwVar.d(A.G().E(ayqr.a()).n().X(new ayrs() { // from class: lsj
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                lsn.this.d();
            }
        }));
    }

    public final void d() {
        boolean i;
        int i2 = this.e;
        if (i2 == 0) {
            i = i();
        } else if (i2 == 1) {
            i = h();
        } else if (i2 != 2) {
            i = h() || g() || i();
        } else {
            i = g();
        }
        if (i == this.i) {
            return;
        }
        this.i = i;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WeakReference weakReference = (WeakReference) arrayList.get(i3);
            if (weakReference.get() != null) {
                if (i) {
                    e(((lsa) weakReference.get()).d(), ((lsa) weakReference.get()).e(), true);
                } else {
                    f(((lsa) weakReference.get()).d());
                }
            }
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        d();
    }
}
