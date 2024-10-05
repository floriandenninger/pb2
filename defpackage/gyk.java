package defpackage;

import android.graphics.Rect;
import android.widget.SeekBar;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyk extends akk {
    final /* synthetic */ gym f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyk(gym gymVar) {
        super(gymVar);
        this.f = gymVar;
    }

    @Override // defpackage.akk
    protected final int k(float f, float f2) {
        if (this.f.s.contains(f, f2)) {
            return 0;
        }
        if (this.f.t.contains(f, f2)) {
            return 1;
        }
        return this.f.u.contains(f, f2) ? 2 : -1;
    }

    @Override // defpackage.akk
    protected final void m(List list) {
        list.add(0);
        list.add(2);
        list.add(1);
    }

    @Override // defpackage.akk
    protected final void q(int i, ks ksVar) {
        String str;
        Rect rect = new Rect();
        if (i == 0) {
            gym gymVar = this.f;
            str = gymVar.n;
            gymVar.s.round(rect);
        } else if (i == 1) {
            gym gymVar2 = this.f;
            str = gymVar2.o;
            gymVar2.t.round(rect);
        } else if (i == 2) {
            gym gymVar3 = this.f;
            str = gymVar3.m;
            gymVar3.u.round(rect);
        } else {
            StringBuilder sb = new StringBuilder(36);
            sb.append("invalid virtual view id: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        ksVar.v(str);
        ksVar.r(SeekBar.class.getName());
        ksVar.n(rect);
        ksVar.h(4096);
        ksVar.h(8192);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.akk
    public final boolean u(int i, int i2) {
        zfi zfiVar;
        final int i3 = 0;
        final int i4 = 1;
        if (i == 0) {
            zfiVar = new zfi(this) { // from class: gyj
                public final /* synthetic */ gyk a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj) {
                    int i5 = i4;
                    if (i5 == 0) {
                        gym gymVar = this.a.f;
                        gymVar.b(gymVar.r + ((Float) obj).floatValue());
                    } else if (i5 == 1) {
                        gym gymVar2 = this.a.f;
                        gymVar2.c(gymVar2.q + ((Float) obj).floatValue());
                    } else {
                        gym gymVar3 = this.a.f;
                        gymVar3.d(gymVar3.u.centerX() + (r0.f.getMeasuredWidth() * ((Float) obj).floatValue()));
                    }
                }
            };
        } else if (i == 1) {
            zfiVar = new zfi(this) { // from class: gyj
                public final /* synthetic */ gyk a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj) {
                    int i5 = i3;
                    if (i5 == 0) {
                        gym gymVar = this.a.f;
                        gymVar.b(gymVar.r + ((Float) obj).floatValue());
                    } else if (i5 == 1) {
                        gym gymVar2 = this.a.f;
                        gymVar2.c(gymVar2.q + ((Float) obj).floatValue());
                    } else {
                        gym gymVar3 = this.a.f;
                        gymVar3.d(gymVar3.u.centerX() + (r0.f.getMeasuredWidth() * ((Float) obj).floatValue()));
                    }
                }
            };
        } else {
            final int i5 = 2;
            if (i == 2) {
                zfiVar = new zfi(this) { // from class: gyj
                    public final /* synthetic */ gyk a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        int i52 = i5;
                        if (i52 == 0) {
                            gym gymVar = this.a.f;
                            gymVar.b(gymVar.r + ((Float) obj).floatValue());
                        } else if (i52 == 1) {
                            gym gymVar2 = this.a.f;
                            gymVar2.c(gymVar2.q + ((Float) obj).floatValue());
                        } else {
                            gym gymVar3 = this.a.f;
                            gymVar3.d(gymVar3.u.centerX() + (r0.f.getMeasuredWidth() * ((Float) obj).floatValue()));
                        }
                    }
                };
            } else {
                StringBuilder sb = new StringBuilder(35);
                sb.append("invalid virtual view id:");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i2 != 4096 && i2 != 8192) {
            return false;
        }
        float f = this.f.l;
        if (i2 == 8192) {
            f = -f;
        }
        zfiVar.a(Float.valueOf(f));
        gyl gylVar = this.f.p;
        if (gylVar != null) {
            gylVar.a();
        }
        o(i, 0);
        v(i, 4);
        return true;
    }
}
