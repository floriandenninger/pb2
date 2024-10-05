package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wkh implements alyx {
    final /* synthetic */ anib a;
    final /* synthetic */ wcx b;
    private final /* synthetic */ int c;

    public wkh(anib anibVar, wcx wcxVar, int i) {
        this.c = i;
        this.a = anibVar;
        this.b = wcxVar;
    }

    @Override // defpackage.alyx
    public final anhy a() {
        int i = this.c;
        if (i == 0) {
            anib anibVar = this.a;
            final wcx wcxVar = this.b;
            final int i2 = 0;
            return anibVar.submit(amjk.g(new Callable() { // from class: wkg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i3 = i2;
                    if (i3 == 0) {
                        return wcxVar.w();
                    }
                    if (i3 == 1) {
                        return wcxVar.v();
                    }
                    afsx c = wcxVar.c();
                    if (whu.i(c).equals("youtube-incognito")) {
                        aong aongVar = (aong) alym.a.createBuilder();
                        String j = whu.j(c);
                        aongVar.copyOnWrite();
                        alym alymVar = (alym) aongVar.instance;
                        alymVar.b = 1 | alymVar.b;
                        alymVar.c = j;
                        aongVar.copyOnWrite();
                        alym alymVar2 = (alym) aongVar.instance;
                        alymVar2.b |= 256;
                        alymVar2.i = "youtube-incognito";
                        return amru.r((alym) aongVar.build());
                    }
                    return amru.q();
                }
            }));
        }
        final int i3 = 1;
        if (i == 1) {
            anib anibVar2 = this.a;
            final wcx wcxVar2 = this.b;
            return anibVar2.submit(amjk.g(new Callable() { // from class: wkg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i32 = i3;
                    if (i32 == 0) {
                        return wcxVar2.w();
                    }
                    if (i32 == 1) {
                        return wcxVar2.v();
                    }
                    afsx c = wcxVar2.c();
                    if (whu.i(c).equals("youtube-incognito")) {
                        aong aongVar = (aong) alym.a.createBuilder();
                        String j = whu.j(c);
                        aongVar.copyOnWrite();
                        alym alymVar = (alym) aongVar.instance;
                        alymVar.b = 1 | alymVar.b;
                        alymVar.c = j;
                        aongVar.copyOnWrite();
                        alym alymVar2 = (alym) aongVar.instance;
                        alymVar2.b |= 256;
                        alymVar2.i = "youtube-incognito";
                        return amru.r((alym) aongVar.build());
                    }
                    return amru.q();
                }
            }));
        }
        anib anibVar3 = this.a;
        final wcx wcxVar3 = this.b;
        final int i4 = 2;
        return anibVar3.submit(amjk.g(new Callable() { // from class: wkg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i32 = i4;
                if (i32 == 0) {
                    return wcxVar3.w();
                }
                if (i32 == 1) {
                    return wcxVar3.v();
                }
                afsx c = wcxVar3.c();
                if (whu.i(c).equals("youtube-incognito")) {
                    aong aongVar = (aong) alym.a.createBuilder();
                    String j = whu.j(c);
                    aongVar.copyOnWrite();
                    alym alymVar = (alym) aongVar.instance;
                    alymVar.b = 1 | alymVar.b;
                    alymVar.c = j;
                    aongVar.copyOnWrite();
                    alym alymVar2 = (alym) aongVar.instance;
                    alymVar2.b |= 256;
                    alymVar2.i = "youtube-incognito";
                    return amru.r((alym) aongVar.build());
                }
                return amru.q();
            }
        }));
    }
}
