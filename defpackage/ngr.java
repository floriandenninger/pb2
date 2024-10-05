package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngr implements ngy {
    public nck a;
    public apxf b;
    public List c;
    public apxf d;
    public apxf e;
    public boolean f;
    public gol g;
    public aahd h;
    public ajok i;
    public mhg j;
    private final /* synthetic */ int k;

    public ngr(int i) {
        this.k = i;
    }

    @Override // defpackage.ngy
    public final void j(nck nckVar) {
        int i = this.k;
        this.a = nckVar;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object e() {
        return this.k != 0 ? augr.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_NOOP : augs.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_NOOP;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object f() {
        return this.k != 0 ? augr.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE : augs.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_PLAY_VIDEO_ON_WATCH_PAGE;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object g() {
        return this.k != 0 ? augr.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN : augs.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
    }

    @Override // defpackage.ngy
    public final void i() {
        if (this.k != 0) {
            this.a.q(this.b);
        } else {
            this.a.q(this.b);
        }
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Integer c(Object obj) {
        if (this.k != 0) {
            augv augvVar = (augv) obj;
            if (augvVar == null || (augvVar.b & 2) == 0) {
                return null;
            }
            return Integer.valueOf(augvVar.d);
        }
        augw augwVar = (augw) obj;
        if (augwVar == null || (augwVar.b & 2) == 0) {
            return null;
        }
        return Integer.valueOf(augwVar.d);
    }

    @Override // defpackage.ngy
    public final /* synthetic */ Object d(Object obj) {
        if (this.k != 0) {
            augv augvVar = (augv) obj;
            if (augvVar == null || (augvVar.b & 4) == 0) {
                return augr.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
            }
            augr b = augr.b(augvVar.e);
            return b == null ? augr.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN : b;
        }
        augw augwVar = (augw) obj;
        if (augwVar == null || (augwVar.b & 4) == 0) {
            return augs.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        }
        augs b2 = augs.b(augwVar.e);
        return b2 == null ? augs.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN : b2;
    }

    @Override // defpackage.ngy
    public final /* synthetic */ void h(Map map, Object[] objArr) {
        int i = 0;
        if (this.k == 0) {
            augw[] augwVarArr = (augw[]) objArr;
            int length = augwVarArr.length;
            while (i < length) {
                augw augwVar = augwVarArr[i];
                augq b = augq.b(augwVar.c);
                if (b == null) {
                    b = augq.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
                }
                map.put(b, augwVar);
                i++;
            }
            return;
        }
        augv[] augvVarArr = (augv[]) objArr;
        int length2 = augvVarArr.length;
        while (i < length2) {
            augv augvVar = augvVarArr[i];
            augq b2 = augq.b(augvVar.c);
            if (b2 == null) {
                b2 = augq.PROMOTED_SPARKLES_CLICK_LOCATION_UNKNOWN;
            }
            map.put(b2, augvVar);
            i++;
        }
    }

    @Override // defpackage.ngy
    public final /* synthetic */ ngw b(Object obj) {
        final int i = 0;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        if (this.k == 0) {
            ngw ngwVar = new ngw();
            augs augsVar = augs.PROMOTED_SPARKLES_VIDEO_APP_CLICK_BEHAVIOR_TYPE_UNKNOWN;
            int ordinal = ((augs) obj).ordinal();
            if (ordinal == 1) {
                ngwVar.c = new Runnable(this) { // from class: ngq
                    public final /* synthetic */ ngr a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i4;
                        if (i5 == 0) {
                            ngr ngrVar = this.a;
                            muf.o(ngrVar.f, ngrVar.g, ngrVar.h, ngrVar.i, ngrVar.j, ngrVar.a, ngrVar.b);
                        } else if (i5 == 1) {
                            ngr ngrVar2 = this.a;
                            ngrVar2.a.e(ngrVar2.c, true);
                        } else if (i5 != 2) {
                            ngr ngrVar3 = this.a;
                            ngrVar3.a.q(ngrVar3.e);
                        } else {
                            ngr ngrVar4 = this.a;
                            ngrVar4.a.q(ngrVar4.d);
                        }
                    }
                };
                ngwVar.a = true;
                ngwVar.b = true;
            } else if (ordinal == 2) {
                ngwVar.c = new Runnable(this) { // from class: ngq
                    public final /* synthetic */ ngr a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i;
                        if (i5 == 0) {
                            ngr ngrVar = this.a;
                            muf.o(ngrVar.f, ngrVar.g, ngrVar.h, ngrVar.i, ngrVar.j, ngrVar.a, ngrVar.b);
                        } else if (i5 == 1) {
                            ngr ngrVar2 = this.a;
                            ngrVar2.a.e(ngrVar2.c, true);
                        } else if (i5 != 2) {
                            ngr ngrVar3 = this.a;
                            ngrVar3.a.q(ngrVar3.e);
                        } else {
                            ngr ngrVar4 = this.a;
                            ngrVar4.a.q(ngrVar4.d);
                        }
                    }
                };
                ngwVar.a = true;
            } else if (ordinal == 3) {
                ngwVar.c = new Runnable(this) { // from class: ngq
                    public final /* synthetic */ ngr a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i3;
                        if (i5 == 0) {
                            ngr ngrVar = this.a;
                            muf.o(ngrVar.f, ngrVar.g, ngrVar.h, ngrVar.i, ngrVar.j, ngrVar.a, ngrVar.b);
                        } else if (i5 == 1) {
                            ngr ngrVar2 = this.a;
                            ngrVar2.a.e(ngrVar2.c, true);
                        } else if (i5 != 2) {
                            ngr ngrVar3 = this.a;
                            ngrVar3.a.q(ngrVar3.e);
                        } else {
                            ngr ngrVar4 = this.a;
                            ngrVar4.a.q(ngrVar4.d);
                        }
                    }
                };
                ngwVar.a = true;
            } else if (ordinal == 4) {
                ngwVar.c = new Runnable(this) { // from class: ngq
                    public final /* synthetic */ ngr a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i2;
                        if (i5 == 0) {
                            ngr ngrVar = this.a;
                            muf.o(ngrVar.f, ngrVar.g, ngrVar.h, ngrVar.i, ngrVar.j, ngrVar.a, ngrVar.b);
                        } else if (i5 == 1) {
                            ngr ngrVar2 = this.a;
                            ngrVar2.a.e(ngrVar2.c, true);
                        } else if (i5 != 2) {
                            ngr ngrVar3 = this.a;
                            ngrVar3.a.q(ngrVar3.e);
                        } else {
                            ngr ngrVar4 = this.a;
                            ngrVar4.a.q(ngrVar4.d);
                        }
                    }
                };
                ngwVar.a = true;
            }
            return ngwVar;
        }
        ngw ngwVar2 = new ngw();
        augr augrVar = augr.PROMOTED_SPARKLES_VIDEO_ACTION_CLICK_BEHAVIOR_TYPE_UNKNOWN;
        int ordinal2 = ((augr) obj).ordinal();
        final byte[] bArr = null;
        if (ordinal2 == 1) {
            ngwVar2.c = new Runnable(this, i4, bArr) { // from class: ngp
                public final /* synthetic */ ngr a;
                private final /* synthetic */ int b;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = this.b;
                    if (i5 == 0) {
                        ngr ngrVar = this.a;
                        muf.o(ngrVar.f, ngrVar.g, ngrVar.h, ngrVar.i, ngrVar.j, ngrVar.a, ngrVar.b);
                    } else if (i5 == 1) {
                        ngr ngrVar2 = this.a;
                        ngrVar2.a.e(ngrVar2.c, true);
                    } else if (i5 != 2) {
                        ngr ngrVar3 = this.a;
                        ngrVar3.a.q(ngrVar3.e);
                    } else {
                        ngr ngrVar4 = this.a;
                        ngrVar4.a.q(ngrVar4.d);
                    }
                }
            };
            ngwVar2.a = true;
            ngwVar2.b = true;
        } else if (ordinal2 == 2) {
            ngwVar2.c = new Runnable(this, i, bArr) { // from class: ngp
                public final /* synthetic */ ngr a;
                private final /* synthetic */ int b;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = this.b;
                    if (i5 == 0) {
                        ngr ngrVar = this.a;
                        muf.o(ngrVar.f, ngrVar.g, ngrVar.h, ngrVar.i, ngrVar.j, ngrVar.a, ngrVar.b);
                    } else if (i5 == 1) {
                        ngr ngrVar2 = this.a;
                        ngrVar2.a.e(ngrVar2.c, true);
                    } else if (i5 != 2) {
                        ngr ngrVar3 = this.a;
                        ngrVar3.a.q(ngrVar3.e);
                    } else {
                        ngr ngrVar4 = this.a;
                        ngrVar4.a.q(ngrVar4.d);
                    }
                }
            };
            ngwVar2.a = true;
        } else if (ordinal2 == 3) {
            ngwVar2.c = new Runnable(this, i3, bArr) { // from class: ngp
                public final /* synthetic */ ngr a;
                private final /* synthetic */ int b;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = this.b;
                    if (i5 == 0) {
                        ngr ngrVar = this.a;
                        muf.o(ngrVar.f, ngrVar.g, ngrVar.h, ngrVar.i, ngrVar.j, ngrVar.a, ngrVar.b);
                    } else if (i5 == 1) {
                        ngr ngrVar2 = this.a;
                        ngrVar2.a.e(ngrVar2.c, true);
                    } else if (i5 != 2) {
                        ngr ngrVar3 = this.a;
                        ngrVar3.a.q(ngrVar3.e);
                    } else {
                        ngr ngrVar4 = this.a;
                        ngrVar4.a.q(ngrVar4.d);
                    }
                }
            };
            ngwVar2.a = true;
        } else if (ordinal2 == 4) {
            ngwVar2.c = new Runnable(this, i2, bArr) { // from class: ngp
                public final /* synthetic */ ngr a;
                private final /* synthetic */ int b;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i5 = this.b;
                    if (i5 == 0) {
                        ngr ngrVar = this.a;
                        muf.o(ngrVar.f, ngrVar.g, ngrVar.h, ngrVar.i, ngrVar.j, ngrVar.a, ngrVar.b);
                    } else if (i5 == 1) {
                        ngr ngrVar2 = this.a;
                        ngrVar2.a.e(ngrVar2.c, true);
                    } else if (i5 != 2) {
                        ngr ngrVar3 = this.a;
                        ngrVar3.a.q(ngrVar3.e);
                    } else {
                        ngr ngrVar4 = this.a;
                        ngrVar4.a.q(ngrVar4.d);
                    }
                }
            };
            ngwVar2.a = true;
        }
        return ngwVar2;
    }
}
