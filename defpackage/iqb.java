package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iqb implements afwx {
    final /* synthetic */ EditVideoActivity a;
    final /* synthetic */ aone b;

    public iqb(EditVideoActivity editVideoActivity, aone aoneVar) {
        this.a = editVideoActivity;
        this.b = aoneVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.v.b(true);
        zga.d("Error updating video metadata", cnqVar);
        whu.K(this.a, R.string.edit_video_error_failed, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [ammv] */
    /* JADX WARN: Type inference failed for: r0v27, types: [ammv] */
    /* JADX WARN: Type inference failed for: r0v29, types: [ammv] */
    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        ammv ammvVar;
        final amlr amlrVar;
        amlr amlrVar2;
        arvu arvuVar = (arvu) obj;
        arvuVar.getClass();
        this.a.v.b(true);
        if ((arvuVar.b & 4) != 0) {
            arvx arvxVar = arvuVar.d;
            if (arvxVar == null) {
                arvxVar = arvx.a;
            }
            int dx = amkq.dx(arvxVar.c);
            if (dx == 0 || dx == 1) {
                EditVideoActivity editVideoActivity = this.a;
                aaea aaeaVar = editVideoActivity.C;
                if (aaeaVar != null && aaeaVar.a() != null) {
                    avuj avujVar = editVideoActivity.C.a().h;
                    if (avujVar == null) {
                        avujVar = avuj.a;
                    }
                    if (avujVar.e) {
                        EditVideoActivity editVideoActivity2 = this.a;
                        arvt arvtVar = (arvt) this.b.build();
                        arvtVar.getClass();
                        if (editVideoActivity2.t) {
                            return;
                        }
                        int i = arvtVar.b;
                        int i2 = i & 8;
                        if (i2 != 0 || (i & 64) != 0) {
                            if (i2 != 0) {
                                arvo arvoVar = arvtVar.f;
                                if (arvoVar == null) {
                                    arvoVar = arvo.a;
                                }
                                ammvVar = ammv.j(arvoVar.c);
                            } else {
                                ammvVar = amlr.a;
                            }
                            final ammv ammvVar2 = ammvVar;
                            amlr amlrVar3 = amlr.a;
                            if ((arvtVar.b & 64) != 0) {
                                arvi arviVar = arvtVar.i;
                                if (arviVar == null) {
                                    arviVar = arvi.a;
                                }
                                int bu = anaf.bu(arviVar.c);
                                if (bu == 0) {
                                    bu = 1;
                                }
                                int i3 = bu - 1;
                                if (i3 == 1) {
                                    amlrVar2 = ammv.j(akzv.PUBLIC);
                                } else if (i3 != 2) {
                                    amlrVar2 = ammv.j(akzv.PRIVATE);
                                } else {
                                    amlrVar2 = ammv.j(akzv.UNLISTED);
                                }
                                amlrVar = amlrVar2;
                            } else {
                                amlrVar = amlrVar3;
                            }
                            final akvq akvqVar = editVideoActivity2.n;
                            final String str = editVideoActivity2.r;
                            final afsx c = editVideoActivity2.i.c();
                            anaf.Y(anaf.T(new anfy() { // from class: akvk
                                @Override // defpackage.anfy
                                public final anhy a() {
                                    akzs akzsVar;
                                    akvq akvqVar2 = akvq.this;
                                    String str2 = str;
                                    afsx afsxVar = c;
                                    final ammv ammvVar3 = ammvVar2;
                                    final ammv ammvVar4 = amlrVar;
                                    amkq.F(!str2.isEmpty(), "Invalid or empty passed Video ID.");
                                    amkq.F(!afsxVar.z(), "Cannot use a signed-out identity.");
                                    if (ammvVar3.h()) {
                                        amkq.F(!((String) ammvVar3.c()).isEmpty(), "Invalid or empty video title.");
                                    }
                                    Iterator it = ((List) akvqVar2.a(afsxVar).get()).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            akzsVar = null;
                                            break;
                                        }
                                        akzsVar = (akzs) it.next();
                                        if (str2.equals(akzsVar.Y)) {
                                            break;
                                        }
                                    }
                                    if (akzsVar != null) {
                                        akzq a = akzq.a(akzsVar.l);
                                        if (a == null) {
                                            a = akzq.UNKNOWN_UPLOAD;
                                        }
                                        if (a == akzq.FEEDBACK_ONLY_UPLOAD) {
                                            akyc a2 = akvqVar2.g.a(akzsVar.k, new akwp() { // from class: akvg
                                                @Override // defpackage.akwp
                                                public final akzs a(akzs akzsVar2) {
                                                    ammv ammvVar5 = ammv.this;
                                                    ammv ammvVar6 = ammvVar4;
                                                    if (akzsVar2 == null) {
                                                        return null;
                                                    }
                                                    amkq.F((akzsVar2.b & 16) != 0, "Feedback only upload hasn't any metadata set.");
                                                    akzw akzwVar = akzsVar2.i;
                                                    if (akzwVar == null) {
                                                        akzwVar = akzw.a;
                                                    }
                                                    aone builder = akzwVar.toBuilder();
                                                    if (ammvVar5.h()) {
                                                        String str3 = (String) ammvVar5.c();
                                                        builder.copyOnWrite();
                                                        akzw akzwVar2 = (akzw) builder.instance;
                                                        akzwVar2.b = 1 | akzwVar2.b;
                                                        akzwVar2.c = str3;
                                                    }
                                                    if (ammvVar6.h()) {
                                                        akzv akzvVar = (akzv) ammvVar6.c();
                                                        builder.copyOnWrite();
                                                        akzw akzwVar3 = (akzw) builder.instance;
                                                        akzwVar3.e = akzvVar.d;
                                                        akzwVar3.b |= 4;
                                                    }
                                                    aone builder2 = akzsVar2.toBuilder();
                                                    builder2.copyOnWrite();
                                                    akzs akzsVar3 = (akzs) builder2.instance;
                                                    akzw akzwVar4 = (akzw) builder.build();
                                                    akzwVar4.getClass();
                                                    akzsVar3.i = akzwVar4;
                                                    akzsVar3.b |= 16;
                                                    return (akzs) builder2.build();
                                                }
                                            });
                                            akzs akzsVar2 = a2.a;
                                            akzs akzsVar3 = a2.b;
                                            if (akzsVar2 != null && akzsVar3 != null) {
                                                akzw akzwVar = akzsVar2.i;
                                                if (akzwVar == null) {
                                                    akzwVar = akzw.a;
                                                }
                                                akzw akzwVar2 = akzsVar3.i;
                                                if (akzwVar2 == null) {
                                                    akzwVar2 = akzw.a;
                                                }
                                                if (!amkq.b(akzwVar, akzwVar2)) {
                                                    akvqVar2.k.c(akzsVar.k, akzwVar2);
                                                }
                                            }
                                            return anaf.O(Boolean.valueOf(a2.b != null));
                                        }
                                    }
                                    return anaf.O(false);
                                }
                            }, akvqVar.c), new akvp(akvqVar, 1), angq.a);
                            editVideoActivity2.q();
                            return;
                        }
                        editVideoActivity2.q();
                        return;
                    }
                }
                this.a.q();
                return;
            }
        }
        final EditVideoActivity editVideoActivity3 = this.a;
        final arvx arvxVar2 = arvuVar.d;
        if (arvxVar2 == null) {
            arvxVar2 = arvx.a;
        }
        if (arvxVar2 != null) {
            aqyg aqygVar = arvxVar2.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            CharSequence b = ajcq.b(aqygVar);
            if (TextUtils.isEmpty(b)) {
                b = editVideoActivity3.getResources().getString(R.string.error_generic);
            }
            gcm d = gcq.d();
            d.d(0);
            d.k(b);
            aqyg aqygVar2 = arvxVar2.e;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            Spanned b2 = ajcq.b(aqygVar2);
            if ((arvxVar2.b & 8) != 0 && !TextUtils.isEmpty(b2)) {
                d.m(b2, new View.OnClickListener() { // from class: ipx
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EditVideoActivity editVideoActivity4 = EditVideoActivity.this;
                        arvx arvxVar3 = arvxVar2;
                        aahd aahdVar = editVideoActivity4.h;
                        apxf apxfVar = arvxVar3.f;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                        aahdVar.c(apxfVar, null);
                    }
                });
            }
            editVideoActivity3.u = d.b();
            editVideoActivity3.l.j(editVideoActivity3.u);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
