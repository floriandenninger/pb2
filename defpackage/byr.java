package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byr {
    public Map b;
    private static final String c = ajbh.S("Data");
    public static final byr a = bxw.a(new HashMap());

    byr() {
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0042: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:54:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x003a -> B:16:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.byr a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L81
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L48 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L48 java.lang.ClassNotFoundException -> L4a java.io.IOException -> L4c
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L40 java.lang.ClassNotFoundException -> L44 java.io.IOException -> L46
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L40 java.lang.ClassNotFoundException -> L44 java.io.IOException -> L46
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L40 java.lang.ClassNotFoundException -> L44 java.io.IOException -> L46
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L40 java.lang.ClassNotFoundException -> L44 java.io.IOException -> L46
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = defpackage.byr.c
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L39
            goto L64
        L39:
            r7 = move-exception
            java.lang.String r2 = defpackage.byr.c
            android.util.Log.e(r2, r0, r7)
            goto L64
        L40:
            r7 = move-exception
            r1 = r7
            r7 = r3
            goto L6a
        L44:
            r7 = move-exception
            goto L50
        L46:
            r7 = move-exception
            goto L50
        L48:
            r1 = move-exception
            goto L6a
        L4a:
            r3 = move-exception
            goto L4d
        L4c:
            r3 = move-exception
        L4d:
            r6 = r3
            r3 = r7
            r7 = r6
        L50:
            java.lang.String r4 = defpackage.byr.c     // Catch: java.lang.Throwable -> L40
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L61
            r3.close()     // Catch: java.io.IOException -> L5b
            goto L61
        L5b:
            r7 = move-exception
            java.lang.String r3 = defpackage.byr.c
            android.util.Log.e(r3, r0, r7)
        L61:
            r2.close()     // Catch: java.io.IOException -> L39
        L64:
            byr r7 = new byr
            r7.<init>(r1)
            return r7
        L6a:
            if (r7 == 0) goto L76
            r7.close()     // Catch: java.io.IOException -> L70
            goto L76
        L70:
            r7 = move-exception
            java.lang.String r3 = defpackage.byr.c
            android.util.Log.e(r3, r0, r7)
        L76:
            r2.close()     // Catch: java.io.IOException -> L7a
            goto L80
        L7a:
            r7 = move-exception
            java.lang.String r2 = defpackage.byr.c
            android.util.Log.e(r2, r0, r7)
        L80:
            throw r1
        L81:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            goto L8a
        L89:
            throw r7
        L8a:
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byr.a(byte[]):byr");
    }

    public static byte[] e(byr byrVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            objectOutputStream.writeInt(byrVar.b.size());
            for (Map.Entry entry : byrVar.b.entrySet()) {
                objectOutputStream.writeUTF((String) entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e2) {
                Log.e(c, "Error in Data#toByteArray: ", e2);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e3) {
                Log.e(c, "Error in Data#toByteArray: ", e3);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e4) {
            e = e4;
            objectOutputStream2 = objectOutputStream;
            Log.e(c, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e5) {
                    Log.e(c, "Error in Data#toByteArray: ", e5);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                Log.e(c, "Error in Data#toByteArray: ", e6);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e7) {
                    Log.e(c, "Error in Data#toByteArray: ", e7);
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e8) {
                Log.e(c, "Error in Data#toByteArray: ", e8);
                throw th;
            }
        }
    }

    public static Boolean[] f(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    public static Byte[] g(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    public static Double[] h(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static Float[] i(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    public static Integer[] j(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static Long[] k(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    public final String b(String str) {
        Object obj = this.b.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final Map c() {
        return Collections.unmodifiableMap(this.b);
    }

    public final byte[] d(String str) {
        Object obj = this.b.get(str);
        if (!(obj instanceof Byte[])) {
            return null;
        }
        Byte[] bArr = (Byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        byr byrVar = (byr) obj;
        Set<String> keySet = this.b.keySet();
        if (!keySet.equals(byrVar.b.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.b.get(str);
            Object obj3 = byrVar.b.get(str);
            if (obj2 == null || obj3 == null) {
                z = obj2 == obj3;
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.b.isEmpty()) {
            for (String str : this.b.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.b.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public byr(byr byrVar) {
        this.b = new HashMap(byrVar.b);
    }

    public byr(Map map) {
        this.b = new HashMap(map);
    }
}
