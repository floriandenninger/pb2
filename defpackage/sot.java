package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentConfig;
import com.google.android.libraries.elements.interfaces.ComponentElement;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.EntitiesProcessorResolver;
import com.google.android.libraries.elements.interfaces.JSEntitiesProcessors;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.youtube.android.libraries.elements.StatusOr;
import com.youtube.android.libraries.elements.templates.UnifiedTemplateResolver;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sot implements spz {
    public static final /* synthetic */ int n = 0;
    private static final aomw o;
    public final sxd a;
    public final syd b;
    public final szj c;
    public final szc d;
    public final axpg e;
    public final suz f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final ComponentConfig j;
    public final boolean k;
    public final azrw l;
    public final azrw m;
    private final ammv p;
    private final boolean q;
    private final ammv r;

    static {
        aomw c = aomw.c();
        c.e(awqf.b);
        c.e(awob.b);
        o = c;
    }

    public sot(szj szjVar, sxd sxdVar, ammv ammvVar, syd sydVar, szc szcVar, axpg axpgVar, suz suzVar, azrw azrwVar, azrw azrwVar2, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4, ammv ammvVar5, ammv ammvVar6, ammv ammvVar7, ammv ammvVar8, ammv ammvVar9) {
        this.c = szjVar;
        this.a = sxdVar;
        this.p = ammvVar;
        this.b = sydVar;
        this.d = szcVar;
        this.f = suzVar;
        this.i = ((Boolean) ammvVar2.e(false)).booleanValue();
        this.q = ((Boolean) ammvVar3.e(false)).booleanValue();
        this.g = ((Boolean) ammvVar5.e(true)).booleanValue();
        this.h = ((Boolean) ammvVar4.e(false)).booleanValue();
        this.e = axpgVar;
        this.j = new ComponentConfig(((Boolean) ammvVar6.e(false)).booleanValue(), ((Integer) ammvVar7.e(0)).intValue());
        this.k = ((Boolean) ammvVar8.e(false)).booleanValue();
        this.l = azrwVar;
        this.m = azrwVar2;
        this.r = ammvVar9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(ByteBuffer byteBuffer) {
        try {
            awqd awqdVar = ((awos) aonm.parseFrom(awos.a, byteBuffer, o)).c;
            if (awqdVar == null) {
                awqdVar = awqd.a;
            }
            awpz awpzVar = ((awob) awqdVar.pX(awob.b)).d;
            if (awpzVar == null) {
                awpzVar = awpz.a;
            }
            awqf awqfVar = (awqf) awpzVar.pX(awqf.b);
            return (awqfVar.c & 1) != 0 ? awqfVar.d : "Unknown template";
        } catch (aoob unused) {
            return "Unknown template";
        }
    }

    @Override // defpackage.spz
    public final /* bridge */ /* synthetic */ dgy a(dhe dheVar, final sxc sxcVar, Object obj, final String str, final aoam aoamVar, sod sodVar, List list) {
        final axop axopVar = (axop) obj;
        szf szfVar = szf.b;
        szf szfVar2 = sxcVar.e;
        if (szfVar2 != null) {
            szfVar = szfVar2;
        }
        final szh a = szfVar.a();
        aypy y = aypy.y(new Callable() { // from class: soi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte[] bArr;
                final List list2;
                aypy Y;
                aypy aj;
                final sot sotVar = sot.this;
                final sxc sxcVar2 = sxcVar;
                final axop axopVar2 = axopVar;
                final String str2 = str;
                final aoam aoamVar2 = aoamVar;
                final szh szhVar = a;
                final boolean z = sotVar.h;
                final String k = ((sxe) sotVar.m.get()).a() ? svv.k(aoamVar2) : null;
                if (z && (!sotVar.i || sotVar.k)) {
                    aj = sotVar.b(axopVar2.aJ(), sxcVar2, szhVar, k, axopVar2.aL());
                } else {
                    if (!z || !sotVar.i) {
                        ByteBuffer i = axopVar2.i(6);
                        if (i == null) {
                            throw new syf("Invalid ComponentType: null templateConfig");
                        }
                        int b = axopVar2.b(6);
                        bArr = new byte[b != 0 ? axopVar2.d(b) : 0];
                        i.get(bArr);
                    } else {
                        aomw c = aomw.c();
                        c.e(awob.b);
                        try {
                            awos awosVar = (awos) aonm.parseFrom(awos.a, axopVar2.aJ(), c);
                            awqd awqdVar = awosVar.c;
                            if (awqdVar == null) {
                                awqdVar = awqd.a;
                            }
                            if (awqdVar.pY(awob.b)) {
                                awqd awqdVar2 = awosVar.c;
                                if (awqdVar2 == null) {
                                    awqdVar2 = awqd.a;
                                }
                                awob awobVar = (awob) awqdVar2.pX(awob.b);
                                if ((awobVar.c & 2) == 0) {
                                    throw new syf("Invalid ComponentType: null templateConfig");
                                }
                                awpz awpzVar = awobVar.d;
                                if (awpzVar == null) {
                                    awpzVar = awpz.a;
                                }
                                bArr = awpzVar.toByteArray();
                            } else {
                                throw new syf("No ComponentType extension on Element");
                            }
                        } catch (aoob e) {
                            throw new syf("Error parsing element proto", e);
                        }
                    }
                    final byte[] bArr2 = bArr;
                    List q = amru.q();
                    if (sotVar.i) {
                        try {
                            awpz awpzVar2 = (awpz) aonm.parseFrom(awpz.a, bArr2, aomw.b());
                            List arrayList = new ArrayList();
                            String str3 = ((awqf) awpzVar2.pX(awqf.b)).d;
                            if (!str3.isEmpty()) {
                                arrayList.add(str3);
                            }
                            awpz awpzVar3 = ((awom) awpzVar2.pX(awom.b)).c;
                            if (awpzVar3 == null) {
                                awpzVar3 = awpz.a;
                            }
                            String str4 = ((awqf) awpzVar3.pX(awqf.b)).d;
                            if (!str4.isEmpty()) {
                                arrayList.add(str4);
                            }
                            list2 = arrayList;
                        } catch (aoob e2) {
                            throw new syf("Failed to parse a TemplateConfig", e2);
                        }
                    } else {
                        list2 = q;
                    }
                    final szj szjVar = sotVar.c;
                    if (list2.isEmpty()) {
                        Y = aypy.R(new Callable() { // from class: soj
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                szh szhVar2 = szh.this;
                                szj szjVar2 = szjVar;
                                byte[] bArr3 = bArr2;
                                aoam aoamVar3 = aoamVar2;
                                String str5 = str2;
                                int i2 = sot.n;
                                szhVar2.h();
                                szi c2 = szjVar2.c(bArr3, aoamVar3, str5);
                                szhVar2.b();
                                return c2;
                            }
                        });
                    } else {
                        azhh azhhVar = new azhh(aypy.T(list2).Y(new ayrv() { // from class: sop
                            @Override // defpackage.ayrv
                            public final Object a(Object obj2) {
                                sxd sxdVar = sot.this.a;
                                String valueOf = String.valueOf((String) obj2);
                                return sxdVar.a(valueOf.length() != 0 ? "/system/template/".concat(valueOf) : new String("/system/template/"));
                            }
                        }), aysu.a, Integer.MAX_VALUE, aypn.a);
                        ayrv ayrvVar = aynu.l;
                        Y = azhhVar.Y(new ayrv() { // from class: soh
                            @Override // defpackage.ayrv
                            public final Object a(Object obj2) {
                                sot sotVar2 = sot.this;
                                List<String> list3 = list2;
                                szh szhVar2 = szhVar;
                                szj szjVar2 = szjVar;
                                byte[] bArr3 = bArr2;
                                aoam aoamVar3 = aoamVar2;
                                String str5 = str2;
                                if (sotVar2.i) {
                                    szc szcVar = sotVar2.d;
                                    UnifiedTemplateResolver unifiedTemplateResolver = (UnifiedTemplateResolver) sotVar2.e.get();
                                    for (String str6 : list3) {
                                        byte[] b2 = szcVar.b(str6);
                                        if (b2 != null) {
                                            unifiedTemplateResolver.jni_setTemplateConfig(str6, b2);
                                        } else {
                                            StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 33);
                                            sb.append("Failed to load \"");
                                            sb.append(str6);
                                            sb.append("\" from Dev Server");
                                            throw new syf(sb.toString());
                                        }
                                    }
                                }
                                szhVar2.h();
                                szi c2 = szjVar2.c(bArr3, aoamVar3, str5);
                                szhVar2.b();
                                return c2;
                            }
                        });
                    }
                    aj = Y.aj(new ayrv() { // from class: sor
                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
                        
                            if (defpackage.aoqp.a(r2.n()) != defpackage.awoi.b.a()) goto L19;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
                        /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
                        @Override // defpackage.ayrv
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object a(java.lang.Object r10) {
                            /*
                                r9 = this;
                                sot r1 = defpackage.sot.this
                                axop r0 = r2
                                boolean r2 = r3
                                sxc r4 = r4
                                szh r3 = r5
                                java.lang.String r5 = r6
                                szi r10 = (defpackage.szi) r10
                                if (r2 == 0) goto L23
                                java.nio.ByteBuffer r10 = r0.aJ()
                                boolean r6 = r0.aL()
                                r0 = r1
                                r1 = r10
                                r2 = r4
                                r4 = r5
                                r5 = r6
                                aypy r10 = r0.b(r1, r2, r3, r4, r5)
                                goto Lb2
                            L23:
                                aoam r2 = r0.aM()
                                if (r2 != 0) goto L60
                                java.nio.ByteBuffer r2 = r0.aK()
                                if (r2 != 0) goto L30
                                goto L4b
                            L30:
                                aomk r2 = defpackage.aomk.N(r2)     // Catch: java.io.IOException -> L57
                                boolean r6 = r2.E()     // Catch: java.io.IOException -> L57
                                if (r6 != 0) goto L4b
                                int r2 = r2.n()     // Catch: java.io.IOException -> L57
                                int r2 = defpackage.aoqp.a(r2)     // Catch: java.io.IOException -> L57
                                aonk r6 = defpackage.awoi.b     // Catch: java.io.IOException -> L57
                                int r6 = r6.a()     // Catch: java.io.IOException -> L57
                                if (r2 == r6) goto L4b
                                goto L60
                            L4b:
                                sxd r2 = r1.a
                                sun r6 = new sun
                                r6.<init>()
                                aypy r0 = defpackage.aypy.y(r6)
                                goto L89
                            L57:
                                r10 = move-exception
                                syf r0 = new syf
                                java.lang.String r1 = "Error reading model"
                                r0.<init>(r1, r10)
                                throw r0
                            L60:
                                boolean r2 = r1.g
                                if (r2 == 0) goto L77
                                sxd r2 = r1.a
                                suz r6 = r1.f
                                aypy r6 = r6.b(r4)
                                suk r7 = new suk
                                r8 = 0
                                r7.<init>()
                                aypy r0 = defpackage.aypy.y(r7)
                                goto L89
                            L77:
                                sxd r2 = r1.a
                                suz r6 = r1.f
                                aypy r6 = r6.b(r4)
                                suk r7 = new suk
                                r8 = 1
                                r7.<init>()
                                aypy r0 = defpackage.aypy.y(r7)
                            L89:
                                azrw r2 = r1.m
                                java.lang.Object r2 = r2.get()
                                sxe r2 = (defpackage.sxe) r2
                                boolean r2 = r2.a()
                                if (r2 == 0) goto La3
                                svt r2 = new svt
                                r2.<init>(r5)
                                azrl r6 = r2.a
                                aypy r0 = defpackage.aypy.aa(r0, r6)
                                goto La4
                            La3:
                                r2 = 0
                            La4:
                                r7 = r0
                                r6 = r2
                                soq r8 = new soq
                                r0 = r8
                                r2 = r3
                                r3 = r10
                                r0.<init>()
                                aypy r10 = r7.Y(r8)
                            Lb2:
                                return r10
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.sor.a(java.lang.Object):java.lang.Object");
                        }
                    });
                }
                final int i2 = 0;
                aypy H = aj.H(new ayrs() { // from class: soo
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        if (i2 == 0) {
                            szh szhVar2 = szhVar;
                            int i3 = sot.n;
                            szhVar2.i();
                            return;
                        }
                        szh szhVar3 = szhVar;
                        int i4 = sot.n;
                        szhVar3.c();
                    }
                });
                final int i3 = 1;
                final ayrs ayrsVar = new ayrs() { // from class: soo
                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        if (i3 == 0) {
                            szh szhVar2 = szhVar;
                            int i32 = sot.n;
                            szhVar2.i();
                            return;
                        }
                        szh szhVar3 = szhVar;
                        int i4 = sot.n;
                        szhVar3.c();
                    }
                };
                aypy p = H.p(new ayqc() { // from class: tak
                    @Override // defpackage.ayqc
                    public final ayqb a(aypy aypyVar) {
                        aziq aziqVar = new aziq(aypyVar, new tam(ayrs.this));
                        ayrv ayrvVar2 = aynu.l;
                        return aziqVar;
                    }
                });
                szhVar.getClass();
                return p.E(new ayrm() { // from class: som
                    @Override // defpackage.ayrm
                    public final void a() {
                        szh.this.a();
                    }
                });
            }
        });
        soe soeVar = new soe();
        soe.c(soeVar, dheVar, new sog());
        soeVar.a.a = sxcVar;
        soeVar.d.set(0);
        soeVar.a.f = y;
        soeVar.d.set(5);
        soeVar.a.g = this.b;
        soeVar.d.set(6);
        soeVar.a.v = a;
        soeVar.d.set(7);
        soeVar.a.b = this.q;
        soeVar.d.set(1);
        soeVar.a.w = new sow(axopVar, aoamVar);
        soeVar.d.set(8);
        soeVar.a.e = this.i;
        soeVar.d.set(4);
        soeVar.a.d = this.m;
        soeVar.d.set(3);
        soeVar.a.c = this.l;
        soeVar.d.set(2);
        return soeVar;
    }

    public final aypy b(final ByteBuffer byteBuffer, final sxc sxcVar, final szh szhVar, final String str, boolean z) {
        final ByteStore byteStore = (ByteStore) ((azrw) ((amna) this.p).a).get();
        final EntitiesProcessorResolver entitiesProcessorResolver = (EntitiesProcessorResolver) EntitiesProcessorResolver.create(byteStore, z ? new sqi(this.f.b(sxcVar)) : null).a(sok.b);
        JSEntitiesProcessors.registerProcessors(((JSEnvironment) ((ajkn) ((azrw) ((amna) this.r).a).get()).a.get()).getController(), entitiesProcessorResolver);
        final ComponentElement create = ComponentElement.create(byteBuffer);
        return aypy.v(new ayqa() { // from class: sol
            @Override // defpackage.ayqa
            public final void a(aypz aypzVar) {
                aoam aoamVar;
                awrt j;
                final sot sotVar = sot.this;
                ComponentElement componentElement = create;
                ByteStore byteStore2 = byteStore;
                EntitiesProcessorResolver entitiesProcessorResolver2 = entitiesProcessorResolver;
                String str2 = str;
                szh szhVar2 = szhVar;
                final sxc sxcVar2 = sxcVar;
                ByteBuffer byteBuffer2 = byteBuffer;
                sotVar.e.get();
                try {
                    final Component component = (Component) Component.createWithElement(componentElement, byteStore2, null, entitiesProcessorResolver2, sotVar.j).a(sok.a);
                    final svt svtVar = ((sxe) sotVar.m.get()).a() ? new svt(str2, component) : null;
                    String templateUri = component.getTemplateUri();
                    szhVar2.g(templateUri);
                    StringBuilder sb = sxcVar2.m;
                    if (sb != null && !TextUtils.isEmpty(templateUri)) {
                        sb.append(templateUri);
                        sb.append("|");
                    }
                    sos sosVar = new sos(sotVar, sxcVar2, szhVar2, byteBuffer2, component, svtVar, aypzVar);
                    awsn e = ((sxe) sosVar.g.m.get()).b() ? svv.e(sosVar.a) : null;
                    try {
                        sot sotVar2 = sosVar.g;
                        szh szhVar3 = sosVar.b;
                        ByteBuffer byteBuffer3 = sosVar.c;
                        szhVar3.j();
                        if (e != null) {
                            awst a = awsu.a();
                            a.copyOnWrite();
                            ((awsu) a.instance).e(e);
                            String c = sot.c(byteBuffer3);
                            a.copyOnWrite();
                            ((awsu) a.instance).f(c);
                            awsu awsuVar = (awsu) a.build();
                            DebuggerClient debuggerClient = (DebuggerClient) sotVar2.l.get();
                            awsv a2 = awsw.a();
                            aoqa d = svv.d();
                            a2.copyOnWrite();
                            ((awsw) a2.instance).p(d);
                            a2.copyOnWrite();
                            ((awsw) a2.instance).o(awsuVar);
                            debuggerClient.sendTimelineEvent(((awsw) a2.build()).toByteArray());
                        }
                        StatusOr materialize = sosVar.d.materialize(true);
                        byte[] bArr = (byte[]) materialize.value;
                        if (bArr == null) {
                            String valueOf = String.valueOf(materialize.status);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 41);
                            sb2.append("Error materializing SharedComponentType: ");
                            sb2.append(valueOf);
                            throw new syf(sb2.toString(), materialize.status.asException());
                        }
                        aoamVar = aoam.au(ByteBuffer.wrap(bArr));
                        try {
                            sot sotVar3 = sosVar.g;
                            Component component2 = sosVar.d;
                            svt svtVar2 = sosVar.e;
                            if (((sxe) sotVar3.m.get()).a() && svtVar2 != null && (j = svv.j(aoamVar, syv.b(component2.latestModel()), component2.latestEntitiesConfig(), svtVar2.c)) != null) {
                                svtVar2.a(j);
                            }
                            sosVar.f.d(sqr.a(aoamVar, sosVar.e));
                            sosVar.g.d(sosVar.b, e, sosVar.d, aoamVar, sosVar.a);
                            component.setObserver(sosVar);
                            aypzVar.f(new ayrr() { // from class: son
                                @Override // defpackage.ayrr
                                public final void a() {
                                    sot sotVar4 = sot.this;
                                    svt svtVar3 = svtVar;
                                    Component component3 = component;
                                    sxc sxcVar3 = sxcVar2;
                                    if (svtVar3 != null) {
                                        synchronized (svtVar3.e) {
                                            svtVar3.b = null;
                                        }
                                    }
                                    Status dispose = component3.dispose();
                                    if (dispose.f()) {
                                        return;
                                    }
                                    sotVar4.b.a(28, "Error disposing Component", sxcVar3, dispose.d());
                                }
                            });
                        } catch (Throwable th) {
                            th = th;
                            sosVar.g.d(sosVar.b, e, sosVar.d, aoamVar, sosVar.a);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aoamVar = null;
                    }
                } catch (syf e2) {
                    aypzVar.c(e2);
                }
            }
        });
    }

    public final void d(szh szhVar, awsn awsnVar, Component component, aoam aoamVar, sxc sxcVar) {
        awrt j;
        szhVar.d();
        if (awsnVar != null) {
            awsr a = awss.a();
            a.copyOnWrite();
            awss.c((awss) a.instance, awsnVar);
            if (aoamVar != null && (j = svv.j(aoamVar, syv.b(component.latestModel()), component.latestEntitiesConfig(), sxcVar.s)) != null) {
                a.copyOnWrite();
                awss.d((awss) a.instance, j);
            }
            DebuggerClient debuggerClient = (DebuggerClient) this.l.get();
            awsv a2 = awsw.a();
            aoqa d = svv.d();
            a2.copyOnWrite();
            ((awsw) a2.instance).p(d);
            a2.copyOnWrite();
            ((awsw) a2.instance).n((awss) a.build());
            debuggerClient.sendTimelineEvent(((awsw) a2.build()).toByteArray());
        }
    }
}
