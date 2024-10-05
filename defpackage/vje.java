package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vje implements vjd {
    private static final Charset b;
    private static final List c;
    public volatile vjc a;
    private final String f;
    private final Object e = new Object();
    private final Map d = new HashMap(10);

    static {
        new vje("");
        b = Charset.forName("UTF-8");
        c = new ArrayList();
    }

    private vje(String str) {
        this.f = str;
    }

    public static long a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(b));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized vje c(String str) {
        synchronized (vje.class) {
            for (vje vjeVar : c) {
                if (vjeVar.f.equals(str)) {
                    return vjeVar;
                }
            }
            vje vjeVar2 = new vje(str);
            c.add(vjeVar2);
            return vjeVar2;
        }
    }

    public final viw b(String str, viy... viyVarArr) {
        synchronized (this.e) {
            viw viwVar = (viw) this.d.get(str);
            if (viwVar != null) {
                viwVar.f(viyVarArr);
                return viwVar;
            }
            viw viwVar2 = new viw(str, this, viyVarArr);
            this.d.put(viwVar2.b, viwVar2);
            return viwVar2;
        }
    }

    public final amll d() {
        ArrayList arrayList;
        aobe aobeVar;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this.e) {
            for (vjb vjbVar : this.d.values()) {
                HashMap hashMap = new HashMap(vjbVar.c.length > 0 ? 10 : 1);
                vja vjaVar = new vja(vjbVar.b, vjbVar.c);
                synchronized (vjbVar.a) {
                    vjaVar.c = vjbVar.d;
                    vjaVar.d = vjbVar.e;
                    vjbVar.d = hashMap;
                    vjbVar.e = 0;
                }
                arrayList3.add(vjaVar);
            }
        }
        aone createBuilder = amll.a.createBuilder();
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            vja vjaVar2 = (vja) arrayList3.get(i);
            if (vjaVar2.d == 0) {
                aobeVar = null;
                arrayList = arrayList3;
            } else {
                aone createBuilder2 = aobe.a.createBuilder();
                long a = a(vjaVar2.a);
                createBuilder2.copyOnWrite();
                aobe aobeVar2 = (aobe) createBuilder2.instance;
                aobeVar2.b |= 2;
                aobeVar2.c = a;
                for (viy viyVar : vjaVar2.b) {
                    long a2 = a(viyVar.a);
                    createBuilder2.copyOnWrite();
                    aobe aobeVar3 = (aobe) createBuilder2.instance;
                    aonx aonxVar = aobeVar3.d;
                    if (!aonxVar.c()) {
                        aobeVar3.d = aonm.mutableCopy(aonxVar);
                    }
                    aobeVar3.d.f(a2);
                }
                for (Map.Entry entry : vjaVar2.c.entrySet()) {
                    aone createBuilder3 = aobd.a.createBuilder();
                    vir virVar = (vir) entry.getKey();
                    vis visVar = (vis) entry.getValue();
                    if (vjaVar2.b.length > 0) {
                        String str = vjaVar2.a;
                        ArrayList arrayList4 = new ArrayList(virVar.c.length);
                        int i2 = 0;
                        while (i2 < virVar.c.length) {
                            aone createBuilder4 = aobb.a.createBuilder();
                            Object obj = virVar.c[i2];
                            ArrayList arrayList5 = arrayList3;
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                createBuilder4.copyOnWrite();
                                aobb aobbVar = (aobb) createBuilder4.instance;
                                str2.getClass();
                                aobbVar.b = 1;
                                aobbVar.c = str2;
                            } else if (obj instanceof Integer) {
                                int intValue = ((Integer) obj).intValue();
                                createBuilder4.copyOnWrite();
                                aobb aobbVar2 = (aobb) createBuilder4.instance;
                                aobbVar2.b = 2;
                                aobbVar2.c = Integer.valueOf(intValue);
                            } else if (obj instanceof Boolean) {
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                createBuilder4.copyOnWrite();
                                aobb aobbVar3 = (aobb) createBuilder4.instance;
                                aobbVar3.b = 3;
                                aobbVar3.c = Boolean.valueOf(booleanValue);
                            } else {
                                String valueOf = String.valueOf(obj);
                                StringBuilder sb = new StringBuilder(str.length() + 56 + String.valueOf(valueOf).length());
                                sb.append("Metric ");
                                sb.append(str);
                                sb.append(" has field ");
                                sb.append(i2);
                                sb.append(" with an unexpected value: ");
                                sb.append(valueOf);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            arrayList4.add((aobb) createBuilder4.build());
                            i2++;
                            arrayList3 = arrayList5;
                        }
                        arrayList2 = arrayList3;
                        createBuilder3.copyOnWrite();
                        aobd aobdVar = (aobd) createBuilder3.instance;
                        aony aonyVar = aobdVar.c;
                        if (!aonyVar.c()) {
                            aobdVar.c = aonm.mutableCopy(aonyVar);
                        }
                        aolo.addAll((Iterable) arrayList4, (List) aobdVar.c);
                    } else {
                        arrayList2 = arrayList3;
                    }
                    aobc a3 = visVar.a();
                    createBuilder3.copyOnWrite();
                    aobd aobdVar2 = (aobd) createBuilder3.instance;
                    a3.getClass();
                    aobdVar2.d = a3;
                    aobdVar2.b |= 1;
                    createBuilder2.copyOnWrite();
                    aobe aobeVar4 = (aobe) createBuilder2.instance;
                    aobd aobdVar3 = (aobd) createBuilder3.build();
                    aobdVar3.getClass();
                    aony aonyVar2 = aobeVar4.e;
                    if (!aonyVar2.c()) {
                        aobeVar4.e = aonm.mutableCopy(aonyVar2);
                    }
                    aobeVar4.e.add(aobdVar3);
                    arrayList3 = arrayList2;
                }
                arrayList = arrayList3;
                aobeVar = (aobe) createBuilder2.build();
            }
            if (aobeVar != null) {
                createBuilder.copyOnWrite();
                amll amllVar = (amll) createBuilder.instance;
                aony aonyVar3 = amllVar.b;
                if (!aonyVar3.c()) {
                    amllVar.b = aonm.mutableCopy(aonyVar3);
                }
                amllVar.b.add(aobeVar);
            }
            i++;
            arrayList3 = arrayList;
        }
        return (amll) createBuilder.build();
    }

    public final viz e(String str, viy... viyVarArr) {
        synchronized (this.e) {
            viz vizVar = (viz) this.d.get(str);
            if (vizVar != null) {
                vizVar.f(viyVarArr);
                return vizVar;
            }
            viz vizVar2 = new viz(str, this, viyVarArr);
            this.d.put(vizVar2.b, vizVar2);
            return vizVar2;
        }
    }
}
