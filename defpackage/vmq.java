package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmq {
    public final vlm a;
    public final vlx b;
    private final vmo h;
    private final anib i;
    private final ajoy l;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final aow e = new aow();
    private int j = 0;
    private boolean k = false;
    public boolean f = false;
    public boolean g = true;

    public vmq(vmo vmoVar, anib anibVar, ajoy ajoyVar, vlm vlmVar, vlx vlxVar, byte[] bArr) {
        this.h = vmoVar;
        this.i = anibVar;
        this.l = ajoyVar;
        this.a = vlmVar;
        this.b = vlxVar;
    }

    public final void a(int i) {
        synchronized (this) {
            this.j = Math.max(i, this.j);
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
                if (!this.k && this.j > this.c.size()) {
                    this.k = true;
                    vmg z = this.l.z(awzb.OBAKE_GOOGLE_PHOTOS_CLUSTER_SUGGESTIONS);
                    z.b();
                    final vmo vmoVar = this.h;
                    if (!vmoVar.e) {
                        i = anaf.N(new IllegalStateException("No more cluster pages."));
                    } else {
                        aone createBuilder = aodc.a.createBuilder();
                        aocx aocxVar = vmoVar.c;
                        createBuilder.copyOnWrite();
                        aodc aodcVar = (aodc) createBuilder.instance;
                        aocxVar.getClass();
                        aodcVar.c = aocxVar;
                        aodcVar.b = 1 | aodcVar.b;
                        if (vmoVar.d.h()) {
                            String str = (String) vmoVar.d.c();
                            createBuilder.copyOnWrite();
                            aodc aodcVar2 = (aodc) createBuilder.instance;
                            aodcVar2.b |= 2;
                            aodcVar2.d = str;
                        }
                        vli vliVar = vmoVar.a;
                        final aodc aodcVar3 = (aodc) createBuilder.build();
                        i = anfq.i(anht.q(((vlg) vliVar).a(new vlf() { // from class: vld
                            @Override // defpackage.vlf
                            public final anhy a(aocy aocyVar) {
                                aodc aodcVar4 = aodc.this;
                                axzp axzpVar = aocyVar.a;
                                aych aychVar = aocz.b;
                                if (aychVar == null) {
                                    synchronized (aocz.class) {
                                        aychVar = aocz.b;
                                        if (aychVar == null) {
                                            ayce a = aych.a();
                                            a.c = aycg.UNARY;
                                            a.d = aych.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotosClusterSuggestions");
                                            a.b();
                                            a.a = ayom.b(aodc.a);
                                            a.b = ayom.b(aodd.a);
                                            aychVar = a.a();
                                            aocz.b = aychVar;
                                        }
                                    }
                                }
                                return ayox.a(axzpVar.a(aychVar, aocyVar.b), aodcVar4);
                            }
                        })), new anfz() { // from class: vmn
                            @Override // defpackage.anfz
                            public final anhy a(Object obj) {
                                ammv ammvVar;
                                vmo vmoVar2 = vmo.this;
                                aodd aoddVar = (aodd) obj;
                                aocv aocvVar = aoddVar.b;
                                if (aocvVar == null) {
                                    aocvVar = aocv.a;
                                }
                                if ((aocvVar.b & 1) != 0) {
                                    ammvVar = ammv.j(aocvVar.c);
                                } else {
                                    ammvVar = amlr.a;
                                }
                                vmoVar2.d = ammvVar;
                                vmoVar2.e = 1 == (aocvVar.b & 1);
                                return anaf.O(aoddVar);
                            }
                        }, vmoVar.b);
                    }
                    anaf.Y(i, new vmp(this, z), this.i);
                }
            }
        }
    }
}
