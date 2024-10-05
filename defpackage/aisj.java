package defpackage;

import android.view.accessibility.CaptioningManager;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisj implements aijo {
    public final Set a = Collections.synchronizedSet(new HashSet());
    private final anhy b;
    private final aifk c;

    public aisj(anhy anhyVar, aifk aifkVar) {
        this.b = anhyVar;
        this.c = aifkVar;
    }

    public final void b(aioc aiocVar) {
        ayqw ayqwVar = new ayqw();
        final int i = 0;
        ayqwVar.d(ahbw.c(aiocVar.V(), aipq.g).Y(new ayrs(this) { // from class: aisi
            public final /* synthetic */ aisj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    aisj aisjVar = this.a;
                    ahdy ahdyVar = (ahdy) obj;
                    SubtitleTrack a = ahdyVar.a();
                    if (!ahdyVar.c() || a == null) {
                        return;
                    }
                    aisjVar.a.add(a.c());
                    return;
                }
                aisj aisjVar2 = this.a;
                if (((ahcu) obj).a()) {
                    return;
                }
                aisjVar2.a.clear();
            }
        }, airw.d));
        final int i2 = 1;
        ayqwVar.d(aiocVar.aa().Y(new ayrs(this) { // from class: aisi
            public final /* synthetic */ aisj a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    aisj aisjVar = this.a;
                    ahdy ahdyVar = (ahdy) obj;
                    SubtitleTrack a = ahdyVar.a();
                    if (!ahdyVar.c() || a == null) {
                        return;
                    }
                    aisjVar.a.add(a.c());
                    return;
                }
                aisj aisjVar2 = this.a;
                if (((ahcu) obj).a()) {
                    return;
                }
                aisjVar2.a.clear();
            }
        }, airw.d));
    }

    @Override // defpackage.aijo
    public final void qZ(aijr aijrVar) {
        if (this.c.A() && this.b.isDone()) {
            try {
                ammv ammvVar = (ammv) anaf.W(this.b);
                if (ammvVar.h()) {
                    CaptioningManager captioningManager = (CaptioningManager) ammvVar.c();
                    aone createBuilder = aryp.a.createBuilder();
                    if (captioningManager.isEnabled()) {
                        createBuilder.copyOnWrite();
                        aryp arypVar = (aryp) createBuilder.instance;
                        arypVar.b |= 1;
                        arypVar.c = true;
                    }
                    Locale locale = captioningManager.getLocale();
                    if (locale != null) {
                        String language = locale.getLanguage();
                        createBuilder.copyOnWrite();
                        aryp arypVar2 = (aryp) createBuilder.instance;
                        language.getClass();
                        arypVar2.b |= 2;
                        arypVar2.d = language;
                    }
                    if (!this.a.isEmpty()) {
                        Set set = this.a;
                        createBuilder.copyOnWrite();
                        aryp arypVar3 = (aryp) createBuilder.instance;
                        aony aonyVar = arypVar3.e;
                        if (!aonyVar.c()) {
                            arypVar3.e = aonm.mutableCopy(aonyVar);
                        }
                        aolo.addAll((Iterable) set, (List) arypVar3.e);
                    }
                    final aryp arypVar4 = (aryp) createBuilder.build();
                    aijrVar.y = arypVar4;
                    aijrVar.d(new aijq() { // from class: aish
                        @Override // defpackage.aijq
                        public final void a(afpi afpiVar) {
                            afpiVar.e("captionParams", aryp.this.toByteArray());
                        }
                    });
                }
            } catch (ExecutionException e) {
                zga.d("Exception getting CaptioningManager", e);
            }
        }
    }
}
