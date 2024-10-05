package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anjv {
    private final anog a;

    private anjv(anog anogVar) {
        this.a = anogVar;
    }

    public static final anjv a(anog anogVar) {
        if (anogVar == null || anogVar.c.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new anjv(anogVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[Catch: aoob -> 0x00ae, TryCatch #0 {aoob -> 0x00ae, blocks: (B:3:0x000e, B:4:0x0019, B:6:0x001f, B:8:0x0029, B:9:0x002b, B:12:0x0039, B:14:0x003d, B:15:0x003f, B:18:0x004a, B:20:0x004e, B:21:0x0050, B:26:0x005a, B:28:0x0064, B:29:0x0066, B:33:0x008c, B:35:0x0093, B:36:0x0095, B:37:0x00a1, B:59:0x00a2, B:65:0x00a8, B:66:0x00ad, B:2:0x0000), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: aoob -> 0x00ae, TryCatch #0 {aoob -> 0x00ae, blocks: (B:3:0x000e, B:4:0x0019, B:6:0x001f, B:8:0x0029, B:9:0x002b, B:12:0x0039, B:14:0x003d, B:15:0x003f, B:18:0x004a, B:20:0x004e, B:21:0x0050, B:26:0x005a, B:28:0x0064, B:29:0x0066, B:33:0x008c, B:35:0x0093, B:36:0x0095, B:37:0x00a1, B:59:0x00a2, B:65:0x00a8, B:66:0x00ad, B:2:0x0000), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.anjv c(defpackage.anji r7) {
        /*
            java.io.InputStream r0 = r7.a     // Catch: java.lang.Throwable -> La7
            aomw r1 = defpackage.aomw.a()     // Catch: java.lang.Throwable -> La7
            anog r2 = defpackage.anog.a     // Catch: java.lang.Throwable -> La7
            aonm r0 = defpackage.aonm.parseFrom(r2, r0, r1)     // Catch: java.lang.Throwable -> La7
            anog r0 = (defpackage.anog) r0     // Catch: java.lang.Throwable -> La7
            java.io.InputStream r7 = r7.a     // Catch: defpackage.aoob -> Lae
            r7.close()     // Catch: defpackage.aoob -> Lae
            aony r7 = r0.c     // Catch: defpackage.aoob -> Lae
            java.util.Iterator r7 = r7.iterator()     // Catch: defpackage.aoob -> Lae
        L19:
            boolean r1 = r7.hasNext()     // Catch: defpackage.aoob -> Lae
            if (r1 == 0) goto La2
            java.lang.Object r1 = r7.next()     // Catch: defpackage.aoob -> Lae
            anof r1 = (defpackage.anof) r1     // Catch: defpackage.aoob -> Lae
            anoc r2 = r1.b     // Catch: defpackage.aoob -> Lae
            if (r2 != 0) goto L2b
            anoc r2 = defpackage.anoc.a     // Catch: defpackage.aoob -> Lae
        L2b:
            int r2 = r2.d     // Catch: defpackage.aoob -> Lae
            int r2 = defpackage.aobq.T(r2)     // Catch: defpackage.aoob -> Lae
            r3 = 4
            r4 = 3
            r5 = 2
            if (r2 != 0) goto L37
            goto L39
        L37:
            if (r2 == r5) goto L5a
        L39:
            anoc r2 = r1.b     // Catch: defpackage.aoob -> Lae
            if (r2 != 0) goto L3f
            anoc r2 = defpackage.anoc.a     // Catch: defpackage.aoob -> Lae
        L3f:
            int r2 = r2.d     // Catch: defpackage.aoob -> Lae
            int r2 = defpackage.aobq.T(r2)     // Catch: defpackage.aoob -> Lae
            if (r2 != 0) goto L48
            goto L4a
        L48:
            if (r2 == r4) goto L5a
        L4a:
            anoc r2 = r1.b     // Catch: defpackage.aoob -> Lae
            if (r2 != 0) goto L50
            anoc r2 = defpackage.anoc.a     // Catch: defpackage.aoob -> Lae
        L50:
            int r2 = r2.d     // Catch: defpackage.aoob -> Lae
            int r2 = defpackage.aobq.T(r2)     // Catch: defpackage.aoob -> Lae
            if (r2 == 0) goto L19
            if (r2 != r3) goto L19
        L5a:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException     // Catch: defpackage.aoob -> Lae
            java.lang.String r0 = "keyset contains key material of type %s for type url %s"
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: defpackage.aoob -> Lae
            anoc r6 = r1.b     // Catch: defpackage.aoob -> Lae
            if (r6 != 0) goto L66
            anoc r6 = defpackage.anoc.a     // Catch: defpackage.aoob -> Lae
        L66:
            int r6 = r6.d     // Catch: defpackage.aoob -> Lae
            int r6 = defpackage.aobq.T(r6)     // Catch: defpackage.aoob -> Lae
            if (r6 != 0) goto L6f
            goto L7b
        L6f:
            if (r6 == r5) goto L8a
            if (r6 == r4) goto L87
            if (r6 == r3) goto L84
            r3 = 5
            if (r6 == r3) goto L81
            r3 = 6
            if (r6 == r3) goto L7e
        L7b:
            java.lang.String r3 = "UNRECOGNIZED"
            goto L8c
        L7e:
            java.lang.String r3 = "REMOTE"
            goto L8c
        L81:
            java.lang.String r3 = "ASYMMETRIC_PUBLIC"
            goto L8c
        L84:
            java.lang.String r3 = "ASYMMETRIC_PRIVATE"
            goto L8c
        L87:
            java.lang.String r3 = "SYMMETRIC"
            goto L8c
        L8a:
            java.lang.String r3 = "UNKNOWN_KEYMATERIAL"
        L8c:
            r4 = 0
            r2[r4] = r3     // Catch: defpackage.aoob -> Lae
            anoc r1 = r1.b     // Catch: defpackage.aoob -> Lae
            if (r1 != 0) goto L95
            anoc r1 = defpackage.anoc.a     // Catch: defpackage.aoob -> Lae
        L95:
            r3 = 1
            java.lang.String r1 = r1.b     // Catch: defpackage.aoob -> Lae
            r2[r3] = r1     // Catch: defpackage.aoob -> Lae
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch: defpackage.aoob -> Lae
            r7.<init>(r0)     // Catch: defpackage.aoob -> Lae
            throw r7     // Catch: defpackage.aoob -> Lae
        La2:
            anjv r7 = a(r0)     // Catch: defpackage.aoob -> Lae
            return r7
        La7:
            r0 = move-exception
            java.io.InputStream r7 = r7.a     // Catch: defpackage.aoob -> Lae
            r7.close()     // Catch: defpackage.aoob -> Lae
            throw r0     // Catch: defpackage.aoob -> Lae
        Lae:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid keyset"
            r7.<init>(r0)
            goto Lb7
        Lb6:
            throw r7
        Lb7:
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anjv.c(anji):anjv");
    }

    public final Object b(Class cls) {
        byte[] array;
        ankc ankcVar = (ankc) ankk.a.get(cls);
        Class a = ankcVar == null ? null : ankcVar.a();
        if (a == null) {
            String valueOf = String.valueOf(cls.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        }
        ankl.b(this.a);
        ankb ankbVar = new ankb(a);
        for (anof anofVar : this.a.c) {
            int aI = aocz.aI(anofVar.c);
            if (aI != 0 && aI == 3) {
                anoc anocVar = anofVar.b;
                if (anocVar == null) {
                    anocVar = anoc.a;
                }
                Object c = ankk.c(anocVar, a);
                int aI2 = aocz.aI(anofVar.c);
                if (aI2 != 0 && aI2 == 3) {
                    int aH = aocz.aH(anofVar.e);
                    if (aH == 0) {
                        aH = 1;
                    }
                    int i = aH - 2;
                    if (i == 1) {
                        array = ByteBuffer.allocate(5).put((byte) 1).putInt(anofVar.d).array();
                    } else {
                        if (i != 2) {
                            if (i == 3) {
                                array = anjk.a;
                            } else if (i != 4) {
                                throw new GeneralSecurityException("unknown output prefix type");
                            }
                        }
                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(anofVar.d).array();
                    }
                    int aI3 = aocz.aI(anofVar.c);
                    if (aI3 == 0) {
                        aI3 = 1;
                    }
                    int aH2 = aocz.aH(anofVar.e);
                    int i2 = aH2 != 0 ? aH2 : 1;
                    int i3 = anofVar.d;
                    anjz anjzVar = new anjz(c, array, aI3, i2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(anjzVar);
                    anka ankaVar = new anka(anjzVar.a());
                    List list = (List) ankbVar.a.put(ankaVar, Collections.unmodifiableList(arrayList));
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(list);
                        arrayList2.add(anjzVar);
                        ankbVar.a.put(ankaVar, Collections.unmodifiableList(arrayList2));
                    }
                    if (anofVar.d != this.a.b) {
                        continue;
                    } else if (anjzVar.b == 3) {
                        if (!ankbVar.a(anjzVar.a()).isEmpty()) {
                            ankbVar.b = anjzVar;
                        } else {
                            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
                        }
                    } else {
                        throw new IllegalArgumentException("the primary entry has to be ENABLED");
                    }
                } else {
                    throw new GeneralSecurityException("only ENABLED key is allowed");
                }
            }
        }
        ankc ankcVar2 = (ankc) ankk.a.get(cls);
        if (ankcVar2 == null) {
            String valueOf2 = String.valueOf(ankbVar.c.getName());
            throw new GeneralSecurityException(valueOf2.length() != 0 ? "No wrapper found for ".concat(valueOf2) : new String("No wrapper found for "));
        }
        if (!ankcVar2.a().equals(ankbVar.c)) {
            String valueOf3 = String.valueOf(ankcVar2.a());
            String valueOf4 = String.valueOf(ankbVar.c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 44 + String.valueOf(valueOf4).length());
            sb.append("Wrong input primitive class, expected ");
            sb.append(valueOf3);
            sb.append(", got ");
            sb.append(valueOf4);
            throw new GeneralSecurityException(sb.toString());
        }
        return ankcVar2.c(ankbVar);
    }

    public final String toString() {
        return ankl.a(this.a).toString();
    }
}
