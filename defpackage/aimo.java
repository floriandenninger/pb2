package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aimo {
    public final ahbv a;
    public final Handler b;
    public final axpg c;
    public final azrw d;
    public final azrw e;
    public final Runnable f;
    public final Runnable g;
    public boolean h;
    public int i;
    public boolean j;
    public final aimx k;
    private final aypn l;
    private final aypn m;
    private final aypn n;
    private final aiov o;

    public aimo(aimx aimxVar, ahbv ahbvVar, Handler handler, axpg axpgVar, aypn aypnVar, aypn aypnVar2, aypn aypnVar3, aiov aiovVar, azrw azrwVar, azrw azrwVar2) {
        this.k = aimxVar;
        ahbvVar.getClass();
        this.a = ahbvVar;
        this.b = handler;
        this.c = axpgVar;
        this.l = aypnVar;
        this.m = aypnVar2;
        this.n = aypnVar3;
        this.o = aiovVar;
        this.d = azrwVar;
        this.e = azrwVar2;
        final int i = 1;
        this.f = new Runnable(this) { // from class: aimn
            public final /* synthetic */ aimo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i == 0) {
                    aimo aimoVar = this.a;
                    acsx acsxVar = (acsx) aimoVar.e.get();
                    aimr aimrVar = aimr.AUTONAV;
                    aigc a = aigd.a();
                    a.a = acsxVar;
                    ((ahbd) aimoVar.c.get()).a(new aims(aimrVar, null, a.a()));
                    return;
                }
                aimo aimoVar2 = this.a;
                acsx acsxVar2 = (acsx) aimoVar2.d.get();
                aimr aimrVar2 = aimr.AUTOPLAY;
                aigc a2 = aigd.a();
                a2.a = acsxVar2;
                ((ahbd) aimoVar2.c.get()).a(new aims(aimrVar2, null, a2.a()));
            }
        };
        final int i2 = 0;
        this.g = new Runnable(this) { // from class: aimn
            public final /* synthetic */ aimo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (i2 == 0) {
                    aimo aimoVar = this.a;
                    acsx acsxVar = (acsx) aimoVar.e.get();
                    aimr aimrVar = aimr.AUTONAV;
                    aigc a = aigd.a();
                    a.a = acsxVar;
                    ((ahbd) aimoVar.c.get()).a(new aims(aimrVar, null, a.a()));
                    return;
                }
                aimo aimoVar2 = this.a;
                acsx acsxVar2 = (acsx) aimoVar2.d.get();
                aimr aimrVar2 = aimr.AUTOPLAY;
                aigc a2 = aigd.a();
                a2.a = acsxVar2;
                ((ahbd) aimoVar2.c.get()).a(new aims(aimrVar2, null, a2.a()));
            }
        };
    }

    public final void a() {
        this.i = 0;
        this.h = false;
    }

    public final void b() {
        final int i = 2;
        this.o.a.X(new ayrs(this) { // from class: aimm
            public final /* synthetic */ aimo a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    aimo aimoVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahdvVar.c() != aigk.VIDEO_WATCH_LOADED || !aimoVar.j || ((ahbd) aimoVar.c.get()).c(aims.c) != 2) {
                        if (ahdvVar.c() == aigk.VIDEO_LOADING) {
                            aimoVar.j = false;
                            return;
                        }
                        return;
                    } else {
                        aimoVar.h = true;
                        aimoVar.b.post(aimoVar.f);
                        aimoVar.j = false;
                        return;
                    }
                }
                if (i2 == 1) {
                    this.a.a();
                    return;
                }
                if (i2 == 2) {
                    aimo aimoVar2 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() != aign.PLAYBACK_PENDING || aimoVar2.i <= 0) {
                        if (ahefVar.c() == aign.VIDEO_PLAYING) {
                            aimoVar2.a();
                            return;
                        }
                        return;
                    } else {
                        aimoVar2.k.f.c(new ahec());
                        return;
                    }
                }
                if (i2 == 3) {
                    aimo aimoVar3 = this.a;
                    aiey aieyVar = aiey.START;
                    switch (((aiez) obj).a()) {
                        case START:
                        case NEXT:
                        case PREVIOUS:
                        case JUMP:
                        case INSERT:
                            aimoVar3.a();
                            return;
                        case AUTOPLAY:
                        case AUTONAV:
                        case RETRY:
                            if (aimoVar3.h) {
                                aimoVar3.i++;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                aimo aimoVar4 = this.a;
                aigr aigrVar = (aigr) obj;
                axpg axpgVar = aimoVar4.c;
                if (axpgVar == null || ((!ahbw.i(((ahbd) axpgVar.get()).c(aims.c)) && !ahbw.i(((ahbd) aimoVar4.c.get()).c(aims.d))) || !aigrVar.a() || aimoVar4.i >= aimoVar4.a.g)) {
                    aimoVar4.a();
                    return;
                }
                if (((ahbd) aimoVar4.c.get()).c(aims.c) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.f);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.d) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.g);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.c) == 3) {
                    aimoVar4.j = true;
                }
            }
        });
        final int i2 = 4;
        this.o.f.X(new ayrs(this) { // from class: aimm
            public final /* synthetic */ aimo a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    aimo aimoVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahdvVar.c() != aigk.VIDEO_WATCH_LOADED || !aimoVar.j || ((ahbd) aimoVar.c.get()).c(aims.c) != 2) {
                        if (ahdvVar.c() == aigk.VIDEO_LOADING) {
                            aimoVar.j = false;
                            return;
                        }
                        return;
                    } else {
                        aimoVar.h = true;
                        aimoVar.b.post(aimoVar.f);
                        aimoVar.j = false;
                        return;
                    }
                }
                if (i22 == 1) {
                    this.a.a();
                    return;
                }
                if (i22 == 2) {
                    aimo aimoVar2 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() != aign.PLAYBACK_PENDING || aimoVar2.i <= 0) {
                        if (ahefVar.c() == aign.VIDEO_PLAYING) {
                            aimoVar2.a();
                            return;
                        }
                        return;
                    } else {
                        aimoVar2.k.f.c(new ahec());
                        return;
                    }
                }
                if (i22 == 3) {
                    aimo aimoVar3 = this.a;
                    aiey aieyVar = aiey.START;
                    switch (((aiez) obj).a()) {
                        case START:
                        case NEXT:
                        case PREVIOUS:
                        case JUMP:
                        case INSERT:
                            aimoVar3.a();
                            return;
                        case AUTOPLAY:
                        case AUTONAV:
                        case RETRY:
                            if (aimoVar3.h) {
                                aimoVar3.i++;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                aimo aimoVar4 = this.a;
                aigr aigrVar = (aigr) obj;
                axpg axpgVar = aimoVar4.c;
                if (axpgVar == null || ((!ahbw.i(((ahbd) axpgVar.get()).c(aims.c)) && !ahbw.i(((ahbd) aimoVar4.c.get()).c(aims.d))) || !aigrVar.a() || aimoVar4.i >= aimoVar4.a.g)) {
                    aimoVar4.a();
                    return;
                }
                if (((ahbd) aimoVar4.c.get()).c(aims.c) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.f);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.d) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.g);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.c) == 3) {
                    aimoVar4.j = true;
                }
            }
        });
        final int i3 = 3;
        this.l.X(new ayrs(this) { // from class: aimm
            public final /* synthetic */ aimo a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    aimo aimoVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahdvVar.c() != aigk.VIDEO_WATCH_LOADED || !aimoVar.j || ((ahbd) aimoVar.c.get()).c(aims.c) != 2) {
                        if (ahdvVar.c() == aigk.VIDEO_LOADING) {
                            aimoVar.j = false;
                            return;
                        }
                        return;
                    } else {
                        aimoVar.h = true;
                        aimoVar.b.post(aimoVar.f);
                        aimoVar.j = false;
                        return;
                    }
                }
                if (i22 == 1) {
                    this.a.a();
                    return;
                }
                if (i22 == 2) {
                    aimo aimoVar2 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() != aign.PLAYBACK_PENDING || aimoVar2.i <= 0) {
                        if (ahefVar.c() == aign.VIDEO_PLAYING) {
                            aimoVar2.a();
                            return;
                        }
                        return;
                    } else {
                        aimoVar2.k.f.c(new ahec());
                        return;
                    }
                }
                if (i22 == 3) {
                    aimo aimoVar3 = this.a;
                    aiey aieyVar = aiey.START;
                    switch (((aiez) obj).a()) {
                        case START:
                        case NEXT:
                        case PREVIOUS:
                        case JUMP:
                        case INSERT:
                            aimoVar3.a();
                            return;
                        case AUTOPLAY:
                        case AUTONAV:
                        case RETRY:
                            if (aimoVar3.h) {
                                aimoVar3.i++;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                aimo aimoVar4 = this.a;
                aigr aigrVar = (aigr) obj;
                axpg axpgVar = aimoVar4.c;
                if (axpgVar == null || ((!ahbw.i(((ahbd) axpgVar.get()).c(aims.c)) && !ahbw.i(((ahbd) aimoVar4.c.get()).c(aims.d))) || !aigrVar.a() || aimoVar4.i >= aimoVar4.a.g)) {
                    aimoVar4.a();
                    return;
                }
                if (((ahbd) aimoVar4.c.get()).c(aims.c) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.f);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.d) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.g);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.c) == 3) {
                    aimoVar4.j = true;
                }
            }
        });
        final int i4 = 1;
        this.n.X(new ayrs(this) { // from class: aimm
            public final /* synthetic */ aimo a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i4;
                if (i22 == 0) {
                    aimo aimoVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahdvVar.c() != aigk.VIDEO_WATCH_LOADED || !aimoVar.j || ((ahbd) aimoVar.c.get()).c(aims.c) != 2) {
                        if (ahdvVar.c() == aigk.VIDEO_LOADING) {
                            aimoVar.j = false;
                            return;
                        }
                        return;
                    } else {
                        aimoVar.h = true;
                        aimoVar.b.post(aimoVar.f);
                        aimoVar.j = false;
                        return;
                    }
                }
                if (i22 == 1) {
                    this.a.a();
                    return;
                }
                if (i22 == 2) {
                    aimo aimoVar2 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() != aign.PLAYBACK_PENDING || aimoVar2.i <= 0) {
                        if (ahefVar.c() == aign.VIDEO_PLAYING) {
                            aimoVar2.a();
                            return;
                        }
                        return;
                    } else {
                        aimoVar2.k.f.c(new ahec());
                        return;
                    }
                }
                if (i22 == 3) {
                    aimo aimoVar3 = this.a;
                    aiey aieyVar = aiey.START;
                    switch (((aiez) obj).a()) {
                        case START:
                        case NEXT:
                        case PREVIOUS:
                        case JUMP:
                        case INSERT:
                            aimoVar3.a();
                            return;
                        case AUTOPLAY:
                        case AUTONAV:
                        case RETRY:
                            if (aimoVar3.h) {
                                aimoVar3.i++;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                aimo aimoVar4 = this.a;
                aigr aigrVar = (aigr) obj;
                axpg axpgVar = aimoVar4.c;
                if (axpgVar == null || ((!ahbw.i(((ahbd) axpgVar.get()).c(aims.c)) && !ahbw.i(((ahbd) aimoVar4.c.get()).c(aims.d))) || !aigrVar.a() || aimoVar4.i >= aimoVar4.a.g)) {
                    aimoVar4.a();
                    return;
                }
                if (((ahbd) aimoVar4.c.get()).c(aims.c) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.f);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.d) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.g);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.c) == 3) {
                    aimoVar4.j = true;
                }
            }
        });
        final int i5 = 0;
        this.m.X(new ayrs(this) { // from class: aimm
            public final /* synthetic */ aimo a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i5;
                if (i22 == 0) {
                    aimo aimoVar = this.a;
                    ahdv ahdvVar = (ahdv) obj;
                    if (ahdvVar.c() != aigk.VIDEO_WATCH_LOADED || !aimoVar.j || ((ahbd) aimoVar.c.get()).c(aims.c) != 2) {
                        if (ahdvVar.c() == aigk.VIDEO_LOADING) {
                            aimoVar.j = false;
                            return;
                        }
                        return;
                    } else {
                        aimoVar.h = true;
                        aimoVar.b.post(aimoVar.f);
                        aimoVar.j = false;
                        return;
                    }
                }
                if (i22 == 1) {
                    this.a.a();
                    return;
                }
                if (i22 == 2) {
                    aimo aimoVar2 = this.a;
                    ahef ahefVar = (ahef) obj;
                    if (ahefVar.c() != aign.PLAYBACK_PENDING || aimoVar2.i <= 0) {
                        if (ahefVar.c() == aign.VIDEO_PLAYING) {
                            aimoVar2.a();
                            return;
                        }
                        return;
                    } else {
                        aimoVar2.k.f.c(new ahec());
                        return;
                    }
                }
                if (i22 == 3) {
                    aimo aimoVar3 = this.a;
                    aiey aieyVar = aiey.START;
                    switch (((aiez) obj).a()) {
                        case START:
                        case NEXT:
                        case PREVIOUS:
                        case JUMP:
                        case INSERT:
                            aimoVar3.a();
                            return;
                        case AUTOPLAY:
                        case AUTONAV:
                        case RETRY:
                            if (aimoVar3.h) {
                                aimoVar3.i++;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                aimo aimoVar4 = this.a;
                aigr aigrVar = (aigr) obj;
                axpg axpgVar = aimoVar4.c;
                if (axpgVar == null || ((!ahbw.i(((ahbd) axpgVar.get()).c(aims.c)) && !ahbw.i(((ahbd) aimoVar4.c.get()).c(aims.d))) || !aigrVar.a() || aimoVar4.i >= aimoVar4.a.g)) {
                    aimoVar4.a();
                    return;
                }
                if (((ahbd) aimoVar4.c.get()).c(aims.c) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.f);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.d) == 2) {
                    aimoVar4.h = true;
                    aimoVar4.b.post(aimoVar4.g);
                } else if (((ahbd) aimoVar4.c.get()).c(aims.c) == 3) {
                    aimoVar4.j = true;
                }
            }
        });
    }
}
