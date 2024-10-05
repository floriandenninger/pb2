package defpackage;

import android.content.Context;
import android.text.format.DateUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aflr implements swv {
    public final Context a;
    public final sxd b;
    private final /* synthetic */ int c;

    public aflr(Context context, sxd sxdVar, int i) {
        this.c = i;
        this.a = context;
        this.b = sxdVar;
    }

    @Override // defpackage.swv
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.swv
    public final aomu a() {
        int i = this.c;
        if (i == 0) {
            return aqdk.b;
        }
        if (i != 1) {
            return i != 2 ? aqdj.b : auts.b;
        }
        return aqdl.b;
    }

    @Override // defpackage.swv
    public final /* synthetic */ ayph b(Object obj, swu swuVar) {
        int i = this.c;
        if (i == 0) {
            final aqdk aqdkVar = (aqdk) obj;
            return adyu.I(this.b, aqdkVar.c).g(new ayrv() { // from class: aflq
                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    final aflr aflrVar = aflr.this;
                    final aqdk aqdkVar2 = aqdkVar;
                    final aufh aufhVar = (aufh) obj2;
                    return (aufhVar.b & 32) != 0 ? ayph.f() : ayph.t(new ayrm() { // from class: aflp
                        @Override // defpackage.ayrm
                        public final void a() {
                            aflr aflrVar2 = aflr.this;
                            aqdk aqdkVar3 = aqdkVar2;
                            aufh aufhVar2 = aufhVar;
                            long j = new bajg().d(0).f(0).j().i().a;
                            String J2 = adyu.J(j, aflrVar2.a);
                            sxd sxdVar = aflrVar2.b;
                            String str = aqdkVar3.c;
                            aone builder = aufhVar2.toBuilder();
                            aufi aufiVar = aufhVar2.e;
                            if (aufiVar == null) {
                                aufiVar = aufi.a;
                            }
                            aone builder2 = aufiVar.toBuilder();
                            builder2.copyOnWrite();
                            aufi aufiVar2 = (aufi) builder2.instance;
                            J2.getClass();
                            aufiVar2.b |= 2;
                            aufiVar2.d = J2;
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
                            builder2.copyOnWrite();
                            aufi aufiVar3 = (aufi) builder2.instance;
                            aufiVar3.b |= 1;
                            aufiVar3.c = seconds;
                            builder.copyOnWrite();
                            aufh aufhVar3 = (aufh) builder.instance;
                            aufi aufiVar4 = (aufi) builder2.build();
                            aufiVar4.getClass();
                            aufhVar3.e = aufiVar4;
                            aufhVar3.b |= 32;
                            sxdVar.b(str, ((aufh) builder.build()).toByteArray());
                        }
                    });
                }
            });
        }
        final int i2 = 1;
        final byte[] bArr = null;
        if (i == 1) {
            final aqdl aqdlVar = (aqdl) obj;
            return adyu.I(this.b, aqdlVar.c).g(new ayrv(aqdlVar, bArr) { // from class: aflt
                public final /* synthetic */ aqdl a;

                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    aufh aufhVar = (aufh) obj2;
                    return (aufhVar.b & 32) != 0 ? ayph.t(new ayrm(this.a, aufhVar, null) { // from class: afls
                        public final /* synthetic */ aqdl a;
                        public final /* synthetic */ aufh b;

                        @Override // defpackage.ayrm
                        public final void a() {
                            aflr aflrVar = aflr.this;
                            aqdl aqdlVar2 = this.a;
                            aufh aufhVar2 = this.b;
                            aufi aufiVar = aufhVar2.e;
                            if (aufiVar == null) {
                                aufiVar = aufi.a;
                            }
                            String J2 = adyu.J(TimeUnit.SECONDS.toMillis(aufiVar.c), aflrVar.a);
                            sxd sxdVar = aflrVar.b;
                            String str = aqdlVar2.c;
                            aone builder = aufhVar2.toBuilder();
                            aufi aufiVar2 = aufhVar2.e;
                            if (aufiVar2 == null) {
                                aufiVar2 = aufi.a;
                            }
                            aone builder2 = aufiVar2.toBuilder();
                            builder2.copyOnWrite();
                            aufi aufiVar3 = (aufi) builder2.instance;
                            J2.getClass();
                            aufiVar3.b |= 2;
                            aufiVar3.d = J2;
                            builder.copyOnWrite();
                            aufh aufhVar3 = (aufh) builder.instance;
                            aufi aufiVar4 = (aufi) builder2.build();
                            aufiVar4.getClass();
                            aufhVar3.e = aufiVar4;
                            aufhVar3.b |= 32;
                            sxdVar.b(str, ((aufh) builder.build()).toByteArray());
                        }
                    }) : ayph.f();
                }
            });
        }
        if (i == 2) {
            final auts autsVar = (auts) obj;
            final int i3 = 0;
            return adyu.I(this.b, autsVar.c).Y(afly.d).M(new ayrv(this, i2, bArr) { // from class: afmc
                public final /* synthetic */ aflr a;
                private final /* synthetic */ int b;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    if (this.b == 0) {
                        final afme afmeVar = (afme) obj2;
                        final int i4 = 0;
                        return aypy.v(new xzs(this.a.a, afmeVar.a, 3)).Y(new ayrv() { // from class: afmb
                            @Override // defpackage.ayrv
                            public final Object a(Object obj3) {
                                if (i4 == 0) {
                                    return new afme((bajg) obj3, afmeVar.b);
                                }
                                return new afme((bajg) obj3, afmeVar.b);
                            }
                        });
                    }
                    final afme afmeVar2 = (afme) obj2;
                    final int i5 = 1;
                    return aypy.v(new xzs(afmeVar2.a, this.a.a, 2)).Y(new ayrv() { // from class: afmb
                        @Override // defpackage.ayrv
                        public final Object a(Object obj3) {
                            if (i5 == 0) {
                                return new afme((bajg) obj3, afmeVar2.b);
                            }
                            return new afme((bajg) obj3, afmeVar2.b);
                        }
                    });
                }
            }).M(new ayrv(this, i3, bArr) { // from class: afmc
                public final /* synthetic */ aflr a;
                private final /* synthetic */ int b;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    if (this.b == 0) {
                        final afme afmeVar = (afme) obj2;
                        final int i4 = 0;
                        return aypy.v(new xzs(this.a.a, afmeVar.a, 3)).Y(new ayrv() { // from class: afmb
                            @Override // defpackage.ayrv
                            public final Object a(Object obj3) {
                                if (i4 == 0) {
                                    return new afme((bajg) obj3, afmeVar.b);
                                }
                                return new afme((bajg) obj3, afmeVar.b);
                            }
                        });
                    }
                    final afme afmeVar2 = (afme) obj2;
                    final int i5 = 1;
                    return aypy.v(new xzs(afmeVar2.a, this.a.a, 2)).Y(new ayrv() { // from class: afmb
                        @Override // defpackage.ayrv
                        public final Object a(Object obj3) {
                            if (i5 == 0) {
                                return new afme((bajg) obj3, afmeVar2.b);
                            }
                            return new afme((bajg) obj3, afmeVar2.b);
                        }
                    });
                }
            }).g(new ayrv(autsVar, bArr) { // from class: afmd
                public final /* synthetic */ auts a;

                @Override // defpackage.ayrv
                public final Object a(Object obj2) {
                    return ayph.t(new ayrm(this.a, (afme) obj2, null) { // from class: afma
                        public final /* synthetic */ auts a;
                        public final /* synthetic */ afme b;

                        @Override // defpackage.ayrm
                        public final void a() {
                            String str;
                            aflr aflrVar = aflr.this;
                            auts autsVar2 = this.a;
                            afme afmeVar = this.b;
                            long j = afmeVar.a.a;
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
                            String J2 = adyu.J(j, aflrVar.a);
                            sxd sxdVar = aflrVar.b;
                            String str2 = autsVar2.c;
                            aone builder = afmeVar.b.toBuilder();
                            int i4 = 5;
                            if (autsVar2.e) {
                                aufh aufhVar = afmeVar.b;
                                if ((aufhVar.b & 2) != 0 && (i4 = anaf.bv(aufhVar.c)) == 0) {
                                    i4 = 1;
                                }
                            }
                            builder.copyOnWrite();
                            aufh aufhVar2 = (aufh) builder.instance;
                            aufhVar2.c = i4 - 1;
                            aufhVar2.b |= 2;
                            if (autsVar2.e) {
                                aufh aufhVar3 = afmeVar.b;
                                if ((aufhVar3.b & 4) != 0) {
                                    str = aufhVar3.d;
                                    builder.copyOnWrite();
                                    aufh aufhVar4 = (aufh) builder.instance;
                                    str.getClass();
                                    aufhVar4.b |= 4;
                                    aufhVar4.d = str;
                                    aone createBuilder = aufi.a.createBuilder();
                                    createBuilder.copyOnWrite();
                                    aufi aufiVar = (aufi) createBuilder.instance;
                                    aufiVar.b |= 1;
                                    aufiVar.c = seconds;
                                    createBuilder.copyOnWrite();
                                    aufi aufiVar2 = (aufi) createBuilder.instance;
                                    J2.getClass();
                                    aufiVar2.b |= 2;
                                    aufiVar2.d = J2;
                                    builder.copyOnWrite();
                                    aufh aufhVar5 = (aufh) builder.instance;
                                    aufi aufiVar3 = (aufi) createBuilder.build();
                                    aufiVar3.getClass();
                                    aufhVar5.e = aufiVar3;
                                    aufhVar5.b |= 32;
                                    sxdVar.b(str2, ((aufh) builder.build()).toByteArray());
                                }
                            }
                            str = autsVar2.d;
                            builder.copyOnWrite();
                            aufh aufhVar42 = (aufh) builder.instance;
                            str.getClass();
                            aufhVar42.b |= 4;
                            aufhVar42.d = str;
                            aone createBuilder2 = aufi.a.createBuilder();
                            createBuilder2.copyOnWrite();
                            aufi aufiVar4 = (aufi) createBuilder2.instance;
                            aufiVar4.b |= 1;
                            aufiVar4.c = seconds;
                            createBuilder2.copyOnWrite();
                            aufi aufiVar22 = (aufi) createBuilder2.instance;
                            J2.getClass();
                            aufiVar22.b |= 2;
                            aufiVar22.d = J2;
                            builder.copyOnWrite();
                            aufh aufhVar52 = (aufh) builder.instance;
                            aufi aufiVar32 = (aufi) createBuilder2.build();
                            aufiVar32.getClass();
                            aufhVar52.e = aufiVar32;
                            aufhVar52.b |= 32;
                            sxdVar.b(str2, ((aufh) builder.build()).toByteArray());
                        }
                    });
                }
            });
        }
        final aqdj aqdjVar = (aqdj) obj;
        return ayph.t(new ayrm(aqdjVar, bArr) { // from class: akoc
            public final /* synthetic */ aqdj a;

            @Override // defpackage.ayrm
            public final void a() {
                int i4;
                aflr aflrVar = aflr.this;
                aqdj aqdjVar2 = this.a;
                int i5 = aqdjVar2.c;
                if ((i5 & 2) == 0 || (i5 & 1) == 0) {
                    return;
                }
                long millis = TimeUnit.SECONDS.toMillis(aqdjVar2.d);
                String str = aqdjVar2.e;
                Context context = aflrVar.a;
                if (aqdjVar2.g) {
                    i4 = 65557;
                } else {
                    i4 = aqdjVar2.f ? 65556 : 0;
                }
                String formatDateTime = DateUtils.formatDateTime(context, millis, i4);
                sxd sxdVar = aflrVar.b;
                aone createBuilder = avhk.a.createBuilder();
                createBuilder.copyOnWrite();
                avhk avhkVar = (avhk) createBuilder.instance;
                str.getClass();
                avhkVar.b |= 1;
                avhkVar.c = str;
                createBuilder.copyOnWrite();
                avhk avhkVar2 = (avhk) createBuilder.instance;
                formatDateTime.getClass();
                avhkVar2.b |= 4;
                avhkVar2.e = formatDateTime;
                sxdVar.b(str, ((avhk) createBuilder.build()).toByteArray());
            }
        });
    }
}
