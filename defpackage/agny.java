package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agny implements agmx {
    private final Map a;

    public agny() {
        this.a = new HashMap();
    }

    @Override // defpackage.agmx
    public final int a(String str) {
        return b("stream_quality", 0);
    }

    @Override // defpackage.agmx
    public final int b(String str, int i) {
        return this.a.containsKey(str) ? ((Integer) this.a.get(str)).intValue() : i;
    }

    @Override // defpackage.agmx
    public final long c(String str) {
        return d(str, 0L);
    }

    @Override // defpackage.agmx
    public final long d(String str, long j) {
        return this.a.containsKey(str) ? ((Long) this.a.get(str)).longValue() : j;
    }

    public final byte[] e() {
        byte[] byteArray;
        synchronized (this.a) {
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(this.a.size());
                    for (Map.Entry entry : this.a.entrySet()) {
                        dataOutputStream.writeUTF((String) entry.getKey());
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            dataOutputStream.writeByte(1);
                            dataOutputStream.writeUTF((String) value);
                        } else {
                            int i = 0;
                            if (value instanceof String[]) {
                                dataOutputStream.writeByte(2);
                                String[] strArr = (String[]) value;
                                dataOutputStream.writeInt(strArr.length);
                                while (i < strArr.length) {
                                    dataOutputStream.writeUTF(strArr[i]);
                                    i++;
                                }
                            } else if (value instanceof Long) {
                                dataOutputStream.writeByte(3);
                                dataOutputStream.writeLong(((Long) value).longValue());
                            } else if (value instanceof long[]) {
                                dataOutputStream.writeByte(4);
                                long[] jArr = (long[]) value;
                                dataOutputStream.writeInt(jArr.length);
                                while (i < jArr.length) {
                                    dataOutputStream.writeLong(jArr[i]);
                                    i++;
                                }
                            } else if (value instanceof Integer) {
                                dataOutputStream.writeByte(5);
                                dataOutputStream.writeInt(((Integer) value).intValue());
                            } else if (value instanceof int[]) {
                                dataOutputStream.writeByte(6);
                                int[] iArr = (int[]) value;
                                dataOutputStream.writeInt(iArr.length);
                                while (i < iArr.length) {
                                    dataOutputStream.writeInt(iArr[i]);
                                    i++;
                                }
                            } else if (value instanceof Boolean) {
                                dataOutputStream.writeByte(7);
                                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                            } else if (value instanceof boolean[]) {
                                dataOutputStream.writeByte(8);
                                boolean[] zArr = (boolean[]) value;
                                dataOutputStream.writeInt(zArr.length);
                                while (i < zArr.length) {
                                    dataOutputStream.writeBoolean(zArr[i]);
                                    i++;
                                }
                            } else if (value instanceof Byte) {
                                dataOutputStream.writeByte(9);
                                dataOutputStream.writeByte(((Byte) value).byteValue());
                            } else if (value instanceof byte[]) {
                                dataOutputStream.writeByte(10);
                                byte[] bArr = (byte[]) value;
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                            } else if (value instanceof Double) {
                                dataOutputStream.writeByte(11);
                                dataOutputStream.writeDouble(((Double) value).doubleValue());
                            }
                        }
                    }
                    dataOutputStream.flush();
                    byteArrayOutputStream.flush();
                    byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArray;
    }

    @Override // defpackage.agmx
    public final String f(String str) {
        if (this.a.containsKey(str)) {
            return (String) this.a.get(str);
        }
        return null;
    }

    @Override // defpackage.agmx
    public final void g(String str, boolean z) {
        synchronized (this.a) {
            this.a.put(str, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.agmx
    public final void h(String str, byte[] bArr) {
        synchronized (this.a) {
            this.a.put(str, bArr);
        }
    }

    @Override // defpackage.agmx
    public final void i(String str, int i) {
        synchronized (this.a) {
            this.a.put(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.agmx
    public final void j(String str, long j) {
        synchronized (this.a) {
            this.a.put(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.agmx
    public final void k(String str, String str2) {
        synchronized (this.a) {
            this.a.put(str, str2);
        }
    }

    @Override // defpackage.agmx
    public final boolean l(String str) {
        return m(str, false);
    }

    @Override // defpackage.agmx
    public final boolean m(String str, boolean z) {
        return this.a.containsKey(str) ? ((Boolean) this.a.get(str)).booleanValue() : z;
    }

    @Override // defpackage.agmx
    public final byte[] n(String str) {
        if (this.a.containsKey(str)) {
            return (byte[]) this.a.get(str);
        }
        return null;
    }

    @Override // defpackage.agmx
    public final void p(double d) {
        synchronized (this.a) {
            this.a.put("bytes_per_sec", Double.valueOf(d));
        }
    }

    public agny(byte[] bArr) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        if (bArr.length > 0) {
            synchronized (hashMap) {
                try {
                    try {
                        hashMap.clear();
                        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                        int readInt = dataInputStream.readInt();
                        for (int i = 0; i < readInt; i++) {
                            String readUTF = dataInputStream.readUTF();
                            byte readByte = dataInputStream.readByte();
                            switch (readByte) {
                                case 1:
                                    this.a.put(readUTF, dataInputStream.readUTF());
                                    break;
                                case 2:
                                    int readInt2 = dataInputStream.readInt();
                                    String[] strArr = new String[readInt2];
                                    for (int i2 = 0; i2 < readInt2; i2++) {
                                        strArr[i2] = dataInputStream.readUTF();
                                    }
                                    this.a.put(readUTF, strArr);
                                    break;
                                case 3:
                                    this.a.put(readUTF, Long.valueOf(dataInputStream.readLong()));
                                    break;
                                case 4:
                                    int readInt3 = dataInputStream.readInt();
                                    long[] jArr = new long[readInt3];
                                    for (int i3 = 0; i3 < readInt3; i3++) {
                                        jArr[i3] = dataInputStream.readLong();
                                    }
                                    this.a.put(readUTF, jArr);
                                    break;
                                case 5:
                                    this.a.put(readUTF, Integer.valueOf(dataInputStream.readInt()));
                                    break;
                                case 6:
                                    int readInt4 = dataInputStream.readInt();
                                    int[] iArr = new int[readInt4];
                                    for (int i4 = 0; i4 < readInt4; i4++) {
                                        iArr[i4] = dataInputStream.readInt();
                                    }
                                    this.a.put(readUTF, iArr);
                                    break;
                                case 7:
                                    this.a.put(readUTF, Boolean.valueOf(dataInputStream.readBoolean()));
                                    break;
                                case 8:
                                    int readInt5 = dataInputStream.readInt();
                                    boolean[] zArr = new boolean[readInt5];
                                    for (int i5 = 0; i5 < readInt5; i5++) {
                                        zArr[i5] = dataInputStream.readBoolean();
                                    }
                                    this.a.put(readUTF, zArr);
                                    break;
                                case 9:
                                    this.a.put(readUTF, Byte.valueOf(dataInputStream.readByte()));
                                    break;
                                case 10:
                                    int readInt6 = dataInputStream.readInt();
                                    byte[] bArr2 = new byte[readInt6];
                                    int i6 = 0;
                                    while (i6 < readInt6) {
                                        int read = dataInputStream.read(bArr2, i6, readInt6 - i6);
                                        if (read == -1) {
                                            throw new IOException("Unexpected end of stream");
                                        }
                                        i6 += read;
                                    }
                                    this.a.put(readUTF, bArr2);
                                    break;
                                case 11:
                                    this.a.put(readUTF, Double.valueOf(dataInputStream.readDouble()));
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder(40);
                                    sb.append("Couldn't read extra of type: ");
                                    sb.append((int) readByte);
                                    throw new RuntimeException(sb.toString());
                            }
                        }
                        dataInputStream.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
