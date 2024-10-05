package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rkj extends rka {
    public rkj(rki rkiVar) {
        super(rkiVar);
    }

    public static final void C(StringBuilder sb, String str, rlf rlfVar) {
        if (rlfVar == null) {
            return;
        }
        v(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (rlfVar.c.size() != 0) {
            v(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l : rlfVar.c) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (rlfVar.b.size() != 0) {
            v(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : rlfVar.b) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (rlfVar.d.size() != 0) {
            v(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (rkx rkxVar : rlfVar.d) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append((rkxVar.b & 1) != 0 ? Integer.valueOf(rkxVar.c) : null);
                sb.append(":");
                sb.append((rkxVar.b & 2) != 0 ? Long.valueOf(rkxVar.d) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (rlfVar.e.size() != 0) {
            v(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (rlg rlgVar : rlfVar.e) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append((rlgVar.b & 1) != 0 ? Integer.valueOf(rlgVar.c) : null);
                sb.append(": [");
                Iterator it = rlgVar.d.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        v(sb, 3);
        sb.append("}\n");
    }

    public static final void D(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        v(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Object E(rkz rkzVar, String str) {
        rlb x = x(rkzVar, str);
        if (x == null) {
            return null;
        }
        int i = x.b;
        if ((i & 2) != 0) {
            return x.d;
        }
        if ((i & 4) != 0) {
            return Long.valueOf(x.e);
        }
        if ((i & 16) != 0) {
            return Double.valueOf(x.g);
        }
        if (x.h.size() <= 0) {
            return null;
        }
        aony<rlb> aonyVar = x.h;
        ArrayList arrayList = new ArrayList();
        for (rlb rlbVar : aonyVar) {
            if (rlbVar != null) {
                Bundle bundle = new Bundle();
                for (rlb rlbVar2 : rlbVar.h) {
                    int i2 = rlbVar2.b;
                    if ((i2 & 2) != 0) {
                        bundle.putString(rlbVar2.c, rlbVar2.d);
                    } else if ((i2 & 4) != 0) {
                        bundle.putLong(rlbVar2.c, rlbVar2.e);
                    } else if ((i2 & 16) != 0) {
                        bundle.putDouble(rlbVar2.c, rlbVar2.g);
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void F(StringBuilder sb, int i, String str, rkq rkqVar) {
        if (rkqVar == null) {
            return;
        }
        v(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if ((rkqVar.b & 1) != 0) {
            int p = rqr.p(rkqVar.c);
            D(sb, i, "comparison_type", (p == 0 || p == 1) ? "UNKNOWN_COMPARISON_TYPE" : p != 2 ? p != 3 ? p != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN");
        }
        if ((rkqVar.b & 2) != 0) {
            D(sb, i, "match_as_float", Boolean.valueOf(rkqVar.d));
        }
        if ((rkqVar.b & 4) != 0) {
            D(sb, i, "comparison_value", rkqVar.e);
        }
        if ((rkqVar.b & 8) != 0) {
            D(sb, i, "min_comparison_value", rkqVar.f);
        }
        if ((rkqVar.b & 16) != 0) {
            D(sb, i, "max_comparison_value", rkqVar.g);
        }
        v(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoox i(aoox aooxVar, byte[] bArr) {
        aomw b = aomw.b();
        if (b != null) {
            return aooxVar.mergeFrom(bArr, b);
        }
        return aooxVar.mergeFrom(bArr);
    }

    static List j(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                aone createBuilder = rlb.a.createBuilder();
                for (String str : bundle.keySet()) {
                    aone createBuilder2 = rlb.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    rlb rlbVar = (rlb) createBuilder2.instance;
                    str.getClass();
                    rlbVar.b |= 1;
                    rlbVar.c = str;
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        long longValue = ((Long) obj).longValue();
                        createBuilder2.copyOnWrite();
                        rlb rlbVar2 = (rlb) createBuilder2.instance;
                        rlbVar2.b |= 4;
                        rlbVar2.e = longValue;
                    } else if (obj instanceof String) {
                        String str2 = (String) obj;
                        createBuilder2.copyOnWrite();
                        rlb rlbVar3 = (rlb) createBuilder2.instance;
                        str2.getClass();
                        rlbVar3.b |= 2;
                        rlbVar3.d = str2;
                    } else if (obj instanceof Double) {
                        double doubleValue = ((Double) obj).doubleValue();
                        createBuilder2.copyOnWrite();
                        rlb rlbVar4 = (rlb) createBuilder2.instance;
                        rlbVar4.b |= 16;
                        rlbVar4.g = doubleValue;
                    }
                    createBuilder.copyOnWrite();
                    rlb rlbVar5 = (rlb) createBuilder.instance;
                    rlb rlbVar6 = (rlb) createBuilder2.build();
                    rlbVar6.getClass();
                    rlbVar5.a();
                    rlbVar5.h.add(rlbVar6);
                }
                if (((rlb) createBuilder.instance).h.size() > 0) {
                    arrayList.add((rlb) createBuilder.build());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List l(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean s(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void u(rky rkyVar, String str, Object obj) {
        List unmodifiableList = Collections.unmodifiableList(((rkz) rkyVar.instance).i());
        int i = 0;
        while (true) {
            if (i >= unmodifiableList.size()) {
                i = -1;
                break;
            } else if (str.equals(((rlb) unmodifiableList.get(i)).c)) {
                break;
            } else {
                i++;
            }
        }
        aone createBuilder = rlb.a.createBuilder();
        createBuilder.copyOnWrite();
        rlb rlbVar = (rlb) createBuilder.instance;
        rlbVar.b |= 1;
        rlbVar.c = str;
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            createBuilder.copyOnWrite();
            rlb rlbVar2 = (rlb) createBuilder.instance;
            rlbVar2.b |= 4;
            rlbVar2.e = longValue;
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            createBuilder.copyOnWrite();
            rlb rlbVar3 = (rlb) createBuilder.instance;
            str2.getClass();
            rlbVar3.b |= 2;
            rlbVar3.d = str2;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            createBuilder.copyOnWrite();
            rlb rlbVar4 = (rlb) createBuilder.instance;
            rlbVar4.b |= 16;
            rlbVar4.g = doubleValue;
        } else if (obj instanceof Bundle[]) {
            createBuilder.m(j((Bundle[]) obj));
        }
        if (i >= 0) {
            rkyVar.copyOnWrite();
            rkz.j((rkz) rkyVar.instance, i, (rlb) createBuilder.build());
        } else {
            rkyVar.e(createBuilder);
        }
    }

    public static final void v(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean w(EventParcel eventParcel, AppMetadata appMetadata) {
        qip.an(eventParcel);
        qip.an(appMetadata);
        return (TextUtils.isEmpty(appMetadata.b) && TextUtils.isEmpty(appMetadata.q)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final rlb x(rkz rkzVar, String str) {
        for (rlb rlbVar : rkzVar.i()) {
            if (rlbVar.c.equals(str)) {
                return rlbVar;
            }
        }
        return null;
    }

    public static final String y(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(aone aoneVar, String str) {
        for (int i = 0; i < ((rld) aoneVar.instance).f.size(); i++) {
            if (str.equals(aoneVar.o(i).d)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(aone aoneVar, Object obj) {
        qip.an(obj);
        aoneVar.copyOnWrite();
        rlb rlbVar = (rlb) aoneVar.instance;
        rlb rlbVar2 = rlb.a;
        rlbVar.b &= -3;
        rlbVar.d = rlb.a.d;
        aoneVar.copyOnWrite();
        rlb rlbVar3 = (rlb) aoneVar.instance;
        rlbVar3.b &= -5;
        rlbVar3.e = 0L;
        aoneVar.copyOnWrite();
        rlb rlbVar4 = (rlb) aoneVar.instance;
        rlbVar4.b &= -17;
        rlbVar4.g = 0.0d;
        aoneVar.copyOnWrite();
        ((rlb) aoneVar.instance).h = rlb.emptyProtobufList();
        if (obj instanceof String) {
            String str = (String) obj;
            aoneVar.copyOnWrite();
            rlb rlbVar5 = (rlb) aoneVar.instance;
            str.getClass();
            rlbVar5.b |= 2;
            rlbVar5.d = str;
            return;
        }
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            aoneVar.copyOnWrite();
            rlb rlbVar6 = (rlb) aoneVar.instance;
            rlbVar6.b |= 4;
            rlbVar6.e = longValue;
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            aoneVar.copyOnWrite();
            rlb rlbVar7 = (rlb) aoneVar.instance;
            rlbVar7.b |= 16;
            rlbVar7.g = doubleValue;
            return;
        }
        if (obj instanceof Bundle[]) {
            aoneVar.m(j((Bundle[]) obj));
        } else {
            aF().c.b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(aone aoneVar, Object obj) {
        aoneVar.copyOnWrite();
        rlh rlhVar = (rlh) aoneVar.instance;
        rlh rlhVar2 = rlh.a;
        rlhVar.b &= -5;
        rlhVar.e = rlh.a.e;
        aoneVar.copyOnWrite();
        rlh rlhVar3 = (rlh) aoneVar.instance;
        rlhVar3.b &= -9;
        rlhVar3.f = 0L;
        aoneVar.copyOnWrite();
        rlh rlhVar4 = (rlh) aoneVar.instance;
        rlhVar4.b &= -33;
        rlhVar4.g = 0.0d;
        if (obj instanceof String) {
            aoneVar.copyOnWrite();
            rlh rlhVar5 = (rlh) aoneVar.instance;
            rlhVar5.b |= 4;
            rlhVar5.e = (String) obj;
            return;
        }
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            aoneVar.copyOnWrite();
            rlh rlhVar6 = (rlh) aoneVar.instance;
            rlhVar6.b |= 8;
            rlhVar6.f = longValue;
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            aoneVar.copyOnWrite();
            rlh rlhVar7 = (rlh) aoneVar.instance;
            rlhVar7.b |= 32;
            rlhVar7.g = doubleValue;
            return;
        }
        aF().c.b("Ignoring invalid (type) user attribute value", obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(byte[] bArr) {
        qip.an(bArr);
        N().n();
        MessageDigest aw = rkm.aw();
        if (aw == null) {
            aF().c.a("Failed to get MD5");
            return 0L;
        }
        return rkm.p(aw.digest(bArr));
    }

    @Override // defpackage.rka
    protected final void b() {
    }

    final Bundle c(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                axvz.b();
                if (!J().o(rfd.au)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(c((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList2);
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList arrayList4 = new ArrayList();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(c((Map) arrayList3.get(i2), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList4.toArray(new Parcelable[0]));
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable d(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (qtd unused) {
            aF().c.a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EventParcel e(dxz dxzVar) {
        Object obj;
        Bundle c = c(dxzVar.e(), true);
        String obj2 = (!c.containsKey("_o") || (obj = c.get("_o")) == null) ? "app" : obj.toString();
        String b = rhi.b(dxzVar.d());
        if (b == null) {
            b = dxzVar.d();
        }
        return new EventParcel(b, new EventParams(c), obj2, dxzVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final rkz g(reu reuVar) {
        rky e = rkz.e();
        long j = reuVar.e;
        e.copyOnWrite();
        rkz.q((rkz) e.instance, j);
        Iterator it = reuVar.f.iterator();
        while (it.hasNext()) {
            String next = ((rew) it).next();
            aone createBuilder = rlb.a.createBuilder();
            createBuilder.copyOnWrite();
            rlb rlbVar = (rlb) createBuilder.instance;
            next.getClass();
            rlbVar.b |= 1;
            rlbVar.c = next;
            Object b = reuVar.f.b(next);
            qip.an(b);
            A(createBuilder, b);
            e.e(createBuilder);
        }
        return (rkz) e.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List k(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                aF().f.b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    aF().f.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r7 >= r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        r4.add(m((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        r0.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r7 >= r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r4.add(m((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        r4.add(m((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x000d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map m(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            defpackage.axvz.b()
            rem r4 = r10.J()
            rfc r5 = defpackage.rfd.au
            boolean r4 = r4.o(r5)
            if (r4 == 0) goto L39
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4c
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4c
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L46
            goto L4c
        L39:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4c
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4c
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L46
            goto L4c
        L46:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4c:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L70
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = 0
        L5c:
            if (r7 >= r5) goto L9e
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L6d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m(r8, r6)
            r4.add(r8)
        L6d:
            int r7 = r7 + 1
            goto L5c
        L70:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L91
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = 0
        L7b:
            if (r7 >= r5) goto L9e
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L8e
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m(r8, r6)
            r4.add(r8)
        L8e:
            int r7 = r7 + 1
            goto L7b
        L91:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L9e
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.m(r3, r6)
            r4.add(r3)
        L9e:
            r0.put(r2, r4)
            goto Ld
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkj.m(android.os.Bundle, boolean):java.util.Map");
    }

    public final void o(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rlb rlbVar = (rlb) it.next();
            if (rlbVar != null) {
                v(sb, i2);
                sb.append("param {\n");
                D(sb, i2, "name", (rlbVar.b & 1) != 0 ? L().d(rlbVar.c) : null);
                D(sb, i2, "string_value", (rlbVar.b & 2) != 0 ? rlbVar.d : null);
                D(sb, i2, "int_value", (rlbVar.b & 4) != 0 ? Long.valueOf(rlbVar.e) : null);
                D(sb, i2, "double_value", (rlbVar.b & 16) != 0 ? Double.valueOf(rlbVar.g) : null);
                if (rlbVar.h.size() > 0) {
                    o(sb, i2, rlbVar.h);
                }
                v(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public final void p(StringBuilder sb, int i, rkp rkpVar) {
        String str;
        if (rkpVar == null) {
            return;
        }
        v(sb, i);
        sb.append("filter {\n");
        if ((rkpVar.b & 4) != 0) {
            D(sb, i, "complement", Boolean.valueOf(rkpVar.e));
        }
        if ((rkpVar.b & 8) != 0) {
            D(sb, i, "param_name", L().d(rkpVar.f));
        }
        if ((rkpVar.b & 1) != 0) {
            int i2 = i + 1;
            rks rksVar = rkpVar.c;
            if (rksVar == null) {
                rksVar = rks.a;
            }
            if (rksVar != null) {
                v(sb, i2);
                sb.append("string_filter {\n");
                if ((rksVar.b & 1) != 0) {
                    int o = rqr.o(rksVar.c);
                    if (o != 0) {
                        switch (o) {
                            case 1:
                                break;
                            case 2:
                                str = "REGEXP";
                                break;
                            case 3:
                                str = "BEGINS_WITH";
                                break;
                            case 4:
                                str = "ENDS_WITH";
                                break;
                            case 5:
                                str = "PARTIAL";
                                break;
                            case 6:
                                str = "EXACT";
                                break;
                            default:
                                str = "IN_LIST";
                                break;
                        }
                        D(sb, i2, "match_type", str);
                    }
                    str = "UNKNOWN_MATCH_TYPE";
                    D(sb, i2, "match_type", str);
                }
                if ((rksVar.b & 2) != 0) {
                    D(sb, i2, "expression", rksVar.d);
                }
                if ((rksVar.b & 4) != 0) {
                    D(sb, i2, "case_sensitive", Boolean.valueOf(rksVar.e));
                }
                if (rksVar.f.size() > 0) {
                    v(sb, i2 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : rksVar.f) {
                        v(sb, i2 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                v(sb, i2);
                sb.append("}\n");
            }
        }
        if ((rkpVar.b & 2) != 0) {
            int i3 = i + 1;
            rkq rkqVar = rkpVar.d;
            if (rkqVar == null) {
                rkqVar = rkq.a;
            }
            F(sb, i3, "number_filter", rkqVar);
        }
        v(sb, i);
        sb.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        Q();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] t(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            aF().c.b("Failed to gzip content", e);
            throw e;
        }
    }
}
