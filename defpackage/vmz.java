package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmz {
    public final vlx a;
    public final vlm b;
    private final anib i;
    private final awzb j;
    private final awzb k;
    private final vmx l;
    private final ajoy o;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final aow e = new aow();
    private int m = 0;
    private boolean n = false;
    public boolean f = false;
    public boolean g = true;
    public int h = 0;

    public vmz(anib anibVar, ajoy ajoyVar, vlm vlmVar, vlx vlxVar, vmw vmwVar, int i, ammv ammvVar, awzb awzbVar, awzb awzbVar2, byte[] bArr) {
        this.i = anibVar;
        this.o = ajoyVar;
        this.b = vlmVar;
        this.a = vlxVar;
        this.j = awzbVar;
        this.k = awzbVar2;
        int i2 = i - 1;
        if (i2 == 0) {
            this.l = new vmx(vmwVar.a, vmwVar.b, vmwVar.c, amlr.a, false);
        } else if (i2 == 1) {
            this.l = new vmx(vmwVar.a, vmwVar.b, vmwVar.c, amlr.a, true);
        } else {
            this.l = new vmx(vmwVar.a, vmwVar.b, vmwVar.c, ammv.j((String) ammvVar.c()), false);
        }
    }

    public final void a(int i) {
        synchronized (this) {
            this.m = Math.max(i, this.m);
        }
        b();
    }

    public final void b() {
        anhy i;
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (this.g) {
                if (!this.n && this.m > this.c.size()) {
                    this.n = true;
                    boolean d = d();
                    if (d) {
                        this.h++;
                    }
                    vmg z = this.o.z(d ? this.k : this.j);
                    z.b();
                    final vmx vmxVar = this.l;
                    if (!vmxVar.g) {
                        i = anaf.N(new IllegalStateException("No more photo pages."));
                    } else {
                        aone createBuilder = aode.a.createBuilder();
                        aocx aocxVar = vmxVar.c;
                        createBuilder.copyOnWrite();
                        aode aodeVar = (aode) createBuilder.instance;
                        aocxVar.getClass();
                        aodeVar.e = aocxVar;
                        aodeVar.b |= 1;
                        aone createBuilder2 = aodh.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aodh aodhVar = (aodh) createBuilder2.instance;
                        aodhVar.b |= 1;
                        aodhVar.c = d;
                        createBuilder.copyOnWrite();
                        aode aodeVar2 = (aode) createBuilder.instance;
                        aodh aodhVar2 = (aodh) createBuilder2.build();
                        aodhVar2.getClass();
                        aodeVar2.g = aodhVar2;
                        aodeVar2.b |= 16;
                        if (vmxVar.f.h()) {
                            String str = (String) vmxVar.f.c();
                            createBuilder.copyOnWrite();
                            aode aodeVar3 = (aode) createBuilder.instance;
                            aodeVar3.b |= 2;
                            aodeVar3.f = str;
                        }
                        if (vmxVar.e.h()) {
                            String str2 = (String) vmxVar.e.c();
                            createBuilder.copyOnWrite();
                            aode aodeVar4 = (aode) createBuilder.instance;
                            aodeVar4.c = 3;
                            aodeVar4.d = str2;
                        } else if (vmxVar.d) {
                            createBuilder.copyOnWrite();
                            aode aodeVar5 = (aode) createBuilder.instance;
                            aodeVar5.c = 4;
                            aodeVar5.d = true;
                        }
                        vli vliVar = vmxVar.a;
                        final aode aodeVar6 = (aode) createBuilder.build();
                        i = anfq.i(anht.q(((vlg) vliVar).a(new vlf() { // from class: vle
                            @Override // defpackage.vlf
                            public final anhy a(aocy aocyVar) {
                                aode aodeVar7 = aode.this;
                                axzp axzpVar = aocyVar.a;
                                aych aychVar = aocz.a;
                                if (aychVar == null) {
                                    synchronized (aocz.class) {
                                        aychVar = aocz.a;
                                        if (aychVar == null) {
                                            ayce a = aych.a();
                                            a.c = aycg.UNARY;
                                            a.d = aych.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotosPhotoSuggestions");
                                            a.b();
                                            a.a = ayom.b(aode.a);
                                            a.b = ayom.b(aodf.a);
                                            aychVar = a.a();
                                            aocz.a = aychVar;
                                        }
                                    }
                                }
                                return ayox.a(axzpVar.a(aychVar, aocyVar.b), aodeVar7);
                            }
                        })), new anfz() { // from class: vmv
                            @Override // defpackage.anfz
                            public final anhy a(Object obj) {
                                ammv ammvVar;
                                ammv ammvVar2;
                                vmx vmxVar2 = vmx.this;
                                aodf aodfVar = (aodf) obj;
                                aodi aodiVar = aodfVar.b;
                                if (aodiVar == null) {
                                    aodiVar = aodi.a;
                                }
                                if ((aodiVar.b & 1) != 0) {
                                    ammvVar = ammv.j(aodiVar.c);
                                } else {
                                    ammvVar = amlr.a;
                                }
                                vmxVar2.f = ammvVar;
                                int i2 = aodiVar.b;
                                vmxVar2.g = 1 == (i2 & 1);
                                if ((i2 & 2) != 0) {
                                    ammvVar2 = ammv.j(aodiVar.d);
                                } else {
                                    ammvVar2 = amlr.a;
                                }
                                vmxVar2.e = ammvVar2;
                                return anaf.O(aodfVar);
                            }
                        }, vmxVar.b);
                    }
                    anaf.Y(i, new vmy(this, z, d), this.i);
                }
            }
        }
    }

    public final void c() {
        this.f = false;
        b();
    }

    public final boolean d() {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            int a = aobq.a(((aodg) it.next()).e);
            if (a != 0 && a == 2) {
                i++;
            }
        }
        return i < 20;
    }
}
