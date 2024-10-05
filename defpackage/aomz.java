package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aomz {
    public static final aomz a = new aomz(null);
    public final aopy b = aopy.b(16);
    public boolean c;
    public boolean d;

    private aomz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(aoqn aoqnVar, int i, Object obj) {
        int ac = aomp.ac(i);
        if (aoqnVar == aoqn.GROUP) {
            aonz.j((aooy) obj);
            ac += ac;
        }
        return ac + b(aoqnVar, obj);
    }

    static int b(aoqn aoqnVar, Object obj) {
        aoqn aoqnVar2 = aoqn.DOUBLE;
        aoqo aoqoVar = aoqo.INT;
        switch (aoqnVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                boolean z = aomp.e;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                boolean z2 = aomp.e;
                return 4;
            case INT64:
                return aomp.ag(((Long) obj).longValue());
            case UINT64:
                return aomp.ag(((Long) obj).longValue());
            case INT32:
                return aomp.O(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                boolean z3 = aomp.e;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                boolean z4 = aomp.e;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                boolean z5 = aomp.e;
                return 1;
            case STRING:
                if (obj instanceof aomf) {
                    return aomp.J((aomf) obj);
                }
                return aomp.ab((String) obj);
            case GROUP:
                return aomp.M((aooy) obj);
            case MESSAGE:
                if (obj instanceof aoog) {
                    return aomp.R((aoog) obj);
                }
                return aomp.T((aooy) obj);
            case BYTES:
                if (obj instanceof aomf) {
                    return aomp.J((aomf) obj);
                }
                return aomp.H((byte[]) obj);
            case UINT32:
                return aomp.ae(((Integer) obj).intValue());
            case ENUM:
                if (obj instanceof aonq) {
                    return aomp.O(((aonq) obj).getNumber());
                }
                return aomp.O(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                boolean z6 = aomp.e;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                boolean z7 = aomp.e;
                return 8;
            case SINT32:
                return aomp.X(((Integer) obj).intValue());
            case SINT64:
                return aomp.Z(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(aomp aompVar, aoqn aoqnVar, int i, Object obj) {
        if (aoqnVar != aoqn.GROUP) {
            aompVar.B(i, aoqnVar.t);
            aoqo aoqoVar = aoqo.INT;
            switch (aoqnVar) {
                case DOUBLE:
                    aompVar.aq(((Double) obj).doubleValue());
                    return;
                case FLOAT:
                    aompVar.as(((Float) obj).floatValue());
                    return;
                case INT64:
                    aompVar.F(((Long) obj).longValue());
                    return;
                case UINT64:
                    aompVar.F(((Long) obj).longValue());
                    return;
                case INT32:
                    aompVar.u(((Integer) obj).intValue());
                    return;
                case FIXED64:
                    aompVar.s(((Long) obj).longValue());
                    return;
                case FIXED32:
                    aompVar.q(((Integer) obj).intValue());
                    return;
                case BOOL:
                    aompVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                    return;
                case STRING:
                    if (obj instanceof aomf) {
                        aompVar.o((aomf) obj);
                        return;
                    } else {
                        aompVar.A((String) obj);
                        return;
                    }
                case GROUP:
                    aompVar.at((aooy) obj);
                    return;
                case MESSAGE:
                    aompVar.w((aooy) obj);
                    return;
                case BYTES:
                    if (obj instanceof aomf) {
                        aompVar.o((aomf) obj);
                        return;
                    } else {
                        byte[] bArr = (byte[]) obj;
                        aompVar.G(bArr, bArr.length);
                        return;
                    }
                case UINT32:
                    aompVar.D(((Integer) obj).intValue());
                    return;
                case ENUM:
                    if (obj instanceof aonq) {
                        aompVar.u(((aonq) obj).getNumber());
                        return;
                    } else {
                        aompVar.u(((Integer) obj).intValue());
                        return;
                    }
                case SFIXED32:
                    aompVar.q(((Integer) obj).intValue());
                    return;
                case SFIXED64:
                    aompVar.s(((Long) obj).longValue());
                    return;
                case SINT32:
                    aompVar.av(((Integer) obj).intValue());
                    return;
                case SINT64:
                    aompVar.ax(((Long) obj).longValue());
                    return;
                default:
                    return;
            }
        }
        aooy aooyVar = (aooy) obj;
        aonz.j(aooyVar);
        aompVar.B(i, 3);
        aompVar.at(aooyVar);
        aompVar.B(i, 4);
    }

    public static int k(aonj aonjVar, Object obj) {
        aoqn aoqnVar = aonjVar.c;
        int i = aonjVar.b;
        if (!aonjVar.d) {
            return a(aoqnVar, i, obj);
        }
        int i2 = 0;
        if (aonjVar.e) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i2 += b(aoqnVar, it.next());
            }
            return aomp.ac(i) + i2 + aomp.ae(i2);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i2 += a(aoqnVar, i, it2.next());
        }
        return i2;
    }

    private static Object o(Object obj) {
        if (obj instanceof aopc) {
            return ((aopc) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static boolean p(Map.Entry entry) {
        aonj aonjVar = (aonj) entry.getKey();
        if (aonjVar.a() == aoqo.MESSAGE) {
            if (aonjVar.d) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((aooy) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof aooy) {
                    if (!((aooy) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof aoog) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void q(defpackage.aonj r4, java.lang.Object r5) {
        /*
            aoqn r0 = r4.c
            defpackage.aonz.h(r5)
            aoqn r1 = defpackage.aoqn.DOUBLE
            aoqo r1 = defpackage.aoqo.INT
            aoqo r0 = r0.s
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L13;
                default: goto L12;
            }
        L12:
            goto L42
        L13:
            boolean r0 = r5 instanceof defpackage.aooy
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof defpackage.aoog
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof defpackage.aonq
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof defpackage.aomf
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            aoqn r4 = r4.c
            aoqo r4 = r4.s
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aomz.q(aonj, java.lang.Object):void");
    }

    public final int c(Map.Entry entry) {
        int ad;
        int ac;
        aonj aonjVar = (aonj) entry.getKey();
        Object value = entry.getValue();
        if (aonjVar.a() != aoqo.MESSAGE || aonjVar.d || aonjVar.e) {
            return k(aonjVar, value);
        }
        if (value instanceof aoog) {
            int i = ((aonj) entry.getKey()).b;
            int ac2 = aomp.ac(1);
            ad = ac2 + ac2 + aomp.ad(2, i);
            ac = aomp.Q(3, (aoog) value);
        } else {
            int i2 = ((aonj) entry.getKey()).b;
            int ac3 = aomp.ac(1);
            ad = ac3 + ac3 + aomp.ad(2, i2);
            ac = aomp.ac(3) + aomp.T((aooy) value);
        }
        return ad + ac;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aomz clone() {
        aomz aomzVar = new aomz();
        for (int i = 0; i < this.b.a(); i++) {
            Map.Entry f = this.b.f(i);
            aomzVar.n((aonj) f.getKey(), f.getValue());
        }
        for (Map.Entry entry : this.b.c()) {
            aomzVar.n((aonj) entry.getKey(), entry.getValue());
        }
        aomzVar.d = this.d;
        return aomzVar;
    }

    public final Iterator e() {
        return this.d ? new aoof(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aomz) {
            return this.b.equals(((aomz) obj).b);
        }
        return false;
    }

    public final void f() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.c) {
            return;
        }
        aopy aopyVar = this.b;
        if (!aopyVar.c) {
            for (int i = 0; i < aopyVar.a(); i++) {
                Map.Entry f = aopyVar.f(i);
                if (((aonj) f.getKey()).d) {
                    f.setValue(Collections.unmodifiableList((List) f.getValue()));
                }
            }
            for (Map.Entry entry : aopyVar.c()) {
                if (((aonj) entry.getKey()).d) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!aopyVar.c) {
            if (aopyVar.b.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(aopyVar.b);
            }
            aopyVar.b = unmodifiableMap;
            if (aopyVar.d.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(aopyVar.d);
            }
            aopyVar.d = unmodifiableMap2;
            aopyVar.c = true;
        }
        this.c = true;
    }

    public final void g(Map.Entry entry) {
        aonj aonjVar = (aonj) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aoog) {
            throw null;
        }
        if (aonjVar.d) {
            Object l = l(aonjVar);
            if (l == null) {
                l = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) l).add(o(it.next()));
            }
            this.b.put(aonjVar, l);
            return;
        }
        if (aonjVar.a() == aoqo.MESSAGE) {
            Object l2 = l(aonjVar);
            if (l2 == null) {
                this.b.put(aonjVar, o(value));
                return;
            } else {
                if (l2 instanceof aopc) {
                    throw new UnsupportedOperationException();
                }
                this.b.put(aonjVar, ((aone) ((aooy) l2).toBuilder()).mergeFrom((aonm) ((aooy) value)).build());
                return;
            }
        }
        this.b.put(aonjVar, o(value));
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        return this.b.isEmpty();
    }

    public final boolean j() {
        for (int i = 0; i < this.b.a(); i++) {
            if (!p(this.b.f(i))) {
                return false;
            }
        }
        Iterator it = this.b.c().iterator();
        while (it.hasNext()) {
            if (!p((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object l(aonj aonjVar) {
        Object obj = this.b.get(aonjVar);
        if (!(obj instanceof aoog)) {
            return obj;
        }
        throw null;
    }

    public final void m(aonj aonjVar, Object obj) {
        List list;
        if (!aonjVar.d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        q(aonjVar, obj);
        Object l = l(aonjVar);
        if (l == null) {
            list = new ArrayList();
            this.b.put(aonjVar, list);
        } else {
            list = (List) l;
        }
        list.add(obj);
    }

    public final void n(aonj aonjVar, Object obj) {
        if (aonjVar.d) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                q(aonjVar, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            q(aonjVar, obj);
        }
        if (obj instanceof aoog) {
            this.d = true;
        }
        this.b.put(aonjVar, obj);
    }

    private aomz(byte[] bArr) {
        f();
        f();
    }
}
