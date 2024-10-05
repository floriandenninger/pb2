package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rei extends reh {
    final /* synthetic */ rej a;
    private final rkr h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rei(rej rejVar, String str, int i, rkr rkrVar) {
        super(str, i);
        this.a = rejVar;
        this.h = rkrVar;
    }

    @Override // defpackage.reh
    public final int a() {
        return this.h.c;
    }

    @Override // defpackage.reh
    public final boolean b() {
        return false;
    }

    @Override // defpackage.reh
    public final boolean c() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(Long l, Long l2, rlh rlhVar, boolean z) {
        axus.b();
        boolean p = this.a.J().p(this.b, rfd.X);
        rkr rkrVar = this.h;
        boolean z2 = rkrVar.f;
        boolean z3 = rkrVar.g;
        boolean z4 = rkrVar.h;
        boolean z5 = z2 || z3 || z4;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (!z || z5) {
            rkp rkpVar = rkrVar.e;
            if (rkpVar == null) {
                rkpVar = rkp.a;
            }
            boolean z6 = rkpVar.e;
            int i = rlhVar.b;
            if ((i & 8) != 0) {
                if ((rkpVar.b & 2) != 0) {
                    long j = rlhVar.f;
                    rkq rkqVar = rkpVar.d;
                    if (rkqVar == null) {
                        rkqVar = rkq.a;
                    }
                    bool = j(h(j, rkqVar), z6);
                } else {
                    this.a.aF().f.b("No number filter for long property. property", this.a.L().e(rlhVar.d));
                }
            } else if ((i & 32) != 0) {
                if ((rkpVar.b & 2) != 0) {
                    double d = rlhVar.g;
                    rkq rkqVar2 = rkpVar.d;
                    if (rkqVar2 == null) {
                        rkqVar2 = rkq.a;
                    }
                    bool = j(g(d, rkqVar2), z6);
                } else {
                    this.a.aF().f.b("No number filter for double property. property", this.a.L().e(rlhVar.d));
                }
            } else if ((i & 4) != 0) {
                int i2 = rkpVar.b;
                if ((i2 & 1) != 0) {
                    String str = rlhVar.e;
                    rks rksVar = rkpVar.c;
                    if (rksVar == null) {
                        rksVar = rks.a;
                    }
                    bool = j(f(str, rksVar, this.a.aF()), z6);
                } else if ((i2 & 2) != 0) {
                    if (rkj.s(rlhVar.e)) {
                        String str2 = rlhVar.e;
                        rkq rkqVar3 = rkpVar.d;
                        if (rkqVar3 == null) {
                            rkqVar3 = rkq.a;
                        }
                        bool = j(i(str2, rkqVar3), z6);
                    } else {
                        this.a.aF().f.c("Invalid user property value for Numeric number filter. property, value", this.a.L().e(rlhVar.d), rlhVar.e);
                    }
                } else {
                    this.a.aF().f.b("No string or number filter defined. property", this.a.L().e(rlhVar.d));
                }
            } else {
                this.a.aF().f.b("User property has no value, property", this.a.L().e(rlhVar.d));
            }
            this.a.aF().k.b("Property filter result", bool == null ? "null" : bool);
            if (bool == null) {
                return false;
            }
            this.d = true;
            if (z4 && !bool.booleanValue()) {
                return true;
            }
            if (!z || this.h.f) {
                this.e = bool;
            }
            if (bool.booleanValue() && z5 && (rlhVar.b & 1) != 0) {
                long j2 = rlhVar.c;
                if (l != null) {
                    j2 = l.longValue();
                }
                if (p) {
                    rkr rkrVar2 = this.h;
                    if (rkrVar2.f && !rkrVar2.g && l2 != null) {
                        j2 = l2.longValue();
                    }
                }
                if (this.h.g) {
                    this.g = Long.valueOf(j2);
                } else {
                    this.f = Long.valueOf(j2);
                }
            }
            return true;
        }
        rfn rfnVar = this.a.aF().k;
        Integer valueOf = Integer.valueOf(this.c);
        rkr rkrVar3 = this.h;
        rfnVar.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, (rkrVar3.b & 1) != 0 ? Integer.valueOf(rkrVar3.c) : null);
        return true;
    }
}
