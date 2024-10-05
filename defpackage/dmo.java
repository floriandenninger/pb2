package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dmo implements dnj {
    final /* synthetic */ dmq a;
    private final ArrayList b = new ArrayList();

    public dmo(dmq dmqVar) {
        this.a = dmqVar;
    }

    @Override // defpackage.dnj
    public final void a(dni dniVar) {
        e(dniVar);
    }

    @Override // defpackage.dnj
    public final void b(dni dniVar) {
        e(dniVar);
    }

    @Override // defpackage.dnj
    public final void c(dni dniVar) {
        dniVar.b(this.b);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            dnn dnnVar = (dnn) this.b.get(i);
            dmm dmmVar = (dmm) ((dmk) this.a.b.a(dnnVar.a())).a.get(dnnVar.b());
            dmmVar.c = Float.valueOf(dnnVar.b);
            dmmVar.b = dniVar;
        }
        this.b.clear();
        if (TextUtils.isEmpty((String) this.a.c.e(dniVar.hashCode()))) {
            return;
        }
        dniVar.hashCode();
    }

    @Override // defpackage.dnj
    public final boolean d(dni dniVar) {
        Float f;
        dniVar.b(this.b);
        int size = this.b.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            dnn dnnVar = (dnn) this.b.get(i);
            dmi a = dnnVar.a();
            dmk dmkVar = (dmk) this.a.b.a(a);
            dmm dmmVar = dmkVar != null ? (dmm) dmkVar.a.get(dnnVar.b()) : null;
            if (dgp.a) {
                String valueOf = String.valueOf(a);
                String b = dnnVar.b().b();
                float f2 = dnnVar.b;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50 + b.length());
                sb.append("Trying to start animation on ");
                sb.append(valueOf);
                sb.append("#");
                sb.append(b);
                sb.append(" to ");
                sb.append(f2);
                sb.append(":");
            }
            if (dmmVar == null) {
                boolean z2 = dgp.a;
                z = false;
            }
            if (z && (f = dmmVar.d) != null && f.floatValue() != dnnVar.b) {
                if (dgp.a) {
                    String valueOf2 = String.valueOf(dmmVar.d);
                    float f3 = dnnVar.b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 95);
                    sb2.append(" - Canceling animation, last mounted value does not equal animation target: ");
                    sb2.append(valueOf2);
                    sb2.append(" != ");
                    sb2.append(f3);
                }
                z = false;
            }
        }
        this.b.clear();
        return z;
    }

    public final void e(dni dniVar) {
        boolean z;
        List list = (List) this.a.a.remove(dniVar);
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dno dnoVar = (dno) list.get(i);
            dmi dmiVar = dnoVar.a;
            dmk dmkVar = (dmk) this.a.b.a(dmiVar);
            dng dngVar = dnoVar.b;
            if (dmkVar.c == 2) {
                if (((dmm) dmkVar.a.get(dngVar)) != null) {
                    r4.e--;
                    if (dmkVar.c == 2) {
                        Iterator it = dmkVar.a.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((dmm) it.next()).e > 0) {
                                    z = false;
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z && dmkVar.b != null) {
                            Iterator it2 = dmkVar.a.keySet().iterator();
                            while (it2.hasNext()) {
                                dmq.e((dng) it2.next(), dmkVar.b);
                            }
                        }
                    } else {
                        throw new RuntimeException("This should only be checked for disappearing animations");
                    }
                } else {
                    throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                }
            } else {
                dmm dmmVar = (dmm) dmkVar.a.get(dngVar);
                if (dmmVar == null) {
                    throw new RuntimeException("Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.");
                }
                int i2 = dmmVar.e - 1;
                dmmVar.e = i2;
                if (i2 <= 0) {
                    dmkVar.a.remove(dngVar);
                    boolean isEmpty = dmkVar.a.isEmpty();
                    if (dmkVar.b != null) {
                        dmq.h(dngVar, dngVar.e((dju) dmkVar.e.d()), dmkVar.b);
                    }
                    z = isEmpty;
                } else {
                    continue;
                }
            }
            if (z) {
                if (dgp.a) {
                    String.valueOf(String.valueOf(dmiVar)).length();
                }
                dlf dlfVar = dmkVar.b;
                if (dlfVar != null) {
                    this.a.d(dlfVar, true);
                }
                dml dmlVar = this.a.i;
                if (dmlVar != null) {
                    dkv dkvVar = (dkv) dmlVar;
                    dlf dlfVar2 = (dlf) dkvVar.l.remove(dmiVar);
                    if (dlfVar2 != null) {
                        dkvVar.l(dlfVar2);
                    } else {
                        if (!dkvVar.j.remove(dmiVar) && dgp.a) {
                            String valueOf = String.valueOf(dmiVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                            sb.append("Ending animation for id ");
                            sb.append(valueOf);
                            sb.append(" but it wasn't recorded as animating!");
                            Log.e("LithoAnimationDebug", sb.toString());
                        }
                        dlf dlfVar3 = (dlf) dkvVar.h.t.get(dmiVar);
                        if (dlfVar3 != null) {
                            short s = dlfVar3.b;
                            for (int i3 = 0; i3 < s; i3++) {
                                dkvVar.q(dkvVar.h, ((dju) dlfVar3.c(i3)).i, false);
                            }
                            if (doa.a && dkvVar.j.isEmpty()) {
                                int length = dkvVar.k.length;
                                for (int i4 = 0; i4 < length; i4++) {
                                    if (dkvVar.k[i4] != 0) {
                                        StringBuilder sb2 = new StringBuilder(70);
                                        sb2.append("No running animations but index ");
                                        sb2.append(i4);
                                        sb2.append(" is still animation locked!");
                                        throw new RuntimeException(sb2.toString());
                                    }
                                }
                            }
                        }
                    }
                }
                this.a.b.d(dmiVar);
                dmq.b(dmkVar);
            } else {
                continue;
            }
        }
        if (TextUtils.isEmpty((String) this.a.c.e(dniVar.hashCode()))) {
            return;
        }
        dniVar.hashCode();
        this.a.c.l(dniVar.hashCode());
    }
}
