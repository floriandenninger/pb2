package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sta implements syk {
    private static final amsx a = amsx.w(224886694, 287553821, Integer.valueOf(awrq.b.a()), Integer.valueOf(awpl.b.a()), 316055719, 268941992, 258411896, 338763089);
    private final SparseArray b = new SparseArray();
    private final SparseArray c = new SparseArray();
    private final Map d;
    private final amsx e;
    private final syd f;
    private final ammv g;

    public sta(Collection collection, Collection collection2, List list, syd sydVar, ammv ammvVar) {
        this.f = sydVar;
        this.g = ammvVar;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            sym symVar = (sym) it.next();
            this.b.put(symVar.a(), symVar);
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            sym symVar2 = (sym) it2.next();
            this.c.put(symVar2.a(), symVar2);
        }
        HashSet hashSet = new HashSet();
        amsv i = amsx.i();
        amru amruVar = (amru) list;
        amxe it3 = amruVar.iterator();
        while (it3.hasNext()) {
            int a2 = ((syl) it3.next()).a().a();
            Integer valueOf = Integer.valueOf(a2);
            if (!hashSet.add(valueOf)) {
                i.c(valueOf);
                StringBuilder sb = new StringBuilder(80);
                sb.append("Multiple property converters found and will be removed for extension ");
                sb.append(a2);
                sydVar.b(27, sb.toString());
            }
        }
        amsx g = i.g();
        this.e = g;
        amrw amrwVar = new amrw();
        amxe it4 = amruVar.iterator();
        while (it4.hasNext()) {
            syl sylVar = (syl) it4.next();
            Integer valueOf2 = Integer.valueOf(sylVar.a().a());
            if (!g.contains(valueOf2)) {
                amrwVar.g(valueOf2, sylVar);
            }
        }
        this.d = amrwVar.c();
    }

    private static Collection c(dhe dheVar, sxc sxcVar, String str, aoam aoamVar, sxs sxsVar, SparseArray sparseArray, aoam aoamVar2, swt swtVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aoamVar.W(); i++) {
            aoamVar.aA(aoamVar2, i);
            if (aoamVar2.U() == 1) {
                sym symVar = (sym) sparseArray.get(aoamVar2.T());
                if (symVar != null) {
                    symVar.c(dheVar, sxcVar, str, symVar.b(aoamVar2.V()), sxsVar, swtVar);
                }
            } else if (aoamVar2.U() != 2) {
                hashSet.add(Integer.valueOf(aoamVar2.T()));
            }
        }
        return hashSet;
    }

    @Override // defpackage.syk
    public final void a(dhe dheVar, sxc sxcVar, String str, aoam aoamVar, sxs sxsVar, swt swtVar) {
        aomw b;
        if (aoamVar == null) {
            return;
        }
        aoam aoamVar2 = (aoam) tab.a.a();
        HashSet hashSet = new HashSet();
        hashSet.addAll(c(dheVar, sxcVar, str, aoamVar, sxsVar, this.b, aoamVar2, swtVar));
        hashSet.addAll(c(dheVar, sxcVar, str, aoamVar, sxsVar, this.c, aoamVar2, swtVar));
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < aoamVar.W(); i++) {
            aoamVar.aA(aoamVar2, i);
            int T = aoamVar2.T();
            if (aoamVar2.U() != 1) {
                if (aoamVar2.U() == 0) {
                    hashSet2.add(Integer.valueOf(T));
                } else {
                    Map map = this.d;
                    Integer valueOf = Integer.valueOf(T);
                    syl sylVar = (syl) map.get(valueOf);
                    if (sylVar == null) {
                        if (!a.contains(valueOf) && !((ammy) ((amna) this.g).a).a(valueOf)) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("No proto converter found for extension ");
                            sb.append(T);
                            String sb2 = sb.toString();
                            if (this.e.contains(valueOf)) {
                                sb2 = String.valueOf(sb2).concat(" due to having duplicate converter bindings.");
                            }
                            this.f.c(27, sb2, sxcVar);
                        }
                    } else {
                        try {
                            ByteBuffer V = aoamVar2.V();
                            aopf parserForType = ((aonk) sylVar.a()).c.getParserForType();
                            if (T == 168774585) {
                                b = aomw.a();
                            } else {
                                b = aomw.b();
                            }
                            sylVar.c(dheVar, sxcVar, str, rwh.ab(V, parserForType, b), sxsVar, swtVar);
                        } catch (aoob e) {
                            syd sydVar = this.f;
                            StringBuilder sb3 = new StringBuilder(89);
                            sb3.append("Failed to set PB Property Extension in PropertiesConverterFlat. Extension id: ");
                            sb3.append(T);
                            sydVar.a(26, sb3.toString(), sxcVar, e);
                        }
                    }
                }
            }
        }
        hashSet.addAll(hashSet2);
        if (hashSet.isEmpty()) {
            tab.a.b(aoamVar2);
        } else {
            String valueOf2 = String.valueOf(hashSet.toString());
            throw new syf(valueOf2.length() != 0 ? "Extensions with unknown format: ".concat(valueOf2) : new String("Extensions with unknown format: "));
        }
    }

    @Override // defpackage.syk
    public final void b(sxs sxsVar) {
        for (int i = 0; i < this.b.size(); i++) {
            ((sym) this.b.get(this.b.keyAt(i))).e(sxsVar);
        }
    }
}
